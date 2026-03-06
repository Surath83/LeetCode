class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list = new ArrayList<>();
        if(arr.length == 0) return list;
        for(int i=0; i<arr.length && i<k; i++){
            list.add(arr[i]);
        }
        for(int i=k; i<arr.length; i++){
            int a = Math.abs(arr[i]-x);
            int b = Math.abs(arr[i-k]-x);
            if(a < b){
                list.remove(0);
                list.add(arr[i]);
            }
        }
        return list;
    }
}