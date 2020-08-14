/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaIO;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author nikolad
 */
public class ManagingFiles {

    //samo rekurzija i eferalgan od 500mg
    public void deleteDirRecursively(File dir) {
        File[] children = dir.listFiles();
        for (File child : children) {
            if (child.isDirectory()) {
                deleteDirRecursively(child);
            } else {
                //The method delete never throws an IOException.
                child.delete();
            }
        }

        dir.delete();
    }

    
    public void moveToSpam(String username, File msg) {
        String pathToSpam = username + File.separator + "spam";
        File spamDirectory = new File(pathToSpam);
        if (!spamDirectory.exists()) {
            spamDirectory.mkdir();
        }
        File spamMsg = new File(pathToSpam + File.separator + msg.getName());
        msg.renameTo(spamMsg);
    }

    public static void main(String[] args) {
        File file = new File("/home/nikolad/PracticeJavaIO2");

        boolean createdNewDirectory = file.mkdir();
        if (createdNewDirectory) {
            System.out.println("It was successfully created.");
        } else {
            System.out.println("It was not created.");
        }

    }
}
