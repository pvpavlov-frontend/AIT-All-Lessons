package ait.wardrobe.model;

public class Wardrobe implements Comparable<Wardrobe>{
    double height;
    double width;
    double depth;

    public Wardrobe(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public double getHeight() {
        return height;
    }


    public double area() {
        return width * depth;
    }

    public double volume() {
        return area() * height;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if(!(obj instanceof Wardrobe wardrobe)) return false;

        if(Double.compare(height, wardrobe.height)!=0) return false;
        if(Double.compare(width, wardrobe.width)!=0) return false;
        return Double.compare(depth, wardrobe.depth) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(height);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(width);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(depth);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Wardrobe{" +
                "height=" + height +
                ", width=" + width +
                ", depth=" + depth +
                ", area=" + area() +
                ", volume=" + volume() +
                '}';
    }

    /**
     * @param o the object to be compared.
     */
    @Override
    public int compareTo(Wardrobe o) {
        return Double.compare(height, o.height);
    }
}
