package CinemaJava;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;

public class IOUtils {
    
    public static int getFileLines(String filename) throws FileNotFoundException
    {
        int cnt = 0;
        File file = new File(filename);
        Scanner cr = new Scanner(file);
        while(cr.hasNextLine()) 
        {
            cr.nextLine();
            cnt++;
        }
        cr.close(); 
        return cnt;
    }
    
    public static String[] readFile(String filename) throws FileNotFoundException
    {
        File file = new File(filename);
        Scanner cr = new Scanner(file);
        String[] content = new String[getFileLines(filename)];
        int line = 0;
        while(cr.hasNextLine()) 
            content[line++] = cr.nextLine();
        cr.close();
        return content;
    }

    public static void writeFile(String filename, Object[] content, boolean firstLine) throws IOException
    {
        FileWriter file = new FileWriter(filename,!firstLine);
        for (Object line : content) 
            file.write(line.toString() + "\n");
        file.close();
    }

}
