package cadenacomercial;

public class Empleado extends Gerente{
    int paga;

    public Empleado(String id, String pass) {
        //invoca al constructor de la clase padre.
        super(id, pass);
    }


}
