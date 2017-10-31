package com.company;
public class Tea extends SaleItem{
        public String type;
        
        @Override
        public void create(){
            super.create();
            this.type = "Type"+this.random.nextInt();
        }

        @Override
        public void read() {
            super.read();
            System.out.println("Тип упаковки = "+this.type);
        }

        @Override
        public void update() {
            super.update();
            System.out.print("Введите Тип Упаковки");
            this.type=this.in.nextLine();

        }

        @Override
        public void delete() {
            super.delete();
            this.type = "";
        }
    }
