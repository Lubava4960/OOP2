import Auto.Competing;
import Auto.Truck;

import java.util.Objects;

public class DriverC<A extends Truck & Competing> {
    private String name;
    private int grade;
    public DriverC(String name, int grade) {
        if (name == null) {
            this.name = "defolt";

        } else {
            this.name = name;
        }
        if (grade == 0) {
            this.grade = 5;
        } else {
            this.grade = grade;
        }
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
        return "Водитель категрии С {" +
                "ФИО " + getName() + '\'' +
                ", стаж " + getGrade() + " лет "+
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DriverC<?> driverC = (DriverC<?>) o;
        return grade == driverC.grade && Objects.equals(name, driverC.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, grade);
    }
    public void driver (){
        System.out.println("Водитель " + getName() + " управляет грузовиком и будет участвовать в заезде. ");


    }

}
