package Auto;

import Auto.Bus;
import Auto.Driver;

public  class DriverD extends Driver<Bus> {


    public DriverD(String name, int grade, String driveLicense) {

        super(name, grade, driveLicense);
    }

    @Override
    public String toString() {
        return "Водитель - {" +
                "ФИО - " + getName() + '\'' +
                ", Стаж" + getGrade() +
                ", Права - " + getDriveLicense() + '\'' +
                '}';
    }

    public void startDrive() {
        System.out.println(" Закрыть двери, повернуть ключ в замке зажигания, включить передачу, нажать на газ. ");
    }

    public void stopDrive() {

        System.out.println("Посмотреть в зеркала, включить повороткк, нажать на тормоз");
    }

    public void refuelCar() {

        System.out.println("Открыть люк, вставить шланг, залить бензин. ");
    }
    @Override
    public void driver(Bus transport){
        System.out.println("Водитель " + getName() + " управляет автобусом и будет участвовать в заезде. ");
    }




}