package fewmore.numbers;

public class Findexpnonent {
	
	//finding the exponent of a number

	public static void main(String[] args) {
		findExponent(4, 4);
	}
	    public static void  findExponent(int number, int exponent)
	    {
	    	 int result = 1;
	     while(exponent >0)
	     {
	        
	         result*=number;
	         exponent --;
	     }
	     System.out.println(result);
	        
	    }
	    
	    
	    
	}


