package fewmore.string;

//Find the permutation of a string



public class LongestCommonSubstring
{

	
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "abc";
		find(str1, str2);
	}
  public static void find(String str1, String str2)
  {
      int m = str1.length();
      int n = str2.length();
      
      int [][] table = new int[m+1][n+1];
      int result = 0;
      for(int i = 0 ; i <= m; i ++)
      {
          for(int j = 0 ; j <= n; j ++)
          
          {
              if(i == 0 || j == 0)
                  table[i][j] = 0;
               
              else if (str1.charAt(i-1)==str2.charAt(j-1))
              {
                  table[i][j] = table[i-1][j-1]+1;
                  result = Math.max(result, table[i][j]);
                  
              }
              else 
              {
                  table[i][j] = 0;
              }
          
          }
      }
      System.out.println(result);
  
  
  }

}