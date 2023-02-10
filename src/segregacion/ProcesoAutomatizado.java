package segregacion;

import jdk.jshell.spi.ExecutionControl;

public class ProcesoAutomatizado implements Proceso {

    @Override
    public void Iniciar() {
        // do something

    }

    @Override
    public void Suspender() {
        throw new RuntimeException();
    }

    @Override
    public void Reanudar() {
        throw new RuntimeException();
    }

    @Override
    public void Finalizar() {
        // do something
    }
}
