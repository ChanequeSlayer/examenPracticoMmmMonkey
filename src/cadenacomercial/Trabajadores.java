package cadenacomercial;

import javax.swing.JOptionPane;
import static  javax.swing.JOptionPane.OK_CANCEL_OPTION;

public class Trabajadores {
    //Declaramos los atributos de trabajadores
    private String id = new String();
    private String pass = new String();
    private String name = new String();
    //variable de confirmacion
    private int conf;
    //objeto para regresar el puesto de la persona.
    private String puesto = new String();
    //El constructor
    public Trabajadores(){
        id = "0123ABC";
        pass="0000";
        name="Gerente";
        conf=0;
        
    }
    //Metodo trabajadores para hacer el registro.
    public Trabajadores(String id, String pass,String name){
        this.id = id;
        this.pass = pass;
        this.name = name;
 
        conf = JOptionPane.showConfirmDialog(null,"Confirmacion de Registro \n"
                + "----------------------------- \n "
                + id +"\n"
                + pass+"\n"
                + name +"\n","Confirmacion",OK_CANCEL_OPTION);
        if(conf==0){
            JOptionPane.showMessageDialog(null,"El registro se ha llevado con exito");   
        }else{
            JOptionPane.showMessageDialog(null,"Se cancelara el registro");
            clean(id, pass, name);
        }
        
    }
    //Metodo para limpiar el registro
    public void clean(String id, String pass,String name){
      this.id="";
      this.pass="";
      this.name="";  
    }
    //Compruba el inicio de sesion.
    public boolean comprobacion(String id, String pass){
        boolean user= false;
        if(id.equals("123ABCOXXO")&&pass.equals("oxxoxsiempre")||id.equals("SABRI0101")&&pass.equals("mecomiunasal")||
           id.equals("ROMXX")&&pass.equals("1deabril")||id.equals("ANA1212")&&pass.equals("121202") )
        {
            user = true;
        }
        return user;
    }
    //Verifica el puesto de la persona.
    public String puesto(String id,String pass){
        puesto="Empleado";
        
        if(id.equals("123ABCOXXO")||id.equals("SABRI0101")){
            puesto="Gerente";       
            }
        
        return puesto;
    }
}
