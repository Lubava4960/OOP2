import Auto.Bus;
import Auto.Car;
import Auto.Truck;

public class Main {
    public static <driverStartB> void main(String[] args) {
        Car granta = new Car("Лада", "Гранта", 1.7);
        System.out.println(granta);
        granta.startDrive();
        granta.stopDrive();

        Car audi = new Car(" Audi ", " A8 50 L TDI quattro", 2.7);
        System.out.println(audi);
        audi.startDrive();
        audi.stopDrive();

        Car BMW = new Car(" BMW ", " Z8", 3.9);
        BMW.startDrive();
        BMW.stopDrive();
        System.out.println(BMW);

        Bus mers = new Bus("Mersedes ", " A5", 3.5);
        mers.startDrive();
        mers.stopDrive();
        System.out.println(mers);

        Bus masda = new Bus("Maзда ", " автобус ", 3.8);
        System.out.println(masda);
        masda.startDrive();
        masda.stopDrive();

        Truck kamaz = new Truck("Камаз", "65115-48 (А5)", 6.7);
        System.out.println(kamaz);
        kamaz.startDrive();
        kamaz.stopDrive();

        Truck renault = new Truck("Рено", "Fourgon L4 H3", 2.3);
        System.out.println(renault);
        renault.startDrive();
        renault.stopDrive();

        DriverD<Bus> maks = new DriverD<Bus>("Максим Максимович Иванов ", 10);
        System.out.println(maks);
        maks.startDrive();
        maks.stopDrive();
        maks.refuelCar();
        maks.driver();

        DriverB<Car> aleks = new DriverB<Car>("Александр Алексеевич Петров", 0);
        System.out.println(aleks);
        aleks.startDrave();
        aleks.stopDrive();
        aleks.refuelCar();
        aleks.driver();

        DriverC<Truck> vlad = new DriverC<Truck>("Владислав Дмитриевич Хвостов", 7);
        System.out.println(vlad);
        vlad.startDrive();
        vlad.stopDrive();
        vlad.refuelCar();
        vlad.driver();



    }
}
