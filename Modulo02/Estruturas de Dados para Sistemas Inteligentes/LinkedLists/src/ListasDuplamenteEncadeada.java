import java.util.LinkedList;

public class ListasDuplamenteEncadeada {
    public static void main(String[] args) {
        // Criando uma lista encadeada
        LinkedList<String> linkedList = new LinkedList<>();

        // Adicionando elementos (como uma pilha)
        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("F");

        System.out.println("Lista após adicionar elementos: " + linkedList);

        // Removendo o topo da pilha
        linkedList.pop();
        System.out.println("Lista após remover o topo: " + linkedList);

        // Inserindo um elemento no meio
        linkedList.add(4, "E"); // Inserindo "E" entre "D" e "F"
        System.out.println("Lista após inserir 'E': " + linkedList);

        // Removendo um elemento
        linkedList.remove("E");
        System.out.println("Lista após remover 'E': " + linkedList);

        // Acessando o primeiro e o último elemento
        System.out.println("Primeiro elemento: " + linkedList.peekFirst());
        System.out.println("Último elemento: " + linkedList.peekLast());

        // Adicionando no início e no fim
        linkedList.addFirst("0");
        linkedList.addLast("G");
        System.out.println("Lista após adicionar no início e no fim: " + linkedList);

        // Removendo o primeiro e o último elemento
        String primeiro = linkedList.removeFirst();
        String ultimo = linkedList.removeLast();
        System.out.println("Lista após remover o primeiro e o último: " + linkedList);
        System.out.println("Elementos removidos: " + primeiro + ", " + ultimo);
    }
}