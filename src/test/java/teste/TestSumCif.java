package teste;

import Ex1.PerecheNumere;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestSumCif {
    @Test
    void test1_sumcif()
    {
        PerecheNumere pn = new PerecheNumere(81, 54);
        assertTrue(pn.SumaCifEgala());
    }
    @Test
    void test2_sumcif()
    {
        PerecheNumere pn = new PerecheNumere(32,23);
        assertEquals(true, pn.SumaCifEgala());
    }
    @Test
    void test3_sumcif()
    {
        PerecheNumere pn = new PerecheNumere(12,23);
        assertFalse(pn.SumaCifEgala());
    }
}
