package pro.sky.java.coursework_2.examineservice.service;

import org.springframework.stereotype.Service;
import pro.sky.java.coursework_2.examineservice.domain.Question;
import java.util.*;

@Service
public class JavaQuestionService implements QuestionService {
    private static final Random RANDOM = new Random();
    private final Set<Question> questions = new HashSet<>();

    @Override
    public Question add(String question, String answer) {
        Question result = new Question(question, answer);
        questions.add(result);
        return result;
    }

    @Override
    public Question add(Question question) {
        return add(question.getQuestion(), question.getAnswer());
    }

    @Override
    public Question remove(Question question) {
        Question result = null;
        if (questions.remove(question)) {
            result = question;
        }
        return result;
    }

    @Override
    public Collection<Question> getAll() {
        return Collections.unmodifiableCollection(questions);
    }

    @Override
    public Question getRandomQuestion() {
        return questions.stream()
                .skip(RANDOM.nextInt(questions.size()))
                .findFirst()
                .orElse(null);
    }
}
