package Generics.completo;

public interface Animal{
     void consulta();
}


class Cachorro extends GenericAnimal<Cachorro> implements Animal {

    public Cachorro(String raca, String nome) {
        super(raca, nome);
    }

    @Override
    public Class<Cachorro> getTipo() {
        return Cachorro.class;
    }

}


class Gato extends GenericAnimal<Gato> implements Animal {

    public Gato(String raca, String nome) {
        super(raca, nome);
    }

    @Override
    public Class<Gato> getTipo() {
        return Gato.class;
    }
}



