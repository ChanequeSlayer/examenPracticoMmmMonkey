package cadenacomercial;

//Importamos el JOptionPane para poder usarlo.
import javax.swing.JOptionPane;
//Our Clase
public class CadenaComercial {
//Clase main
    public static void main(String args[]) {
        String name = new String();
        String pass = new String();
        String id = new String();
        String d = JOptionPane.showInputDialog("Inicio de Sistema OXXO" + "\n"
                + "------------------------------" + "\n"
                + "1)Iniciar Sesion \n"
                + "2)Registrarse \n"
                + "3)Salir \n"
                + "Ingrese el numero o nombre de la opcion por favor \n");

        if (d.equalsIgnoreCase("1") || d.equalsIgnoreCase("Iniciar Sesion")) {
            //Se llama a la clase iniciar sesion y toda la wea.
            id = JOptionPane.showInputDialog(null, "Ingrese su ID: ");
            pass = JOptionPane.showInputDialog(null, "Ingrese su Contraseña: ");
            Trabajadores existente = new Trabajadores();
            if (existente.comprobacion(id, pass) == true) {
                JOptionPane.showMessageDialog(null, "Iniciado con exito");

                if (existente.puesto(id, pass).equals("Gerente")) {
                    Gerente vip = new Gerente(id,pass);
                    vip.showUser(id, pass);
                    vip.Cobrar();
                    
                } else {
                    Empleado gen = new Empleado(id,pass);

                }

            } else {
                JOptionPane.showMessageDialog(null, "Intente nuevamente");
            }

        } else if (d.equalsIgnoreCase("2") || d.equalsIgnoreCase("Registrarse")) {
            //Se llama a la clase de registro.
            name = JOptionPane.showInputDialog(null, "Ingrese su nombre completo");
            pass = JOptionPane.showInputDialog(null, "Ingrese su Contraseña: ");
            id = JOptionPane.showInputDialog(null, "Ingrese su ID: ");
            Trabajadores nuevo = new Trabajadores(name.toUpperCase(), pass, id);

        } else {
            JOptionPane.showMessageDialog(null, "Regrese pronto...");
            System.exit(0);
        }

    }

}
