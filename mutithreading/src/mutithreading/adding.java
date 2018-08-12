/**
 * 
 */
package mutithreading;

/**
 * @author Nuril Hijas
 *
 */
class adding implements Runnable{
	  
	  int a,b; 
	   
	 public adding(int a, int b){
	 
	       this.a = a;
	  
	      this.b = b;
	  
	   }
	    
	public void run() {
	      
	  add(a,b);
	  
	  }
	   
	 public void add(int a, int b){
	   
	     int sum=0;
	      
	  synchronized (this) {
	        
	    for(int i=a;i<=b;i++){
	         
	       sum = sum+ a;
	        
	    }
	       
	     System.out.println("Sum of "+a+" to "+ b+" numbers = "+sum);    
	 
	       }
	  
	  }
	


	public class addnumbersusing5threads
	{
	  
	  public void main(String[] args) {
	     
	   Thread t1 = new Thread(new adding(1,10));
	     
	        
	t1.start();
	      
	
	    }

	}

}