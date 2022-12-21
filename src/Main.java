import Auto.Bus;
import Auto.Car;

public class Main {
    public static void main(String[] args) {
        Car granta = new Car("Лада", "Гранта", 2015, "Россия", null, 150.0);

        System.out.println(granta);

        Car audi = new Car(" Audi ", " A8 50 L TDI quattro", 2020, " Германия", null, 280.0);
        System.out.println(audi);
        Car BMW = new Car(" BMW ", " Z8", 2021, " Германия",null, 280.0);
        System.out.println(BMW);
        Bus Mers= new Bus("Mersedes ","A5",2020, "Германия", "желтый",280.0);
        System.out.println(Mers);
        Bus Masda = new Bus("Maзда ", "автобус ", 2013, "Япония", "черный", 260);
        System.out.println(Masda);

           }
}