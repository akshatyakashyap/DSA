class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> map= new HashMap<>();
        
        int st=0;
        int e=0;
        
        int ans=0;
        
        while(e< fruits.length){
            map.put(fruits[e], map.getOrDefault(fruits[e],0)+1);
            //putting values in map
            
            while(map.size() > 2){
                map.put(fruits[st],map.get(fruits[st]) -1);
                //agar hai tto minus krte jao
                
                if(map.get(fruits[st])==0){
                    map.remove(fruits[st]);
                } //agar values 0 ho gyi tto remove it
                
                st++; //increase st;
            }
            
            if(map.size() <= 2){
                ans= Math.max(ans, e-st+1);
            }  
            e++;
        }
        
        return ans;
    }
}