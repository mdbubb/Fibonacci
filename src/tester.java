import java.util.Scanner;

/**
 * Created by Matt on 6/17/2016.
 */
public class tester {
    public static void main(String[] args) {
        int one = 0;
        int two = 1;
        int three = one + two;
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        for (int i = 0; i < 10; i++) {
            one = two;
            two = three;
            three = one + two;
            System.out.println(three);
        }

    }
}
