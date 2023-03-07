/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{	
	public static String printpairs(int A[], int sum){
		Set<Integer> hm= new HashSet<>();
		for(int i=0; i<A.length; i++){
			int temp= sum-A[i];
			if(hm.contains(temp)){
				return "YES";
			}
			hm.add(A[i]);
		}
		return "NO";
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		 int A[] = { 1, 4, 45, 6, 10, 8 };
        int n = 13;
       System.out.println( printpairs(A, n) );
	}
}
