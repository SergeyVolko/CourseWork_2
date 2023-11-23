package pro.sky.java.coursework_2.examineservice.repository;

import org.junit.jupiter.api.Test;
import pro.sky.java.coursework_2.examineservice.domain.Question;
import java.util.Set;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static pro.sky.java.coursework_2.examineservice.service.constants.ConstantsQuestionService.*;

class JavaQuestionRepositoryTest {

    JavaQuestionRepository repository = new JavaQuestionRepository();

    @Test
    public void whenAddQuestionThenContainsSet() {
        repository.add(QUESTION_OBJ1);
        assertThat(repository.getAll()).containsExactlyInAnyOrderElementsOf(Set.of(QUESTION_OBJ1));
    }

    @Test
    public void whenAddQuestionThenReturnQuestion() {
        Question actual = repository.add(QUESTION_OBJ1);
        assertEquals(QUESTION_OBJ1, actual);
    }

    @Test
    public void whenRemoveInEmptyRepositoryThenReturnNull() {
        Question actual = repository.remove(QUESTION_OBJ1);
        assertNull(actual);
    }

    @Test
    public void whenRemoveAfterAddQuestionThenQuestion() {
        repository.add(QUESTION_OBJ1);
        Question actual = repository.remove(QUESTION_OBJ1);
        assertEquals(QUESTION_OBJ1, actual);
    }

}