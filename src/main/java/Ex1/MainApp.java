package Ex1;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;

import java.io.File;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        List<Mobilier> mList = citire();

        System.out.println("afisare1:");
        System.out.println(mList);
        System.out.println("afisare2:--------------------------------------------------------------------------------");
        long arieTotala = 0;
        int arieCoala = 2800 * 2070;
        for (Mobilier m : mList) {
            System.out.println("Denumire: " + m.getNume());
            for (Placa p : m.getPlaci()) {
                arieTotala += p.getLatime() * p.getLungime();
                System.out.println(p.getDescriere() + ", c:" + Arrays.toString(p.getCanturi()) + ", L:" + p.getLungime() + ", l:" + p.getLatime() + ", nr:" + p.getNr_bucati() + ", " + p.getOrientare());
            }
            System.out.println("Nr de coli necesare pentru corpul de mobila:");
            if (arieTotala / arieCoala == 0)
                System.out.println("1");
            else
                System.out.println(arieTotala / arieCoala);
        }
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println(arieTotala);


    }

    public static List<Mobilier> citire() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            File file = new File("src/main/resources/mobilier.json");
            List<Mobilier> m = mapper.readValue(file, new TypeReference<List<Mobilier>>() {
            });
            return m;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void scriere(List<Mobilier> list) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            File file = new File("src/main/resources/mobilier.json");
            mapper.writeValue(file, list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
