package Classes;

import Methods.While;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Read {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true){
            int x = Integer.parseInt(scanner.nextLine());
            if (x != 0){
                try {
                    throw new  IOException();
                }catch (IOException e){
                    System.out.println("user enter some thing other 0");

                }

            }
        }
    }

}
