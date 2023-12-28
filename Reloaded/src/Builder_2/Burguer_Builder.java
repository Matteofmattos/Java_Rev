package Builder_2;

public abstract class Burguer_Builder {

    Burguer burguer = new Burguer();

    abstract void buildBun();
    abstract  void buildMeat();
    abstract void buildSalad();
    abstract void buildSauce();
    abstract void buildCheese();

    public Burguer burguerBuild(){
        return this.burguer;
    }

}
