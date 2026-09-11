class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map= new HashMap<>();

        for(String s: strs){
            char[] c= s.toCharArray(); //word ke letters ka array banado
            Arrays.sort(c);

            String key= new String(c); //make string of sorted letters

            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>()); //na ho tto putting the sorted word and making a list for its anagrams
            }

            map.get(key).add(s); //add the anagram if sorted already made in a list
       } return new ArrayList<>(map.values());
    }
}