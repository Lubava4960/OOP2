import Auto.Car;
import Auto.Competing;

import java.util.Objects;


public class DriverB<C extends Driver <Car>& Competing> {


    private String name;
    private int grade;
    private String driveLicense;

    public DriverB(String name, int grade, String driveLicense) {
        super();
    }

    @Override
    public String toString() {
        return "Водитель {" +
                "ФИО " + getName() + '\'' +
                ", стаж " + getGrade() +
                ", Права- " + getDriveLicense()+'\'' +
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

    public void driver() {
        System.out.println("Водитель " +name+ " управляет автобусом и будет участвовать в заезде. ");
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DriverB<?> driverB = (DriverB<?>) o;
        return grade == driverB.grade && Objects.equals(name, driverB.name) && Objects.equals(driveLicense, driverB.driveLicense);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, grade, driveLicense);
    }

    public void Driver() {
        System.out.println("Водитель  управляет автомобилем и будет участвовать в заезде. ");
    }
}






