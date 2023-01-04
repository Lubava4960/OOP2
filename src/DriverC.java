import Auto.Competing;
import Auto.Truck;

import java.util.Objects;

public class DriverC  extends Driver <Truck> {

    public DriverC(String name, int grade, String driveLicense) {
        super(name, grade, driveLicense);
    }

    public void startDrive() {
        System.out.println("Проверить закрытие кузова,повернуть ключ в замке зажигания, включить передачу, нажать на газ.");
    }
    public void stopDrive() {
        System.out.println("Посмотреть в зеркало заднего вида, включить поворотник, нажать на тормоз, выключить передачу, поставить на ручник, повернуть ключ зажигания.");
    }
    public void refuelCar() {
        System.out.println("Осмотреть кузов, открыть люк, вставить шланг, залить бензин. ");
    }

    @Override
    public String toString() {
        return "Водитель  {" +
                "ФИО" + getName() + '\'' +
                ", Стаж-" + getGrade() +
                ", Права- " + getDriveLicense() + '\'' +
                '}';
    }



    //public void driver (){

     //   System.out.println("Водитель " + getName() + " управляет грузовиком и будет участвовать в заезде. ");


  //  }



}
