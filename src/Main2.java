import java.util.Scanner;

public class Main2 {

    public static void main(String args[]){

        System.out.println(Math.random());
        Scanner scan = new Scanner(System.in);
//        boolean x = scan.nextBoolean();
        System.out.println("please insert your lucky number?");
        int lNumber = scan.nextInt();
        if(0<lNumber && lNumber<11) {
            int randomNumber = (int) Math.round(Math.random() * 10);
            System.out.println("auto generated random number is " + randomNumber);

            System.out.println(randomNumber == lNumber);
            String fullName = scan.next();
        }
        System.out.println("please try again");



    }
}

