
/* Hackerank Breaking Record Java code */    
public static List<Integer> breakingRecords(List<Integer> scores) {
    // Write your code here
        int c1=0, c2=0;
        int hs= scores.get(0);// high Score
        int ls= scores.get(0); // Low Score
        for(Integer i: scores){
            if(i>hs){
                c1++;
                hs=i;
            }
        }
        for(Integer i: scores){
            if(i< ls){
                c2++;
                ls=i;
            }
        }
        List<Integer> al = new ArrayList<>();
        al.add(c1);
        al.add(c2);
        
        return al;
    }

}

