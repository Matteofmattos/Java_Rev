package Enumers.enumComoClasse;

public class EnumLocal {

    private String nome;
    private Genero genero;

    public EnumLocal(String nome) {
        this.nome = nome;
    }

    enum Genero{   //Enum local, usado apenas quando o enum é bastante específico.

        Masculino('M'),Feminino('F');

        private char valor;

        Genero(char valor){
            this.valor= valor;
        }

        public char getValor() {
            return valor;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
}
