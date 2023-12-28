package Composite_1;

public class Cliente {
    public static void main(String[] args) {

        ProductLeaf camiseta1 = new ProductLeaf("Camisa básica verde",18f);
        ProductLeaf bicicleta = new ProductLeaf("Bicicleta Monark clássica",450f);
        ProductLeaf  notebook = new ProductLeaf("Notebook acer i5",2500f);

        ProductComponent carrinhoCompras = new CompositeProduct();

        carrinhoCompras.add(camiseta1);
        carrinhoCompras.add(bicicleta);
        carrinhoCompras.add(notebook);

        System.out.printf(String.format("Valor total do carrinho R$ %.2f",carrinhoCompras.getPrice()));

    }
}
