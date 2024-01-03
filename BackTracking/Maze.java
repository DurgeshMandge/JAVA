package BackTracking;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        boolean[][] a = {{true,true,true},{true,false,true},{true,true,true}};
        // int count = findPath(a);
        // System.out.println(count);
        // System.out.println(helperDig("", 1,1));
        System.out.println(pathWithObstacles(a,"", 0,0));
    }

    private static ArrayList<String> pathWithObstacles(boolean[][] arr,String p, int row, int col) {
        if(row ==2 && col==2){
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }
        if(row == 2 && arr[row][col]){
            return pathWithObstacles(arr,p+'R', row, col+1);
        }
        if(col == 2 && arr[row][col]){
            return pathWithObstacles(arr,p+'D', row+1, col);
        }
        if(arr[row][col+1]){
            return pathWithObstacles(arr,p+'R', row, col+1);
        }
        if(arr[row+1][col]){
            return pathWithObstacles(arr,p+'D', row+1, col);
        }
        return null;
    }

    private static int findPath(int[][] a) {
        return helper(a.length,a[0].length);
    }

    private static int helper(int row, int col) {
        if(row==1 || col==1){return 1;}
        int right = helper(row,col-1);
        int down = helper(row-1,col);
        return right+down;
    }

    private static ArrayList<String> helper(String p, int row, int col) {
        if(row==1 && col==1){
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }
        if(row==1){
            return helper(p+"R", row, col-1);
        }
        if(col==1){
            return helper(p+"D", row-1, col);
        }
        ArrayList<String> right = helper(p+"R",row,col-1);
        ArrayList<String> down = helper(p+"D",row-1,col);
        right.addAll(down);
        return right;
    }

    private static ArrayList<String> helperDig(String p, int row, int col) {
        if(row==1 && col==1){
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }
        if(row==1){
            return helperDig(p+"R", row, col-1);
        }
        if(col==1){
            return helperDig(p+"D", row-1, col);
        }
        ArrayList<String> right = helperDig(p+"R",row,col-1);
        ArrayList<String> diag = helperDig(p+"C",row-1,col-1);
        ArrayList<String> down = helperDig(p+"D",row-1,col);
        right.addAll(down);
        right.addAll(diag);
        return right;
    }

}
