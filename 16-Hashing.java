/*
Jim and the Orders Hackerank 
*/

public static List<Integer> jimOrders(List<List<Integer>> orders) {
    // Write your code here
    Map<Integer, Set<Integer>> hm= new TreeMap<>();
        int customer=1;
        for(List<Integer> al: orders){
            int sum=0;
            for(int  al1: al){
                sum= sum+al1;
            }
            if( hm.containsKey(sum) ){
                Set<Integer> hset = hm.get(sum);
                hset.add(customer);
                hm.put(sum, hset);// returns new pair of <sum, hset> 
            }else{
                Set<Integer> hset= new HashSet<>();
                hset.add(customer);
                hm.put(sum, hset);
            }
            customer++;
        }
        List<Integer> res= new ArrayList<>();
        for(Integer i: hm.keySet()){
            for(Integer j: hm.get(i)){
                res.add(j);
            }
        }
        return res;
    }
