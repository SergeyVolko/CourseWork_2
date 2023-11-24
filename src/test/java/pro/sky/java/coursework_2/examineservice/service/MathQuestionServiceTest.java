package pro.sky.java.coursework_2.examineservice.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pro.sky.java.coursework_2.examineservice.domain.Question;
import pro.sky.java.coursework_2.examineservice.exceptions.MethodNotAllowedException;
import pro.sky.java.coursework_2.examineservice.utils.UtilsForServiceRandom;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static pro.sky.java.coursework_2.examineservice.service.constants.ConstantsQuestionService.*;

class MathQuestionServiceTest {
    MathQuestionService service = new MathQuestionService();

    @BeforeEach
    public void initSize() {
        UtilsForServiceRandom.setSize(AMOUNT);
    }

    @Test
    public void whenAddElementThenEqualsExpectElement() {
        assertThrows(MethodNotAllowedException.class, () -> service.add(MATH_QUESTION1, MATH_ANSWER1));
    }
    @Test
    public void whenAddElementQuestionThenEqualsExpectElement() {
        assertThrows(MethodNotAllowedException.class, () -> service.add(QUESTION_OBJ1));
    }

    @Test
    public void whenRemoveOneQuestionThenEqualsExpectElement() {
        assertThrows(MethodNotAllowedException.class, () -> service.remove(QUESTION_OBJ1));
    }

    @Test
    public void whenGetRandomQuestionThenContainInSet() {
        assertThrows(MethodNotAllowedException.class, () -> service.getAll());
    }

    @Test
    public void whenGetRandomQuestionThenEqualsSet() {
        Set<Question> set = IntStream.range(0, AMOUNT_FOR_GET_RANDOM_QUESTION)
                .mapToObj(i -> service.getRandomQuestion())
                .collect(Collectors.toSet());
        assertThat(set).containsExactlyInAnyOrderElementsOf(MATH_QUESTIONS_ALL);
    }

    @Test
    public void whenGetRandomQuestionThenEqualsSetAmount() {
        Set<Question> set = IntStream.range(0, AMOUNT)
                .mapToObj(i -> service.getRandomQuestion())
                .collect(Collectors.toSet());
        assertThat(set).containsExactlyInAnyOrderElementsOf(MATH_QUESTIONS_ALL);
    }
}