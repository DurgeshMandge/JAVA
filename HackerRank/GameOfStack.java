package HackerRank;


public class GameOfStack {
    public static void main(String[] args) {
        int[] m ={3,2,1,6};
        int[] n ={1};
        int maxSum =3;
        int ans = twoStacks(maxSum,m,n);
        System.out.println(ans);
    }
    public static int twoStacks(int maxSum, int[] a, int[] b) {
        return helper(a,b,0,maxSum,0,0);
    }

    private static int helper(int[] a, int[] b, int sum, int maxSum, int i, int j) {
        if(i >= a.length){
            int z=j;
            while(j<b.length){
                sum+=b[j];
                j++;
            }
            return i+j-z;
        }
        if(j >= b.length){
            int z=i;
            while(i<a.length){
                if(sum > maxSum){
                    return i+j-1;
                }
                sum+=a[i];
                i++;
            }
            return j+i-z;
        }
        if(sum > maxSum){
            return i+j-1;
        }
        int left =0, right =0;
        if(i<a.length){
            left = helper(a, b, sum+a[i], maxSum, i+1, j);
        }    
        if(j<b.length){
            right = helper(a, b, sum, maxSum+b[j], i, j+1);
        }
        return Math.max(left, right);
    }
}
