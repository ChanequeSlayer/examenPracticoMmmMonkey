package cadenacomercial;
import java.util.Calendar;
import javax.swing.JOptionPane;
//Clase productos.
public class Productos {
    //Atributos de la clase productos.
    private String id;
    private String name;
    String d = "Si";
    //objeto de la clase Calendar para usar una variable-objeto, con caracteristicas de fecha.
    private Calendar cad = Calendar.getInstance();
    private double precio;
    private int cant;
    private String marca;
    //Variable-atributo para llevar una lista de lo que lleva el cliente.
    private String lista;
    //Metodo Constructor
    public Productos(){
        lista ="Lista: \n\n";
        id = "N1";
        name = "Negrito";
        cad.set(2022, 04, 24);
        precio = 15;
        cant = 20;
        marca = "Bimbo";
    }
    //Metodo para listar los productos.
    public String listP(){
        while(d.equalsIgnoreCase("Si")||d.equalsIgnoreCase("1")){
        name = JOptionPane.showInputDialog("¿Que producto es?\n"
                        + "(Ingrese ID o nombre)\n");
        cant = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos?\n"
                        + "(Ingrese ID o nombre)\n"));
        if(name.equals("Negrito")||name.equals("N1")){
            lista += "Negrito "+"  "+cant+"\n";
            
        }else if(name.equals("Donitas")||name.equals("N2")){
            lista += "Donitas"+"   "+cant+"\n";
        }else{
            JOptionPane.showMessageDialog(null,"No compro nada o se equivoco");
        }
        d=JOptionPane.showInputDialog(null,"Va a ingresar otro articulo? \n"
                + "Ingrese 1 o Si, si va a ingresar mas articulos \n"
                + "Ingrese 2 o No, si NO va a ingresar mas articulos");
        }
        
        lista+="\n\n"
                + "---------------------";
        return lista;
        
    }

    
    
    
} 
