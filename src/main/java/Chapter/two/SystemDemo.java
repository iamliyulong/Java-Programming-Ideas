package Chapter.two;

/**
 * @ClassName SystemDemo
 * @Description TODO
 * @Author liyulong
 * @Date 2022/2/18 22:35
 * @Version 1.0
 **/
public class SystemDemo {

    public static void main(String[] args) {

        System.getProperties().list(System.out);

        System.out.println("================================");

        System.out.println(System.getProperty("user.name"));

    }

}
