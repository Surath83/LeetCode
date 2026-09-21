class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public void backtrack(int[] candidates, int start, int remaining, List<Integer> curr){
        if(remaining == 0){
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i=start; i<candidates.length; i++){
            if(candidates[i]>remaining){
                break;
            }
            curr.add(candidates[i]);
            backtrack(candidates, i, remaining-candidates[i], curr);
            curr.remove(curr.size()-1);
        }
        return;
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtrack(candidates, 0, target, new ArrayList<>());
        return res;
    }
}