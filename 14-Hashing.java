/* 
Largest subarray with 0 sum gfg
*/

class GfG
{
    int maxLen(int arr[], int n)
    {
         int sum = 0;
        int mlen = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(sum,-1);
        for(int i=0;i<n;i++){
            sum += arr[i];
            if(map.containsKey(sum)==false){
                map.put(sum,i);
            }
            else{
                int len = i - map.get(sum);
                if(len>mlen){
                    mlen = len;
                }
            }
        }
        return mlen;
        
    }
}
