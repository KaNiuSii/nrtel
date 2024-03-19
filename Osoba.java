public class Osoba extends Wpis {
    private String imie;
    private String nazwisko;
    private String adres;
    private NrTelefoniczny nrTelefonu;

    public Osoba(String imie, String nazwisko, String adres, NrTelefoniczny nrTelefonu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;
        this.nrTelefonu = nrTelefonu;
    }

    @Override
    public void opis() {
        System.out.println(imie + " " + nazwisko + ", " + adres + ", " + nrTelefonu);
    }
}
