package pro.sky.java.coursework_2.examineservice.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
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
    JavaQuestionService service;
    @InjectMocks
    ExaminerServiceImpl examinerService;

    @Test
    public void whenCountsThenUniq() {
        when(service.size()).thenReturn(AMOUNT);
        when(service.getRandomQuestion()).thenReturn(
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
        assertThat(examinerService.getQuestions(AMOUNT)).containsExactlyInAnyOrderElementsOf(QUESTIONS_ALL);
    }
    @Test
    public void whenWrongAmountThenException() {
        when(service.size()).thenReturn(SIZE_QUESTION);
        assertThrows(AmountMoreSizeQuestionsException.class,
                () -> examinerService.getQuestions(WRONG_AMOUNT));
    }
}