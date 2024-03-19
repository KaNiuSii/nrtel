public class NrTelefoniczny implements Comparable<NrTelefoniczny> {
    private String nrKierunkowy;
    private String nrTelefonu;

    public NrTelefoniczny(String nrKierunkowy, String nrTelefonu) {
        this.nrKierunkowy = nrKierunkowy;
        this.nrTelefonu = nrTelefonu;
    }

    public String getNrKierunkowy() {
        return nrKierunkowy;
    }

    public String getNrTelefonu() {
        return nrTelefonu;
    }

    @Override
    public int compareTo(NrTelefoniczny o) {
        int kierunkowy = this.nrKierunkowy.compareTo(o.nrKierunkowy);
        if (kierunkowy == 0) {
            return this.nrTelefonu.compareTo(o.nrTelefonu);
        }
        return kierunkowy;
    }

    @Override
    public String toString() {
        return nrKierunkowy + " " + nrTelefonu;
    }
}
