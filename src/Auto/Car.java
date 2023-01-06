package Auto;

public class Car extends Transport implements Competing {
    private TypeOfBody typeOfBody;
    public static final String SPC_PIT = "Остановиться";
    public static final String RTP_PIT = "Заправиться топливом";
    public static final String DTP_PIT = "Удалить грязь";


    public static final String[] CAR_PIT_COMMANDS = new String[]{SPC_PIT, RTP_PIT, DTP_PIT};
    public static final double[] CAR_LAST_TIME = new double[]{3.8, 2.4, 1.9,};
    public static final double[] CAR_MAX_VOLUME = new double[]{180.0, 250.5, 280.02};

    public Car(String brand, String modeL, double engineVolume,TypeOfBody typeOfBody) {

        super(brand, modeL, engineVolume);
        this.typeOfBody = typeOfBody;
    }

    public TypeOfBody getTypeOfBody() {
        return typeOfBody;
    }

    public void setTypeOfBody(TypeOfBody typeOfBody) {
        this.typeOfBody = typeOfBody;
    }

    @Override
    public void startDrive() {
        System.out.println("Посмотреть в зеркало,повернуть ключ в замке зажигания, включить передачу, нажать на газ.");

    }

    @Override
    public void stopDrive() {
        System.out.println("Включить поворотник, нажать на тормоз, выключить передачу, поставить на ручник, повернуть ключ зажигания");
    }

    @Override
    public void printType() {
        if (typeOfBody==null){
            System.out.println("Данных по авто не достаточно");
        }else {
            System.out.println("Тип авто - "+typeOfBody);
        }
    }

    @Override
    public String[] pitStop() {

        return new String[0];
    }

    @Override
    public double[] lastTime() {

        return new double[0];
    }

    @Override
    public double[] maxVolume() {

        return new double[0];
    }

    public void doPitCommands(String pitCommands) {
        System.out.println("осуществляется остановка");
        switch (pitCommands) {
            case SPC_PIT:
                System.out.println("автомобиль остановился");
                break;
            case RTP_PIT:
                System.out.println("происходит заправка топливом");
                switch (pitCommands) {
                    case RTP_PIT:
                        System.out.println("автомобиль заправляется");
                        break;
                    case DTP_PIT:
                        System.out.println("происходит мойка машины");
                        switch (pitCommands) {
                            case DTP_PIT:
                                System.out.println("удаляется грязь");
                                break;
                            default:
                                System.out.println("Нет такого действия");

                        }
                }
        }
    }

    public void DriverB() {
   }





}










