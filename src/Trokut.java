public class Trokut {

    private String naziv;
    private double prvaStranica;
    private double drugaStranica;
    private double trecaStranica;

    public Trokut(String naziv, double prvaStranica, double drugaStranica, double trecaStranica){
        this.naziv = naziv;
        this.prvaStranica = prvaStranica;
        this.drugaStranica = drugaStranica;
        this.trecaStranica = trecaStranica;
    }

    public String getNaziv(){
        return naziv;
    }

    public double getPrvaStranica() {
        return prvaStranica;
    }

    public double getDrugaStranica() {
        return drugaStranica;
    }

    public double getTrecaStranica(){
        return trecaStranica;
    }

    public void setNaziv(String naziv){
        this.naziv = naziv;
    }

    public void setPrvaStranica(double prvaStranica) {
        this.prvaStranica = prvaStranica;
    }

    public void setDrugaStranica(double drugaStranica) {
        this.drugaStranica = drugaStranica;
    }

    public void setTrecaStranica(double trecaStranica){
        this.trecaStranica = trecaStranica;
    }
}
