class Solution {
    public int[] minOperations(String boxes) {
        int[] answer = new int[boxes.length()];
        for (int currentBox = 0; currentBox < boxes.length(); currentBox++) {
            if (boxes.charAt(currentBox) == '1') {
                for (
                    int newPosition = 0;
                    newPosition < boxes.length();
                    newPosition++
                ) {
                    answer[newPosition] += Math.abs(newPosition - currentBox);
                }
            }
        }
        return answer;
    }
}