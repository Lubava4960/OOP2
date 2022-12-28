package Auto;

public class Truck extends Transport implements Competing {
    public static final String SPC_PIT = "Остановиться";
    public static final String RTP_PIT = "Заправиться топливом";
    public static final String ETP_PIT = "Заменить шины";
    public static final String EBP_PIT = "Поправить кузов";

    public static final String[] TRUCK_PIT_COMMANDS = new String[]{SPC_PIT, RTP_PIT, ETP_PIT, EBP_PIT};
    public static final double[] TRUCK_LAST_TIME = new double[]{4.33, 4.10};
    public static final double[] TRUCK_MAX_VOLUME = new double[]{201.0, 199.1};

    public Truck(String brand, String modeL, double engineVolume) {
        super(brand, modeL, engineVolume);
    }

    @Override
    public void Driver() {
        System.out.println("Водитель "+getName()+"  управляет грузовиком"+ brand +" и участвует в заезде ");
    }

    @Override
    public void startDrive() {
        System.out.println("Проверить закрытие кузова,повернуть ключ в замке зажигания, включить передачу, нажать на газ.");
    }

    @Override
    public void stopDrive() {
        System.out.println("Посмотреть в зеркало заднего вида, включить поворотник, нажать на тормоз, выключить передачу, поставить на ручник, повернуть ключ зажигания.");
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
                System.out.println("грузовик остановился");
                break;
            case RTP_PIT:
                System.out.println("происходит запрвка топливом");
                switch (pitCommands) {
                    case RTP_PIT:
                        System.out.println("грузовик заправляется");
                        break;
                    case ETP_PIT:
                        System.out.println("происходит замена шин");
                        switch (pitCommands) {
                            case ETP_PIT:
                                System.out.println("меняем шины");
                                break;


                        }
                }
        }
    }
}