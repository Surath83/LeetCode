class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        int sum = 0;
        for(int i : students){
            map1.put(i, map1.getOrDefault(i,0)+1);
        }
        for(int i : sandwiches){
            if(map1.getOrDefault(i,0) == 0){
                return map1.getOrDefault(0,0) + map1.getOrDefault(1,0);
            }else{
                map1.put(i, map1.getOrDefault(i,0)-1);
            }
        }
        return 0;
    }
}