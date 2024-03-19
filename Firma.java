public class Firma extends Wpis {
    private String nazwa;
    private String adres;
    private NrTelefoniczny nrTelefonu;

    public Firma(String nazwa, String adres, NrTelefoniczny nrTelefonu) {
        this.nazwa = nazwa;
        this.adres = adres;
        this.nrTelefonu = nrTelefonu;
    }

    @Override
    public void opis() {
        System.out.println(nazwa + ", " + adres + ", " + nrTelefonu);
    }
}
