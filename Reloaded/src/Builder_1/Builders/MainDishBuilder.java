package Builder_1.Builders;
import Builder_1.classes.*;
import Builder_1.interfaces.IBuilder;

public class MainDishBuilder implements IBuilder {

    private final MealBox<AbstractMeal> Main_meal_box = new MealBox<>();

    public void newMainBox(){
        MealBox<AbstractMeal> Main_meal_box = new MealBox<>();
    }

    @Override
    public void make_meal() {
        Rice rice = new Rice(3.5,"Arroz");
        Beans beans = new Beans(3.2,"Feijão");
        Egg egg = new Egg(2.0,"Ovo");
        FrenchFries french_fries = new FrenchFries(5d,"Batatas fritas");
        Meat meat = new Meat(8.0,"Bife de boi");
        Tomato tomato = new Tomato(2.0,"Tomate fresco");
        this.Main_meal_box.Add(rice,beans,egg,french_fries,meat,tomato);
    }

    @Override
    public void make_drink() {
        Juice juice = new Juice(10.0,"Suco de laranja");
        this.Main_meal_box.Add(juice);
    }

    @Override
    public void make_dessert() { }

    public MealBox<AbstractMeal> GetMealBox(){
        return this.Main_meal_box;
    }

}
