import Auto.Bus;
import Auto.Competing;

import java.util.Objects;

public  class DriverD<A extends Driver <Bus>> {


    private String name;
    private int grade;
    private String driveLicense;




    public DriverD(String name, int grade, String driveLicense) {
       super();
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

    public void driver() {
        System.out.println("Водитель " + name + " управляет автобусом и будет участвовать в заезде. ");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getDriveLicense() {
        return driveLicense;
    }

    public void setDriveLicense(String driveLicense) {
        this.driveLicense = driveLicense;
    }
}