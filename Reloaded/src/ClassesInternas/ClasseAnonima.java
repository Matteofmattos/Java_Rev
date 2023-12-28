package ClassesInternas;

public class ClasseAnonima {

    public void imprimeTexto(){
        System.out.println("Qualquer texto...");
    }

    public static void main(String[] args) {

        ClasseAnonima anonima = new ClasseAnonima() {
            public void imprimeTexto() {
                System.out.println("qualquer texto sobrescrito. \n");
            }
        };

        anonima.imprimeTexto();
    }


}   // Em tempo de execução configura-se um novo comportamento do método, seria possível até mesmo instanciar uma interface na classe anonima.
