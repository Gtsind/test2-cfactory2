package gr.aueb.cf.ch9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class PdfCopyApp {

    public static void main(String[] args) {
        int b;
        int counter = 0;
        try(FileInputStream fis = new FileInputStream("c:/tmp/dummy.pdf");
            FileOutputStream fos = new FileOutputStream("C:/tmp/dummy-out.pdf")) {

            while ((b = fis.read()) != -1 ) {
                fos.write(b);
                counter++;
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
