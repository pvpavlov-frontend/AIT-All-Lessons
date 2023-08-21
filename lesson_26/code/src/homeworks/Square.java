package src.homeworks;

class Square extends Shape {
    private double side;
    public Square (double side){
        this.side = side;
    }
    @Override
    double calcArea() {
        double s = (side * side);
        return s;
    }

    @Override
    double calcPerimeter() {
        return side * 4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
