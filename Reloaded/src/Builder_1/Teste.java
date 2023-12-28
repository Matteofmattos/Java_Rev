package Builder_1;

import Builder_1.Builders.MainDishBuilder;
import Builder_1.Builders.WeekendDishBuilder;

public class Teste {

    public static void main(String[] args) {

        System.out.println("\n | -------------------** CARDÁPIO **-------------------- |      \n");

        System.out.println("\n            ---- ** Refeição principal ** ----\n");

        MainDishBuilder main_dishBilder = new MainDishBuilder();

        main_dishBilder.make_meal();
        main_dishBilder.make_dessert();
        main_dishBilder.make_drink();

        main_dishBilder.GetMealBox().getBox();
        System.out.printf(String.format(" %20s Valor total R$ %.2f%n","",
                main_dishBilder.GetMealBox().getPrice()));


        System.out.println("\n            ---- ** Refeição do final de semana ** ----\n");
        WeekendDishBuilder week_dishBilder = new WeekendDishBuilder();

        week_dishBilder.make_meal();
        week_dishBilder.make_dessert();
        week_dishBilder.make_drink();

        week_dishBilder.GetMealBox().getBox();
        System.out.printf(String.format(" %20s Valor total R$ %.2f%n","",
                week_dishBilder.GetMealBox().getPrice()));


        /*
        week_dishBilder.GetMealBox().clearBox();
        System.out.println(week_dishBilder.GetMealBox().getPrice());
         **/

        System.out.println("\n            ---- ** Refeição2 do final de semana ** ----\n");
        week_dishBilder.newWeekendBox();
        week_dishBilder.make_drink();
        week_dishBilder.GetMealBox().getBox();
        System.out.printf(String.format(" %20s Valor total R$ %.2f%n","",
                week_dishBilder.GetMealBox().getPrice()));

    }

}
