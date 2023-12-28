package Builder_2;

public class Director {

    private Burguer_Builder burguerBuilder;

    public void setBurguerBuilder(Burguer_Builder burguerBuilder) {
        this.burguerBuilder = burguerBuilder;
    }

    public Burguer buildingBurguer(){
        burguerBuilder.buildCheese();
        burguerBuilder.buildBun();
        burguerBuilder.buildMeat();
        burguerBuilder.buildSauce();
        burguerBuilder.buildSalad();

        return burguerBuilder.burguerBuild();
    }
}
