package Composite_1;

import java.util.ArrayList;
import java.util.List;

public class CompositeProduct extends ProductComponent{

    private static List<ProductComponent> children = new ArrayList<ProductComponent>();

    public static void setChildren(List<ProductComponent> children) {
        CompositeProduct.children = children;
    }

    @Override
    float getPrice() {
        float totalPacote = 0;
        for ( ProductComponent value: children){
            totalPacote+=value.getPrice();
        }
        return totalPacote;
    }

    @Override
    void add(ProductComponent product) {
        children.add(product);
    }

    @Override
    void remove(ProductComponent product) {
        children.remove(product);
    }
}

