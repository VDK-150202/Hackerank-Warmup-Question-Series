/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int arr[]= new int[]{1,1,1,2,2,8,8,3,3,4,4,5,6,7};
		Map<Integer, Integer> hmap= new HashMap<>();
		for(int i=0; i<arr.length; i++){
			if(hmap.containsKey(arr[i]) ){
				int value= hmap.get(arr[i]);
				hmap.put(arr[i], value+1);
			}else{
				hmap.put(arr[i], 1);
			}
		}
		
		for(Integer key: hmap.keySet()){
			System.out.println(key+": " +hmap.get(key)+" ");
		}
		
	}
}
