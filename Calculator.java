import java.util.Scanner;
class Calculator
{
	public static void main(String args[])
    {
	double num1,num2,result=0;
	char ch;
	 Scanner sc = new Scanner(System.in);
	
	while(true)
	{
	System.out.println(" 1.  Addition\n  2. Subtraction\n 3. Multiplication\n 4. Division\n5. Modulus\n 0 exit");             
     System.out.print("Select your choice  : ");

	int n=sc.nextInt();

	if(n>5||n<=0)
               {
	          System.out.print("program succesfully exited !\n");
	          break;
	            }
               
                else
               {
                 System.out.print("Enter Two Numbers : ");
                 num1 = sc.nextDouble();
                 num2 = sc.nextDouble();
	 switch(n)
	 {
	case 1 :
		 result = num1+ num2;
        break;

	case 2 :  
		result = num1- num2;
        break;

	case 3 : 
		result = num1* num2;
		break;
	case 4 :
          if(num2>0)
		    {	 
		        result = num1/ num2;
                    	
            }

		else
		{
		System.out.println("second number should not be 0");
		result=0;
		}
            break;

	case 5 :
         result = num1% num2;
		 break;	
	
	
	
	}          
    
    System.out.println("Result = " + result);
 }
           
	
 System.out.print("-----------------------------------------------\n");
	
}
	
}

}