public class FunctionTable { 
    public static void main(String[] args) { 
        double[][] functionValues = generateFunctionValues(); printTable(functionValues); 
    } 

    private static double[][] generateFunctionValues() { 
        double[][] values = new double[11][101]; 
        for (int n = 0; n <= 100; n++) { 
            values[0][n] = Math.pow(n, 3); // n^3 
            values[1][n] = n; // n 
            values[2][n] = n * Math.log(n); // n log n values[3][n] = Math.log(Math.log(n)); // 
            log(log(n)) 
            values[4][n] = Math.log(n); // log(n) 
            values[5][n] = Math.pow(2, Math.log(n)); //2^(log(n)) values[6][n] = Math.pow(1.5, n); // (3/2)^n values[7][n] = Math.sqrt(Math.log(n)); //sqrt(log(n)) values[8][n] = Math.pow(Math.sqrt(2), Math.log(n)); 
            // (sqrt(2))^log(n) 
            values[9][n] = Math.pow(2, Math.pow(2, n)); //2^(2^n) values[10][n] = factorial(n); // n! 
        } 
        
        return values;
    }

    private static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    private static void printTable(double[][] values) {
        System.out.println("n\t n^3\tn\tn logn\tlog(log(n))\tlog(n)\t2^(log(n))\t(3/2)^n\tsqrt(log(n))\t(sqrt(2))^log(n)\t2^(2^n)\t n!");
        for (int n = 0; n <= 100; n++) {
            System.out.print(n + "\t");
            for (int i = 0; i < 11; i++) {
                System.out.print(values[i][n] + "\t");
            }
            System.out.println();
        }
    }
}
