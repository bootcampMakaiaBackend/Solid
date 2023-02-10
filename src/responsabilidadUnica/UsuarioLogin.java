package responsabilidadUnica;

public class UsuarioLogin {
    private DataBaseUsuario dataBase;

    public UsuarioLogin(DataBaseUsuario dataBase) {
        this.dataBase = dataBase;
    }

    public boolean login(String usuario, String contrasena) {
        User user = dataBase.findUserByUserName(usuario);
        if (user == null) {
            // do something
        }
        return true;
    }
}
