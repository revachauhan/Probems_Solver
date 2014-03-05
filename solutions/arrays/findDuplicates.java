package fewmore.arrays;

/*Duplicates count in sorted array.
 * E.g. 1 2 3 3 4 5 6 6 6 7 19
 * for x = 3, count = 2
 * for x = 6, count = 3

 Given a list containing only 0s, 1s and 2s, rearrange that list (in linear time and in place and in one pass) so that all 1s follow all 0s and all 2s follow 1s.
Ex: Input: [1, 2, 0, 0, 1, 1, 2] → Output: [0, 0, 1, 1, 1, 2, 2]
 */

public class findDuplicates{

	public static int findDuplicateCount(int [] arr, int target)
	{   

		int n = arr.length-1;
		if(n <=0)
			return -1;

		int firstOccurence = findFirstocuurence(arr, target,0,n); 
		if(firstOccurence==-1)
			return -1;
		int lastOcuurence = findLastOcuurence(arr, target,firstOccurence,n);


		return lastOcuurence - firstOccurence+1;





	}
	public static int findFirstocuurence(int [] a, int target, int low, int high)
	{
		while(low<= high)
		{
			int mid = (low + high)/2;
			if((mid== 0&&a[mid]==target) ||(a[mid]==target&& a[mid-1]<a[mid]))
				return mid;
			else if (target>a[mid])
				return findFirstocuurence(a,target,mid+1,high);
			else if(target<=a[mid])
				return findFirstocuurence(a,target, low, mid-1);

		}
		return -1;


	}
	public static int findLastOcuurence(int [] a, int target, int low, int high)
	{
		while(low<=high)
		{
			int mid = (low + high)/2;
			if((mid==a.length-1&&a[mid]==target) ||(a[mid]==target&&a[mid+1]>a[mid]))
				return mid;
			else if (target>=a[mid])
				return findLastOcuurence(a,target,mid+1,high);
			else if(target<a[mid])
				return findLastOcuurence(a,target, low, mid-1);

		}
		return -1;


	}

	public static void main(String[] args) {

		int count = findDuplicateCount(new int[]{2, 2, 2, 3, 4, 8, 11, 11, 12, 13, 13, 13, 13, 15}, 13);
		System.out.println(count);
	}
}


