package pro.sky.java.coursework_2.examineservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pro.sky.java.coursework_2.examineservice.domain.Question;
import pro.sky.java.coursework_2.examineservice.service.ExaminerService;
import java.util.Collection;

@RestController
@RequestMapping("/exam/get")
public class ExamController {

    public final ExaminerService service;

    @Autowired
    public ExamController(ExaminerService service) {
        this.service = service;
    }

    @GetMapping("{amount}")
    public Collection<Question> getQuestions(@PathVariable int amount) {
        return service.getQuestions(amount);
    }
}
