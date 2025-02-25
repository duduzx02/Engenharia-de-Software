import java.util.Stack;

// Pilha tem 05 Métoso principais
// push - Adicona um item ao topo da pilha
// pop - Remove um item do topo da pilha
// peek - Verifica o item do topo da pilha sem remover
// empty - Verifica se a pilha esta vazia
// size - Retorna o tamanho da pilha
// search - Retorna o indice do item

public class ExemploDeStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("Doom");
        stack.push("League of Legends");


        System.out.println("A pilha está vazia? " + stack.empty());
        System.out.println("Quem está no topo da pilha? " + stack.peek());

        System.out.println("Vamos remover o item do topo da pilha: " + stack.pop());
        System.out.println("A pilha está vazia? " + stack.empty());

        System.out.println("Quem está no topo da pilha agora? " + stack.peek());

        System.out.println("Tamanho da pilha: " + stack.size());

        System.out.println("Doom está na lista? posição: " + stack.search("Doom"));


    }
}
