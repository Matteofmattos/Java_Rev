package StaticImport;
//import static java.lang.Math.pow;  // Static import
import static java.lang.Math.*;

public class StaticImport {

    public static void main(String[] args) {

        float a = 3;
        float b = 4;
        float c = 5;

        System.out.println(Math.pow(b,a));
        System.out.println(Math.sqrt(b));

        System.out.println(pow(c,a));
        System.out.println(round(random()*100));

    }
}
