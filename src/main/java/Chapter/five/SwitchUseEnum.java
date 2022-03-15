package Chapter.five;

/**
 * @ClassName SwitchUseEnum
 * @Description TODO
 * @Author liyulong
 * @Date 2022/3/15 23:05
 * @Version 1.0
 **/
public class SwitchUseEnum {

    public static void main(String[] args) {
        EnumDemo enumDemo = EnumDemo.NOT;
        switch (enumDemo){
            case NOT:
                System.out.println("not");
                break;
            case MILD:
                System.out.println("mild");
                break;
            default:
                System.out.println("default");
        }
    }

}
