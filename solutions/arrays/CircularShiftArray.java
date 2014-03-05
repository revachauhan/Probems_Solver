package fewmore.arrays;

public class CircularShiftArray {

    private CircularShiftArray() {

    }
    public static void main(String[] args) {
        int[] input = new int[]{1, 2, 3, 4, 5, 6};

        shiftSize(input, 13);
        print(input);
        shiftSize(input, 10);
        print(input);
        shiftSize(input, 8);
        print(input);
        shiftSize(input, 4);
        print(input);
    }

     
         
         private static void print(int[] input) {
        	 for(int i : input)
        		 System.out.print(i+",");
        	 System.out.println();
		// TODO Auto-generated method stub
		
	}
		public static void shiftSize(int [] arr,int shiftsize)
         {
             int len = arr.length;
             int n =shiftsize;
             while( n>len)
             {
            	
            	 n = n%len;
            	
             }
                
             reverse(arr,0,len-1);
             reverse(arr,0,n-1);
             reverse(arr,n,len-1);
         
         
         }
         public static void reverse(int []arr, int low, int high)
         {
        	 if(low>high)
        		 return;
             while(low<high)
             {
                 int temp = arr[high];
                 arr[high] = arr[low];
                 arr[low]   = temp;
                 low++;
                 high--;
             
             }
         
         
         }
     
     
     
     }