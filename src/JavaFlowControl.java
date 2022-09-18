import java.util.Scanner;

public class JavaFlowControl {

public static void main(String ar[]){
    Scanner scan = new Scanner(System.in);
    System.out.println("please insert the first number?");
    int fNumber = scan.nextInt();
    System.out.println("please insert the 2nd number?");
    int sNumber = scan.nextInt();
    System.out.println("please insert operator ?");
    System.out.println("- + * /");
    char op = scan.next().charAt(0);
    if(op=='+'){
        System.out.println(fNumber+sNumber);
    } else if (op=='-') {
        System.out.println(fNumber-sNumber);
    }




}
}
