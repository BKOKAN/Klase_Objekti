public abstract class GeoLik {

    String naziv;

    public GeoLik(String naziv) {
        this.naziv = naziv;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    @Override
    public String toString() {
        return naziv;
    }

    public abstract double opseg();
    public abstract double povrsina();
}