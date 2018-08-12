package constructor;
/**
 * @author Nuril Hijas
 *
 */
public class exp10iii {
	/**
	 * @param args
	 parameterized constructor
	 */
	int a;
	int b;
	exp10iii(int f1, int f2 )
	{
		a=f1;
		b=f2;
	}
	exp10iii(exp10iii s)
	{
		a=s.a;
		b=s.b;
		
	}
	void calculate()
	{
		System.out.println(a+b);
	}
public static void main(String args[])
{
	exp10iii s1 =new exp10iii(10,20);
	exp10iii s2 =new exp10iii(s1); 
	s1.calculate();
	s2.calculate();
}
}
