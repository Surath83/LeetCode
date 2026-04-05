class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0; i<=rowIndex; i++){
            newRow(list,i);
        }
        return list.get(rowIndex);
    }
    public void newRow(List<List<Integer>> list,int num){
        if(num == 0){
            list.add(new ArrayList<>(Arrays.asList(1)));
            return;
        }
        if(num == 1){
            list.add(new ArrayList<>(Arrays.asList(1,1)));
            return;
        }
        List<Integer> prev = list.get(num - 1);
        List<Integer> curr = new ArrayList<>();
        curr.add(1);
        for(int i=1; i<num; i++){
            curr.add(prev.get(i-1)+prev.get(i));
        }
        curr.add(1);
        list.add(curr);
        return;
    }
}