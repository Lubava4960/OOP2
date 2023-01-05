import Auto.Car;
import Auto.Transport;

public abstract class Driver<T extends Transport> {


    private String name;
    private int grade;
    private String driveLicense;

    public Driver(String name, int grade, String driveLicense) {
        if (name == null) {
            this.name = "default";
        } else {
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

    public abstract void startDrive();
    //    System.out.println(" Проверить закрытие кузова,повернуть ключ в замке зажигания, включить передачу, нажать на газ.");
    //    }

    public abstract void stopDrive();
    //        System.out.println("Посмотреть в зеркало заднего вида, включить поворотник, нажать на тормоз, выключить передачу, поставить на ручник, повернуть ключ зажигания.");
    //    }

    public abstract void refuelCar();
    //        System.out.println("Осмотреть кузов, открыть люк, вставить шланг, залить бензин. ");
    //    }

    // }


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
    public  void  driver(T transport){
        System.out.println("Водитель садится в машину");
    }


}