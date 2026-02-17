class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        // PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->b[0]-a[0]);
        // String[] str = new String[n];
        // for(int i=0; i<n; i++){
        //     pq.offer(new int[]{score[i],i});
        // }
        // int rank = 1;
        // while(!pq.isEmpty()){
        //     int[] arr = pq.poll();
        //     int index = arr[1];
        //     if(rank==1){
        //         str[index] = "Gold Medal";
        //     }else if(rank==2){
        //         str[index] = "Silver Medal";
        //     }else if(rank==3){
        //         str[index] = "Bronze Medal";
        //     }else{
        //         str[index] = String.valueOf(rank);
        //     }
        //     rank++;
        // }
        // return str;

        TreeMap<Integer, Integer> map = new TreeMap<>();
        String[] str = new String[n];
        for(int i=0; i<n; i++){
            map.put(score[i],i);
        }
        int rank = 1;
        for(int key : map.descendingKeySet()){
            int index = map.get(key);
            if(rank==1){
                str[index] = "Gold Medal";
            }else if(rank==2){
                str[index] = "Silver Medal";
            }else if(rank==3){
                str[index] = "Bronze Medal";
            }else{
                str[index] = String.valueOf(rank);
            }
            rank++;
        }
        return str;
    }
}