package cadenacomercial;

//Importamos el JOptionPane para poder usarlo.
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
//Our Clase Principal donde tenemos el main

public class CadenaComercial {
//Clase main

    public static void main(String args[]) {
        //Declaramos el objeto name haciendo un wrap a la variable del mismo nombre por asi decirlo.
        String name = new String();
        //Declaramos el objeto pass haciendo un wrap a la variable del mismo nombre por asi decirlo.
        String pass = new String();
        //Declaramos el objeto id haciendo un wrap a la variable del mismo nombre por asi decirlo.
        String id = new String();
        //Declaramos y damos valor a la variable d.
        //Inicio del menu principal
        String d = JOptionPane.showInputDialog("Inicio de Sistema OXXO" + "\n"
                + "------------------------------" + "\n"
                + "1)Iniciar Sesion \n"
                + "2)Registrarse \n"
                + "3)Salir \n"
                + "Ingrese el numero o nombre de la opcion por favor \n");
        //Estructura de control if para el menu.
        //Si da la opcion Iniciar sesion sin importar sus caracteres iguales.
        if (d.equalsIgnoreCase("1") || d.equalsIgnoreCase("Iniciar Sesion")) {
            //Al objeto-Variable id le vamos a asignar un valor que el usuario ingresara
            id = JOptionPane.showInputDialog(null, "Ingrese su ID: ");
            //Al Objeto-Variable pass le vamos a asignar un valor que el usuario ingresara
            pass = JOptionPane.showInputDialog(null, "Ingrese su Contraseña: ");
            //Se instancia un nuevo objeto de la clase Trabajadores
            Trabajadores existente = new Trabajadores();
            //Estructura de control, para con el objeto, mandar a llamar al metodo
            //Comprobacion para comprobar que el usuario si es usuario.
            if (existente.comprobacion(id, pass) == true) {
                JOptionPane.showMessageDialog(null, "Iniciado con exito");
            //Si coinciden la id y el password, da exito de conexion.
            //Si coincide con un id y pass de gerente entonces se da lugar a Gerente.
                if (existente.puesto(id, pass).equals("Gerente")) {
                    Gerente vip = new Gerente(id, pass);
                    vip.showUser(id, pass);
                    vip.Cobrar();
            //Si no, empleado.
                } else {
                    Empleado gen = new Empleado(id, pass);

                }

            } else {
                JOptionPane.showMessageDialog(null, "Intente nuevamente");
                //No coincidieron la password y el id.
            }

        } else if (d.equalsIgnoreCase("2") || d.equalsIgnoreCase("Registrarse")) {
            //Aqui hace todo si selecciona la opcion 2.
            //Aqui le pedimos al usuario ingresar su nombre, pass y id
            name = JOptionPane.showInputDialog(null, "Ingrese su nombre completo");
            pass = JOptionPane.showInputDialog(null, "Ingrese su Contraseña: ");
            id = JOptionPane.showInputDialog(null, "Ingrese su ID: ");
            //Instancia un nuevo objeto de la clase Trabajadores
            Trabajadores nuevo = new Trabajadores(name.toUpperCase(), pass, id);

        } else {
            //Si selecciona la opcion 3.
            JOptionPane.showMessageDialog(null, "Regrese pronto...");
            
            Interfaz interfaz = new Interfaz();

            //System.exit(0);
        }
        
        //gui
        //Interfaz interfaz = new Interfaz();
        
        
        
    }

}
