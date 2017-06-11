import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by vika on 11.06.17.
 */
public class Numbers {
    public void writeNumbers() {
    /*    File folder= new File("D:\\first");
        folder.mkdir();*/
        File myPath = new File("/tmp/a/b");

        myPath.mkdirs();

        try {

            OutputStream output = new FileOutputStream(myPath);
            for (int i = 0; i < 10000000; i++) {
              //  Random random = new Random();

                output.write(5);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
