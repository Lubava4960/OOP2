package Auto;

import java.util.Objects;

public class Transport {
    public String brand;
    public String modeL;
    private int productionYear;
    private String originCountry;
    public String color;
    public  double speedMax;

    @Override
    public String toString() {
        return "Авто: " +
                  brand +
                ", модель " + modeL +
                ", год выпуска " + productionYear +
                ", страна происхождения " + originCountry +
                ", цвет " + color +
                ", максимальная скорость " + speedMax +
                '}';
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return productionYear == transport.productionYear && speedMax == transport.speedMax && Objects.equals(brand, transport.brand) && Objects.equals(modeL, transport.modeL) && Objects.equals(originCountry, transport.originCountry) && Objects.equals(color, transport.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, modeL, productionYear, originCountry, color, speedMax);
    }

    public Transport(String brand, String modeL, int productionYear, String originCountry, String color, double speedMax) {
        this.brand = brand;
        this.modeL = modeL;
        this.productionYear = productionYear;
        this.originCountry = originCountry;
        if (color != null && color !="") {
            this.color =color;
        } else {
            this.color = "белый";


           }
        if (Double.compare(speedMax, 0) == 0) {
            this.speedMax =240;
        } else {
            this.speedMax = speedMax;
        }



    }

}












