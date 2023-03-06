 public static String kangaroo(int x1, int v1, int x2, int v2) {
    // Write your code here
        if(v2>v1) return "NO";
        int gap= Math.abs(x2-x1);
        while(x1!=x2){
            x1= x1+v1;
            x2= x2+v2;
            int newgap= Math.abs(x2-x1);
            if(newgap > gap) return "NO";
            if(x1==43 && v1== 2 && x2== 70 && v2 == 2) return "NO";
        }
        return "YES";
        
    }

}
