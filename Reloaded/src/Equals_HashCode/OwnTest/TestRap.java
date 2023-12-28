package Equals_HashCode.OwnTest;

import java.util.Objects;

public class TestRap {

    public static void main(String[] args) {
        String b = "2";
        Integer a = 2;

        System.out.println(Objects.equals(b,a));
        System.out.println(Objects.equals(2,"2"));
    }
}
