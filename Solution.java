class Solution {
    public int[] plusOne(int[] digits) {
        // Start recursion from the last index (least significant digit)
        return processDigit(digits, digits.length - 1);
    }
    
    private int[] processDigit(int[] digits, int index) {
        // Base case: carry expanded array size (e.g., [9, 9] -> [1, 0, 0])
        if (index < 0) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            return result;
        }
        
        if (digits[index] < 9) {
            digits[index]++;
            return digits;
        }
        
        // If digit is 9, reset to 0 and recurse to the left
        digits[index] = 0;
        return processDigit(digits, index - 1);
    }
}