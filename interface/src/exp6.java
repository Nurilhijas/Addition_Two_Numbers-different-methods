/**
 * 
 */

/**
 * @author Nuril Hijas
 *
 */
import java.util.*;
interface exp6 {
void input();
void add();
}	/**
	 * @param args
	 */
class Test implements exp6
{
int x,y,z;
Scanner sc= new Scanner(System.in);

	@Override
	public void input() {
		// TODO Auto-generated method stub
		System.out.println("enter two numbers");
		x=sc.nextInt();
		y=sc.nextInt();
		
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		z=x+y;
	}
	void display()
	{
		System.out.println("\nthe sum is"+z);
	}
	public static void main(String args[])
	{
		Test t1= new Test();
		t1.input();
		t1.add();
		t1.display();
	}
}
	
