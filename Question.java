public class Question {

    String question;
    String option1;
    String option2;
    String option3;
    String option4;
    int answer;

    public Question(String question,
                    String option1,
                    String option2,
                    String option3,
                    String option4,
                    int answer) {

        this.question = question;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.answer = answer;
    }

    public void displayQuestion() {

        System.out.println("\n" + question);
        System.out.println("1. " + option1);
        System.out.println("2. " + option2);
        System.out.println("3. " + option3);
        System.out.println("4. " + option4);
    }
}