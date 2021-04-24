package cadenacomercial;
import java.util.Calendar;
import javax.swing.JOptionPane;
public class Productos {
    private String id;
    private String name;
    private Calendar cad = Calendar.getInstance();
    private double precio;
    private int cant;
    private String marca;
    private String lista;
    
    public Productos(){
        lista ="Lista: \n";
        id = "N1";
        name = "Negrito";
        cad.set(2022, 04, 24);
        precio = 15;
        cant = 20;
        marca = "Bimbo";
    }
    public String listP(){
        String d = "Si";
        do{
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
            
        }while(d.equalsIgnoreCase("Si")||d.equalsIgnoreCase("1"));
        
        lista+="\n"
                + "---------------------";
        return lista;
        
    }

    
    
    
} 
