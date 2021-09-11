import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroTest {
    @Test
    void deveRetornarCarroEstrada(){
        Carro carro = new Carro();
        carro.setAnfibio("Lama");
        assertEquals("Lama", carro.getAnfibio());
    }

    @Test
    void deveRetornarCarroAquatico(){
        Carro carro = new Carro();
        carro.setAnfibio("Lama");

        assertEquals("Rio", carro.getAquatico());
    }
}