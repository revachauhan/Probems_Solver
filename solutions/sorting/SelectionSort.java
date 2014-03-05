package fewmore.sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int [] arr = {3,4,1,2,6,5};
		sortSelection(arr);
		for(int i : arr)
			System.out.print(i+"->");
	}

	public static void sortSelection(int [] arr)
	{ 
		int n = arr.length;
		for(int i = n-1; i >=0; i -- )
		{    
			int m = 0;
			for(int j = 0; j <=i; j++)
			{
				if(arr[j]>arr[m] )
					m = j;

			}
			swap(arr,i,m);


		}
	}
	public static void swap(int []arr,int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}


