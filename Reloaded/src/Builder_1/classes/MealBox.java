package Builder_1.classes;

import Builder_1.interfaces.Imeal_composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MealBox<T extends AbstractMeal> implements Imeal_composite {

    List<T> box = new ArrayList<>();

    @SafeVarargs
    public final void Add(T... meals){
        box.addAll(Arrays.asList(meals));
    }

    @Override
    public double getPrice() {
        double priceTot = 0;
        for (Imeal_composite meal : box) {
            priceTot += meal.getPrice();
        }
        return priceTot;
    }

    public void clearBox(){
        this.box.clear();
    }

    public void getBox(){
        for (Imeal_composite meal: box){
            String value = meal.getClass().getName();
            String[] values = value.split("\\.");
            System.out.printf(String.format("%20s%n",values[2]));
        }
    }
}
