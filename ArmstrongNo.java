package numbers;
import java.util.Scanner;
import java.lang.Math;

public class ArmstrongNo {

	public static int countDigit(int no)
	{
		int count = 0 ;
		while (no>0)
		{
			no=no/10;
			count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int digit;
		int sum=0;
		int no = sc.nextInt();
		int n=no;
        int order = countDigit(no);
        
        while (no>0)
        {
        	digit = no%10;
        	sum = sum + (int)Math.pow(digit,order);
        	no=no/10;
        }
        
        if (sum==n)
        {
        	System.out.println("Yes");
        }
        else
        {
        	System.out.println("No");
        }
	}

}
