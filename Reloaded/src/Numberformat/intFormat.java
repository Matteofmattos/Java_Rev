package Numberformat;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class intFormat {

    public static void main(String[] args) {

        Locale en = new Locale("en","United States");
        Locale br = new Locale("pt","Brazil");

        NumberFormat nf = NumberFormat.getInstance(en);
        String num = nf.format(100.99);
        System.out.println(num);

        NumberFormat nf_pt = NumberFormat.getInstance(br);
        String num_pt = nf_pt.format(100.99);
        System.out.println(num_pt);


        //Moeda local do usuário.

        NumberFormat moeda = NumberFormat.getCurrencyInstance(Locale.getDefault());

        Currency currency = moeda.getCurrency();
        System.out.println(currency);

        String valor = moeda.format(100.55);
        System.out.println(valor);








    }

}
