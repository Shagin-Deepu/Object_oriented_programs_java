import java.util.*;
import java.io.*;

class file_rw {
    public static void main(String args[]) {
        String s = "";
        Scanner sc = new Scanner(System.in);
        
        try {
            FileWriter FW = new FileWriter("sample.txt");
            System.out.println("Enter a line of text (type 'stop' to end):");
            
            do {
                s = sc.nextLine();
                if (!s.equals("stop")) {
                    FW.write(s);
                    FW.write("\n");
                }
            } while (!s.equals("stop"));
            
            FW.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
        try {
            FileReader Fr = new FileReader("sample.txt");
            BufferedReader br = new BufferedReader(Fr);
            System.out.println("Content in the file is:\n");
            
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
            
            Fr.close();
        } catch (FileNotFoundException e) {
            System.out.println("No such file");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
        sc.close();
    }
}

