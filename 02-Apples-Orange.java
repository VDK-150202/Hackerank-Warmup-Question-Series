/*



*/

class Result {

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
    // Write your code here
        int count_apple=0, count_orange=0;
        for(int i=0; i<apples.size(); i++){
            int z= apples.get(i);
            apples.set(i,a+z);
        }
        for(int i=0; i< oranges.size(); i++){
            int z= oranges.get(i);
            oranges.set(i,z+b);
        }
        for(Integer i: apples){
            if(i>=s && i<=t){
                count_apple++;
            }
        }
        for(Integer i: oranges){
            if(i>=s && i<=t){
                count_orange++;
            }
        }
        System.out.println( count_apple );// 5-2, 5+2, 5+1
        System.out.println( count_orange );
    }

}
