package NumberConversion;

public class OctalToDecimal {
    public static void main(String[] args) {
        int octal = 242343;
        System.out.println(convert(octal));
    }

    private static int convert(int octal) {
        int ans = 0 , exp = 0 ;
        while (octal > 0) {
            ans += (octal%10) * Math.pow(8, exp);
            exp++;
            octal/=10;
        }
        return ans;
    }
}
