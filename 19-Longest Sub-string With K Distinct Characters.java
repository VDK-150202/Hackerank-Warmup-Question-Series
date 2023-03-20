/*
https://www.codingninjas.com/codestudio/guided-paths/data-structures-algorithms/content/118626/offering/1377986?leftPanelTab=1
*/
import java.util.* ;
import java.io.*; 
public class Solution {
	public static int getLengthofLongestSubstring(String s, int k) {
		// Write your code here.
		Map<Character, Integer> hm= new HashMap<>();
		char arr[]= s.toCharArray();
		int cc=0;
		int max_count=Integer.MIN_VALUE;
		int i=0, j=0;
		while(i< arr.length){
			hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);

			if(hm.size()<= k){
				for (Map.Entry<Character,Integer> mapElement : hm.entrySet()){
					cc= cc+ mapElement.getValue();
				}
				max_count= Math.max(cc, max_count);
				cc=0;
			}

			if(hm.size()>k){
				while(hm.size()!=k){
					hm.put(arr[j], hm.getOrDefault(arr[j], 0)-1);

					if(hm.get(arr[j]) == 0 || hm.get(arr[j]) == -1){
						hm.remove(arr[j]);
					}
					j++;
				}
			}
			i++;
		}
		return max_count;

	}
}
