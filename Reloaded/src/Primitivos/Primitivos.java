package Primitivos;

import javax.sound.midi.Soundbank;

public class Primitivos {

    static byte valorBiteMaximo = 127;

    static byte valorBiteMinimo = -128;

    static short valorShortMaximo = 32767;

    static short valorShortMinimo = -32768;

    static int valorIntMinimo = -2147483648;

    static int valorIntMaximo = 2147483647;

    static long valorLongMaximo = 9223372036854775807L;

    static long ValorLongMinimo = -9223372036854775808L;

    static float valorFloatMaximo = 3.4028235E38F;

    static float ValorFloatMaximo = 1.4E-45F;

    static double valorMaximoDouble = 1.7E308d;

    static double valorMinimoDouble = 1.7E-323d;

    static char valorMaximoChar = 65535;  // Também aceita 1 único caracter string.

    static char valorMinimoChar = 0;


    public static void main(String[] args) {


        float numero = (float) 3.4e39;

        System.out.println(numero);

    }





}
