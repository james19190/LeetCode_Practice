class Solution {
    public List<List<Integer>> generate(int numRows) {
    
        List<List<Integer>> pascalTriangle  = new ArrayList<>();

        for(int i=0; i < numRows; i++){

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
        }
        return pascalTriangle;
    }
}

//list 추가할때는 item 하나싹먼 추가 가능
//line을 만들어서 .add()
