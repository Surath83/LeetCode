class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : arr){
            if(map.containsKey(i)){
                int val = map.get(i);
                map.put(i,val+1);
            }else{
                map.put(i,1);
            }
        }
        Set<Integer> set = new HashSet<>(map.values());
        if(map.size() == set.size()){
            return true;
        }
        return false;
    }
}