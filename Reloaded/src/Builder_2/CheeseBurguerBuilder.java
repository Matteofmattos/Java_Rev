package Builder_2;

public class CheeseBurguerBuilder extends Burguer_Builder{
    @Override
    void buildBun() {
        burguer.setBun("White bread");
    }

    @Override
    void buildMeat() {
        burguer.setMeat("Beef");
    }

    @Override
    void buildSalad() {
        burguer.setSalad("tomatos and arugula");
    }

    @Override
    void buildSauce() {
        burguer.setSouce("Secret souce");
    }

    @Override
    void buildCheese() {
        burguer.setCheese("American cheese");
    }
}
