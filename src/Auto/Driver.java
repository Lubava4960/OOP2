package Auto;

import Auto.Car;
import Auto.Transport;

import java.util.Objects;

public abstract class Driver<T extends Transport> {


    private String name;
    private int grade;
    private String driveLicense;

    public Driver(String name, int grade, String driveLicense) {
         if (name==null){
             this.name = "defoult";
         }else{
             this.name = name;
         }

        if (grade == 0) {
            this.grade = 5;
        } else {
            this.grade = grade;
        }
        if (driveLicense == null) {
            this.driveLicense = "default";
        } else {
            this.driveLicense = driveLicense;
        }

    }


    public String toString() {
        String Transport;
        return "Водитель{" +
                "ФИО-" + name + '\'' + grade +
                ", Права - " + driveLicense + '\'' + "и управляет автомобилем " +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver<?> driver = (Driver<?>) o;
        return grade == driver.grade && Objects.equals(name, driver.name) && Objects.equals(driveLicense, driver.driveLicense);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, grade, driveLicense);
    }

    public abstract void startDrive();


    public abstract void stopDrive();


    public abstract void refuelCar();



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
          if ( driveLicense != null ){
          throw new IllegalArgumentException("Тип прав не заполнен");
         }
        this.driveLicense = driveLicense;
    }
    public  void  driver(T transport){

        System.out.println("Водитель садится в машину");
    }







}