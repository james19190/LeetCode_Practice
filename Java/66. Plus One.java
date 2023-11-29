class Solution {
    public int[] plusOne(int[] digits) {

        for (int i = digits.length-1; i >= 0; i--) {

            digits[i]++;

            if (digits[i] == 10) {

                digits[i] = 0;

                if (i == 0) {
                    int[] overflowedDigits = new int[digits.length+1];
                    overflowedDigits[0] = 1;
                    for (int j = 1; j < overflowedDigits.length; j++) {
                        overflowedDigits[j] = digits[j-1];
                    }
                    return overflowedDigits;
                }
            } else {
                break;
            }

         }
         
        return digits;  
    }
}
