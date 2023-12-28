package Builder_2;

public class Teste {
    public static void main(String[] args) {

        Director director = new Director();

        System.out.println("\n----- *** Cheese Burguer *** -----\n");
        director.setBurguerBuilder(new CheeseBurguerBuilder());
        System.out.println(director.buildingBurguer());

        System.out.println("\n----- *** Vegan Burguer *** -----\n");
        director.setBurguerBuilder(new VeganBurguerBuilder());
        System.out.println(director.buildingBurguer());
    }
}
