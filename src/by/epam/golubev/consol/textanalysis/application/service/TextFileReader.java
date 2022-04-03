package by.epam.golubev.consol.textanalysis.application.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextFileReader {

     public Scanner readTextFile(){
          File file = new File("gText.txt");
          Scanner scanner = null;

               try {
                    scanner = new Scanner(file);
               } catch (FileNotFoundException e) {
                    e.printStackTrace();
               }

               return scanner;
     }
     public void closeScanner(Scanner scanner){
          scanner.close();
     }
}
