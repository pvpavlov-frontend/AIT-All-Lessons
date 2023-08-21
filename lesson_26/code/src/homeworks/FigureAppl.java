package src.homeworks;

public class FigureAppl {
    public static void main(String[] args) {
        double side = 5.0;
        double r = 8.0;
        double str1 = 5;
        double str2= 6;
        double str3 = 7;
        Shape[] shapes = new Shape[4];

        shapes[0] = new Triangle(str1, str2, str3);

        str1 = 15;
        str2= 16;
        str3 = 17;
        shapes[1] =  new Triangle(str1, str2, str3);
        shapes[2] = new Circle(r);
        shapes[3] = new Square(side);

        for (int i = 0; i < shapes.length; i++) {
             System.out.println("Area : " + shapes[i].calcArea());
        }
        for (int i = 0; i < shapes.length; i++) {
             System.out.println("Perimeter : " + shapes[i].calcPerimeter());
        }

//        System.out.println("area of triangle :" + shapes[0].calcArea());
//        System.out.println("area of triangle :" + triangle1.calcArea());
//        System.out.println("area square:" + square.calcArea());
//        System.out.println("area of a circle :" + circle.calcArea());
//
//        System.out.println("perimeter of triangle :" + triangle.calcPerimeter());
//        System.out.println("perimeter of triangle :" + triangle1.calcPerimeter());
//        System.out.println("perimeter of square :" + square.calcPerimeter());
//        System.out.println("perimeter of a circle :" + circle.calcPerimeter());


        System.out.println("=======================================");
        printArray(shapes);
        double totalArea = totalArea(shapes);
        System.out.println("=======================================");
        System.out.println("totalArea = " + totalArea);
        double totalPerimeter = totalPerimeter(shapes);
        System.out.println("totalPerimeter = " + totalPerimeter);


    }
    private static void printArray(Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println(arr[i]);
            }
        }
    }
    private static double totalPerimeter(Shape[] shapes) {
        double sum = 0;
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] != null) {
                sum += shapes[i].calcPerimeter();
            }
        }
        return sum;
    }
    private static double totalArea(Shape[] shapes) {
        double sum = 0;
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] != null) {
                sum += shapes[i].calcArea();
            }
        }
        return sum;
    }
}
