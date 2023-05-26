class Solution {
    public int[] countBits(int n) {
        int[] result = new int[n+1];
        for (int i = 0; i < n+1; i++){
            result[i] = countInt(i);
        }
        return result;
    }

    static int countInt(int n){
        int counter = 0;
        for (int i = 0; i < 32; i++){
            if((n&1) == 1) counter++;
            n = n >> 1;
        }
        return counter;
    }
}
