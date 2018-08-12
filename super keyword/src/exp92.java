/**
 * 
 */

/**
 * @author Nuril Hijas
 *
 */
class exp92
{
   int num = 100+100;
}
class Subclass extends exp92
{
   int num = 110+200;
   void printNumber(){
	/* Note that instead of writing num we are
	 * writing super.num in the print statement
	 * this refers to the num variable of Superclass
	 */
	System.out.println(super.num);
   }
   public static void main(String args[]){
	Subclass obj= new Subclass();
	obj.printNumber();	
   }
}
