package fewmore.arrays;


//* For e.g. 111 22 4 555 ---> 13(1 occurs thrice) 22 41 53

public class CountFrequency{

	public static void countNumberOfFrequency(int [] arr)
	{
		for(int i = 0 ; i < arr.length; i ++)
		{    
			int counter = 1;
			while((i+1 < arr.length)&&arr[i]==arr[i+1] )
			{
				i ++;
				counter++;
			}
			System.out.print(arr[i]+""+counter);
		}
	}    
	public static void main(String[] args)
	{
		int [] inp = new int[]{1,1,1,2,2,4,5,5,5};
		countNumberOfFrequency(inp);



	}



}