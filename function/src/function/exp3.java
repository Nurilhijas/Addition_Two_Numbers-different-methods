
/**
 * 
 */
package function;
import java.util.*;
/**
 * @author Nuril Hijas
 *
 */
public class exp3 {

	private static Scanner data;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		data = new Scanner(System.in);
int num1,num2;
System.out.println("enter first number");
num1=data.nextInt();
System.out.println("enter Second number");
num2=data.nextInt();
sum(num1,num2);
	}
	public static void sum(int numx,int numy)
	{
		int sum=0;
		sum=numx+numy;
		System.out.println("sum of two numbers is "+sum);
	}

}
