package Prototype_2;

import java.util.HashMap;
import java.util.Map;

public class DocumentsRegistry {
    private static final DocumentsRegistry INSTANCE = new DocumentsRegistry(); // Os protótipos poderiam ser criados pelo usuário e adicionados.
    private static final Map<String,Document2> REGISTRY = new HashMap<>();

    static {
        Document2 d4 = new Document2();
        d4.name = "MembersList.pdf";
        d4.type="PDF";
        d4.visibility="Restrict";
        d4.localization = "arquiv.sytem.123";
        REGISTRY.put("pdf Restrict",d4);

        Document2 d1 = new Document2();
        d1.name = "MembersList.pdf";
        d1.type="PDF";
        d1.visibility="Public";
        d1.localization = "arquiv.sytem.123";
        REGISTRY.put("pdf Public",d1);

        Document2 d2 = new Document2();
        d2.name = "MembersList.csv";
        d2.type="PDF";
        d2.visibility="Restrict";
        d2.localization = "arquiv.sytem.123";
        REGISTRY.put("CSV Public",d2);

        Document2 d3 = new Document2();
        d3.name = "MembersList.csv";
        d3.type="PDF";
        d3.visibility="Restrict";
        d3.localization = "arquiv.sytem.123";
        REGISTRY.put("CSV Restrict",d3);

    }

    public static DocumentsRegistry getInstance(){
        return INSTANCE;
    }

    public static Document2 getDocument2(String key){
        try{ return REGISTRY.get(key).clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

}
