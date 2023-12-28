package Ordenacoes;

import java.util.Objects;

public class Manga implements Comparable<Manga> {
    private int id;
    private String nome;
    private double preco;

    public Manga(Integer id, String nome, double preco) {
        Objects.requireNonNull(id,"O id nunca deve ser nulo.");
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return Double.compare(preco, manga.preco) == 0 && Objects.equals(id, manga.id) && Objects.equals(nome, manga.nome);
    }

    //Se x.equals(y) ==true; então y.hashCode() == x.hashCode();
    //Se x.hashCode() == y.hashCode(), NÃO necessariamente x.quals(y)
    //Se x.equals(y)=false, obrigatóriamente x.hashCode() != y.hashCode();
    @Override
    public int hashCode() {
        return Objects.hash(id, nome, preco);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }

    @Override
    public int compareTo(Manga anotherManga) {
        // return 0 if this == anotherManga
        // return 1 if this > anotherManga
        // return -1 if this < anotherManga

        //return Integer.compare(this.id, anotherManga.getId());
        return this.nome.compareTo(anotherManga.getNome());
        // ou return (this.id < anotherManga.getId()) ? -1 : ((this.id == anotherManga.getId()) ? 0 : 1);
    }
}
