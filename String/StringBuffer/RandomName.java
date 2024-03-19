import java.util.Random;

public class RandomName {

    static String generateRandom(int size){
        StringBuffer sb = new StringBuffer();
        Random ran = new Random();
        for(int i=0;i<size;i++){
            int r = (ran.nextInt()%26);
            sb.append((char)(97+r));
        }
        return sb.toString()    ;
    }
    public static void main(String[] args) {
        System.out.println(generateRandom(10));
        System.out.println('['+0);
    }
}
