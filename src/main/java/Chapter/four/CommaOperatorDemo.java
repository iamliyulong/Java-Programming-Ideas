package Chapter.four;

/**
 * <h>逗号操作符<h/>
 *
 * @author liyulong
 * @version 1.0
 **/
public class CommaOperatorDemo {

    public static void main(String[] args) {
        for (int i = 0, j = i + 10; i < 10; i++, j = i * 2) {
            System.out.println("i=" + i + ",j=" + j);
        }
    }

}