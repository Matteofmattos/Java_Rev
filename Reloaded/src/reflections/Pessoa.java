package reflections;
import java.io.Serializable;

@chavePrincipal(cpf="62532353")
public class Pessoa implements IPessoa, Serializable {

    private String nome;
    @chavePrincipal(cpf = "82323636")
    private String cpf;
    private Integer idade;

    public Pessoa() { }

    public Pessoa(String nome,Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public void Alimentar(String alimento) {
        System.out.println("Comendo "+alimento);
    }
}
