public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
        int leftSum=0, rightSum=0, n_rows= arr.size();
        int row=0,col=0;
        while(row<n_rows){
            int element= arr.get(row).get(col);
            leftSum+=element;
            row++;
            col++;
        }
        
        row=0; col=n_rows-1;
        while(row<n_rows){
            int element= arr.get(row).get(col);
            rightSum+=element;
            row++;
            col--;
        }
        int res= Math.abs(leftSum-rightSum);
        return res;
    }
