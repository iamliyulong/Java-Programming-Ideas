package Chapter.four;

/**
 * <h>标签使用</h>
 *
 * @author liyulong
 * @version 1.0
 **/
public class LabelDemo {

    public static void main(String[] args) {

        outer:
        for (int i = 0; i < 10; i++) {
            middle:
            for (int j = 0; j < 10; j++) {
                inner:
                for (int k = 0; k < 10; k++) {

                    if (k == 3) {
                        System.out.println("continue inner," + "i=" + i + ",j=" + j + ",k=" + k);
                        continue inner;
                    } else if (k == 8) {
                        System.out.println("continue middle," + "i=" + i + ",j=" + j + ",k=" + k);
                        continue middle;
                    } else if (i == 6) {
                        System.out.println("break outer," + "i=" + i + ",j=" + j + ",k=" + k);
                        break outer;
                    } else {
                        System.out.println("i=" + i + ",j=" + j + ",k=" + k);
                    }

                }
            }
        }

    }

}
