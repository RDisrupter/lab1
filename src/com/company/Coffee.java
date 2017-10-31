package com.company;
public class Coffee extends SaleItem {
    public String typeC;

    @Override
    public void create() {
        super.create();
        this.typeC = "TypeC"+random.nextInt();
    }

    @Override
    public void read() {
        super.read();
        System.out.println("Тип зерен  = "+this.typeC);
    }

    @Override
    public void update() {
        super.update();
        System.out.print("Введите Вид зерен");
        this.typeC = this.in.nextLine();
    }

    @Override
    public void delete() {
        super.delete();
        this.typeC = "";
    }
}
