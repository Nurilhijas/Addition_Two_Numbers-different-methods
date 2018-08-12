

/**
 * 
 */

/**
 * @author Nuril Hijas
 *
 */
public class exp10 {
	int a;
	int b;
	int result;
	public void setValue(int a, int b)
	{
		this.a=a;
		this.b=b;
		
	}
	public void showresult()
	{
		System.out.println("Sum of two number is ="+result);
	}

	public static class ClassB1 extends exp10
	{
	public void add()
	{
		result=a+b;
		
	}
		public  static void main(String args[])
		{
			ClassB1 f1 = new ClassB1();
			f1.setValue(10,20);
			f1.add();
			f1.showresult();
		}

	}
}
