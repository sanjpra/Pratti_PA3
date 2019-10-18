import com.sun.source.tree.CompilationUnitTree;

import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerAssistedInstructions {

    /*
    int[] math = new int[] { 1, 2, 3, 4, 5};
    int[] diffic = new int[] {1,2,3,4};
    int[][] randomNums = new int[10][2];

    */
    public static boolean repeat = false;

    public static int[][] numbers = new int[10][2];
    public static int[] answers = new int[10];



    Scanner scnr = new Scanner(System.in);

    public static double numOfDigits(int difficulty, int questionType) {
        SecureRandom randomNumber = new SecureRandom();
        ComputerAssistedInstructions cs = new ComputerAssistedInstructions();

        int multiplication, addition, subtraction, division;
        int num1 = 0;
        int num2 = 0;
        int[][] numbers = new int[10][2];
        int[] answers = new int[10];

        for(int i = 0; i<10; i++){
            if(difficulty == 1) {
                num1 = randomNumber.nextInt(8) +1;
                num2 = randomNumber.nextInt(8) +1;
            } else if(difficulty == 2) {
                num1 = randomNumber.nextInt(89) + 10;
                num2 = randomNumber.nextInt(89) + 10;
            } else if (difficulty == 3) {
                num1 = randomNumber.nextInt(899) + 100;
                num2 = randomNumber.nextInt(899) + 100;
            } else if(difficulty == 4) {
                num1 = randomNumber.nextInt(8999) + 1000;
                num2 = randomNumber.nextInt(8999) + 1000;
            }

            ComputerAssistedInstructions.numbers[i][0] = num1;
            ComputerAssistedInstructions.numbers[i][1] = num2;
        }


         double printThisPls = 0;


        for(int i = 0; i<10; i++) {
            num1 = ComputerAssistedInstructions.numbers[i][0];
            num2 = ComputerAssistedInstructions.numbers[i][1];

            if (questionType == 1) {
                // prints only one question
                addition = num1 + num2;
                System.out.println("How much is " + num1 + " plus " + num2 + "?");
                ComputerAssistedInstructions.answers[i] = addition;

            } else if (questionType == 2) {
                multiplication = num1 * num2;
                System.out.println("How much is " + num1 + " times " + num2 + "?");
                ComputerAssistedInstructions.answers[i]  = multiplication;
            } else if (questionType == 3) {
                subtraction = num1 - num2;
                System.out.println("How much is " + num1 + " minus " + num2 + "?");
                ComputerAssistedInstructions.answers[i]  = subtraction;
            } else if (questionType == 4) {
                division = num1 / num2;
                System.out.println("How much is " + num1 + " divided by " + num2 + "?");
                ComputerAssistedInstructions.answers[i]  = division;
            }
        }

          return printThisPls; // This is important

    }

    public static int CorrectAnswer() {
        SecureRandom randomNumber = new SecureRandom();
        int choice;
        choice = randomNumber.nextInt(4);

        switch(choice) {

            case 0:
                System.out.println("Very good!");
                break;
            case 1:
                System.out.println("Excellent!");
                break;
            case 2:
                System.out.println("Nice Work!");
                break;
            case 3:
                System.out.println("Keep up the good work!");
                break;
        }
        return choice;
    }
    public static int wrongAnswer() {
        SecureRandom randomNumber = new SecureRandom();
        int choice = randomNumber.nextInt(4);

        switch(choice) {

            case 0:
                System.out.println("No. Please try again.");
                break;
            case 1:
                System.out.println("Wrong. Try once more.");
                break;
            case 2:
                System.out.println("Don't give up!");
                break;
            case 3:
                System.out.println("No. Keep trying. ");
                break;
        }
        return choice;
    }

    public static double Everything() {
      System.out.println("Enter a difficulty level[1 - 2 - 3 - 4]");
      ComputerAssistedInstructions cs = new ComputerAssistedInstructions();
      Scanner sc = cs.scnr;

      int userDiff = sc.nextInt();


      // Let user pick question type
      System.out.println("Pick a type of Arithmetic problem you would like to study:");
      System.out.println("[1] Addition");
      System.out.println("[2] Multiplication");
      System.out.println("[3] Subtraction");
      System.out.println("[4] Division");
      System.out.println("[5] Mixed");
      int userQtType = sc.nextInt();

      numOfDigits(userDiff, userQtType);

      int[] userInput = new int[10];

      for(int i = 0; i < userInput.length ; i++ ) {
          userInput[i] = sc.nextInt();
      }

      int count = 0;
      for(int i = 0; i < 10 ; i++) {
          if(userInput[i] == cs.answers[i]) {
              count++;
          }
      }

      int wrong = 0;
      for(int i = 0; i < 10; i++) {
          if (userInput[i] != cs.answers[i]) {
              wrong++;
          }
      }
      System.out.println("You got " + count + " correct and " + wrong + " wrong.");


      double grade = (count * 100) / 10  ;
      System.out.println("You got " + grade + "%");
      return grade;

  }
    public static void main(String[] args) {
        ComputerAssistedInstructions cs = new ComputerAssistedInstructions(); // to access scanner!
        Scanner sc = cs.scnr;
        // let user pick difficulty

        System.out.println("Enter a difficulty level[1 - 2 - 3 - 4]");
        int userDiff = sc.nextInt();

        // Let user pick question type
        System.out.println("Pick a type of Arithmetic problem you would like to study:");
        System.out.println("[1] Addition");
        System.out.println("[2] Multiplication");
        System.out.println("[3] Subtraction");
        System.out.println("[4] Division");
        System.out.println("[5] Mixed");
        int userQtType = sc.nextInt();

        numOfDigits(userDiff, userQtType);

        int[] userInput = new int[10];

        for (int i = 0; i < userInput.length; i++) {
            userInput[i] = sc.nextInt();
        }

        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (userInput[i] == cs.answers[i]) {
                count++;
            }
        }

        int wrong = 0;
        for (int i = 0; i < 10; i++) {
            if (userInput[i] != cs.answers[i]) {
                wrong++;
            }
        }
        System.out.println("You got " + count + " correct and " + wrong + " wrong.");


        double grade = (count * 100) / 10;
        System.out.println("You got " + grade + "%");


        while(grade >= 75.0) {
            CorrectAnswer();
            System.out.println("Would you like to start a new session? [Yes] or [No]");
            String userResp = sc.next();
            if(userResp.equals("No")) {
               System.out.println("\nExiting\n");
                break;
            } else {
                Everything();
            }
        }

        while(grade < 75.0) {
            wrongAnswer();
            System.out.println("\nPlease ask your teacher for help\n");
            System.out.println("Starting a new session--> \n ");
            Everything();
        }
    }
}
