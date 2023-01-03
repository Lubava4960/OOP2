import Auto.Bus;
import Auto.Car;
import Auto.Truck;

public class Main {
    public static <driverStartB> void main(String[] args) {
        Car granta = new Car("Лада", "Гранта", 1.7);
        System.out.println(granta);
        granta.startDrive();
        granta.stopDrive();
        granta.Driver();
        granta.DriverB();


        Car audi = new Car(" Audi ", " A8 50 L TDI quattro", 3.5);
        System.out.println(audi);
        audi.startDrive();
        audi.stopDrive();
        audi.Driver();
        audi.stopDrive();

        Car BMW = new Car(" BMW ", " Z8", 3.9);
        BMW.startDrive();
        BMW.stopDrive();
        System.out.println(BMW);
        BMW.Driver();
        BMW.Driver();

        Bus mers = new Bus("Mersedes ", " A5", 3.5 );
        System.out.println(mers);
        mers.startDrive();
        mers.stopDrive();
        mers.Driver();
        mers.Driver();

        Bus masda = new Bus("Maзда ", " автобус ", 3.8);
        System.out.println(masda);
        masda.startDrive();
        masda.stopDrive();
        masda.Driver();
        masda.Driver();

        Truck kamaz = new Truck("Камаз", "65115-48 (А5)", 6.7);
        System.out.println(kamaz);
        kamaz.startDrive();
        kamaz.stopDrive();
        kamaz.Driver();
        kamaz.Driver();

        Truck renault = new Truck("Рено", "Fourgon L4 H3", 2.3) ;
        System.out.println(renault);
        renault.startDrive();
        renault.stopDrive();
        renault.Driver();


        DriverD maks = new DriverD("Максим Максимович Иванов ",  7,"Права категории D");
        System.out.println(maks);
        maks.startDrive();
        maks.stopDrive();
        maks.refuelCar();


        DriverB aleks = new DriverB("Александр Алексеевич Петров", 0, "права категории В");
        System.out.println(aleks);
        aleks.startDrive();
        aleks.stopDrive();
        aleks.refuelCar();



        DriverC vlad = new DriverC("Владислав Дмитриевич Хвостов", 7, "права категории С");
        System.out.println(vlad);
        vlad.startDrive();
        vlad.stopDrive();
        vlad.refuelCar();




    }
}
