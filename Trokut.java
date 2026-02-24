public class Trokut extends GeoLik{

    private double prvaStranica;
    private double drugaStranica;
    private double trecaStranica;

    public Trokut(String naziv, double prvaStranica, double drugaStranica, double trecaStranica){
        super(naziv);
        this.prvaStranica = prvaStranica;
        this.drugaStranica = drugaStranica;
        this.trecaStranica = trecaStranica;
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

    public void setPrvaStranica(double prvaStranica) {
        this.prvaStranica = prvaStranica;
    }

    public void setDrugaStranica(double drugaStranica) {
        this.drugaStranica = drugaStranica;
    }

    public void setTrecaStranica(double trecaStranica){
        this.trecaStranica = trecaStranica;
    }

    @Override
    public double opseg() {
        return prvaStranica + drugaStranica + trecaStranica;
    }

    @Override
    public double povrsina() {
        double poluOpseg = (prvaStranica + drugaStranica + trecaStranica) / 2;
        return Math.sqrt(poluOpseg * (poluOpseg - prvaStranica) * (poluOpseg - drugaStranica) * (poluOpseg - trecaStranica));
    }
}
