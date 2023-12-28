package prototype_1;

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {

        Document1 d1 = new Document1();
        d1.name = "MembersList.pdf";
        d1.type="PDF";
        d1.visibility="Restrict";
        d1.localization = "arquiv.sytem.123";

        System.out.println(d1);
        System.out.println(" --------*** clonagem 1 ***--------\n");

        Document1 d2 = d1.clone();
        d2.name="\"MembersList2.pdf";

        System.out.println(d2);

    }


}
