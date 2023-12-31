package Patterns;

class TriangleByRecursion {

    public static void main(String[] args) {
        triangleRec(4,0);
    }

    private static void triangleRec(int i, int j) {
        if(i==0){return;}
        if(i>j){
            triangleRec(i, j+1);
            System.out.print("* ");
        }else{
            triangleRec(i-1, 0);
            System.out.println();
        }
    }
}