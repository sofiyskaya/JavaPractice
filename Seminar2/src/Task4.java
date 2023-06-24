import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Task4 {
    public static String createString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; ++i) {
            sb.append("TEST ");
        }
        String result = sb.toString();
        return result;
    }

    public static void writer(String line) throws IOException {
        File file = new File("Test.txt");
        try (FileWriter fw = new FileWriter(file, false)) {
            fw.write(line);
            fw.flush();
        }
        
    }
}
