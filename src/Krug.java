public class Krug {
    private String naziv;
    private double radius;

    public Krug(String naziv, double radius){
        this.naziv = naziv;
        this.radius = radius;
    }

    public String getNaziv(){
        return this.naziv;
    }

    public double getRadius() {
        return radius;
    }

    public void setNaziv(String naziv){
        this.naziv = naziv;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
}
