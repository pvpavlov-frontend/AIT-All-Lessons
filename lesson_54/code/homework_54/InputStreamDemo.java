package homework_54;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamDemo {
    public static void main(String[] args) throws Exception {
        InputStream is = null;
        byte[] buffer = new byte[601];
        char c;

        try {
            // new input stream created
            is = new FileInputStream("file.dat");

            System.out.println("Characters printed:");

            // read stream data into buffer
            is.read(buffer, 0, 601);

            // for each byte in the buffer
            for(byte b:buffer) {

                // convert byte to character
                if(b == 0)

                    // if b is empty
                    c = '-';
                else

                    // if b is read
                    c = (char)b;

                // prints character
                System.out.print(c);
            }

        } catch(Exception e) {
            // if any I/O error occurs
            e.printStackTrace();
        } finally {
            // releases system resources associated with this stream
            if(is!=null)
                is.close();
        }
    }
}