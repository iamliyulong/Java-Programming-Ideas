package Chapter.five;

/**
 * @ClassName VarArgsDemo
 * @Description 可变参数列表
 * @Author liyulong
 * @Date 2022/3/15 22:53
 * @Version 1.0
 **/
public class VarArgsDemo {

    public static void main(String[] args) {
        printArray();
        printArray(11,234,11.34,"hahah",34L);
        printArray(new Integer[]{11,22,98});

    }

    static void printArray(Object... args){
        for (Object arg : args) {
            System.out.println(arg);
        }
    }

}
