package Ex1;

public class PerecheNumere {
    private int a;
    private int b;

    public PerecheNumere() {
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public PerecheNumere(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "PerecheNumere{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public boolean FiboPair(int[] vect) {
        for (int i = 0; i < vect.length - 1; i++) {
            if (a == vect[i] && b == vect[i+1])
                return true;
        }
        return false;
    }

    public int CMMMC()
    {
        int r;
        int A = a, B = b;
        while(B != 0)
        {
            r = A % B;
            A = B;
            B = r;
        }
        return Math.abs(a*b)/A;
    }

    public boolean SumaCifEgala()
    {
        return SumaCif(a) == SumaCif(b);
    }
    private int SumaCif(int x)
    {
        int sum = 0;
        while(x>0)
        {
            sum+=x%10;
            x/=10;
        }
        return sum;
    }

    public boolean EgalCifPare()
    {
        return NrCifPare(a) == NrCifPare(b);
    }

    private int NrCifPare(int x)
    {
        int nr = 0;
        while(x!=0)
        {
            if((x%10)%2==0)
                nr++;
            x/=10;
        }
        return nr;
    }
}
