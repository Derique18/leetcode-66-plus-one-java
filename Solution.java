import java.util.Arrays;

class Solution {
    public int[] plusOne(int[] digits) {
        return processDigit(digits, digits.length - 1);
    }
    
    private int[] processDigit(int[] digits, int index) {
        if (index < 0) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            return result;
        }
        
        if (digits[index] < 9) {
            digits[index]++;
            return digits;
        }
        
        digits[index] = 0;
        return processDigit(digits, index - 1);
    }

    // Entry point for running locally in the terminal
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] test1 = {1, 2, 3};
        System.out.println("Input: [1, 2, 3] -> Output: " + Arrays.toString(sol.plusOne(test1)));

        int[] test2 = {4, 3, 2, 1};
        System.out.println("Input: [4, 3, 2, 1] -> Output: " + Arrays.toString(sol.plusOne(test2)));

        int[] test3 = {9, 9};
        System.out.println("Input: [9, 9] -> Output: " + Arrays.toString(sol.plusOne(test3)));
    }
}