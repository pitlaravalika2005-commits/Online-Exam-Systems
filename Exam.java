import java.util.Scanner;

public class Exam {

    Question[] questions = {

            new Question(
                    "Which language runs on JVM?",
                    "Python",
                    "Java",
                    "C",
                    "PHP",
                    2),

            new Question(
                    "Which keyword is used for inheritance?",
                    "implements",
                    "extends",
                    "super",
                    "this",
                    2),

            new Question(
                    "Which company developed Java?",
                    "Google",
                    "Microsoft",
                    "Sun Microsystems",
                    "Apple",
                    3),

            new Question(
                    "Size of int in Java?",
                    "2 Bytes",
                    "4 Bytes",
                    "8 Bytes",
                    "16 Bytes",
                    2),

            new Question(
                    "Which package contains Scanner?",
                    "java.io",
                    "java.net",
                    "java.util",
                    "java.awt",
                    3)

    };

    public void startExam() {

        Scanner sc = new Scanner(System.in);

        int score = 0;

        System.out.println("\n===== ONLINE EXAM STARTED =====");

        for (Question q : questions) {

            q.displayQuestion();

            System.out.print("Enter Answer: ");

            int ans = sc.nextInt();

            if (ans == q.answer) {
                score++;
            }
        }

        System.out.println("\n===== RESULT =====");
        System.out.println("Correct Answers : " + score);
        System.out.println("Wrong Answers : " + (questions.length - score));
        System.out.println("Score : " + score + "/" + questions.length);
    }
}