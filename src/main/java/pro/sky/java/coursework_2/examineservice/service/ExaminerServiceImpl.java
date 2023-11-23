package pro.sky.java.coursework_2.examineservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import pro.sky.java.coursework_2.examineservice.domain.Question;
import pro.sky.java.coursework_2.examineservice.exceptions.AmountMoreSizeQuestionsException;
import java.util.*;
import java.util.stream.Collectors;
import static pro.sky.java.coursework_2.examineservice.constants.ConstantsQuestionService.SHUFFLE_ARRAY;

@Service
public class ExaminerServiceImpl implements ExaminerService {
    private final static String TEMPLATE_EXCEPTION = "Количестов вопросов %d не корректно задано.";
    private final QuestionService javaService;
    private final QuestionService mathService;

    @Autowired
    public ExaminerServiceImpl(@Qualifier("javaQuestionService") QuestionService javaService,
                               @Qualifier("mathQuestionService") QuestionService mathService) {
        this.javaService = javaService;
        this.mathService = mathService;
    }

    @Override
    public Collection<Question> getQuestions(int amount) {
        List<QuestionService> services = List.of(javaService, mathService);
        Question[] result = services.stream().
                flatMap(s -> Arrays.stream(getQuestionsInService(s))).
                toArray(Question[]::new);
        if (result.length < amount) {
            throw new AmountMoreSizeQuestionsException(String.format(TEMPLATE_EXCEPTION, amount));
        }
        SHUFFLE_ARRAY.accept(result);
        return Arrays.stream(result).limit(amount).collect(Collectors.toSet());
    }

    private Question[] getQuestionsInService(QuestionService service) {
        Set<Question> questions = new HashSet<>();
        int size = service.size();
        while (questions.size() != size) {
            Question question = service.getRandomQuestion();
            while (questions.contains(question)) {
                question = service.getRandomQuestion();
            }
            questions.add(question);
        }
        return questions.toArray(new Question[0]);
    }
}
