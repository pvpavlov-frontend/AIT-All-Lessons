package homework_54;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) {
//        try(FileInputStream fis=new FileInputStream("file.dat");
//            FileOutputStream fos=new FileOutputStream("file_new.dat"))
//        {
//            byte[] buffer = new byte[256];
//            int count;
//            while((count= fis.read()) !=-1){
//
//                // записываем из буфера в файл
////                fos.write(buffer, 0, count);
//                System.out.printf("%s ",count);
//            }
//
//
//
//        }
//        catch(IOException ex){
//
//            System.out.println(ex.getMessage());
//        }

        readFile("file.dat","file_1.dat");
    }

    private static void readFile(String fileNameRead,String fileNameWrite) {

        try (
                FileInputStream fis = new FileInputStream(new File(fileNameRead))

        ) {
            int content;
            int counter = 0;
            // reads a byte at a time, if it reached end of the file, returns -1
            while ((content = fis.read()) != -1 ) {
//                System.out.print(content +" "+ fis.available()+" ");
                System.out.print(content +" ");
                counter++;
                if(counter == 11){
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
//        try (FileInputStream fis = new FileInputStream(new File(fileName))) {
//
//            // remaining bytes that can be read
//            System.out.println("Remaining bytes that can be read : " + fis.available());
//
//            // 8k a time
//            byte[] bytes = new byte[1];
//
//            // reads 8192 bytes at a time, if end of the file, returns -1
//            while (fis.read(bytes) != -1) {
//
//                // convert bytes to string for demo
//
//                // convert bytes unicode to string
//                for (byte i: bytes){
//                    System.out.println(i);
//                }
//
//                System.out.println("Remaining bytes that can be read : " + fis.available());
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


    }
}
