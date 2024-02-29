package com.c;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author miguel_rico
 */
public class C {

    private String values = null;
    
    public C(String values) {
        this.values = values;
    }
    
    public void getPermutations() {
    
    }
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String n = reader.readLine();
        
        new C(n);
        
    }
}
