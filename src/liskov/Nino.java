package liskov;

public class Nino extends Persona{

    public Nino(String nombre, String apellidos) {
        super(null, nombre, apellidos, null);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void pagar() {
        // TODO Auto-generated method stub
        throw new RuntimeException("un niño no puede pagar");
    }

}
