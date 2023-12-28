package Builder_1.classes;

import Builder_1.interfaces.Imeal_composite;

public abstract class AbstractMeal implements Imeal_composite {
    private Double price;
    private String nome;

    public AbstractMeal(Double price, String nome) {
        this.price = price;
        this.nome = nome;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

}
