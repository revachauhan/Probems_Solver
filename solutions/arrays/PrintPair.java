package fewmore.arrays;

import java.util.ArrayList;
import java.util.Hashtable;

/*Write a program takes array input{1,0,2,3} and num =3.and
 * provides output {1,2}{0,3}{2,1}{3,0} sum equals the num.
 */
 
 public class PrintPair{
	 
	 public static void printPairs1(int [] arr, int k)
     {
     ArrayList<Integer> list = new ArrayList<>();
     for(int i : arr)
         list.add(i);
     for(int i : arr)
         {
             int x = k - i ;
             if(list.contains(x));
             System.out.println("(" + i +"," +x+")");
         
         }
     
     }
 
     public static void printPairs(int [] arr, int k)
     {
         Hashtable<Integer, Integer> result = new Hashtable<>();
         
         for(int i: arr)
         {
         if(result.containsKey(i))
             System.out.println("(" + i +"," +result.get(i)+")");
         
         else 
             result.put(k -i, i );
         }
         
     
     }
 
 public static void main(String[] args) {
	 
	 int inp [] = new int[]{1,0,2,3};
	 
	 printPairs(inp,3);
	 printPairs1(inp, 3);
	 
	 
	
}
 
 
 }