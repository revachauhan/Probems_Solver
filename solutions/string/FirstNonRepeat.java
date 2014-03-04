package fewmore.string;

import java.util.Hashtable;

public class FirstNonRepeat {

	//Find the first non repeated character 
	
	public static void main(String[] args) {
		String str = "interview";
		firstNonreapeated(str);
		int i = 69;
		char c = (char) i;
		System.out.println(i +"  " + c);

	}


	public static void firstNonreapeated(String str)
	{    
		Hashtable<Integer,Integer> table = new Hashtable<>();
		for(int i = 0; i < str.length(); i++)
		{
			
			if(table.containsKey((int) (str.charAt(i))))
				table.put((int) (str.charAt(i)),table.get((int) (str.charAt(i)))+1);
			else
			table.put((int) (str.charAt(i)),1);           
		}

		for(int i = 0 ; i < str.length(); i++)
		{
			int temp = (str.charAt(i));
			if(table.get(temp)==1)
			{
				System.out.println(str.charAt(i));
				return;
			}

		} 
		
	}
}



