package Auto;

import java.util.Objects;

public abstract class Transport {
    public String brand;
    public String modeL;
    private double engineVolume;
    private String name;
    private int grade;
    private String  driveLicense;

    public Transport() {

    }


    public void Driver(String name, int grade, String driveLicense) {
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


    @Override
    public String toString() {
        return "Transport{" +
                "Бренд " + brand + '\'' +
                ", модель" + modeL + '\'' +
                ", объём двигателя " + engineVolume +
                '}';
    }


    public abstract void DriverD(String name, int grade, String driveLicense);

    public abstract void DriverC(String name, int grade, String driveLicense);

    public abstract void DriverB(String name, int grade, String driveLicense);

    public void startDrive() {
        //System.out.println("{Повернуть ключ в замке зажигания, включить передачу, нажать на газ.}");
    }

        public void stopDrive(){
      //  System.out.println("{Нажать на тормоз, выключить передачу, поставить на ручник, повернуть ключ зажигания.}");

        }
    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineaVolume) {

        this.engineVolume = engineaVolume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Double.compare(transport.engineVolume, engineVolume) == 0 && Objects.equals(brand, transport.brand) && Objects.equals(modeL, transport.modeL);
    }

    @Override
    public int hashCode() {

        return Objects.hash(brand, modeL, engineVolume);
    }

    public Transport(String brand, String modeL, double engineVolume) {
        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (modeL == null) {
            this.modeL = "default";
        } else {
            this.modeL = modeL;
        }
        if (Double.compare(engineVolume, 0) == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }

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


    public abstract void Driver();
}




















