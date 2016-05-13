
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Borodikhina {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        char c = 0;
        String test = 0;
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        FileWriter writer = new FileWriter("output.txt",false);
        List<String> lines = new ArrayList<String>();




        while ((line = reader.readLine()) != null) {
            line = line.replaceAll("\t", "");
            line = line.replaceAll(" ", "");
            line = line.replaceAll("\r", "");
            lines.add(line);
        }
        String str="";
        for (int i = 0; i < lines.size(); i++) {
            str+=lines.get(i);
        }
        char[] Array = str.toCharArray();
        int j = 0;
        while(Array[j] != '{')
        {
            if((Array[j] == '('))
                writer.append(' ');
            writer.append(Array[j]);
            if((Array[j] == ')'))
                writer.append(' ');
            j++;
        }
        writer.append(Array[j]);
        writer.append(System.getProperty("line.separator"));
        writer.append("    ");
        j++;
        while(Array[j] != '}')
        {
            if((Array[j] == '('))
                writer.append(' ');
            writer.append(Array[j]);
            if((Array[j] == ')'))
                writer.append(' ');
            if(Array[j] == ';')
                writer.append(System.getProperty("line.separator"));
            j++;
        }
        writer.append(Array[j]);

        writer.flush();
        writer.close();

    }

}
