import java.util.*;
/*
Write a function which takes an input array of integers(could be +ve or negative) and an integer sum(again +ve or nagative) and returns a pair of numbers a and b where a + b = sum; if no such pair reuturns 'null'
*/
public class pairSum{

     public static void main(String []args){
          
          
          
         int[] input =  {1,2,3,4,-9};
         int sum = -8;
        System.out.println("Hello World");
        System.out.println(function(input, sum));
      
     }
     public static List<Integer> function(int[]input, int sum){
         
        //Algorithm
        //bruite force is run two for loops through the array, O(n^2) complexity
        /**
         * //Better algoorithm - O(n)
        //put the array in hashset - O(n)
        {
            if array[i]==sum/2
                check if already has the number 
                    if yes "return  pair";
                else add the number to hashset
            else
            add the number to hashset
        }
        //interate the array 
        {
            check if hash set contains (sum - array[i])
                if yes, return pair
            
        }
        "rerurn pair";
        */
        List<Integer> pair = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        
        for(int i=0;i<input.length;i++){
            if(input[i] == (sum/2))
            {
                if(set.contains(input[i]))
                {
                    pair.add(input[i]);
                    pair.add(input[i]);
                    return pair;
                }
                
            set.add(input[i]);
               
            }
            else{
            set.add(input[i]);
            }
            
        }
        
        for(int i=0;i<input.length;i++){
            if(input[i] != (sum/2) && set.contains(sum - input[i]))
            {
                pair.add(input[i]);
                pair.add(sum - input[i]);
                
                return pair;
            }
        }
        
        return null;
     }
}
