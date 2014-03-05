package fewmore.string;

/*
 * Find min substring that contains all the char of target string.
 * User: rpanjrath
 * Date: 11/22/13
 * Time: 6:49 PM
 */
public class FIndMinSubstring
{

	public static void main(String[] args) {
		String p = "abcdefgh";
		String t = "hbc";
		findMinString(p, t);
	}

	public static void findMinString(String parentString, String targetString)
	{    
		int min_index = parentString.length()-1;
		int max_index = 0;
		int index = 0;
		int end_Index_target = targetString.length();
		int j = 0;
		while(j < end_Index_target )
		{
			for(int i = 0 ; i < parentString.length(); i ++)
			{
				if(targetString.charAt(j)==parentString.charAt(i))
				{
					index = i ;
					if(index<min_index)
						min_index = index;  

					if(index >max_index)
						max_index = index;

					break;

				}
				else if(i==parentString.length()-1)
				{
					System.out.println("The String does not exist");
					return;
				}
			}
			j++;

		}
		System.out.println(parentString.substring(min_index,max_index+1));

	}


}
