package reflections;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {

        System.out.println("----------------*** Nome da classe ***------------\n");
        Class pessoa = Pessoa.class;
        System.out.println(pessoa+"\n");

        System.out.println("----------------*** Construtor sem parâmetro ***------------");

        Constructor construtor = pessoa.getConstructor();
        System.out.println(construtor);

        Pessoa pessoa1 = (Pessoa) construtor.newInstance();
        System.out.println(pessoa1);

        System.out.println("----------------*** Construtor com parâmetro ***------------\n");
        Constructor construtor2 = pessoa.getConstructor(String.class,Integer.class);
        System.out.println(construtor2);

        Pessoa pessoa2 = (Pessoa) construtor2.newInstance("Matheus",21);
        System.out.println(pessoa2);
        System.out.println("Nome: "+ pessoa2.getNome());
        System.out.println("Idade: "+pessoa2.getIdade());

        System.out.println("----------------*** Construtores declarados ***------------\n");
        Constructor[] constructors = pessoa.getDeclaredConstructors();
        for (Constructor constructor: constructors){
            System.out.println(constructor);
        }

        System.out.println("\n----------------*** Propriedades ***------------");
        Field[] fields = pessoa.getDeclaredFields(); // fields são os atributos da classe;
        //System.out.println(Arrays.toString(fields)); // Array de fields como strings

        for (Field field: fields){
            System.out.println(field);
            System.out.println(field.getName());
            System.out.println(field.getType()+"\n");
        }

        System.out.println("\n----------------*** Métodos ***------------");
        Method[] methods = pessoa.getDeclaredMethods(); // fields são os atributos da classe;
        for (Method method: methods){
            System.out.println(method);
            System.out.println(method.getName());
            System.out.println(method.getReturnType()+"\n");
        }

        System.out.println("\n----------------*** utilizando os métodos ***------------");
        Method metodo = pessoa.getMethod("setNome",String.class);
        Method metodo2 = pessoa.getMethod("getNome");

        System.out.println("Pegando o método: "+metodo.getName());
        System.out.println(("Pegando o método: "+metodo2.getName()));

        metodo.invoke(pessoa1,"Matheus Felipe Oliveira Mattos");
        System.out.println(metodo2.invoke(pessoa1));

        System.out.println("----------------*** Package ***-------------");
        System.out.println(pessoa1.getClass().getPackage());
        System.out.println("----------------*** Interface ***-------------");
        Class[] interfaces = pessoa.getInterfaces();

        for (Class interf: interfaces){
            System.out.println(interf.getName());
        }

        System.out.println("----------------*** @Annotations ***-------------\n");
        Annotation[] anotation = pessoa.getAnnotations(); // Annotations da classe;
        for ( Annotation an: anotation){
            System.out.println(an.annotationType());
        }

        System.out.println("\n----------Annotation por fields-------------\n");
        for (Field field: fields){ //Annotations das propriedades;
            if (field.isAnnotationPresent(chavePrincipal.class)){
                chavePrincipal annotationField = field.getAnnotation(chavePrincipal.class);
                System.out.println("Nome da anotação a partir do field: "+annotationField.toString());
                System.out.println("Valor da anotação: "+annotationField.cpf());
            }
        }

        System.out.println("\n--------Annotation pela própria classe---------\n");
        if (pessoa.isAnnotationPresent(chavePrincipal.class)){
            chavePrincipal anotationClass = (chavePrincipal) pessoa.getAnnotation(chavePrincipal.class);
            System.out.println("Nome da Annotação direto da classe : "+pessoa.getAnnotation(chavePrincipal.class));
            System.out.println("Anotação com instância e valor: "+anotationClass.cpf());
        }






    }

}
