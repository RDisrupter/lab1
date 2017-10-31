package com.company;
public class coffee extends SaleItem {
    public String ITypeC;

    @Override
    public void Create() {
        super.Create();
        ITypeC = "TypeC"+random.nextInt();
    }

    @Override
    public void Read() {
        super.Read();
        System.out.println("Тип зерен  = "+ITypeC);
    }

    @Override
    public void Update() {
        super.Update();
        System.out.print("Введите Вид зерен");
        ITypeC=in.nextLine();
    }

    @Override
    public void Delete() {
        super.Delete();
        ITypeC = "";

    }



}