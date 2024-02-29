package com.d;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author miguel_rico
 */
public class D {
    
    private int n = 0;
    private int b = 0;
    
    public D(int n, int b) {
        this.n = n;
        this.b = b;
        decimalToBinary();
    }
    
    public void decimalToBinary() {
        int[] binVal = new int[this.b];
        int i = 0;
        int iterationN = this.n;
        while (iterationN != 0) {
            binVal[i] = iterationN%2;
            iterationN = iterationN/2;
            i++;
        }
        reverseBinary(binVal);
    }
    
    public void reverseBinary(int[] binVal) {
        int[] revBinVal = new int[binVal.length]; 
        int pos = this.b;
        for (int i = 0; i < binVal.length; i++) { 
            revBinVal[pos - 1] = binVal[i]; 
            pos--; 
        }
        for(int x: revBinVal) {
            System.out.print(x);
        }
    }

    public static void main(String[] args) throws IOException {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] splitValues = reader.readLine().split(" ");
        
        new D(Integer.valueOf(splitValues[0]), Integer.valueOf(splitValues[1]));
        
    }
}
