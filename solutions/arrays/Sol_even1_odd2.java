package fewmore.arrays;


	
	//code to have all even numbers before odd


	public class Sol_even1_odd2{

	    public static void main(String[] args)
	    {
	        int arr[] = {1, 4, 3, 4,3, 4, 1, 4, 1, 3, 5, 6};
	        evenOddsorting(arr);
	        for(int i : arr)
	            System.out.print(i);
	    
	    }

	    public static void evenOddsorting(int []arr)
	    {
	        int left = 0;
	        int right = arr.length-1;
	        int temp =0;
	        
	        while(left<right)
	        {
	            while(arr[left]%2==0&&left<right)
	                left++;
	            while(arr[right]%2!=0&&left<right)
	                right--;
	            temp = arr[left];
	            arr[left] = arr[right];
	            arr[right] = temp;
	             
	        
	        
	        
	        }
	    
	    
	    
	    }






	}


