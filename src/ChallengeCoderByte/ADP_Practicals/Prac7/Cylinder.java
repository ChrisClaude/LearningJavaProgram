package ChallengeCoderByte.ADP_Practicals.Prac7;

public class Cylinder extends Circle {

    private int height;
    private int base;

    public Cylinder(int radius, int height, int base) {
        super(radius);
        this.height = height;
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    /**
     * This methods computes the surface are of the cylinder
     * @return surface area of the cylinder
     */
    @Override
    public double getArea() {
        return getCircumference() * height;
    }

    public double getVolume() {
        return super.getArea() * height;
    }

    @Override
    public String toString() {
        return String.format("Cylinder = {radius = %d, height = %d, base = %d, Surface area = %.3f, Volume = %.3f}",
                getRadius(), getHeight(), getBase(), getArea(), getVolume());
    }
}
