package fewmore.sorting;

public class BubbleSort {

	//Find bubble sort
	public static void main(String[] args) {
		int [] arr = {3,4,1,2,6,5};
		sortBubble(arr);
		for(int i : arr)
			System.out.print(i+"->");
	}

	public static void sortBubble(int [] arr)
	{
		int n = arr.length;
		for(int i = n-1; i >=0; i--)
			for(int j = 0 ; j < i ;j++)
			{

				if(arr[j]>arr[j+1])
					swap(arr,j,j+1);

			}
	}
	public static void swap(int []arr,int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}

