package season1.instance;

class Main {
    public static void main(String[] args) {

        Human human = new Human();
        human.age = 31;
        human.name = "Dima";

        House house = new House();
        house.number = 6;
        house.street = "Mira";


        System.out.println(human.name+"'s " + "age " + human.age + house.street + house.number);



    }
}