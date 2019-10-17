import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerAssistedInstructions {

    Scanner scnr = new Scanner(System.in);

    public static double multiplicationAr() {

        double num1, num2;

        SecureRandom randomNumber = new SecureRandom();
        num1 = randomNumber.nextInt(10) + 1;
        num2 = randomNumber.nextInt(10) + 1;

        System.out.println("How much is "+ num1 + " times " + num2 + "?");

        return num1 * num2;


    }
    public static double additionAr() {
        double num1, num2;

        SecureRandom randomNumber = new SecureRandom();
        num1 = randomNumber.nextInt(10) + 1;
        num2 = randomNumber.nextInt(10) + 1;

        System.out.println("How much is "+ num1 + " plus " + num2 + "?");

        return num1 + num2;
    }
    public static int subtractionAr() {
        int num1, num2;

        SecureRandom randomNumber = new SecureRandom();
        num1 = randomNumber.nextInt(10) + 1;
        num2 = randomNumber.nextInt(10) + 1;

        System.out.println("How much is "+ num1 + " minus " + num2 + "?");

        return num1 - num2;
    }
    public static int divisionAr() {

        int num1, num2;

        SecureRandom randomNumber = new SecureRandom();
        num1 = randomNumber.nextInt(10) + 1;
        num2 = randomNumber.nextInt(10) + 1;

        System.out.println("How much is "+ num1 + " divided by " + num2 + "?");

        return num1 / num2;

    }
    public static int mixedAr() {

        SecureRandom randomNumber = new SecureRandom();
        int number ;
        number = randomNumber.nextInt(4);
        System.out.println(number);

        if(number == 0) {
            System.out.println("Multiplication");
            multiplicationAr();
        }
        else if (number == 1) {
            System.out.println("Addition");
            additionAr();
        } else if (number == 2) {
            System.out.println("Division");
            divisionAr();
        }
        else if(number == 3) {
            System.out.println("Subtraction");
            subtractionAr();
        }

        /*switch(number) {
            case 0:
                System.out.println("Multiplication");
                multiplicationAr();
                break;
            case 1:
                System.out.println("Addition");
                additionAr();
                break;
            case 2:
                System.out.println("Division");
                divisionAr();
                break;
            case 3:
                System.out.println("Subtraction");
                subtractionAr();
                break;
        } */
        return number;
    }

    public double digits(int difficulty) {
        SecureRandom randomNumber = new SecureRandom();

        double num1, num2;
         if(difficulty == 1) {
             num1 = randomNumber.nextInt(10) + 1;
             num2 = randomNumber.nextInt(10) + 1;
         } else if(difficulty == 2) {
             num1 = randomNumber.nextInt(99) + 10;
             num2 = randomNumber.nextInt(99) + 10;
         } else if (difficulty == 3) {
             num1 = randomNumber.nextInt(999) + 100;
             num2 = randomNumber.nextInt(999) + 100;
         } else if(difficulty == 4) {
             num1 = randomNumber.nextInt(9999) + 1000;
             num2 = randomNumber.nextInt(9999) + 1000;
         }

         double[] numbersArray = new double[2];
         numbersArray[0] = num1;
         numbersArray[1] = num2;

         return numbersArray[] ;

    }
    public static int doubleDigits() {
        int num1, num2;

        SecureRandom randomNumber = new SecureRandom();
        num1 = randomNumber.nextInt(99) + 10;
        num2 = randomNumber.nextInt(99) + 10;

        System.out.println("How much is "+ num1 + " times " + num2 + "?");

        return num1 * num2;
    }
    public static int tripleDigits() {
        int num1, num2;

        SecureRandom randomNumber = new SecureRandom();
        num1 = randomNumber.nextInt(999) + 100;
        num2 = randomNumber.nextInt(999) + 100;

        System.out.println("How much is "+ num1 + " times " + num2 + "?");

        return num1 * num2;
    }
    public static int fourDigits() {
        int num1, num2;

        SecureRandom randomNumber = new SecureRandom();
        num1 = randomNumber.nextInt(9999) + 1000;
        num2 = randomNumber.nextInt(9999) + 1000;

        System.out.println("How much is "+ num1 + " times " + num2 + "?");

        return num1 * num2;
    }

    public int generateQuestions(int difficulty, int questionType) {
        switch(difficulty) {
            case 1:
                //regular digits;
                break;
            case 2:
                doubleDigits();
                break;
            case 3:
                tripleDigits();
                break;
            case 4:
                fourDigits();
                break;
        }
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
  /*  public static int AllQuestions() {
        int displayQuestion = 0;
        int[] generateQuestions = new int[10];

        for(int i = 0; i<generateQuestions.length; i++){
            generateQuestions[i]= multiplicationAr();
            displayQuestion = generateQuestions[i];
        }
        return displayQuestion;
    }
    public static int findMatching(int[] a, int[] b) {
        int count = 0;

        for(int i = 0, j = 0; i <a.length && j < b.length; i++, j++  ) {
            if( a[i] == b[j]) {
                count++;
            }
        }
        System.out.println("it worked!");
        return count;
    }
    public double EverythingWeNeed() {
        // Generating 10 questions at once9807
        int[] generateQuestions = new int[10];

        for(int i = 0; i<generateQuestions.length; i++){
            generateQuestions[i]= multiplicationAr();

        }
        // User answers
        int[] userInput = new int[10];
        for(int i = 0; i < userInput.length; i++) {
            userInput[i] = scnr.nextInt();
            //System.out.println("so far so good");
        }
        //counting number of correct responses
        int count = 0;
        int j;
        for (j = 0; j < userInput.length; j++) {
            if(userInput[j] == generateQuestions[j]) {
                count++;
            }
        }
        //calculating the percentage
        double userResult = count;
        userResult = userResult /10 * 100;
        return userResult;
    }
    */

    public  void main(String[] args) {
        ComputerAssistedInstructions cs = new ComputerAssistedInstructions(); // to access scanner!
        Scanner sc = cs.scnr;
        // let user pick difficulty

        System.out.println("Enter a difficulty level[1 - 2 - 3 - 4]");
        int userDiff = sc.nextInt();
        digits(userDiff);
        // Let user pick question type
        System.out.println("Pick a type of Arithmetic problem you would like to study:");
        System.out.println("[1] Addition");
        System.out.println("[2] Multiplication");
        System.out.println("[3] Subtraction");
        System.out.println("[4] Division");
        System.out.println("[5] Mixed");
        int userQtType = sc.nextInt();

        switch(userQtType) {
            case 1:
                System.out.println("You picked Addition\n");
                additionAr();
                userQtType = sc.nextInt();
                break;
            case 2:
                System.out.println("You picked Multiplication\n");
                multiplicationAr();
                userQtType = sc.nextInt();

                break;
            case 3:
                System.out.println("You picked Subtraction\n");
                subtractionAr();
                userQtType = sc.nextInt();
                break;
            case 4:
                System.out.println("You picked Division\n");
                divisionAr();
                userQtType = sc.nextInt();
                break;
            case 5:
                System.out.println("You picked mixed\n");
                mixedAr();
                userQtType = sc.nextInt();
                break;
        }

        /*
        //User can pick a difficulty now
        System.out.println("Enter a difficulty level[1 - 2 - 3 - 4]");
        int userChoice = sc.nextInt();
        int answer;
        if(userChoice == 1) {
            multiplicationAr();
        }
        else if (userChoice == 2) {
            doubleDigits();
        }
        else if (userChoice == 3) {
            tripleDigits();
        } else if(userChoice == 4) {
            fourDigits();
        }
        //Check if below or above 75%
    	double userResult = 1;
        while(true) {
        	userResult = 1.0;
            //System.out.println("test 1");
            userResult = cs.EverythingWeNeed();
            //System.out.println("test 2");
            System.out.println("\nYou got: "  + userResult + "%\n");

            if(userResult >= 75.0) {
                System.out.println("3Congratulations, you are ready to go to the next level!\n\n");
            }
            else {
                System.out.println("Please ask teacher for extra help\n\n");
            }
        }
        */
    }
}
