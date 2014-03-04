package fewmore.string;

import java.util.HashMap;

public class Isomorphism {
	
	//find if 2 strings are isomorphic 


	public static void main(String[] args) {
		 System.out.println(checkIsomprphic("foo", "baa"));
	}

	    public static boolean checkIsomprphic(String str1, String str2)
	    {
	        if(str1.length()!=str2.length())
	            return false;
	        HashMap<Integer, Integer> map = new HashMap<>();
	        for(int i = 0; i < str1.length(); i ++)
	        {
	            int char1= (int)str1.charAt(i);
	            int char2 = (int)str2.charAt(i);
	            if(map.containsKey(char1)&&map.get(char1)!=char2)
	                return false;
	            else
	            map.put(char1,char2);  
	        }
	        return true;
	      
	    
	    
	    }
	}


