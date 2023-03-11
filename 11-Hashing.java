/*
Yet another query problem gfg.
vaibhavkorlekar3 ~username gfg/account
*/
class Solution {
    public static ArrayList<Integer> solveQueries(int N, int num, int[] A, int[][] Q) {
        // code here
        // freq of element == k
        //
       HashMap<Integer, Integer> hm= new HashMap<>();
       int arr[]= new int[A.length];
       for(int i=0; i< A.length; i++){ // Storing (Key,Freq) of Everyelement from i to n-1;
           if(hm.containsKey(A[i])){
               int val= hm.get(A[i]);
               hm.put( A[i], val+1);
           } else hm.put(A[i], 1);
       }
       
       for(int i=0; i<A.length; i++){
           arr[i]= hm.get(A[i]);
           hm.put(A[i], hm.get(A[i])-1 );
       }
       
       ArrayList<Integer> al = new ArrayList<>();
       for(int i=0; i<Q.length; i++){
           int count=0;
           for(int j=Q[i][0] ; j<=Q[i][1]; j++){
               if(arr[j]== Q[i][2]) count++;
           }
           al.add(count);
       }
       
       return al;
       
    }
}
