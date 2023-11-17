package pro.sky.java.coursework_2.examineservice.service.constants;

import pro.sky.java.coursework_2.examineservice.domain.Question;
import java.util.Collection;
import java.util.Set;

public class ConstantsQuestionService {
    public static final int AMOUNT = 10;
    public static final int WRONG_AMOUNT = 11;
    public static final String QUESTION1 = "question1";
    public static final String QUESTION2 = "question2";
    public static final String QUESTION3 = "question3";
    public static final String QUESTION4 = "question4";
    public static final String QUESTION5 = "question5";
    public static final String QUESTION6 = "question6";
    public static final String QUESTION7 = "question7";
    public static final String QUESTION8 = "question8";
    public static final String QUESTION9 = "question9";
    public static final String QUESTION10 = "question10";

    public static final String ANSWER1 = "answer1";
    public static final String ANSWER2 = "answer2";
    public static final String ANSWER3 = "answer3";
    public static final String ANSWER4 = "answer4";
    public static final String ANSWER5 = "answer5";
    public static final String ANSWER6 = "answer6";
    public static final String ANSWER7 = "answer7";
    public static final String ANSWER8 = "answer8";
    public static final String ANSWER9 = "answer9";
    public static final String ANSWER10 = "answer10";
    public static final Question QUESTION_OBJ1 = new Question(QUESTION1, ANSWER1);
    public static final Question QUESTION_OBJ2 = new Question(QUESTION2, ANSWER2);
    public static final Question QUESTION_OBJ3 = new Question(QUESTION3, ANSWER3);
    public static final Question QUESTION_OBJ4 = new Question(QUESTION4, ANSWER4);
    public static final Question QUESTION_OBJ5 = new Question(QUESTION5, ANSWER5);
    public static final Question QUESTION_OBJ6 = new Question(QUESTION6, ANSWER6);
    public static final Question QUESTION_OBJ7 = new Question(QUESTION7, ANSWER7);
    public static final Question QUESTION_OBJ8 = new Question(QUESTION8, ANSWER8);
    public static final Question QUESTION_OBJ9 = new Question(QUESTION9, ANSWER9);
    public static final Question QUESTION_OBJ10 = new Question(QUESTION10, ANSWER10);

    public static final Collection<Question> QUESTIONS_ALL = Set.of(
            QUESTION_OBJ1,
            QUESTION_OBJ2,
            QUESTION_OBJ3,
            QUESTION_OBJ4,
            QUESTION_OBJ5,
            QUESTION_OBJ6,
            QUESTION_OBJ7,
            QUESTION_OBJ8,
            QUESTION_OBJ9,
            QUESTION_OBJ10
    );

    public static final Collection<Question> QUESTIONS_NOT_FIRST = Set.of(
            QUESTION_OBJ2,
            QUESTION_OBJ3,
            QUESTION_OBJ4,
            QUESTION_OBJ5,
            QUESTION_OBJ6,
            QUESTION_OBJ7,
            QUESTION_OBJ8,
            QUESTION_OBJ9,
            QUESTION_OBJ10
    );
}
