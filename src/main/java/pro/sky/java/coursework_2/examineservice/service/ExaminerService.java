package pro.sky.java.coursework_2.examineservice.service;

import pro.sky.java.coursework_2.examineservice.domain.Question;

import java.util.Collection;

public interface ExaminerService {
    Collection<Question> getQuestions(int amount);
}
