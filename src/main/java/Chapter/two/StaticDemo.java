package Chapter.two;

/**
 * @ClassName StaticDemo
 * @Description 一个static字段对每个类来说都只有一份存储空间
 * @Author liyulong
 * @Date 2022/2/18 22:24
 * @Version 1.0
 **/
public class StaticDemo {

    public static int i;

    public static void main(String[] args) {
        StaticDemo staticDemo1 = new StaticDemo();
        StaticDemo staticDemo2 = new StaticDemo();

        System.out.println(staticDemo1.i);
        System.out.println(staticDemo2.i);

        System.out.println(staticDemo1.i == staticDemo2.i);

    }

}
