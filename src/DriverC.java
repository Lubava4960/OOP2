import Auto.Competing;
import Auto.Truck;

import java.util.Objects;

public class DriverC<A extends Driver <Truck>> {
    private String name;
    private int grade;
    private String driveLicense;

    public DriverC(String name, int grade, String driveLicense) {
        super();
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DriverC<?> driverC = (DriverC<?>) o;
        return grade == driverC.grade && Objects.equals(name, driverC.name) && Objects.equals(driveLicense, driverC.driveLicense);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, grade, driveLicense);
    }

    public void driver (){

        System.out.println("Водитель " + getName() + " управляет грузовиком и будет участвовать в заезде. ");


    }



}
