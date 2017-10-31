package com.company;

import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

abstract class SaleItem implements ICrudAction {
    public UUID id
    public String title;
    public float price;
    public String firm;
    public String provider;
    public Random random;
    public Scanner in;
    
    private static int count=0;

    public SaleItem(Random random, Scanner scanner){
        this.random = random;
        this.id = UUID.randomUUID();
        this.in=scanner;
    }

    public void create(){
        this.title = "Title"+random.nextInt();
        this.price = random.nextFloat();
        this.firm = "Firm"+random.nextInt();
        this.provider= "Provider"+random.nextInt();
        SaleItem.count++;
    }

    public void read(){
        System.out.println("ID = "+this.id);
        System.out.println("Название= "+this.title);
        System.out.println("Цена = "+this.price);
        System.out.println("Номер объекта = "+this.count);
        System.out.println("Фирма изготовитель = "+this.firm);
        System.out.println("Поставщик = "+this.provider);
    }

    public void update(){
        System.out.println("Введите Title:  ");
        this.title=this.in.next();
        System.out.println("Введите Цену:  ");
        this.price=this.in.nextFloat();
        System.out.println("Введите Фирму:  ");
        this.firm=this.in.next();
        System.out.println("Введите Поставщика:  ");
        this.provider=this.in.next();
    }
    
    public void delete(){
        this.title = "";
        this.price = 0;
        SaleItem.count--;
        this.firm = "";
        this.provider= "";
    }
}
