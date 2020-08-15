/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 *
 * @author nikolad
 */
public class ReverseInputText {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String txt = reader.readLine();
        byte[] byteArr = txt.getBytes();
        byte[] res = new byte[byteArr.length];
        for (int i = 0; i < byteArr.length; i++) {
            res[i] = byteArr[byteArr.length - i - 1];
        }
        System.out.println(new String(res));

        reader.close();
    }
}
