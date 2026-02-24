public class Pravokutnik extends GeoLik{

    private double velicinaAC;
    private double velicinaBD;

    public Pravokutnik(String naziv, double velicinaAC, double velicinaBD){
        super(naziv);
        this.velicinaAC = velicinaAC;
        this.velicinaBD = velicinaBD;
    }


    public double getVelicinaAC(){
        return velicinaAC;
    }

    public double getVelicinaBD() {
        return velicinaBD;
    }

    public void setVelicinaAC(double velicinaAC){
        this.velicinaAC = velicinaAC;
    }

    public void setVelicinaBD(double velicinaBD){
        this.velicinaBD = velicinaBD;
    }

    @Override
    public double opseg() {
        return 2 * (velicinaAC + velicinaBD);
    }

    @Override
    public double povrsina() {
        return velicinaAC * velicinaBD;
    }
}
