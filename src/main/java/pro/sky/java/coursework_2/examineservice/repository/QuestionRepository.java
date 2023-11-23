package pro.sky.java.coursework_2.examineservice.repository;

import pro.sky.java.coursework_2.examineservice.domain.Question;

import java.util.Collection;

public interface QuestionRepository {
    Question add(Question question);
    Question remove(Question question);
    Collection<Question> getAll();
}
