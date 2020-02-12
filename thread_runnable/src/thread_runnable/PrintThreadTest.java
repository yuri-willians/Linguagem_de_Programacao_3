/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread_runnable;

/**
 *
 * @author Yuri
 */
public class PrintThreadTest {

    public static void main(String args[]) {
        PrintThread pt1 = new PrintThread("O");
        PrintThread pt2 = new PrintThread("X");
        new Thread(pt1).start();
        new Thread(pt2).start();
    }
}
