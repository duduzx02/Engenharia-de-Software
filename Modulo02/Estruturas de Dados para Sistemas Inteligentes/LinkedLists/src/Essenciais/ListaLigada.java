package Essenciais;

public class ListaLigada {
    No primeiro, ultimo;

    public ListaLigada() {
        primeiro = null;
        ultimo = null;
    }

    public boolean Listavazia() {
        return (primeiro == null && ultimo == null);
    }

    public void InserirInicio(No novoNo) {
        if (Listavazia()) {
            ultimo = novoNo;
        } else {
            novoNo.proximo = primeiro;
        }
        primeiro = novoNo;
    }

    public void Remover(double elemento){
        No noTemp = primeiro;
        No noAnterior = null;
        if(primeiro.elemento == elemento){
            primeiro = primeiro.proximo;
        }else{
            while(noTemp != null && noTemp.elemento != elemento){
                noAnterior = noTemp;
                noTemp = noTemp.proximo;
            }
            if(noTemp != null){
                noAnterior.proximo = noTemp.proximo;
            }
            if(noTemp == null){
                ultimo = noAnterior;
            }
        }
    }

    public void InserirFinal(No novoNo) {
        if (Listavazia()) {
            primeiro = novoNo;
        } else {
            ultimo.proximo = novoNo;

        }
        ultimo = novoNo;
    }

    public void InserirMeio(No novoNo, int posicao) {
        int posAux = 1;
        int nroNos = ContarNos();
        No aux = primeiro;
        if (posicao <= 1) {
            InserirInicio(novoNo);
        } else if (posicao >= nroNos) {
            InserirFinal(novoNo);
        } else {
            while (posAux < (posicao - 1)) {
                aux = aux.proximo;
                posAux++;
            }
            novoNo.proximo = aux.proximo;
            aux.proximo = novoNo;
        }
    }

    public void MostrarLista(){
        No noTemp = primeiro;
        int i = 1;
        while(noTemp != null){
            System.out.println("Elemento " + noTemp.elemento + " posição " + i);
            noTemp = noTemp.proximo;
            i++;
        }
    }

    public void ElementoInicio(){
        if(!Listavazia()){
            System.out.println("Elemento do inicio: " + primeiro.elemento);
        } else{
            System.out.println("Lista vazia");
        }
    }

    public void ElementoFinal(){
        if(!Listavazia()){
            System.out.println("Elemento do final: " + ultimo.elemento);
        } else{
            System.out.println("Lista vazia");
        }
    }

    public int ContarNos() {
        int tamanho = 0;
        No aux = primeiro;
        while (aux != null) {
            tamanho++;
            aux = aux.proximo;
        }
        return tamanho;
    }

    public No BuscaElemento(double elemento){
        No noTemp = primeiro;
        int i = 1;
        while(noTemp != null){
            if(noTemp.elemento == elemento){
                System.out.println("Nó "+ elemento + " encontrado na posição " + i);
                return noTemp;
            }
            noTemp = noTemp.proximo;
        }
        return null;
    }

}



