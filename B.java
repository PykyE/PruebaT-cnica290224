package com.b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author miguel_rico
 */
public class B {

    public B (String n) {
        this.n = Integer.valueOf(n);
        this.start();
    }
    
    private final int base_milis = 1000;
    private int n = 0;
    private MyThread t1 = null;
    private MyThread t2 = null;
    
    public void start() {
        t1 = new MyThread(n);
        t2 = new MyThread(n);
        t1.setName("Hilo 1");
        t2.setName("Hilo 2");
        t1.start();
        t2.start();
    }
    
    public class MyThread extends Thread {

        private int n;

        public MyThread(int n) {
            this.n = n;
        }
        
        public void log(int i) {
            System.out.println(this.getName() + ": " + i);
        }
        
        @Override
        public void run() {
            super.run();
            try {
                for(int i = 1; i <= n; i++) {
                    switch (this.getName()) {
                        case "Hilo 1":
                            if (i % 2 == 0) {
                                log(i);
                            }
                            break;
                        case "Hilo 2":
                            if (i % 2 != 0) {
                                log(i);
                            }
                            break;
                        default:

                    }
                    this.sleep(base_milis);
                }
            } catch (InterruptedException e) {}
        }
        
    }
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String n = reader.readLine();
        
        new B(n);
        
    }
}
