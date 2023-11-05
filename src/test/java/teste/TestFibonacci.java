package teste;

import Ex1.PerecheNumere;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestFibonacci {
    private int[] generateFibo()
    {
        int i = 0, j = 1;
        int[] vect = new int[10000];
        vect[0] = i;
        vect[1] = j;
        int poz = 2, sum = 0;
        while(sum < 10000000)
        {
            sum = i+j;
            vect[poz++] = sum;
            i = j;
            j = sum;
        }
        return vect;
    }
    @Test
    void test1_Fibo()
    {
        PerecheNumere pn = new PerecheNumere(1,1);
        assertEquals(true, pn.FiboPair(generateFibo()));
    }

    @Test
    void test2_Fibo()
    {
        PerecheNumere pn = new PerecheNumere(123,27);
        assertFalse(pn.FiboPair(generateFibo()));
    }

    @Test
    void test3_Fibo()
    {
        PerecheNumere pn = new PerecheNumere(8,13);
        assertTrue(pn.FiboPair(generateFibo()));
    }
}
