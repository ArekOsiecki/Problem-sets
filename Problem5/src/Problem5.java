import java.util.Scanner;

public class Problem5 {
    public static void main (String args[]){

        String calc ;
        double num1, num2, result=0;

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to calculator, choose from Addition,Subtraction,Multiplication or Division by entering corresponding letter ");
        System.out.println("Please enter first letter of operation: ");
        calc = input.nextLine();
        System.out.println("Please enter first number: ");
        num1 = input.nextDouble();
        System.out.println("Please enter second number: ");
        num2 = input.nextDouble();


        switch(calc){
            case "A" : result = num1+num2;
            break;
            case "S" : result = num1-num2;
            break;
            case "M" : result = num1*num2;
            break;
            case "D" : result = num1/num2;
            break;
            default : System.out.print("You have not entered a correct operation letter");
            break;
        }

        System.out.println("Result of your operation is "+result);
    }
}
