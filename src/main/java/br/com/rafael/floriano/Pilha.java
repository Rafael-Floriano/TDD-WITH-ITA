package br.com.rafael.floriano;

public class Pilha {

    private Object elemento;
    private int quantidade;

    public boolean isEmpty() {
        return elemento == null;
    }

    public int size() {
        return quantidade;
    }

    public void empilha(Object elemento) {
        quantidade++;
        this.elemento = elemento;
    }

    public Object topo() {
        return elemento;
    }
}
