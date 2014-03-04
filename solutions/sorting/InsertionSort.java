package fewmore.sorting;

public class InsertionSort {
	
	public static void main(String[] args) {
		int [] arr = {3,4,1,2,6,5};
		sortInsertion(arr);
		for(int i : arr)
			System.out.print(i+"->");
	}

	public static void sortInsertion(int [] arr)
	{   
		int n = arr.length;
		for(int i =1 ; i < n; i++)
		{
			int j;
			int ai = arr[i];
			for( j = i ; j>0 && arr[j-1]>ai; j-- )
				arr[j] = arr[j-1];
			
			arr[j] = ai;
		}
		
	}
}


