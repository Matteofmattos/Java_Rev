package Prototype_2;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {

        Document2 documentoType1 = DocumentsRegistry.getDocument2("pdf Restrict");
        System.out.println(documentoType1);

        Document2 documentoType2 = DocumentsRegistry.getDocument2("CSV Public");
        System.out.println(documentoType2);

        Document2 documentoType3 = DocumentsRegistry.getDocument2("CSV Restrict");
        System.out.println(documentoType3);

        Document2 documentoType4 = DocumentsRegistry.getDocument2("pdf Public");
        System.out.println(documentoType4);


    }
}
