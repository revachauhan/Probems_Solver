package fewmore.arrays;

/**
 * Given a sequence of non-negative integers find a subsequence of length 3 having maximum product with the numbers
 * of the subsequence being in ascending order.
 * Hint: For each number, find Max(lowest on left) and Max(Highest on Right). Compute product at each iteration and
 * compare with global maxProduct.
 * Example:
 * Input: 6 7 8 1 2 3 9 10
 * Ouput: 8 9 10
 * User: rpanjrath
 * Date: 11/14/13
 * Time: 1:41 PM
 */


public class Max3subsequence{

	public static int[] find3Subsequence(int [] arr)
	{
		int[] subsequence  = new int[3];
		int maxProduct = 0 ;
		if(arr.length< 3)
			return subsequence ;
		for (int i = 1 ; i < arr.length;  i ++)
		{
			int lefthighest = 0;
			int righthighest = 0;
			
			
			for(int j =0; j < i ; j++)
			{
				if(arr[j]<arr[i]&&lefthighest<arr[j])
					lefthighest = arr[j];


			}
			for(int k = i+1; k < arr.length; k++)
			{
				if(arr[k]> arr[i] && righthighest<arr[k])
					righthighest = arr[k];


			}

			int currentproduct = lefthighest*arr[i]*righthighest;
			if(currentproduct > maxProduct)
			{	
				maxProduct = currentproduct;
				subsequence = new int[]{lefthighest,arr[i],righthighest};
			}



		}
		return subsequence;




	}


	public static void main(String[] args)
	{
		 int[] ints = new int[]{1, 5, 10, 8, 9};
		int[] ar  = find3Subsequence(ints);
		for(int i : ar)
			System.out.print(i);



	}



}