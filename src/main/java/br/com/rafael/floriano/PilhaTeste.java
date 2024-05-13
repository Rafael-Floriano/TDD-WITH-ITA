package br.com.rafael.floriano;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PilhaTeste {

    @Test
    void pilhaEmpty() {
        Pilha p = new Pilha();
        assertTrue(p.isEmpty());
        assertEquals(0, p.size());
    }

}
