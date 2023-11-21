package pro.sky.java.coursework_2.examineservice.service;

import org.springframework.stereotype.Service;
import pro.sky.java.coursework_2.examineservice.domain.Question;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class JavaQuestionService implements QuestionService {
    private static final Random RANDOM = new Random();
    private final Set<Question> questions = new HashSet<>();
    private Deque<Question> shuffleQuestion = new LinkedList<>();
    private boolean isChange = false;

    @Override
    public Question add(String question, String answer) {
        isChange = true;
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
        isChange = true;
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
        if (isChange || shuffleQuestion.isEmpty()) {
            shuffleQuestion = IntStream.range(0, questions.size())
                    .mapToObj(i -> questions.stream()
                            .skip(i + RANDOM.nextInt(questions.size() - i))
                            .findFirst()
                            .get())
                    .collect(Collectors.toCollection(LinkedList<Question>::new));
        }
        return shuffleQuestion.pollFirst();
    }

    @Override
    public int size() {
        return questions.size();
    }
}
