/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaIO;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nikolad
 */
public class CountWords {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String word = reader.readLine();
        String newTrimmed = word.trim();

        reader.close();

        if (newTrimmed.isEmpty()) {
            System.out.println(0);
        } else {
            String[] words = newTrimmed.split("\\s+");
            System.out.println(words.length);
        }

    }
}
