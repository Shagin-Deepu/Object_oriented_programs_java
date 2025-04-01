import java.io.*;
import java.util.*;

class File_handling_2 {
    public static void main(String args[]) {
        try {
            FileReader Fin = new FileReader("test.txt");
            FileWriter Fout = new FileWriter("copy.txt");
            int i;
            while ((i = Fin.read()) != -1) {
                Fout.write(i);
            }
            Fin.close();
            Fout.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

