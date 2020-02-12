/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread_runnable;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Yuri
 */
public class PrintThread implements Runnable {

    String valueToPrint;

    public PrintThread(String valueToPrint) {
        this.valueToPrint = valueToPrint;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            try {
                sleep((long) (Math.random() * 100));
            } catch (InterruptedException ex) {
                Logger.getLogger(PrintThread.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.print(valueToPrint);
        }
    }
}
