package fewmore.arrays;

public class MaxContiguosSubArray {
	
	public static void main(String[] args) {
		int arr []  = new int[]{5,0,8,-2,7,8,-1,6};
		System.out.println(maxContiguos(arr));
		
	}


	    public static int maxContiguos(int [] arr)
	    {
	        int current_max = 0;
	        int max_ending_so_far = 0;
	        
	        for(int i = 0; i < arr.length; i ++)
	        {
	            current_max = Math.max(0,current_max+arr[i]);
	            max_ending_so_far = Math.max(current_max,max_ending_so_far );
	        
	        
	        }
	    
	    return max_ending_so_far ;
	    
	    }


}
