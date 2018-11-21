package task1;

public class Task2 {

    enum Animals {

        Cat(5), Dog(6), Shark(7); int age;
        Animals(int age){
            this.age = age;
            toString();
        }
        public String toString(){return "вид животного " + super.toString() + " возраст " + age;}
    }


    public static void main(String[] args) {
        Animals dog = Animals.Dog;
        System.out.println(dog);

        Animals cat = Animals.Cat;
        System.out.println(cat);

        Animals shark = Animals.Shark;
        System.out.println(shark);

    }

}
