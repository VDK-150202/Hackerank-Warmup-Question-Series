public static int birthday(List<Integer> s, int d, int m) {
    // Write your code here
    int i=0, sum=0, ways=0, count=0;
            while(i< s.size()){
                sum= sum+s.get(i);
                count++;
                if(count == m && sum == d){
                    count--;
                    sum= sum - s.get(i-count);
                    ways++;
                }
                else if(count == m){
                    count--;
                    sum= sum- s.get(i-count);
                }
                i++;
            }
        return ways;
    }

}
