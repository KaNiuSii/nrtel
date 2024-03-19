import java.util.*;

public class KsiazkaTelefoniczna {
    public static void main(String[] args) {
        TreeMap<NrTelefoniczny, Wpis> ksiazka = new TreeMap<>();

        ksiazka.put(new NrTelefoniczny("+48", "123456789"), new Osoba("Jan", "Kowalski", "ul. Kwiatowa 1", new NrTelefoniczny("+48", "123456789")));
        ksiazka.put(new NrTelefoniczny("+48", "987654321"), new Firma("XYZ", "ul. Słoneczna 2", new NrTelefoniczny("+48", "987654321")));

        Iterator<Map.Entry<NrTelefoniczny, Wpis>> iterator = ksiazka.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<NrTelefoniczny, Wpis> entry = iterator.next();
            entry.getValue().opis();
        }
    }
}
