import java.util.Scanner;

public class JavaSwitchStatement {
//    The switch case is very commonly used in Java. It is a multi-way branch statement
//    that provides paths to execute different parts of the code based on the value of the expression.
//    The expression can be a byte, short, char, and int primitive data types.
//The switch statement allows us to execute a block of code among many alternatives.

    public static void main(String arg[]){
        Scanner input = new Scanner(System.in);
        System.out.println("please insert a number ");
        int i = input.nextInt();

            switch (i) {

                case 1:
                    // code
                    System.out.println("monday ");
                    break;

                case 2:
                    System.out.println("tuesday ");
                    break;
                case 3:

                    System.out.println("wednesday ");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                default:
                    System.out.println("please insert valid input ");


        }
    }

}
