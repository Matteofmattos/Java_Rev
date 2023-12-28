package Singleton_1;

public class Singleton {

    private static Singleton singleton= null;

    private Singleton(){

    }

     public static Singleton getSingleton(){
        if (singleton==null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
