package inversionDependencia;

public class servicioPersona {

    private MySql mySql;

    public servicioPersona(MySql mySql) {
        this.mySql = mySql;
    }

    public void savePerson(String nombre, String apellido) {
        mySql.savePerson(nombre, apellido);
    }
}
