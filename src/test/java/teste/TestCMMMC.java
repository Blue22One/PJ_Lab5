package teste;

import Ex1.PerecheNumere;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestCMMMC {
    @Test
    void test1_cmmmc()
    {
        PerecheNumere pn = new PerecheNumere(2, 8);
        assertEquals(8,pn.CMMMC());
    }

    @Test
    void test2_CMMMC()
    {
        PerecheNumere pn = new PerecheNumere(1, 1);
        assertEquals(1,pn.CMMMC());
    }
    @Test
    void test3_CMMMC()
    {
        PerecheNumere pn = new PerecheNumere(10, 6);
        assertEquals(30,pn.CMMMC());
    }

}
