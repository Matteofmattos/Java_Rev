package Builder_2;

public class VeganBurguerBuilder extends Burguer_Builder {

    @Override
    void buildBun() {
        burguer.setBun("Vegan Bread");
    }

    @Override
    void buildMeat() {
        burguer.setMeat("Soy meat");
    }

    @Override
    void buildSalad() {
        burguer.setSalad("complete salad");
    }

    @Override
    void buildSauce() {
        burguer.setSouce("vegan sauce");
    }

    @Override
    void buildCheese() {
        burguer.setCheese("vegan cheese");
    }
}
