class Solution {
    public List<Integer> getRow(int rowIndex) {

        List<List<Integer>> pascalTriangle  = new ArrayList<>();

        for(int i=0; i <= rowIndex; i++){

            List<Integer> currentRow = new ArrayList<>();
            
            for(int j =0; j<=i ; j++){
                boolean endCheck = 0 < j && j < i;
                if (endCheck) {
                    currentRow.add(pascalTriangle.get(i-1).get(j-1) + pascalTriangle.get(i-1).get(j));
                } else {
                    currentRow.add(1);
                }
            }
            pascalTriangle.add(currentRow);

            if (i == rowIndex){
                return currentRow;
            }
        }
        return null;
    }
}

