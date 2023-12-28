package ClassesInternas;

public class Externa {

    private String textoExterno = "texto externo";

    public class Interna {
        private String textoInterno = "texto interno";

        public void imprimeTexto(){
            System.out.println(textoInterno);
            System.out.println(Externa.this.textoExterno);
        }

    }


}

