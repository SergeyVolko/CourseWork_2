package pro.sky.java.coursework_2.examineservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pro.sky.java.coursework_2.examineservice.domain.Question;
import pro.sky.java.coursework_2.examineservice.exceptions.AmountMoreSizeQuestionsException;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class ExaminerServiceImpl implements ExaminerService {
    private final static String TEMPLATE_EXCEPTION = "Количестов вопросов %d не корректно задано.";
    private static final Random RANDOM = new Random();
    private final QuestionService service;

    @Autowired
    public ExaminerServiceImpl(QuestionService service) {
        this.service = service;
    }

    @Override
    public Collection<Question> getQuestions(int amount) {
        QuestionService tmpService = new JavaQuestionService();
        Collection<Question> questions = service.getAll();
        questions.forEach(tmpService::add);
        if (amount < 0 || questions.size() < amount) {
            throw new AmountMoreSizeQuestionsException(String.format(TEMPLATE_EXCEPTION, amount));
        }
        Set<Question> result = new HashSet<>();
        IntStream.range(0, amount).forEach(i -> result.add(tmpService.remove(tmpService.getRandomQuestion())));
        return result;
    }
}
