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
            shuffleQuestion = new LinkedList<>();
            Question[] questionsArr =  questions.toArray(new Question[0]);
            shuffle(questionsArr);
            shuffleQuestion.addAll(Arrays.asList(questionsArr));
            isChange = false;
        }
        return shuffleQuestion.pollFirst();
    }

    private void shuffle(Question[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int index = i + RANDOM.nextInt(arr.length - i);
            Question tmp = arr[i];
            arr[i] = arr[index];
            arr[index] = tmp;
        }
    }

    @Override
    public int size() {
        return questions.size();
    }
}
