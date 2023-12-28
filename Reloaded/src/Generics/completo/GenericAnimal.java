package Generics.completo;

public abstract class GenericAnimal<T extends Animal> implements Animal{

    private String raca;
    private String nome;

    public GenericAnimal(String raca, String nome) {
        this.raca = raca;
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    @Override
    public void consulta() {
        System.out.println("\n"+this.nome +" da raça "  +this.raca + " foi criado...");
        String var = getTipo().getName();
        System.out.println("Classe: "+var.substring(18)+"\n");
    }

    public abstract Class<T> getTipo();

}
