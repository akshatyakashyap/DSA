class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character, Integer> vowels= new HashMap<>();
        HashMap<Character, Integer> consonents= new HashMap<>();

        for(char c: s.toCharArray()){
            if(c=='a'|| c=='e'||c=='i'||c=='o'||c=='u'){
                vowels.put(c,vowels.getOrDefault(c,0)+1);
            } else {
                consonents.put(c,consonents.getOrDefault(c,0)+1);
            }

            
        }
        int maxV = 0;
            int maxC = 0;

            if(!vowels.isEmpty()) {
                maxV = Collections.max(vowels.values());
            }

            if(!consonents.isEmpty()) {
                maxC = Collections.max(consonents.values());
            }
                return maxV + maxC;
    }
}