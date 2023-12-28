package Enumers.EnumComoAtributo;

public class TesteEnum {

    public static void main(String[] args) {

        //usarConstantes();
        UsandoClasseEnum();

    }

    /**
    private static void usarConstantes(){

        int segunda = DiasSemanasConstantes.SEGUNDA;
        int terca = DiasSemanasConstantes.TERCA;
        int quarta = DiasSemanasConstantes.QUARTA;
        int quinta = DiasSemanasConstantes.QUINTA;
        int sexta = DiasSemanasConstantes.SEXTA;
        int sabado = DiasSemanasConstantes.SABADO;
        int domingo = DiasSemanasConstantes.DOMINGO;

        int[] dias_semana = {segunda,terca,quarta,quinta,sexta,sabado,domingo};
        for (int dia : dias_semana){
            imprimeConstante(dia);
        }

    }*/

    private static void imprimeConstante(DiaSemana dia){

        switch (dia) {
            case SEGUNDA-> System.out.println("Segunda-feira");
            case TERCA -> System.out.println("Terça-feira");
            case QUARTA -> System.out.println("Quarta-feira");
            case QUINTA -> System.out.println("Quinta-feira");
            case SEXTA -> System.out.println("Sexta-feira");
            case SABADO -> System.out.println("Sábado");
            case DOMINGO -> System.out.println("Domingo");
        }
    }

    private static void UsandoClasseEnum(){

        DiaSemana segunda = DiaSemana.SEGUNDA;  // Permite o controle sobre a variável segunda, ou seja, garante a sua tipagem como DiaSemana.
        DiaSemana terca = DiaSemana.TERCA;
        DiaSemana quarta = DiaSemana.QUARTA;
        DiaSemana quinta = DiaSemana.QUINTA;
        DiaSemana sexta = DiaSemana.SEXTA;
        DiaSemana sabado = DiaSemana.SABADO;
        DiaSemana domingo = DiaSemana.DOMINGO;

        DiaSemana[] dias_semana = {segunda,terca,quarta,quinta,sexta,sabado,domingo};
        for (DiaSemana dia : dias_semana) {
            imprimeConstante(dia);
        }

    }
}
