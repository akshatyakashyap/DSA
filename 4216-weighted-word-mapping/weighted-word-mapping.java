class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int a = 0;

            for (int j = 0; j < word.length(); j++) {
                a += weights[word.charAt(j) - 'a'];
            }

            int b = a % 26;
            char letter = (char) ('z' - b);  
            str.append(letter);
        }

        return str.toString();
    }
}