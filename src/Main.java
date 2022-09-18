import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);
        System.out.println("please insert your salary amount ?");
        float salary = scan.nextFloat();
        System.out.println("please insert your bank account Saving ? ");
        float saving  = scan.nextFloat();
        System.out.println("do you have a criminal Record ?");
        boolean criminalRecord = scan1.nextBoolean();

        System.out.println("do you have good socialScore ?");
        boolean socialScore = scan.nextBoolean();


        System.out.println(Math.random());



        boolean hasGoodSalary = salary>70_000;
        boolean hasGoodSaving = saving>500_000;


        boolean loan = (hasGoodSalary || hasGoodSaving) && (socialScore && !criminalRecord);

        System.out.println(loan);





    }
}