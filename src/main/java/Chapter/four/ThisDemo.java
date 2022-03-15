package Chapter.four;

/**
 * @author liyulong
 * @version 1.0
 **/
public class ThisDemo {

    private String name;

    private int age;

    ThisDemo() {

    }

    ThisDemo(String name) {
        this.name = name;
    }

    ThisDemo(int age) {
        this.age = age;
    }

    ThisDemo(String name, int age) {
        this(name);
        this.age = age;
    }

}
