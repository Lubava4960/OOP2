package Transport;

import Auto.Transport;

import java.util.ArrayDeque;
import java.util.Queue;

public class STO {
    private final Queue <Transport> transportQueue = new ArrayDeque< >();

        public void add (Auto.Transport transport){
            if (transport instanceof Auto.Bus) {
                System.out.println("Автобусы не нуждаются в ТО ");
            } else {

               transportQueue.add(transport);
            }
        }

        public void runTO () {
            ArrayDeque<Object> transportQueue = new ArrayDeque<>();
            Transport transport =(Transport) transportQueue.poll();
            if (transport != null) {
                 transport.getMechanics().get(0).MaintenanceAuto();
            }

        }
    }
