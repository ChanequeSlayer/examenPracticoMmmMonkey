package cadenacomercial;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.PLAIN_MESSAGE;
//Clase Gerente heredando de Trabajadores
public class Gerente extends Trabajadores{
    private String permisos = new String();
    private String nombre = new String();
    
    //Constructor
    public Gerente(String id, String pass){
        if(id.equals("123ABCOXXO")&&pass.equals("oxxoxsiempre")){    
            nombre = "Marco Antonio";
        }else{
            nombre = "Sabrina Mendoza";
        }
        permisos = "Avanzados"; 
    }
    //Metodo para mostrar el usuario ingresado.
    public void showUser(String id,String pass){
        JOptionPane.showMessageDialog(null,"Tu nombre de usuario es: "+nombre+"\n"
                + id+"\n"
                + pass+"\n");
    }
    //Metodo para cobrar los productos
    public void Cobrar(){
        int d=0;
        do{
        d = Integer.parseInt(JOptionPane.showInputDialog("Cobro de Productos" + "\n"
                + "---------------------------------" + "\n"
                + "1)Comprar Productos\n"
                + "2)Hacer Factura \n"
                + "3)Salir \n"
                + "Ingrese el numero o nombre de la opcion por favor \n"));
        switch(d){
            case 1:
                Productos p = new Productos();
                JOptionPane.showMessageDialog(null,p.listP());
            
        }
        }while(d!=3);
 
    }
    

    
}
