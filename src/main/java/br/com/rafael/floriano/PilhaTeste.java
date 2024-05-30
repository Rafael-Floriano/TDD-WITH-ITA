package br.com.rafael.floriano;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PilhaTeste {

    @Test
    void pilhaEmpty() {
        Pilha p = new Pilha();
        assertTrue(p.isEmpty());
        assertEquals(0, p.size());
    }

    @Test
    void empilhaUmElemento() {
        Pilha p = new Pilha();
        p.empilha("Primeiro elemento");
        assertFalse(p.isEmpty());
        assertEquals(1, p.size());
        assertEquals("Primeiro elemento", p.topo());
    }

}
