public class Pravokutnik {

    private String naziv;
    private double velicinaAC;
    private double velicinaBD;

    public Pravokutnik(String naziv, double velicinaAC, double velicinaBD){
        this.naziv = naziv;
        this.velicinaAC = velicinaAC;
        this.velicinaBD = velicinaBD;
    }

    public String getNaziv(){
        return naziv;
    }

    public double getVelicinaAC(){
        return velicinaAC;
    }

    public double getVelicinaBD() {
        return velicinaBD;
    }

    public void setNaziv(String naziv){
        this.naziv = naziv;
    }

    public void setVelicinaAC(double velicinaAC){
        this.velicinaAC = velicinaAC;
    }

    public void setVelicinaBD(double velicinaBD){
        this.velicinaBD = velicinaBD;
    }
}
