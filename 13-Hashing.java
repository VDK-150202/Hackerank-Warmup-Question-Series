/*
First element to occur k times gfg
*/

class Solution
{
    public int firstElementKTime(int[] a, int n, int k) { 
        HashMap<Integer, Integer> tm= new HashMap<>();
        for(int i=0; i<n; i++){
            
            if(tm.containsKey(a[i])){
                int val= tm.get(a[i]);
                tm.put(a[i], val+ 1);
            } 
            else tm.put(a[i], 1);
            
            if(tm.get(a[i]) == k)  return a[i];
        }
       
        return -1;
    } 
}
