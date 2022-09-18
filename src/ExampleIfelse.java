import java.util.Scanner;

public class ExampleIfelse {

public static void main(String t[]){

    Scanner input = new Scanner(System.in);
    System.out.println("please insert your number ?");
    int number  = input.nextInt();
    //condition ? expression1 : expression2;
    String output  = (number % 2==0)
            ?"even number":"odd number";
    System.out.println(output);

    boolean output2  =  (number % 2==0 && number % 5==0 )? true:false;


//    boolean isEven = number % 2 == 0;
//    boolean isDivisibleby3 = number % 3 == 0;
//    boolean isDivisibleby5 = number % 5 == 0;
//
//    if(isEven){
//        if (isEven &&  isDivisibleby5)
//            System.out.println("can be div 2/5");
//        else if (isEven)
//            System.out.println("can be div 2");
//        else if (isDivisibleby5)
//            System.out.println("can be div 5");
//    }
//    else {
//
//        if (isDivisibleby5 && isDivisibleby3)
//            System.out.println("can be div 3/5");
//        else if (isDivisibleby3)
//            System.out.println("can be div 3");
//        else if (isDivisibleby5)
//            System.out.println("can be div 5");
//        else
//            System.out.println("Can't be div by 3/5");
//
//
//    }

}

}
