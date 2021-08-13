class Solution {
    public boolean judgeCircle(String moves) {
        return judgeCircle(moves,0,0);
    }
    public boolean judgeCircle(String moves,int x,int y){
        for(char c : moves.toCharArray()){
            if(c == 'L')
                x--;
            else if(c == 'R')
                x++;
            else if(c == 'U')
                y++;
            else
                y--;
        }
        if(x == 0 && y == 0)
            return true;
        return false;
    }
}
