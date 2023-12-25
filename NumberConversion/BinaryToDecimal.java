package NumberConversion;

public class BinaryToDecimal {
    public static void main(String[] args) {
        // int binary = 0101101001;
        int decimal = convert(101101001);
        System.out.println(decimal);
    }

    private static int convert(int binary) {
        int ans =0 ;
        int power = 0 ;
        while(binary>0){
            ans += (int)Math.pow(2, power) * (binary % 10) ;
            power++;
            binary /= 10;
        }
        return ans;
    }
}