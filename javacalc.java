import java.util.Scanner;


public class javacalc 
{

    public static void main(String[] args) 
    {
        int num1, num2;
        String operator;


        Scanner input = new Scanner(System.in);

        System.out.print("please enter the first number ");
        num1 = input.nextInt();

        System.out.print("please enter the second number ");
        num2 = input.nextInt();

        Scanner ope = new Scanner(System.in);

        System.out.println("Please enter operator ");
        operator = ope.next();
	
		//System.out.println(operator);
		if (operator.equals("+"))
            System.out.println("your answer is " + (num1 + num2));
        if (operator.equals("-"))
            System.out.println("your answer is " + (num1 - num2));
        if (operator.equals("/"))
            System.out.println("your answer is " + (num1 / num2));
        if (operator.equals("*"))
            System.out.println("your answer is " + (num1 * num2));


    }
}