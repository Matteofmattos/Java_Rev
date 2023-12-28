package Composite_1;

public class ProductLeaf extends ProductComponent {

    private String name;
    private Float price;

    public ProductLeaf(String name, Float price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    float getPrice() {
        return this.price;
    }
}
