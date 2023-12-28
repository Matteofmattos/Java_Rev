package Equals_HashCode.OwnTest;

public class Test {

    public static void main(String[] args) {

        SmartphoneG phone1 = new SmartphoneG(153,"Iphone");
        SmartphoneG phone2 = new SmartphoneG(153,"Sansung");
        //SmartphoneG phone3  = phone1;
        //Meu equals
        //System.out.println("---------** Meu equals com apenas referência **---------\n");
        //System.out.println("Referências diferentes porém valores iguais: "+phone1.equals1(phone2));
        //System.out.println("Referências iguais: "+phone1.equals1(phone3));


        // O equals real busca os valores em si, mas estão em locais de memória diferentes, ou seja, classes distintas;
        System.out.println("\n---------** Equals completo e modificado. **---------\n");
        System.out.println("Referências diferentes porém valores iguais: "+phone1.equals(phone2));
        //System.out.println("Referências iguais: "+phone1.equals(phone3));
        System.out.println("HashCode iphone1 pelo serialNumber "+phone1.hashCode());
        System.out.println("HashCode iphone2 pelo serialNumber "+phone2.hashCode());
    }
}