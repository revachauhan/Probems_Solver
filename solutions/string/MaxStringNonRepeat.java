package fewmore.string;

import java.util.HashMap;
import java.util.Map;


//Find maxsize of substring with non repeated character

public class MaxStringNonRepeat
{
	public static void main(String[] args) {
		String s = "bbbbbacbbbbb";
		findMaxsize(s);
	}
	public static void findMaxsize(String str)
	{
		Map<Character, Integer> map = new HashMap<>();
		int len = str.length();
		int min_index = len;
		int max_index = -1;
		int index = 0;
		int max_size= 0,size =0;
		for(int i =0; i < len; i ++)
		{
			if(!map.containsKey(str.charAt(i)))
			{
				map.put(str.charAt(i),i);
				index = i;
				if(min_index>index)
					min_index = index;
				if(index >max_index)
					max_index = index;
				size = max_index -min_index+1;
				if(size>max_size)
					max_size = size;
			}
			else
			{
				map.put(str.charAt(i),i);
				min_index = i;
				max_index = i;
			}
		}
		System.out.println(max_size);

	}

}


