package pro.sky.java.coursework_2.examineservice.service;

import org.springframework.stereotype.Service;
import pro.sky.java.coursework_2.examineservice.domain.Question;
import pro.sky.java.coursework_2.examineservice.exceptions.MethodNotAllowedException;
import pro.sky.java.coursework_2.examineservice.utils.UtilsForServiceRandom;
import java.util.*;
import java.util.stream.IntStream;
import static pro.sky.java.coursework_2.examineservice.constants.ConstantsQuestionService.SHUFFLE_ARRAY;

@Service
public class MathQuestionService implements QuestionService {
    private final Deque<Question> shuffleQuestion = new LinkedList<>();
    private static final String MATH_QUESTION = "math question%d";
    private static final String MATH_ANSWER = "math answer%d";
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
        if (shuffleQuestion.isEmpty()) {
            Question[] questions = IntStream.rangeClosed(1, size())
                    .mapToObj(i -> new Question(String.format(MATH_QUESTION, i), String.format(MATH_ANSWER, i)))
                    .toArray(Question[]::new);
            SHUFFLE_ARRAY.accept(questions);
            shuffleQuestion.addAll(Arrays.asList(questions));
        }
        return shuffleQuestion.pollFirst();
    }

    @Override
    public int size() {
        return UtilsForServiceRandom.getSize();
    }
}
