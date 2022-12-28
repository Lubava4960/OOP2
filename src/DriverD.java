import Auto.Bus;
import Auto.Competing;

import java.util.Objects;

public  class DriverD<A extends Bus & Competing> {


    private String name;
    private int grade;

    public DriverD(String name, int grade) {
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
        @java.lang.Override
        public java.lang.String toString () {
            return "Водитель категории D {" +
                    "ФИО - " + getName() +
                    ", Стаж - " + getGrade() + " лет " +
                    '}';
        }

        public String getName () {

            return name;
        }

        public void setName (String name){

            this.name = name;
        }

        public int getGrade () {

            return grade;
        }

        public void setGrade ( int grade){

            this.grade = grade;
        }

        @Override
        public boolean equals (Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            DriverD<?> driverD = (DriverD<?>) o;
            return grade == driverD.grade && Objects.equals(name, driverD.name);
        }

        @Override
        public int hashCode () {
            return Objects.hash(name, grade);
        }

        public void startDrive (A Transport){
            return;
        }

        public void startDrive () {
            System.out.println(" Закрыть двери, повернуть ключ в замке зажигания, включить передачу, нажать на газ. ");
        }

        public void stopDrive () {
            System.out.println("Нажать на тормоз, выключить передачу, поставить на ручник, открыть двери .");
        }

        public void refuelCar () {
            System.out.println("Открыть люк, вставить шланг, залить бензин. ");
        }


        public void driver () {
            System.out.println("Водитель " + getName() + " управляет автобусом и будет участвовать в заезде. ");


        }

    }

