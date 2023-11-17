package pro.sky.java.coursework_2.examineservice.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class AmountMoreSizeQuestionsException extends RuntimeException {
    public AmountMoreSizeQuestionsException(String message) {
        super(message);
    }
}
