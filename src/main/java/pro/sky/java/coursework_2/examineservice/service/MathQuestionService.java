package pro.sky.java.coursework_2.examineservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import pro.sky.java.coursework_2.examineservice.domain.Question;
import pro.sky.java.coursework_2.examineservice.repository.QuestionRepository;
import java.util.*;
import static pro.sky.java.coursework_2.examineservice.constants.ConstantsQuestionService.SHUFFLE_ARRAY;

@Service
public class MathQuestionService implements QuestionService {
    private static final Random RANDOM = new Random();
    private final QuestionRepository repository;
    private Deque<Question> shuffleQuestion = new LinkedList<>();
    private boolean isChange = false;

    @Autowired
    public MathQuestionService(@Qualifier("mathQuestionRepository") QuestionRepository repository) {
        this.repository = repository;
    }

    @Override
    public Question add(String question, String answer) {
        isChange = true;
        Question result = new Question(question, answer);
        return repository.add(result);
    }

    @Override
    public Question add(Question question) {
        return add(question.getQuestion(), question.getAnswer());
    }

    @Override
    public Question remove(Question question) {
        isChange = true;
        return repository.remove(question);
    }

    @Override
    public Collection<Question> getAll() {
        return repository.getAll();
    }

    @Override
    public Question getRandomQuestion() {
        if (isChange || shuffleQuestion.isEmpty()) {
            shuffleQuestion = new LinkedList<>();
            Question[] questionsArr =  repository.getAll().toArray(new Question[0]);
            SHUFFLE_ARRAY.accept(questionsArr);
            shuffleQuestion.addAll(Arrays.asList(questionsArr));
            isChange = false;
        }
        return shuffleQuestion.pollFirst();
    }

    @Override
    public int size() {
        return repository.getAll().size();
    }
}
