import java.util.Arrays;
import java.util.Scanner;

public class Equib {

    public static void main(String A[]){
        Scanner input = new Scanner(System.in);
        String equibtega[]  = new String[10];
        System.out.println("please insert your name ");
        equibtega[0] = input.nextLine();
        System.out.println("please insert your name ");
        equibtega[1] = input.nextLine();
        System.out.println("please insert your name ");
        equibtega[2] = input.nextLine();
        System.out.println("please insert your name ");
        equibtega[3] = input.nextLine();
        System.out.println("please insert your name ");
        equibtega[4] = input.nextLine();
        System.out.println("please insert your name ");
        equibtega[5] = input.nextLine();
        System.out.println("please insert your name ");
        equibtega[6] = input.nextLine();
        System.out.println("please insert your name ");
        equibtega[7] = input.nextLine();
        System.out.println("please insert your name ");
        equibtega[8] = input.nextLine();
        System.out.println("please insert your name ");
        equibtega[9] = input.nextLine();

        System.out.println
                (Arrays.toString(equibtega));
        long luckNumber =
                Math.round(Math.random()*10);
        System.out.println
                ("congrats  " +
                        equibtega[
                                (int) luckNumber]+" you are the luck equbitega");
    }
}
