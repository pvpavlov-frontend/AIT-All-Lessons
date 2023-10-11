package demo20231004_1.src;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReaderObj {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try (ObjectInputStream is = new ObjectInputStream( new FileInputStream("object_out.dat"))) {
            Person person =(Person)is.readObject();
            System.out.println(person);
        }
    }
}
