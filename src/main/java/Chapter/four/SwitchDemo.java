package Chapter.four;

/**
 * @author liyulong
 * @version 1.0
 **/
public class SwitchDemo {

    public static void main(String[] args) {

        int s = (int) (Math.random() * 26) + 'a';

        switch (s) {
            case 'b':
                System.out.println("haha");
                break;
            case 'z':
                System.out.println("lala");
                break;
            default:
                System.out.println("pei");
        }
    }

}
