package HW2;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

public class t1 {
    public static void main(String[] args) throws SecurityException, IOException {

        Logger lg = Logger.getLogger(t1.class.getName());
        lg.setLevel(Level.INFO);
        lg.setUseParentHandlers(false);
        FileHandler fh = new FileHandler("HW2\\log1.xml");
        lg.addHandler(fh);
        XMLFormatter sForm = new XMLFormatter();
        fh.setFormatter(sForm);
        
        int[] mas = { 11, 3, 14, 16, 7 };
        
        String str = String.format("%s", Arrays.toString(mas));
        lg.log(Level.INFO, "Enter Array of int: " + str);

        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i + 1]) {
                    isSorted = false;

                    buf = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = buf;
                    str = String.format("%s", Arrays.toString(mas));
                    lg.log(Level.INFO, "Changed array of int: " + str);
                }
            }
        }
        System.out.println(Arrays.toString(mas));
        fh.close();
    }
}
