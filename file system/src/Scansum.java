/**
 * 
 */

/**
 * @author Nuril Hijas
 *
 */
import java.io.FileReader;

import java.io.BufferedReader;

import java.io.IOException;

import java.util.Scanner;

import java.util.Locale;

 

 

public class Scansum {

    public static void main(String[] args) throws IOException {

        Scanner s = null;

        double sum = 0;

        try {

             //see, I set up my scanner to read a file via BufferedReader

             s = new Scanner(

                    new BufferedReader(new FileReader("sample.txt")));

            

            //this just reads the next set of characters up to a space

            while (s.hasNext()) {

                 //and if the next set of characters are a double, then I add them to sum

                 if (s.hasNextDouble()) {

                        sum += s.nextDouble();

                    } else {

                        s.next();

                    }  

            }

        } finally {

            s.close();

        }

        //printed out my sum to the console

        System.out.println("The sum ="+sum);

    }

}