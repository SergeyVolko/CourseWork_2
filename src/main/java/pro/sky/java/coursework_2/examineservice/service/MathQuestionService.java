package pro.sky.java.coursework_2.examineservice.service;

import org.springframework.stereotype.Service;
import pro.sky.java.coursework_2.examineservice.domain.Question;
import pro.sky.java.coursework_2.examineservice.exceptions.MethodNotAllowedException;
import pro.sky.java.coursework_2.examineservice.utils.UtilsForServiceRandom;
import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import static pro.sky.java.coursework_2.examineservice.constants.ConstantsQuestionService.*;

@Service
public class MathQuestionService implements QuestionService {
    private static final String MATH_QUESTION = "%d %s %d = ?";
    private static final String MATH_ANSWER = "math answer: %d";
    private static final String[] ACTIONS = new String[] {"+", "-", "*", "/"};
    private static final int MAX_VALUE = 100_000;
    private static final int MIN_RANGE = 1;

    private final Function<Integer, Integer> generatorNums;

    public MathQuestionService() {
        this.generatorNums = (a) -> MIN_RANGE + RANDOM.nextInt(a);
    }
    public MathQuestionService(Function<Integer, Integer> generatorNums) {
        this.generatorNums = generatorNums;
    }
    private static final Map<String, BiFunction<Integer, Integer, Integer>> EXPRESSION = Map.of(
            ACTIONS[0], Integer::sum,
            ACTIONS[1], (a, b) -> a - b,
            ACTIONS[2], (a, b)  -> a * b,
            ACTIONS[3], (a, b) -> a / b
    );




    @Override
    public Question add(String question, String answer) {
        throw new MethodNotAllowedException();
    }

    @Override
    public Question add(Question question) {
        return add(question.getQuestion(), question.getAnswer());
    }

    @Override
    public Question remove(Question question) {
        throw new MethodNotAllowedException();
    }

    @Override
    public Collection<Question> getAll() {
        throw new MethodNotAllowedException();
    }

    @Override
    public Question getRandomQuestion() {
        int a = generatorNums.apply(MAX_VALUE);
        int b = generatorNums.apply(MAX_VALUE);
        String action = ACTIONS[generatorNums.apply(ACTIONS.length)];
        String question = String.format(MATH_QUESTION, a, action, b);
        String answer = String.format(MATH_ANSWER, EXPRESSION.get(action).apply(a, b));
        return new Question(question, answer);
    }

    @Override
    public int size() {
        throw new MethodNotAllowedException();
    }
}
