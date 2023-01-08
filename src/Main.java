import Auto.*;

public class Main {
    public static <driverStartB> void main(String[] args) {
        Car granta = new Car("Лада", "Гранта", 1.7, TypeOfBody.SEDAN);
        System.out.println(granta);
        granta.startDrive();
        granta.stopDrive();
        granta.DriverB();


        Car audi = new Car(" Audi ", " A8 50 L TDI quattro", 3.5,TypeOfBody.SEDAN);
        System.out.println(audi);
        audi.startDrive();
        audi.stopDrive();


        Car BMW = new Car(" BMW ", " Z8", 3.9,TypeOfBody.SEDAN);
        BMW.startDrive();
        BMW.stopDrive();
        System.out.println(BMW);


        Bus mers = new Bus("Mersedes ", " A5", 3.5, Capasity.SMALL);
        System.out.println(mers);
        mers.startDrive();
        mers.stopDrive();


        Bus masda = new Bus("Maзда ", " автобус ", 3.8 , Capasity.AVERAGE);
        System.out.println(masda);
        masda.startDrive();
        masda.stopDrive();


        Truck kamaz = new Truck("Камаз", "65115-48 (А5)", 6.7,Weight.N3);
        System.out.println(kamaz);
        kamaz.startDrive();
        kamaz.stopDrive();



        Truck renault = new Truck("Рено", "Fourgon L4 H3", 2.3,Weight.N2) ;
        System.out.println(renault);
        renault.startDrive();
        renault.stopDrive();



        DriverD maks = new DriverD("Максим Максимович Иванов ",  7,"Права категории D");
        System.out.println(maks);
        maks.startDrive();
        maks.stopDrive();
        maks.refuelCar();
        maks.driver(masda);


        DriverB aleks = new DriverB("Александр Алексеевич Петров", 0, "права категории В");
        System.out.println(aleks);
        aleks.startDrive();
        aleks.stopDrive();
        aleks.refuelCar();
        aleks.driver(BMW); //Урааа!



        DriverC vlad = new DriverC("Владислав Дмитриевич Хвостов", 7, "категория прав С");
        System.out.println(vlad);
        vlad.startDrive();
        vlad.stopDrive();
        vlad.refuelCar();
        vlad.driver(kamaz);// Урааа!

        masda.printType();
        mers.printType();





    }
}
