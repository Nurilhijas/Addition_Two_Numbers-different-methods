/**
 * 
 */
package constructor;


/**
 * @author Nuril Hijas
 *
 */
public class exp10ii {

	/**
	 * @param args
	 parameterized constructor
	 */
	int f;
	int s;
	exp10ii(int f1,int s1)
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
		exp10ii r1=new exp10ii(10,25);
		exp10ii r2=new exp10ii(26,35);
		r1.calculate();
		r2.calculate();
	}

}
