package Auto;

public class Bus extends Transport implements Competing{
    private Capasity capasity;
    public static final String SPC_PIT = "Остановиться";
    public static final String RTP_PIT = "Заправиться топливом";
    public static final String ETP_PIT = "Заменить шины";


    public static final String[] ALL_PIT_COMMANDS= new String[]{SPC_PIT,RTP_PIT, ETP_PIT};
    public static final double[]ALL_LAST_TIME= new double[]{5.8,6.4};
    public static final double[] ALL_MAX_VOLUME = new double[]{180.0, 200.5};


    public Bus(String brand, String modeL, double engineVolume, Capasity capasity) {

        super(brand, modeL, engineVolume);
        this.capasity = capasity;
    }

    public void setCapasity(Capasity capasity) {
        this.capasity = capasity;
    }

    @Override
    public void startDrive() {
        //super.startDrive();
        System.out.println("Закрыть двери, повернуть ключ в замке зажигания, включить передачу, нажать на газ. ");
    }
    @Override
    public void stopDrive(){
       System.out.println("Нажать на тормоз, выключить передачу, поставить на ручник, открыть двери .");
    }

    @Override
    public void printType() {

            if (capasity==null){
                System.out.println("Данных по авто не достаточно");
            }else {
                System.out.println("Грузоподъёмность авто: "+ capasity.getFrom()+"до " + capasity.getTo());
            }
        }



    @Override
    public boolean service() {
        System.out.println("Автобус " + brand+ ""+ modeL+ " В диагностике не нуждается ");
        return true;
    }


    @Override
    public String[] pitStop() {

        return ALL_PIT_COMMANDS;
    }

    @Override
    public double[] lastTime() {

        return ALL_LAST_TIME;
    }

    @Override
    public double[] maxVolume() {
        return ALL_MAX_VOLUME;
    }

    public void doPitCommands(String pitCommands) {
        System.out.println("осуществляется остановка");
        switch (pitCommands) {
            case SPC_PIT:
                System.out.println("автобус остановился");
                break;
            case RTP_PIT:
                System.out.println("происходит заправка топливом");
                switch (pitCommands) {
                    case RTP_PIT:
                        System.out.println("автобус заправляется");
                        break;
                    case ETP_PIT:
                        System.out.println("происходит замена шин");
                    switch (pitCommands){
                        case ETP_PIT:
                            System.out.println("меняем шины");
                            break;
                        default:
                            System.out.println("Нет такого действия");
                    }
                }
        }
    }





    }













