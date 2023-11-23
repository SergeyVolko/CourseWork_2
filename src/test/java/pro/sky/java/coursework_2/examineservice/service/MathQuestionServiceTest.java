package pro.sky.java.coursework_2.examineservice.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import pro.sky.java.coursework_2.examineservice.domain.Question;
import pro.sky.java.coursework_2.examineservice.repository.MathQuestionRepository;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static pro.sky.java.coursework_2.examineservice.service.constants.ConstantsQuestionService.*;

@ExtendWith(MockitoExtension.class)
class MathQuestionServiceTest {

    @Mock
    MathQuestionRepository repository;

    @InjectMocks
    MathQuestionService service;

    @Test
    public void whenAddElementThenEqualsExpectElement() {
        when(repository.add(any())).thenReturn(MATH_QUESTION_OBJ1);
        assertEquals(MATH_QUESTION_OBJ1, service.add(MATH_QUESTION1, MATH_ANSWER1));
    }
    @Test
    public void whenAddElementQuestionThenEqualsExpectElement() {
        when(repository.add(any())).thenReturn(MATH_QUESTION_OBJ1);
        assertEquals(MATH_QUESTION_OBJ1, service.add(MATH_QUESTION_OBJ1));
    }

    @Test
    public void whenRemoveOneQuestionThenEqualsExpectElement() {
        when(repository.remove(any())).thenReturn(MATH_QUESTION_OBJ1);
        assertEquals(MATH_QUESTION_OBJ1, service.remove(MATH_QUESTION_OBJ1));
    }

    @Test
    public void whenGetRandomQuestionThenContainInSet() {
        when(repository.getAll()).thenReturn(MATH_QUESTIONS_ALL);
        assertTrue(MATH_QUESTIONS_ALL.contains(service.getRandomQuestion()));
    }

    @Test
    public void whenGetRandomQuestionThenEqualsSet() {
        when(repository.getAll()).thenReturn(MATH_QUESTIONS_ALL);
        Set<Question> set = IntStream.range(0, AMOUNT_FOR_GET_RANDOM_QUESTION)
                .mapToObj(i -> service.getRandomQuestion())
                .collect(Collectors.toSet());
        assertThat(set).containsExactlyInAnyOrderElementsOf(MATH_QUESTIONS_ALL);
    }

    @Test
    public void whenGetRandomQuestionThenEqualsSetAmount() {
        when(repository.getAll()).thenReturn(MATH_QUESTIONS_ALL);
        Set<Question> set = IntStream.range(0, AMOUNT)
                .mapToObj(i -> service.getRandomQuestion())
                .collect(Collectors.toSet());
        assertThat(set).containsExactlyInAnyOrderElementsOf(MATH_QUESTIONS_ALL);
    }
}