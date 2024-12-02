import java.util.Scanner;

public class OnlineQuizPlatform {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define the questions, options, and answers
        String[] questions = {
            "What is the capital of France?",
            "Which is the largest planet in our solar system?",
            "What is the chemical symbol for water?",
            "Who wrote 'Romeo and Juliet'?"
        };

        String[][] options = {
            {"1. Paris", "2. London", "3. Berlin", "4. Madrid"},
            {"1. Earth", "2. Mars", "3. Jupiter", "4. Saturn"},
            {"1. O2", "2. CO2", "3. H2O", "4. CH4"},
            {"1. William Shakespeare", "2. Charles Dickens", "3. Mark Twain", "4. Jane Austen"}
        };

        int[] correctAnswers = {1, 3, 3, 1};  // Correct answers (index starts from 1)

        int score = 0;
        
        System.out.println("Welcome to the Online Quiz Platform!");
        System.out.println("Please answer the following questions:\n");

        // Loop through the questions
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }
            
            System.out.print("Enter your answer (1-4): ");
            int userAnswer = scanner.nextInt();

            if (userAnswer == correctAnswers[i]) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong! The correct answer was: " + correctAnswers[i] + "\n");
            }
        }

        // Display the final score
        System.out.println("Quiz completed! Your final score is: " + score + "/" + questions.length);
        
        scanner.close();
    }
}
