public class Krug extends GeoLik{

    private double radius;

    public Krug(String naziv, double radius){
        super(naziv);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }

    @Override
    public double opseg() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double povrsina() {
        return Math.PI * radius * radius;
    }
}
