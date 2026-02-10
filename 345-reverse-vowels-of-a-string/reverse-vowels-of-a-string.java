class Solution {
    public String reverseVowels(String s) {
        char word[] = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        String vowel = "aeiouAEIOU";
        while(i < j){
            while(i < j && vowel.indexOf(word[i]) == -1){
                i++;
            }
            while(i < j && vowel.indexOf(word[j]) == -1){
                j--;
            }
            char temp = word[i];
            word[i] = word[j];
            word[j] = temp;
            i++;
            j--;
        }
        return new String(word);
    }
}