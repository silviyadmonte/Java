import java.io.File;
import java.io.FileReader;
public class FilenotFound_Demo {
public static void main(String args[]) {
File file = new File(&quot;E://file.txt&quot;);
FileReader fr = new FileReader(file);
}
}