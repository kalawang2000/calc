import java.util.Scanner;
import java.util.InputMismatchException;

public class javacalc 
{
	
	
	public int enternum() {	
	
	boolean bError=true;
	int num1=0;
	Scanner in = new Scanner(System.in); 	       
		do {
			try {
				System.out.print("Please enter an integer: ");
				num1 = in.nextInt();
				bError = false;
				
				} 
			catch (InputMismatchException e) {
				System.out.print("(Wrong input) ");
				}
				in.nextLine(); 
		} while (bError);
		return(num1);

    }
    
	public String enterope()
	{
		Scanner in2 = new Scanner(System.in); 	
		String oper;
		boolean bool=true;
		do {
		System.out.print("Please enter operator + - * /: ");	
		oper = in2.next();	
		if (oper.equals("-") || oper.equals("+") || oper.equals("*") || oper.equals("/"))
		{
			bool=false;			
			
		}
		else {
		in2.nextLine();	
		System.out.print("Wrong input!!! ");		
		
		}
		
		}
		while (bool);
		
		return(oper);
		
		
		
	}
	
	
    public static void main(String[] args) 
    {
        int num1, num2;
        String operator;
		javacalc c= new javacalc();
		javacalc a= new javacalc();
		javacalc b= new javacalc();
      //  Scanner input = new Scanner(System.in);

        //System.out.print("please enter the first number ");
        num1=a.enternum();
		num2=b.enternum();
		operator=c.enterope();
       // System.out.print("please enter the second number ");
      //  num2 = input.nextInt();

        Scanner ope = new Scanner(System.in);

        System.out.println("Please enter operator ");
        //operator = ope.next();
	
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