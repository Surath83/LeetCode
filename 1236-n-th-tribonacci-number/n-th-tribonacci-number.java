class Solution {
    public int tribonacci(int n) {
        int arr[] = new int[n+1];
        Arrays.fill(arr,-1);
        return tri(n,arr);
    }
    public int tri(int n,int arr[]){
        if(n==0) return 0;
        if(n==1 || n==2) return 1;
        if(arr[n] != -1) return arr[n];
        arr[n] = tri(n-1,arr)+tri(n-2,arr)+tri(n-3,arr); 
        return arr[n];
    }
}