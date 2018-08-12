/**
 * 
 */

/**
 * @author Nuril Hijas
 *
 */
public class exp2 {

	/**
	 * @param args
	 */
	int f;
	int s;
	void insert(int f1,int s1)
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
exp2 r1=new exp2();
exp2 r2=new exp2();
r1.insert(10,20);
r2.insert(20,30);
r1.calculate();
r2.calculate();
	}

}
