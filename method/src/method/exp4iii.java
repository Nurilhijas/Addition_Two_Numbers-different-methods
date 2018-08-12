/**
 * 
 */
package method;

/**
 * @author Nuril Hijas
 *
 */
public class exp4iii {

	/**
	 * @param args
	 parameterized constructor
	 */
	int f;
	int s;
	exp4iii(int f1,int s1)
	{
		f=f1;
		s=s1;
	}
	void calculate()
	{
		System.out.println(f+s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exp4iii r1=new exp4iii(10,25);
		exp4iii r2=new exp4iii(26,35);
		r1.calculate();
		r2.calculate();
	}

}
