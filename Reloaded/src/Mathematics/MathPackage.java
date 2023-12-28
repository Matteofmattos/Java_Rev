package Mathematics;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Random;

import static java.lang.Math.abs;

public class MathPackage {

    // Nunca utilizar tipos primitivos Double e Float com o pacote Math, pois é impreciso.

    // Utilizar BigDecimal ( Double ou float )
    // utilizar bigInteger ( Inteiros )

    public static void main(String[] args) {
        System.out.println(Math.pow(2,3));

        System.out.println(Math.round(4.5));
        System.out.println(Math.round(4.4)); // para baixo, pois é menor que 4.5

        System.out.println(Math.ceil(3.2)); // sempre pra cima.

        System.out.println(Math.floor(4.7)); // arredonda para baixo.

        System.out.println(Math.round(Math.random()*10));

        Random gerador = new Random();
        System.out.println(gerador.nextInt(3,90));


        System.out.println(Math.sin(Math.toRadians(30))); // O pacote Math calcula em radianos.
        System.out.println(Math.cos(Math.toRadians(60)));
        System.out.println(Math.tan(Math.toRadians(0)));
        System.out.println(Math.tan(Math.toRadians(45)));

        BigDecimal a = new BigDecimal("0.04");
        BigDecimal b = new BigDecimal("0.01");

        System.out.println(b.subtract(a));
        System.out.println(b.divide(a));


        BigDecimal c = new BigDecimal("0.63253265752");

        System.out.println(c.multiply(new BigDecimal("100")));

        BigInteger integ = new BigInteger("783467234672");
        BigInteger divisor = new BigInteger("73673674636");
        System.out.println(integ.mod(divisor));

        System.out.println(3/2);  //Both are integers

        System.out.println(3.0/2);

    }
}
