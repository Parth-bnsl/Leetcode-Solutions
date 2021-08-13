class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Stack<Integer> s = new Stack<Integer>();
        boolean[] visited = new boolean[rooms.size()];
        visited[0] = true;
        s.push(0);
        while(!s.isEmpty()){
            int room = s.pop();
            for(int r : rooms.get(room))
                if(!visited[r]){
                    visited[r] = true;
                    s.push(r);
                }
        }
        for(boolean b : visited){
            if(b == false)
                return false;
        }
        return true;
    }
}
