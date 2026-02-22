import java.util.*;

public class jump{
    public static int jump(List<String> num) {
        int m = num.size();
        int[] nums = new int[m];
        for(int i=0; i<m; i++){
            nums[i] = Integer.parseInt(num.get(i));
        }
        int n = nums.length;
        if(n==0 || n==1) return 0;
        int dp[] = new int [n];
        Arrays.fill(dp,0);
        for(int i=1;i<n;i++){
            int jump = nums[i-1];
            int j=i;
            if(jump>0){
                while(jump!=0 && j<n){
                    if(dp[j]==0){
                        dp[j]=dp[i-1]+1;
                    }else{
                        dp[j] = Math.min(dp[j], dp[i-1]+1);
                    }
                    j++;
                    jump--;
                }
            }
        }
        return dp[n-1];
    }
    public static void main(String Args[]){
        List<String> str = new ArrayList<>();
        str.add("2");
        str.add("3");
        str.add("0");
        str.add("1");
        str.add("4");
        System.out.println(jump(str));
    }
}