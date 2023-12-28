package Builder_1.Builders;

import Builder_1.classes.*;
import Builder_1.interfaces.IBuilder;

public class WeekendDishBuilder implements IBuilder {

    MealBox<AbstractMeal> weekend_meal_box = new MealBox<>();

    public void newWeekendBox(){
        MealBox<AbstractMeal> weekend_meal_box = new MealBox<>();
        GetMealBox().clearBox();
    }

    @Override
    public void make_meal() {

        Pasta pasta = new Pasta(7.0,"Espaguete");
        FrenchFries french_fries = new FrenchFries(5d,"Batatas fritas");
        Lasagna lasagna = new Lasagna(8.0,"Lasanha a bolonhesa");

        this.weekend_meal_box.Add(pasta,french_fries,lasagna);

    }

    @Override
    public void make_drink() {
        Soda soda = new Soda(7.0,"Coke");
        this.weekend_meal_box.Add(soda);
    }

    @Override
    public void make_dessert() {
        IceCream ice_Cream = new IceCream(8.5,"Chocolate iceCream ");
        this.weekend_meal_box.Add(ice_Cream);
    }

    public MealBox<AbstractMeal> GetMealBox(){
        return this.weekend_meal_box;
    }

}
