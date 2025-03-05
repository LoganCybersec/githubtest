package be.ses.higher_lower;

import java.util.Random;
import java.util.Scanner;

public class App {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Welcome to the Higher or Lower game!");
        System.out.println("Guess if the next number will be higher or lower.");
        
        int currentNumber = random.nextInt(100) + 1;
        boolean playing = true;
        int score = 0;
        
        while (playing) {
            System.out.println("Current number: " + currentNumber);
            System.out.print("Will the next number be higher or lower? (h/l): ");
            String guess = scanner.next().toLowerCase();
            
            int nextNumber = random.nextInt(100) + 1;
            
            if ((guess.equals("h") && nextNumber > currentNumber) || 
                (guess.equals("l") && nextNumber < currentNumber)) {
                System.out.println("Correct! The next number was: " + nextNumber);
                score++;
            } else {
                System.out.println("Wrong! The next number was: " + nextNumber);
                playing = false;
            }
            
            currentNumber = nextNumber;
        }
        
        System.out.println("Game over! Your final score: " + score);
        scanner.close();
    }
}