package pro.sky.java.coursework_2.examineservice.repository;

import org.springframework.stereotype.Repository;
import pro.sky.java.coursework_2.examineservice.domain.Question;
import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import static pro.sky.java.coursework_2.examineservice.constants.ConstantsQuestionService.MATH_QUESTIONS_ALL;

@Repository
public class MathQuestionRepository implements QuestionRepository {
    Set<Question> questions = new HashSet<>();

    @PostConstruct
    public void init() {
        questions.addAll(MATH_QUESTIONS_ALL);
    }
    @Override
    public Question add(Question question) {
        questions.add(question);
        return question;
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
}
