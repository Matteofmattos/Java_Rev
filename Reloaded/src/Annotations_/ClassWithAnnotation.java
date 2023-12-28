package Annotations_;

//Annotations é um recurso que permite embutir informações complementares no código fonte.
// As informações podem ser consumidas pelo compilador,por tempo de execução (Runtime) ou em deploy.
@firstAnnotation(value = "Matheus. ",bairros = {"Centro"},valorDefault = 20d)
public class ClassWithAnnotation {

    @firstAnnotation(value = "Felipe",bairros = {"Jardim panorama "},valorDefault = 30d)
    private String nome;

}
