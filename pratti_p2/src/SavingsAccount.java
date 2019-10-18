import java.util.Scanner;
// Sanjana Pratti


public class SavingsAccount {
    static private double annualInterestRate;
    private double savingBalance;


    public SavingsAccount() {

    }

    public SavingsAccount(double savingBalance) {
        this.savingBalance=savingBalance;
    }


    public double getSavingBalance() {
        return this.savingBalance;
    }


    public static void modifyInterestRate(double newInterestRate) {
        annualInterestRate=newInterestRate;
    }


    public void calculateMonthlyInterest() {
        double monthlyI;
        monthlyI= (double)(this.savingBalance*annualInterestRate/12);
        this.savingBalance+=monthlyI;
    }


    public static void main(String[] args) {

        //Instantiate 2 saving account objects saver1 and saver2
        SavingsAccount saver1, saver2;
        saver1 = new SavingsAccount (2000.0);
        saver2= new SavingsAccount (3000.0);

        int total = 0;

        //Set the annual interest rate to 4%
        SavingsAccount.modifyInterestRate (0.04);
        System.out.println("Balance for Saver 1-->");

        for(int i=0; i<12; i++) {
            saver1.calculateMonthlyInterest();
            System.out.println("Month " + (i+1)+" : "+ String.format("%.2f",saver1.getSavingBalance()));
        }

        System.out.println("\nBalance for Saver 2-->\n");

        for(int i=0; i<12; i++){
            saver2.calculateMonthlyInterest();
            System.out.println("Month " + (i+1)+" : "+ String.format("%.2f",saver2.getSavingBalance()));
        }

        //Set the annual interest rate to 5%
        SavingsAccount.modifyInterestRate(0.05);
        System.out.println("\nAnnual interest rate = 5% \nBalance for Saver 1-->\n");
        for(int i=0; i<12; i++) {
            saver1.calculateMonthlyInterest();
            System.out.println("Month " + (i+1)+" : "+ String.format("%.2f",saver1.getSavingBalance()));
        }

        System.out.println("\nAnnual interest rate = 5% \nBalance for Saver 2-->\n");

        for(int i=0; i<12; i++) {
            saver2.calculateMonthlyInterest();
            System.out.println("Month " + (i+1)+" : "+ String.format("%.2f",saver2.getSavingBalance()));
        }

    }
}


