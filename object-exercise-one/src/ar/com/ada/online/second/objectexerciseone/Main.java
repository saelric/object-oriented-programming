package ar.com.ada.online.second.objectexerciseone;

public class Main {

    public static void main(String[] args) {
        Person sandy = new Person();
        Animal cat = new Animal();
        Vehicle car = new Vehicle();

        sandy.name = "Sandy";
        sandy.lastName = "De la Rosa";
        sandy.age = 29;

        cat.breed = "Mestizo";
        cat.color = "Gris";
        cat.name = "Nermal";

        car.brand = "Nissan";
        car.color = "Rojo";
        car.maxSpeed = 150;

        System.out.println(sandy.name + " " + sandy.lastName + ", " + sandy.age + " años");
        sandy.talk();

        System.out.println(cat.name + ", " + cat.color + ", " + cat.breed);
        cat.eat();

        System.out.println(car.brand + ", " + car.color + ", " + car.maxSpeed + " km/h");
        car.moveOn();

    }
}
