package cadenacomercial;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Interfaz extends JFrame {
    
    Interfaz() {
        
        //no se como agregar 2 labels
        /*JLabel label1 = new JLabel();//hago un label1
        label1.setText("hola");
        label1.setHorizontalTextPosition(JLabel.CENTER);
        label1.setVerticalTextPosition(JLabel.TOP);
        label1.setHorizontalAlignment(JLabel.CENTER);
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("Titillium Web",Font.PLAIN,50));
        label1.setIconTextGap(-100);*/
        
        ImageIcon fondo = new ImageIcon("C:\\Users\\Alex\\Documents\\NetBeansProjects\\Interfaz\\src\\interfaz\\fondosi.png");
        
        //label del nombre y fondo
        JLabel label = new JLabel();//hago un label
        label.setText("hola");
        label.setIcon(fondo);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setForeground(new Color(00,00,00));
        label.setFont(new Font("Titillium Web",Font.BOLD,50));
        label.setIconTextGap(-100);
        
        
        
        //JFrame frame = new JFrame(); //creo un frame
        this.setTitle("Sistema de caja OXXO"); //titulo del this
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//salir de la aplicación
        this.setResizable(false); //no deja cambiar el tamaño
        //this.setSize(576,714); //dimensiono 
        //this.setLayout(null);
        //label.setBounds(0,0,576,714);
        this.setVisible(true); //lo hago visible
        
        ImageIcon icono = new ImageIcon("C:\\Users\\Alex\\Documents\\NetBeansProjects\\examenPracticoMmmMonkey\\src\\cadenacomercial\\logosi.png"); //creo el iono
        this.setIconImage(icono.getImage());
        
        this.getContentPane().setBackground(new Color(255,200,200));
        this.add(label);
        this.pack();
        
        
        
    }
    
    
    
}
