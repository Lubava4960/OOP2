import Auto.Competing;
import Auto.Car;

import java.util.Objects;


public class DriverB<C extends Car & Competing> {


    private String name;
    private int grade;
    public DriverB(String name, int grade) {
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
    public void startDrave() {
        System.out.println("Посмотреть в зеркало,повернуть ключ в замке зажигания, включить передачу, нажать на газ. ");
    }
    public void stopDrive(){
        System.out.println("Включить поворотник, нажать на тормоз, выключить передачу, поставить на ручник, повернуть ключ зажигания");
    }
    public void refuelCar() {
        System.out.println("Открыть люк в салоне , вставить шланг, залить бензин. ");
    }

        @Override
        public String toString() {
            return "Водитель категрии В {" +
                    "ФИО - " + getName() + '\'' +
                    ", стаж - " + getGrade() + " " +
                    "лет "+
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
        DriverB<?> driverB = (DriverB<?>) o;
        return grade == driverB.grade && Objects.equals(name, driverB.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, grade);
    }

    public void driver (){
            System.out.println("Водитель " + getName() + " управляет автомобилем и будет участвовать в заезде. ");


        }


    }




