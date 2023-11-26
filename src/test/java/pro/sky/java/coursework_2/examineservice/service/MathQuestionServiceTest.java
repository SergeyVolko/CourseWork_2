package pro.sky.java.coursework_2.examineservice.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import pro.sky.java.coursework_2.examineservice.exceptions.MethodNotAllowedException;
import java.util.function.Function;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static pro.sky.java.coursework_2.examineservice.service.constants.ConstantsQuestionService.*;

@ExtendWith(MockitoExtension.class)
class MathQuestionServiceTest {
    @Mock
    Function<Integer, Integer> generatorNums;
    @InjectMocks
    MathQuestionService service;

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
    public void whenGetRandomQuestionWhenAddAction() {
        when(generatorNums.apply(any())).thenReturn(ONE, TWO, ACTION_NUM1);
        assertEquals(ARITHMETIC_QUESTION_ADD_OBJ, service.getRandomQuestion());
    }

    @Test
    public void whenGetRandomQuestionWhenDefAction() {
        when(generatorNums.apply(any())).thenReturn(SIX, FOUR, ACTION_NUM2);
        assertEquals(ARITHMETIC_QUESTION_DEF_OBJ, service.getRandomQuestion());
    }

    @Test
    public void whenGetRandomQuestionWhenMultipleAction() {
        when(generatorNums.apply(any())).thenReturn(TWO, THREE, ACTION_NUM3);
        assertEquals(ARITHMETIC_QUESTION_MULTIPLE_OBJ, service.getRandomQuestion());
    }

    @Test
    public void whenGetRandomQuestionWhenDivAction() {
        when(generatorNums.apply(any())).thenReturn(TEN, TWO, ACTION_NUM4);
        assertEquals(ARITHMETIC_QUESTION_DIV_OBJ, service.getRandomQuestion());
    }
}