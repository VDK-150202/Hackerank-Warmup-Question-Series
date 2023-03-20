/*
stdin:
xxyyzz
xyz
stdoutput:
2
-----------------
stdin:
xxyyzz
xyzk
stdoutput:
0


*/


import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scanner = new Scanner(System.in);
 
        String s1 = scanner.next();
        String s2 = scanner.next();
 
        Map<Character, Integer> mp1 = new HashMap<>();
        Map<Character, Integer> mp2 = new HashMap<>();
 
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            mp1.put(ch, mp1.getOrDefault(ch, 0) + 1);
        }
 
        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            mp2.put(ch, mp2.getOrDefault(ch, 0) + 1);
        }
 
        int ans = Integer.MAX_VALUE;
 
        for (char ch = 'a'; ch <= 'z'; ch++) {
 
            if (mp2.containsKey(ch) && !mp1.containsKey(ch)) {
                ans = 0;
                break;
            }
 
            if (mp1.containsKey(ch) && mp2.containsKey(ch)) {
                int cnt = mp1.get(ch) / mp2.get(ch);
 
                ans = Math.min(ans, cnt);
            }
        }
 
        System.out.println(ans);
	}
}
