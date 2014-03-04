package fewmore.string;

public class PrintPalindromes {

	public static void main(String[] args) {
		String str = "abcbcaddabagfgafsdjkl";
		printAllPalindromes(str);



	}


	public static void printAllPalindromes(String str)
	{
		int i , j , k;
		for(i = 0; i < str.length(); i ++)
		{	int flag = 0;
			for( j= i , k = i+1;j >=0 && k < str.length(); j--,k++ )
				if(str.charAt(j)==str.charAt(k))
				{
					flag = 1;
					continue;

				}
				else 
				{
					
					break;
				}
			if(flag ==1)
				System.out.println(str.substring(j+1,k));
			
				

		}

		for( i = 1; i < str.length(); i ++)
		{	int flag = 0;
			for( j= i-1 , k = i+1;j >=0 && k < str.length(); j--,k++ )
			{
				if(str.charAt(j)==str.charAt(k))
				{
					flag =1 ;
					continue;
				}
				
				else 
				 break;

			}
			if(flag ==1)
				System.out.println(str.substring(j+1,k));

		}
	}



}

