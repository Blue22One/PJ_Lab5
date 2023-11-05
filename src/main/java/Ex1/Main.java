package Ex1;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<PerecheNumere> lista = new ArrayList<>();
        lista.add(new PerecheNumere(34,52));
        lista.add(new PerecheNumere(34,-21));
        lista.add(new PerecheNumere(25,342));

        scriere(lista);

        List<PerecheNumere> lista1 = citire();
        //System.out.println(lista);
        for(PerecheNumere p : lista1)
        {
            System.out.println(p);
        }

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
        for(PerecheNumere p : lista1)
        {
            System.out.println(p.FiboPair(vect));
        }

        System.out.println("CMMMC al perechilor:");
        for(PerecheNumere p : lista1)
        {
            System.out.println(p.CMMMC());
        }

        System.out.println("Care perechi au suma cifrelor egala?");
        for(PerecheNumere p : lista1)
        {
            System.out.println(p.SumaCifEgala());
        }

        System.out.println("Care perechi au acelasi nr de cifre pare?");
        for(PerecheNumere p : lista1)
        {
            System.out.println(p.EgalCifPare());
        }

    }

    public static void scriere(List<PerecheNumere> lista)
    {
        try {
            ObjectMapper mapper = new ObjectMapper();
            File file = new File("src/main/resources/perechi1.json");
            mapper.writeValue(file,lista);
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
    public static List<PerecheNumere> citire()
    {
        try{
            ObjectMapper mapper = new ObjectMapper();
            File file = new File("src/main/resources/perechi1.json");
            List<PerecheNumere> perechi = mapper.
                    readValue(file, new TypeReference<List<PerecheNumere>>(){});
            return perechi;
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
