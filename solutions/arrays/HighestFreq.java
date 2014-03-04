package fewmore.arrays;


//* For e.g. 111 22 4 555 ---> 13(1 occurs thrice) 22 41 53

public class HighestFreq

{

  public static void highestFrequency(int [] arr)
  {    int max_counter = 1;
       int most_frequent_num = 0;
      for(int i = 0 ; i < arr.length; i ++)
      {    int counter = 1;
          while(i < arr.length-1 && arr[i]==arr[i+1])
          {
              i ++;
              counter++;
          }
         if(counter>max_counter)
             {
             max_counter = counter;
             most_frequent_num = arr[i];
             
             }
      }
      System.out.println(most_frequent_num + "" + max_counter);
  }
  public static void main(String[] args)
  {
      int [] inp = new int[]{1,1,1,2,2,4,5,5,5};
      highestFrequency(inp);
      
  
  
    
  }

}


