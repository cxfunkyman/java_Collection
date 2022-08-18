package FileHandler;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * WAP to accept a text in a file and then print the text words 
 * alphabetically (for example, the words starting with ‘a’ come 
 * first, then words starting with ‘b’ and so on). At the end of 
 * printing the words with respective alphabets, count and give 
 * the number of words in that group (starting with ‘a’ then ’b’ 
 * and ….). At the end, when you finished with letter ‘z’, give 
 * to total number of words and sentences in the whole text as 
 * well.
 */

public class PrintFileSorted {
  public static void main(String[] args) {
      int sum=0,sum1=0;
      try {
        FileWriter myWriter = new FileWriter("D:\\FilesJava\\ff.txt");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the text: ");
        myWriter.write(in.nextLine());
           myWriter.close();
            in.close();
       for(char a='a';a<='z';a++) {
            Scanner s = new Scanner(new File("D:\\FilesJava\\ff.txt"));
            int i=0;
            while (s.hasNext()) {
                String str=s.next();
                if(str.startsWith(Character.toString(a))) {
                    System.out.print(str + " ");
                    i++;
                    }
                if(str.endsWith(Character.toString('.')) && a=='a')sum1++;
            }
            System.out.println("No. of words starting with:" + a + " is " + i + "\n");
            s.close();
            sum=sum+i;
        }
        System.out.println("Total number of words:" + sum);
        System.out.println("Total number of sentences:" + sum1);
      }
      catch (IOException e) {
              System.out.println("An error occurred.");
              e.printStackTrace();
     }
      }
}
 
