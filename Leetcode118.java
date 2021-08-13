class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<Integer>());
        res.get(0).add(1);
        for(int i=1;i<numRows;i++){
            List<Integer> current = new ArrayList<>();
            List<Integer> prev = res.get(i-1);
            current.add(1);
            for(int j=1;j<i;j++)
                current.add(prev.get(j) + prev.get(j-1));
            current.add(1);
            
            res.add(current);
        }
        return res;
    }
}
