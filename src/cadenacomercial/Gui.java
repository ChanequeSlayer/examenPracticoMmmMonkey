package cadenacomercial;

import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.WARNING_MESSAGE;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class Gui extends JFrame implements ActionListener {

    JLabel label1, label2;
    JButton boton1,boton2;
    Productos listP;
    Trabajadores listU;
    Inventario listIn;




    public Gui() {
        setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Sistema principal de OXXO");

        boton1 = new JButton("Inicio de Sesion");
        boton1.setBounds(115, 100, 100, 30);
        boton1.setForeground(Color.darkGray);
        boton1.setBackground(Color.WHITE);
        add(boton1);
        
        boton1.addActionListener(this);

        boton2 = new JButton("Salir del Sistema");
        boton2.setBounds(115, 280, 100, 30);
        boton2.setForeground(Color.darkGray);
        boton2.setBackground(Color.WHITE);
        Border line = new LineBorder(Color.BLACK);
        Border margin = new EmptyBorder(20, 30, 50, 15);
        Border compound = new CompoundBorder(line, margin);
        boton2.setBorder(compound);
        add(boton2);
        boton2.addActionListener(this);

        label1 = new JLabel("O X X O");
        label1.setBounds(115, 20, 300, 30);
        add(label1);

        label2 = new JLabel("Menu Principal");
        label2.setBounds(115, 50, 100, 30);
        add(label2);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==boton2){
              JOptionPane.showMessageDialog(null,"En unos instantes se cerrara el sistema");
            System.exit(0);
            
        }else{
            try{
            }catch(Exception error){
                JOptionPane.showMessageDialog(null, "No deje nada vacio le dijimos...: ", "Espacio Vacio", WARNING_MESSAGE);
                
            }
        }
        
        

    }

}
