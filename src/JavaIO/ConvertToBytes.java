/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaIO;

import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author nikolad
 */
public class ConvertToBytes {

    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        int a = inputStream.read();
        while (a != -1) {
            System.out.print(a);
            a = inputStream.read();
        }
        inputStream.close();
    }
}
