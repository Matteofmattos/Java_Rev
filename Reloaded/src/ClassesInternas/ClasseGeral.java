package ClassesInternas;

public class ClasseGeral {

    public void imprimeTextoGeral(){
        System.out.println("Text geral. \n");

        class ClasseLocal {

            private String textoClasseLocal;

            public void imprimeTextoLocal(){
                System.out.println("Texto local...");
            }

        }

        ClasseLocal classeLocal = new ClasseLocal();
        classeLocal.imprimeTextoLocal();

    }



}

