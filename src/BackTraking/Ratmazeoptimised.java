package BackTraking;

public class Ratmazeoptimised {

    public static void main(String[] args) {
        int rows = 3;
        int col = 4;
        int[][] maze ={{1,0,1,1},
                {1,1,1,1},
                {1,1,0,1}
        };
        print(0,0,rows-1,col-1,"",maze);
    }
    private static void print(int sr, int sc, int er, int ec,String s,int[][] maze) {
        if(sr<0 || sc<0) return;
        if(sr>er|| sc>ec) return ;
        if(sr==er && sc==ec){
            System.out.println(s);
            return;
        }
        if(maze[sr][sc]==0) return;
        if(maze[sr][sc]== -1) return;
        maze[sr][sc] = -1;
        print(sr,sc+1,er,ec,s+"R",maze); // GO RIGHT
        print(sr+1,sc,er,ec,s+"D",maze); // GO DOWN
        print(sr,sc-1,er,ec,s+"L",maze); // GO LEFT
        print(sr-1,sc,er,ec,s+"U",maze);
       maze[sr][sc] = 1;

    }
}
