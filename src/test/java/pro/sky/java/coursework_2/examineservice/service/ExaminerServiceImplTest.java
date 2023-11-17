package pro.sky.java.coursework_2.examineservice.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import pro.sky.java.coursework_2.examineservice.exceptions.AmountMoreSizeQuestionsException;

import java.util.stream.IntStream;

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
        when(service.getAll()).thenReturn(QUESTIONS_ALL);
        IntStream.rangeClosed(0, AMOUNT).forEach((i) ->
                assertEquals(i, examinerService.getQuestions(i).size()));
    }

    @Test
    public void whenCountsThenUniqException() {
        when(service.getAll()).thenReturn(QUESTIONS_ALL);
        assertThrows(AmountMoreSizeQuestionsException.class, () -> examinerService.getQuestions(WRONG_AMOUNT));
    }
}