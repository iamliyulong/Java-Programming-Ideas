package Chapter.three;

import java.security.SecureRandom;
import java.util.Random;

/**
 * @author liyulong
 * @version 1.0
 **/
public class RandomDemo {

    public static void main(String[] args) {
        System.out.println("****************");

        Random random = new Random(100);
        System.out.println(random.nextInt(1000));

        SecureRandom secureRandom = new SecureRandom();
        System.out.println(secureRandom.nextInt(100));

        System.out.println((int) (Math.random() * 100));

        System.out.println("*****************************");

    }

}
