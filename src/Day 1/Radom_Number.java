import java.util.Random;
public class Radom_Number {

        public static void main(String[] args) {
            int low = 10;
            int high = 100;
            int result = getRandomNumber(low, high);
            System.out.println(result);
        }

        public static int getRandomNumber(int low, int high) {
            Random r = new Random();
            return r.nextInt(high - low) + low;
        }
}

