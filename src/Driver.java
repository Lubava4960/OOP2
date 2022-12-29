import java.util.Objects;

public abstract class Driver {
    public  String name;
    public int grade;

    public Driver(String name, int grade) {
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

    @Override
    public String toString() {
        return "Водитель {" +
                "ФИО" + name + '\'' +
                ", Стаж" + grade +
                '}';
    }
    void drive(T transport) {
        public void startDrive () {
            System.out.println(" Проверить закрытие кузова,повернуть ключ в замке зажигания, включить передачу, нажать на газ.");
        }

        public void stopDrive () {
            System.out.println("Посмотреть в зеркало заднего вида, включить поворотник, нажать на тормоз, выключить передачу, поставить на ручник, повернуть ключ зажигания.");
        }

        public void refuelCar () {
            System.out.println("Осмотреть кузов, открыть люк, вставить шланг, залить бензин. ");
        }

    }

    // public String getName() {
    //     return name;
    // }

    // public void setName(String name) {
    //   this.name = name;
    // }

    // public int getGrade() {
    //     return grade;
    // }

    // public void setGrade(int grade) {
    //    this.grade = grade;
    //}


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return grade == driver.grade;
    }

    @Override
    public int hashCode() {
        return Objects.hash(grade);
    }

    public void driver() {
        System.out.println("Водитель " + name() + " управляет автобусом и будет участвовать в заезде. ");
    }
}