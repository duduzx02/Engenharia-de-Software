import java.util.Queue;

public class Queue_Fila {
    public static void main(String[] args) {
        Queue<String> fila = new java.util.LinkedList<>();

        fila.offer("Karen");
        fila.offer("Chad");
        fila.offer("Steve");
        fila.offer("Harold");

        System.out.println("Vamos mostrar o inicio da fila sem removê-lo: " + fila.peek());
        System.out.println("Agora vamos remover o elemento da fila: " + fila.poll());
        System.out.println("vamos remover mais um elemento: " + fila.poll());
        System.out.println("Agora vamos mostrar o elemento da fila sem removê-lo: " + fila.peek());

        System.out.println("isEmpty() mostra se está vazia: " + fila.isEmpty());
        System.out.println("size() mostra o tamanho da fila: " + fila.size());

        System.out.println("contains() mostra se contém um determinado elemento: " + fila.contains("Karen"));

    }
}
