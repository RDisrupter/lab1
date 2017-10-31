package com.company;
public class tea extends SaleItem{
        public String IType;
        public void Create(){
            super.Create();
            IType = "Type"+random.nextInt();

        }

        @Override
        public void Read() {
            super.Read();
            System.out.println("Тип упаковки = "+IType);
        }

        @Override
        public void Update() {
            super.Update();
            System.out.print("Введите Тип Упаковки");
            IType=in.nextLine();

        }

        @Override
        public void Delete() {
            super.Delete();
            IType = "";
        }


    }
