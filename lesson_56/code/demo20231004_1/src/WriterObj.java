package demo20231004_1.src;

import java.io.*;

public class WriterObj {

    public static void main(String[] args) throws IOException {
        Person p1= new Person("john", 20, 10, 200, new Car("opel"));
        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("object_out.dat"))) {
            os.writeObject(p1);
        }
    }
}
