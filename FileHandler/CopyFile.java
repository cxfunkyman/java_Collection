package FileHandler;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/* 
 * WAP to accept the user input and write it into a file. 
 * Then copy the contents of this file to another one.
 */


public class CopyFile {
public static void main(String[] args) {
       try {
          FileWriter myWriter = new FileWriter("D:\\FilesJava\\ff.txt");
          Scanner in = new Scanner(System.in);
          System.out.println("Enter a sentence: ");
          myWriter.write(in.nextLine());
          myWriter.close();

          FileInputStream fis = new FileInputStream("D:\\FilesJava\\ff.txt");
          FileOutputStream fos = new FileOutputStream("D:\\FilesJava\\gg.txt");
          int b;
          while ((b=fis.read()) != -1) {//read returns the next byte of data, or -1 if the end of the file is reached
              System.out.println("The ascii of character read " + b
                      + " & character " + (char)b);
              fos.write(b);
          }
          in.close();
          fis.close();
          fos.close();
          }
      catch (IOException e) {
      System.out.println("An error occurred.");
      //e.printStackTrace();
      }
      }
}

