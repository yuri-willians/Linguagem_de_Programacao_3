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
public class ThreadStart {

    public static void main(String args[]) {
        new ThreadSample().start();
        new Thread(new RunnableSample()).start();
    }
}
