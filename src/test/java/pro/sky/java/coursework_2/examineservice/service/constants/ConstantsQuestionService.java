package pro.sky.java.coursework_2.examineservice.service.constants;

import pro.sky.java.coursework_2.examineservice.domain.Question;
import java.util.Collection;
import java.util.Random;
import java.util.Set;

public class ConstantsQuestionService {
    public static final int AMOUNT = 10;
    public static final int WRONG_AMOUNT = 11;
    public static final int AMOUNT_FOR_GET_RANDOM_QUESTION = 100;
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
    public static final String ADD_QUESTION = "add question";

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

    public static final String ADD_ANSWER = "answer add";
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

    public static final Question ADD_QUESTION_OBJ = new Question(ADD_QUESTION, ADD_ANSWER);

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

    public static final Collection<Question> QUESTIONS_ALL_WITH_ADD = Set.of(
            QUESTION_OBJ1,
            QUESTION_OBJ2,
            QUESTION_OBJ3,
            QUESTION_OBJ4,
            QUESTION_OBJ5,
            QUESTION_OBJ6,
            QUESTION_OBJ7,
            QUESTION_OBJ8,
            QUESTION_OBJ9,
            QUESTION_OBJ10,
            ADD_QUESTION_OBJ
    );

    public static final String MATH_QUESTION1 = "math question1";
    public static final String MATH_QUESTION2 = "math question2";
    public static final String MATH_QUESTION3 = "math question3";
    public static final String MATH_QUESTION4 = "math question4";
    public static final String MATH_QUESTION5 = "math question5";
    public static final String MATH_QUESTION6 = "math question6";
    public static final String MATH_QUESTION7 = "math question7";
    public static final String MATH_QUESTION8 = "math question8";
    public static final String MATH_QUESTION9 = "math question9";
    public static final String MATH_QUESTION10 = "math question10";
    public static final String MATH_ADD_QUESTION = "math add question";

    public static final String MATH_ANSWER1 = "math answer1";
    public static final String MATH_ANSWER2 = "math answer2";
    public static final String MATH_ANSWER3 = "math answer3";
    public static final String MATH_ANSWER4 = "math answer4";
    public static final String MATH_ANSWER5 = "math answer5";
    public static final String MATH_ANSWER6 = "math answer6";
    public static final String MATH_ANSWER7 = "math answer7";
    public static final String MATH_ANSWER8 = "math answer8";
    public static final String MATH_ANSWER9 = "math answer9";
    public static final String MATH_ANSWER10 = "math answer10";
    public static final String MATH_ADD_ANSWER = "math answer add";

    public static final Question MATH_QUESTION_OBJ1 = new Question(MATH_QUESTION1, MATH_ANSWER1);
    public static final Question MATH_QUESTION_OBJ2 = new Question(MATH_QUESTION2, MATH_ANSWER2);
    public static final Question MATH_QUESTION_OBJ3 = new Question(MATH_QUESTION3, MATH_ANSWER3);
    public static final Question MATH_QUESTION_OBJ4 = new Question(MATH_QUESTION4, MATH_ANSWER4);
    public static final Question MATH_QUESTION_OBJ5 = new Question(MATH_QUESTION5, MATH_ANSWER5);
    public static final Question MATH_QUESTION_OBJ6 = new Question(MATH_QUESTION6, MATH_ANSWER6);
    public static final Question MATH_QUESTION_OBJ7 = new Question(MATH_QUESTION7, MATH_ANSWER7);
    public static final Question MATH_QUESTION_OBJ8 = new Question(MATH_QUESTION8, MATH_ANSWER8);
    public static final Question MATH_QUESTION_OBJ9 = new Question(MATH_QUESTION9, MATH_ANSWER9);
    public static final Question MATH_QUESTION_OBJ10 = new Question(MATH_QUESTION10, MATH_ANSWER10);
    public static final Question MATH_ADD_QUESTION_OBJ = new Question(MATH_ADD_QUESTION, MATH_ADD_ANSWER);

    public static final Collection<Question> MATH_QUESTIONS_ALL = Set.of(
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

    public static final Collection<Question> MATH_QUESTIONS_NOT_FIRST = Set.of(
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

    public static final Collection<Question> MATH_QUESTIONS_ALL_WITH_ADD = Set.of(
            MATH_QUESTION_OBJ1,
            MATH_QUESTION_OBJ2,
            MATH_QUESTION_OBJ3,
            MATH_QUESTION_OBJ4,
            MATH_QUESTION_OBJ5,
            MATH_QUESTION_OBJ6,
            MATH_QUESTION_OBJ7,
            MATH_QUESTION_OBJ8,
            MATH_QUESTION_OBJ9,
            MATH_QUESTION_OBJ10,
            MATH_ADD_QUESTION_OBJ
    );

    public static final Collection<Question> QUESTIONS_ALL_WITH_MATH = Set.of(
            QUESTION_OBJ1,
            QUESTION_OBJ2,
            QUESTION_OBJ3,
            QUESTION_OBJ4,
            QUESTION_OBJ5,
            QUESTION_OBJ6,
            QUESTION_OBJ7,
            QUESTION_OBJ8,
            QUESTION_OBJ9,
            QUESTION_OBJ10,
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

    public static final int ACTION_NUM1 = 0;
    public static final int ACTION_NUM2 = 1;
    public static final int ACTION_NUM3 = 2;
    public static final int ACTION_NUM4 = 3;
    public static final int ONE = 1;
    public static final int TWO = 2;
    public static final int SIX = 6;
    public static final int THREE = 3;
    public static final int FOUR = 4;
    public static final int TEN = 10;
    public static final String ARITHMETIC_QUESTION_ADD = "1 + 2 = ?";
    public static final String ARITHMETIC_QUESTION_DEF = "6 - 4 = ?";
    public static final String ARITHMETIC_QUESTION_MULTIPLE = "2 * 3 = ?";
    public static final String ARITHMETIC_QUESTION_DIV = "10 / 2 = ?";

    public static final String ARITHMETIC_ANSWER_ADD = "math answer: 3";
    public static final String ARITHMETIC_ANSWER_DEF = "math answer: 2";
    public static final String ARITHMETIC_ANSWER_MULTIPLE = "math answer: 6";
    public static final String ARITHMETIC_ANSWER_DIV = "math answer: 5";

    public static final Question ARITHMETIC_QUESTION_ADD_OBJ =
            new Question(ARITHMETIC_QUESTION_ADD, ARITHMETIC_ANSWER_ADD);
    public static final Question ARITHMETIC_QUESTION_DEF_OBJ =
            new Question(ARITHMETIC_QUESTION_DEF, ARITHMETIC_ANSWER_DEF);
    public static final Question ARITHMETIC_QUESTION_MULTIPLE_OBJ =
            new Question(ARITHMETIC_QUESTION_MULTIPLE, ARITHMETIC_ANSWER_MULTIPLE);
    public static final Question ARITHMETIC_QUESTION_DIV_OBJ =
            new Question(ARITHMETIC_QUESTION_DIV, ARITHMETIC_ANSWER_DIV);

    public static final Collection<Question> MATH_ARITHMETIC_QUESTIONS = Set.of(
            ARITHMETIC_QUESTION_ADD_OBJ,
            ARITHMETIC_QUESTION_DEF_OBJ,
            ARITHMETIC_QUESTION_MULTIPLE_OBJ,
            ARITHMETIC_QUESTION_DIV_OBJ
    );
}
