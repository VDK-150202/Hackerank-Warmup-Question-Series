/*
 Count pairs with given sum gfg.
*/

class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        // code here
        // k-arr[i] ?
        //5 3 5 7 4 2 8 5
        int ans=0;
        HashMap<Integer, Integer> hm= new HashMap<>();
       for(int i=0; i<arr.length; i++){
           int b= arr[i];
           int a= k-b;
           if(hm.containsKey(a))   ans+=hm.get(a);
           if(hm.containsKey(b))   hm.put(arr[i], hm.get(arr[i])+ 1);
           else hm.put(arr[i],1);
       }
        return ans;
    }
}
