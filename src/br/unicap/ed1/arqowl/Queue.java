
package br.unicap.ed1.arqowl;

public class Queue<T> {
    private LSENode<T> inicio;
    private LSENode<T> fim;    

    public boolean isEmpty() {
        if (this.inicio == null) {
            return true;
        }
        else {
            return false;
        }   
    }

    public boolean isFull() {
        return false;
    }

    public void enQueue (T value) { // inserir valor no FINAL da fila
        LSENode<T> novo = new LSENode(value);
        if (this.isEmpty() == true) {
            this.inicio = novo;
            this.fim = novo;
        }
        else {
            this.fim.setNext(novo);
            this.fim = novo;
        }
    }

    public T deQueue() {
        LSENode<T> aux = this.inicio;
        if (this.inicio == this.fim) {
            this.inicio = null;   
            this.fim = null;
        }
        else {
            this.inicio = this.inicio.getNext();
        }
        return aux.getContent();
    }

    public T head () {
        return this.inicio.getContent();
    }

    
}