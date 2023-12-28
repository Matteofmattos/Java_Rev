package Enumers.enumComoClasse;

public enum DiaSemana {

    SEGUNDA(1),TERCA(2),QUARTA(3),QUINTA(4),
    SEXTA(5),SABADO(6),DOMINGO(7);

    //Como são classes podem implementar interfaces, mas não extender outras classes, pois já extendem a classe ENUM PAI.

    private int valor;

    DiaSemana(int valor){  // Não há modificador de acesso, pois funciona apena implicitamente.
        this.valor= valor;
    }

    public int getValor(){
        return this.valor;
    }
}
