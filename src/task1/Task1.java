package task1;

public class Task1 {

    enum Vehicles  {
        MERCEDES(10000){@Override public String getColor() {return "Black";}},
        AUDI(7000){@Override public String getColor() {return "Red";}},
        BMW(8000){@Override public String getColor() {return "Blue";}};
        int price; String color;


    Vehicles(int price){

        this.price = price;


        }

        public String getColor(){

        return color;

        }


        @Override
        public  String toString(){

        return "Марка " + super.toString() + " цвет " + getColor() + " стоймость " + price + "$";

        }


    }

    public static void main(String[] args) {

        Vehicles vehicle1 = Vehicles.MERCEDES;
        System.out.println(vehicle1.toString());

        Vehicles vehicle2 = Vehicles.BMW;
        System.out.println(vehicle2.toString());

        Vehicles vehicle3 = Vehicles.AUDI;
        System.out.println(vehicle3.toString());
    }

}
