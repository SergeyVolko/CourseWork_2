package pro.sky.java.coursework_2.examineservice.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import pro.sky.java.coursework_2.examineservice.exceptions.AmountMoreSizeQuestionsException;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static pro.sky.java.coursework_2.examineservice.service.constants.ConstantsQuestionService.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ExaminerServiceImplTest {
    @Mock
    JavaQuestionService javaService;
    @Mock
    MathQuestionService mathService;
    ExaminerServiceImpl examinerService;

    @BeforeEach
    public void initMock() {
        examinerService = new ExaminerServiceImpl(javaService, mathService);
    }

    @Test
    public void whenCountsThenUniq() {
        when(javaService.size()).thenReturn(AMOUNT);
        when(javaService.getRandomQuestion()).thenReturn(
                QUESTION_OBJ1,
                QUESTION_OBJ2,
                QUESTION_OBJ3,
                QUESTION_OBJ4,
                QUESTION_OBJ5,
                QUESTION_OBJ1,
                QUESTION_OBJ2,
                QUESTION_OBJ6,
                QUESTION_OBJ7,
                QUESTION_OBJ8,
                QUESTION_OBJ9,
                QUESTION_OBJ10
        );
        when(mathService.size()).thenReturn(AMOUNT);
        when(mathService.getRandomQuestion()).thenReturn(
                MATH_QUESTION_OBJ1,
                MATH_QUESTION_OBJ2,
                MATH_QUESTION_OBJ3,
                MATH_QUESTION_OBJ4,
                MATH_QUESTION_OBJ5,
                MATH_QUESTION_OBJ6,
                MATH_QUESTION_OBJ7,
                MATH_QUESTION_OBJ8,
                MATH_QUESTION_OBJ9,
                MATH_QUESTION_OBJ10
        );
        assertThat(examinerService.getQuestions(AMOUNT + AMOUNT))
                .containsExactlyInAnyOrderElementsOf(QUESTIONS_ALL_WITH_MATH);
    }
    @Test
    public void whenWrongAmountThenException() {
        when(javaService.size()).thenReturn(AMOUNT);
        when(mathService.size()).thenReturn(AMOUNT);
        when(javaService.getRandomQuestion()).thenReturn(
                QUESTION_OBJ1,
                QUESTION_OBJ2,
                QUESTION_OBJ3,
                QUESTION_OBJ4,
                QUESTION_OBJ5,
                QUESTION_OBJ1,
                QUESTION_OBJ2,
                QUESTION_OBJ6,
                QUESTION_OBJ7,
                QUESTION_OBJ8,
                QUESTION_OBJ9,
                QUESTION_OBJ10
        );
        when(mathService.getRandomQuestion()).thenReturn(
                MATH_QUESTION_OBJ1,
                MATH_QUESTION_OBJ2,
                MATH_QUESTION_OBJ3,
                MATH_QUESTION_OBJ4,
                MATH_QUESTION_OBJ5,
                MATH_QUESTION_OBJ6,
                MATH_QUESTION_OBJ7,
                MATH_QUESTION_OBJ8,
                MATH_QUESTION_OBJ9,
                MATH_QUESTION_OBJ10
        );
        assertThrows(AmountMoreSizeQuestionsException.class,
                () -> examinerService.getQuestions(WRONG_AMOUNT + WRONG_AMOUNT));
    }
}