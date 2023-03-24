class Solution 
{ 
    static long solve(int X,int Y, String S)
	{    
	    // code here
	    int l= S.length();
	    String str1="pr";
	    String str2= "rp";
	    if( Y > X){
	        str1= "rp";
	        str2= "pr";
	        int temp= X;
	        X=Y;
	        Y=temp;
	    }
	    while(S.indexOf(str1) != -1){
	        S= S.replaceAll(str1, "");
	    }
	    long x= (l-S.length())/2;
	    
	    l= S.length();
	    while(S.indexOf(str2) != -1){
	        S= S.replaceAll(str2, "");
	    }
	    long y= (l-S.length())/2;
	    
	    return x*X+y*Y;
        
	}
} 
