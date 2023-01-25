package transport;

import exception.DiagnosticFaildException;

import java.util.ArrayDeque;
import java.util.Queue;

public class STO {
    private final Queue<Transport<?>> transportQueue = new ArrayDeque<>();
    private Object Transport;

    public void addTransport(Transport<?> transport) {
        if (Transport instanceof Bus) {
            System.out.println("Автобусы не нуждаются в ТО");
        } else {
            transportQueue.add(transport);
        }
    }


    public void runTO() {
        Transport<?> transport = transportQueue.poll();

        if (transport != null) {
            try {
                transport.diagnostics();
                transport.getMehanics().iterator().next().maintennance();
            } catch (DiagnosticFaildException e) {
                System.out.println("Ошибка проведения ТО" + transport);
            }
        }
    }
}

