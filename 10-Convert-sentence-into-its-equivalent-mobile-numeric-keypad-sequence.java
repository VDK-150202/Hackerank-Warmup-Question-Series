
class Solution 
{ 
    String printSequence(String S) 
    { 
        // code here
        String Output="";
        String a[] = new String[]{ "2", "22","222", "3", "33", "333", "4", "44", 
             "444", "5", "55", "555", "6"
            , "66", "666", "7", "77", "777", "7777", "8", "88", 
            "888", "9", "99", "999", "9999" };
            for(int i=0; i<S.length(); i++){
                int z= S.charAt(i)-'A';
                char c= S.charAt(i);
                if(c == ' ' ) Output+="0";
                else
                Output+=a[z];
            }
            return Output;
    }
}
