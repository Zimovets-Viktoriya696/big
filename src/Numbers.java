import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by vika on 11.06.17.
 */
public class Numbers {
    public void writeNumbers() {
            File file = new File("D:/myprogramm/test.txt");
           // file.mkdirs();
        /*String nameDir = "/java/proglang/newdir";
        File a = new File(nameDir);

        // Создание на диске папки и всех вышестоящих каталогов
        a.mkdirs();*/

        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        try {
            OutputStream output = new FileOutputStream(file);

            for (int i = 0; i < 10000000; i++) {
                list.add(random.nextInt());
                output.write(list.get(i));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
