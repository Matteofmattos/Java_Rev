package Collections;
import java.util.LinkedList;
import java.util.Queue;

public class TesteQueues {

    static Queue<String> fila1 = new LinkedList<>();

    public static void main(String[] args) {

        fila1.add("1");
        fila1.add("2");
        fila1.add("3");
        fila1.add("4");

        System.out.println(fila1.peek());
        fila1.poll();
        System.out.println(fila1.peek());

    }


}
