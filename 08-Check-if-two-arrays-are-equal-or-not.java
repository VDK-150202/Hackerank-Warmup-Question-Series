class Solution{
    //Function to check if two arrays are equal or not.
  /*
  
 Q) Check if two arrays are equal or not
 --> Given two arrays A and B of equal size N, the task is to find if given arrays are equal or not. Two arrays are said to be equal if both of them contain same set of elements, arrangements (or permutation) of elements may be different though.
Note : If there are repetitions, then counts of repeated elements must also be same for two array to be equal.
  
  
  Input:
N = 5
A[] = {1,2,5,4,0}
B[] = {2,4,5,0,1}
Output: 1
Explanation: Both the array can be 
rearranged to {0,1,2,4,5}

Example 2:

Input:
N = 3
A[] = {1,2,5}
B[] = {2,4,15}
Output: 0
Explanation: A[] and B[] have only 
one common value.
  
  */  
  
  public static boolean check(long A[],long B[],int N)
    {
        //Your code here
        // A == B
        if(A.length != B.length ){
            return false;
        }
        HashMap<Long, Integer> hm1= new HashMap<>();
        HashMap<Long, Integer> hm2= new HashMap<>();
        for(int i=0; i< A.length; i++){
            if(hm1.containsKey(A[i])){
                int value= hm1.get(A[i]);
				hm1.put(A[i], value+1);
            }else{
                hm1.put(A[i], 1);
            }
        }
        
        for(int i=0; i< B.length; i++){
            if(hm2.containsKey(B[i])){
                int value= hm2.get(B[i]);
				hm2.put(B[i], value+1);
            }else{
                hm2.put(B[i], 1);
            }
        }
        
       if(hm1.equals(hm2)){
           return true;
       }else{
           return false;
       }
        
    }
}
