import java.util.*;

class First extends Thread {
    void display (String msg ){
        System.out.println ("["+msg );
        try {
            sleep (1000);
        } catch (InterruptedException e) {
            System.out.println (e);
        }
        System.out.println ("]");
    }
}

class Second extends Thread {
    First ob;
    String str;

    Second(First obj, String str) {
        ob = obj;
        this.str = str;  // Corrected assignment
        start();
    }

    public void run(){
        synchronized(ob){
            ob.display(str);
        }
    }
}

class Synchronisation_Demo2 {
    public static void main (String [] args ){
        First F = new First ();
        Second S1 = new Second (F, "Ridhu ");
        Second S2 = new Second (F, "Sarath ");
        Second S3 = new Second (F, "Nehna ");
    }
}

