package Auto;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Car granta = new Car(" Лада", " Гранта", 1.7, TypeOfBody.SEDAN);
        System.out.println(granta);
        granta.startDrive();
        granta.stopDrive();
        granta.DriverB();


        Car audi = new Car(" Audi ", " A8 50 L TDI ", 3.5, TypeOfBody.SEDAN);
        System.out.println(audi);
        audi.startDrive();
        audi.stopDrive();


        Car bmw = new Car(" BMW ", " Z8", 3.9, TypeOfBody.SEDAN);
        bmw.startDrive();
        bmw.stopDrive();
        System.out.println(bmw);


        Bus mers = new Bus(" Mersedes ", " A5", 3.5, Capasity.SMALL);
        System.out.println(mers);
        mers.startDrive();
        mers.stopDrive();


        Bus masda = new Bus(" Maзда ", " автобус ", 3.8, Capasity.AVERAGE);
        System.out.println(masda);
        masda.startDrive();
        masda.stopDrive();


        Truck kamaz = new Truck(" Камаз", " 65115-48 (А5)", 6.7, Weight.N3);
        System.out.println(kamaz);
        kamaz.startDrive();
        kamaz.stopDrive();


        Truck renault = new Truck(" Рено", " Fourgon L4 H3", 2.3, Weight.N2);
        System.out.println(renault);
        renault.startDrive();
        renault.stopDrive();


        DriverD maks = new DriverD(" Максим Максимович Иванов ", 7, " Права категории D");
        System.out.println(maks);
        maks.startDrive();
        maks.stopDrive();
        maks.refuelCar();
        maks.driver(masda);

        // service(
        //         granta, audi, bmw,
        //         mers, masda,
        //        kamaz, renault

        // );


        DriverB aleks = new DriverB(" Александр Алексеевич Петров", 0, "права категории В");
        System.out.println(aleks);
        aleks.startDrive();
        aleks.stopDrive();
        aleks.refuelCar();
        aleks.driver(bmw); //Урааа!


        DriverC vlad = new DriverC(" Владислав Дмитриевич Хвостов", 7, "категория прав С");
        System.out.println(vlad);
        vlad.startDrive();
        vlad.stopDrive();
        vlad.refuelCar();
        vlad.driver(kamaz);// Урааа!

        masda.printType();
        mers.printType();


        //private static void service(Transport...transports){
        //    for (Transport transport : transports) {
        //      serviceTransport(transport);
        //  }
        // }

        // private static void serviceTransport (Transport transport){
        //     try {
        //       if (!transport.service()) {
        //          throw new RuntimeException("Автомобиль " + transport.brand + " не прошел диагностику");
        //      }
        //  } catch (RuntimeException e) {
        //      System.out.println(e.getMessage());
        //  }
        // }

        List<Transport> racers = new ArrayList<Transport>();

        racers.add(granta);
        racers.add(audi);
        racers.add(bmw);
        racers.add(mers);
        racers.add(masda);
        racers.add(kamaz);
        racers.add(renault);

        Mechanic Anatoliy = new Mechanic<Truck>("Анатолий", "Иванов", "Колесотехно", "Грузовики");
        System.out.println(Anatoliy);
        Mechanic Mishel = new Mechanic<Bus>("Михаил", "Петров", "Колесотехно", "Автобусы");
        System.out.println(Mishel);
        Mechanic Pier = new Mechanic<Car>("Пётр", "Кузнецов", "Гражданин сервис", "Легковые");
        System.out.println(Pier);
        Anatoliy.repairAuto();
        Mishel.repairAuto();
        Pier.repairAuto();
        Anatoliy.MaintenanceAuto();
        Mishel.MaintenanceAuto();
        Pier.MaintenanceAuto();

        granta.addMechanic(Pier);
        audi.addMechanic(Pier);
        bmw.addMechanic(Pier);
        mers.addMechanic(Mishel);
        masda.addMechanic(Mishel);
        kamaz.addMechanic(Anatoliy);
        renault.addMechanic(Anatoliy);

        System.out.println(racers);

        // Transport sto = new Transport.STO();
        // sto.addTransport(Car);
        //sto.addTransport(Bus);
        // sto.addTransport(Truck);
        //sto.runTO;
       printUnigueDrivers();
    }
    public static void printUnigueDrivers(){
        DriverB vasiliy = new DriverB(" Vasiliy", 8, " категории В");
        DriverB ivan = new DriverB(" Ivan", 9, " категории В");
        DriverC dmitriy = new DriverC(" Dmitriy", 10, "  категории  С");
        DriverC mihail = new DriverC( " Mihail", 9, " категории С");
        DriverC mihail2 = new DriverC(" Mihail", 9, " категории С");
        DriverD kostya = new DriverD(" Kostya", 7, " категории D");
        DriverD kostyan = new DriverD(" Kostyan", 9, " категории D");
        Set<Driver> drivers = new HashSet<>();
        drivers.add(vasiliy);
        drivers.add(ivan);
        drivers.add(dmitriy);
        drivers.add(mihail);
        drivers.add(mihail2);
        drivers.add(kostya);
        drivers.add(kostyan);
        for(Driver driver:drivers){
            System.out.println(driver);
        }
        Iterator<Driver>iterator= drivers.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }


    public static void test(Map<String,String>map){
        Object mechanic;
        map.put("Лада Гранта ", "Пётр Кузнецов");
        map.put("Ауди ", "Пётр Кузнецов");
        map.put("БМВ ", "Пётр Кузнецов");
        map.put("Мукедес", "Михаил Петров");
        map.put("Мазда", "Михаил Петров");
        map.put("КАмаз", "Анатолий Иванов");
        map.put("Рено", "Анатолий Иванов");

        System.out.println(map);
    }



    }





