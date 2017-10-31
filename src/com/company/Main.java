package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        
        int count = Integer.parseInt(args[1]);
        int type = Integer.parseInt(args[0]);

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
                
        switch (type){
            case 0:
                for (int i=0; i = count; i++ ){
                    Tea tea = new Tea(random, scanner);
                    tea.create();
                    //tea.update();
                    tea.read();
                    //tea.delete();
                    System.out.println("=======================================");
                }
                break;
            case 1:
                for ( int i=0; i = count; i++ ){
                    Coffee coffee = new Coffee(random, scanner);
                    coffee.create();
                    //coffee.update();
                    coffee.read();
                    //coffee.delete();
                    System.out.println("=======================================");
                }
                break;
            default:
                throw new RuntimeException("Нет такого товара");
        }
    }
}
