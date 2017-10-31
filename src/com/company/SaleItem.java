package com.company;

import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

abstract class SaleItem implements ICrudAction {
    public UUID ID;
    public String ITitle;
    public float IPrice;
    public String IFirm;
    public String IProvider;
    public Random random;
    public Scanner in;
    private static int ICount=0;

    public SaleItem(){
        random = new Random();
        ID = UUID.randomUUID();
        in=new Scanner(System.in);

    }

    public void Create(){

        ITitle = "Title"+random.nextInt();
        IPrice = random.nextFloat();
        IFirm = "Firm"+random.nextInt();
        IProvider= "Provider"+random.nextInt();
        ICount=++ICount;

    }

    public void Read(){
        System.out.println("ID = "+ID);
        System.out.println("Название= "+ITitle);
        System.out.println("Цена = "+IPrice);
        System.out.println("Номер объекта = "+ICount);
        System.out.println("Фирма изготовитель = "+IFirm);
        System.out.println("Поставщик = "+IProvider);
    }

    public void Update(){
        System.out.println("Введите Title:  ");
        ITitle=in.next();
        System.out.println("Введите Цену:  ");
        IPrice=in.nextFloat();
        System.out.println("Введите Фирму:  ");
        IFirm=in.next();
        System.out.println("Введите Поставщика:  ");
        IProvider=in.next();

    }
    public void Delete(){
        ITitle = "";
        IPrice = 0;
        ICount=--ICount;
        IFirm = "";
        IProvider= "";


    }

}
