package fewmore.arrays;

public class FindArrayImpl
{
	public static int findSubarray(int[] arr, int [] ar)
	{
		if(ar.length>arr.length)
			return -1;
		int startIndex= -1;
		int i , j;
		for(i = 0; i < arr.length; i ++)
		{
			for(j = 0 ; j <ar.length; j ++ )
			{
				if(arr[i]== ar[j])
				{
					i++;
					
				}
				else 
					break;			}
			if(j==ar.length)
			{
				startIndex = i - ar.length;
				break;
			} 


		}
		return startIndex;


	}

	public static void main(String[] args) {
		

        

        System.out.println(findSubarray(new int[]{7, 8, 9, 11, 8 , 9 ,1,10}, new int[]{8, 9, 10}));
	
	
	}



}