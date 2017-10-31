package com.company;

public class Main {
    public static void main(String[] args){
        int i=0;
        Integer j = new Integer(args[1]);
        Integer k = new Integer(args[0]);
        tea TEA;
        coffee COFFEE;

        switch (k){
            case 0:
                for ( i=1; i <= j; i++ ){
                    TEA = new tea();
                    TEA.Create();
                    //TEA.Update();
                    TEA.Read();
                    //TEA.Delete();
                    System.out.println("=======================================");
                }
                break;
            case 1:
                for ( i=1; i <= j; i++ ){
                    COFFEE = new coffee();
                    COFFEE.Create();
                    //COFFEE.Update();
                    COFFEE.Read();
                    //COFFEE.Delete();
                    System.out.println("=======================================");
                }
                break;
            default:
                System.out.println("ну, допустим, Мяу");
                break;


        }








    }



}
