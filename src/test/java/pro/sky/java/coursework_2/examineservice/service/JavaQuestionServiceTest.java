package pro.sky.java.coursework_2.examineservice.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pro.sky.java.coursework_2.examineservice.domain.Question;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static pro.sky.java.coursework_2.examineservice.service.constants.ConstantsQuestionService.*;
import static org.junit.jupiter.api.Assertions.*;

class JavaQuestionServiceTest {

    QuestionService questionService;

    @BeforeEach
    public void initQuestionService() {
        questionService = new JavaQuestionService();
        QUESTIONS_ALL.forEach((q) -> questionService.add(q));
    }


    @Test
    public void whenAddElementThenEqualsLists() {
        questionService.add(ADD_QUESTION, ADD_ANSWER);
        assertThat(questionService.getAll()).containsExactlyInAnyOrderElementsOf(QUESTIONS_ALL_WITH_ADD);
    }
    @Test
    public void whenAddQuestionsThenEqualsSet() {
        assertThat(questionService.getAll()).containsExactlyInAnyOrderElementsOf(QUESTIONS_ALL);
    }

    @Test
    public void whenRemoveOneQuestionThenEqualsSet() {
        questionService.remove(QUESTION_OBJ1);
        assertThat(questionService.getAll()).containsExactlyInAnyOrderElementsOf(QUESTIONS_NOT_FIRST);
    }

    @Test
    public void whenGetRandomQuestionThenContainInSet() {
        Question actual = questionService.getRandomQuestion();
        assertTrue(QUESTIONS_ALL.contains(actual));
    }

    @Test
    public void whenGetRandomQuestionThenEqualsSet() {
        Set<Question> set = IntStream.range(0, AMOUNT_FOR_GET_RANDOM_QUESTION)
                .mapToObj(i -> questionService.getRandomQuestion())
                .collect(Collectors.toSet());
        assertThat(set).containsExactlyInAnyOrderElementsOf(QUESTIONS_ALL);
    }
}