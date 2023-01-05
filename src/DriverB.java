import Auto.Car;
import Auto.Competing;
import Auto.Truck;

import java.util.Objects;


public class DriverB  extends Driver <Car> {


    public DriverB(String name, int grade, String driveLicense) {
        super(name, grade, driveLicense);
    }

    @Override
    public String toString() {
        return "Водитель {" +
                "ФИО " + getName() + '\'' +
                ", стаж " + getGrade() +
                ", Права- " + getDriveLicense() + '\'' +
                '}';
    }

    public void startDrive() {
        System.out.println("Посмотреть в зеркало,повернуть ключ в замке зажигания, включить передачу, нажать на газ. ");
    }

    public void stopDrive() {
        System.out.println("Включить поворотник, нажать на тормоз, выключить передачу, поставить на ручник, повернуть ключ зажигания");
    }

    public void refuelCar() {
        System.out.println("Открыть люк в салоне , вставить шланг, залить бензин. ");
    }
    @Override
    public void driver(Car transport){
        System.out.println("Водитель садится в машину");
    }

    //public void driver()
    // {
    //    System.out.println("Водитель " +name+ " управляет автобусом и будет участвовать в заезде. ");
    // }


}






