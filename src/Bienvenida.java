import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

public class Bienvenida extends JFrame implements ActionListener {

    private JLabel titulo, subtitulo, etiqueta1, etiqueta2;
    private JTextField field1;
    private JButton boton1;
    public static String nombreUsu ="";
    public static String nombreDef ="";

    public Bienvenida(){
        //Diseño de pantalla
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(255,0,0));
        //Diseño del titulo, imagen icono, background color.
        setTitle("Bienvenido");
        ImageIcon imagenx = new ImageIcon(".\\src\\images\\icon.png");
        setIconImage(imagenx.getImage());

        //El label del TITULO.
        ImageIcon imagen = new ImageIcon(".\\src\\images\\logo-coca.png");
        titulo = new JLabel(imagen);
        titulo.setBounds(25,15,300,150);
        add(titulo);

        //El label del SUBTÍTULO
        subtitulo = new JLabel("Sistema de Control Vacacional");
        subtitulo.setBounds(50,160,300,40);
        subtitulo.setFont(new Font("Arial",3,18));
        subtitulo.setForeground(new Color(255,255,255));
        add(subtitulo);

        //label de solicitud del nombre
        etiqueta1 = new JLabel("Ingrese su nombre: ");
        etiqueta1.setBounds(50,210,150,30);
        etiqueta1.setFont(new Font("Arial",1,12));
        etiqueta1.setForeground(new Color(255,255,255));
        add(etiqueta1);

        //textfield
        field1 = new JTextField();
        field1.setBounds(45,240,255,25);
        field1.setBackground(new Color(224,224,224));
        field1.setFont(new Font("Arial",1,14));
        field1.setForeground(new Color(255,0,0));
        add(field1);

        //boton, este solo debe activarse cuando ingreses el nombre
        boton1 = new JButton("Ingresar");
        boton1.setBounds(125,280,100,30);
        boton1.setFont(new Font("Arial",1,14));
        boton1.setForeground(new Color(255,0,0));
        add(boton1);
        boton1.addActionListener(this);
        //boton1.setEnabled(false);

        //texto de copyright
        etiqueta2 = new JLabel("© 2022 The Coca-Cola Company");
        etiqueta2.setBounds(85,375,300,30);
        etiqueta2.setFont(new Font("Arial",1,12));
        etiqueta2.setForeground(new Color(255,255,255));
        add(etiqueta2);
    }
    //IMPLEMENTAMOS LA ACCIÓN
    public void actionPerformed (ActionEvent e){
        if (e.getSource() == boton1){
            //obtener nombre y corregir el formate del nombre
            nombreUsu = field1.getText().trim();
            nombreDef = nombreUsu.substring(0,1).toUpperCase(Locale.ROOT) + nombreUsu.substring(1).toLowerCase(Locale.ROOT);

            if (nombreUsu.equals("")){
                JOptionPane.showMessageDialog(null,"Debes ingresar tu nombre");
            }else{
                condiciones ventanaCondiciones = new condiciones();
                ventanaCondiciones.setLayout(null);
                ventanaCondiciones.setBounds(0,0,600,360);
                ventanaCondiciones.setBackground(new Color(224,224,244));
                ventanaCondiciones.setResizable(false);
                ventanaCondiciones.setLocationRelativeTo(null);
                ventanaCondiciones.setDefaultCloseOperation(EXIT_ON_CLOSE);
                ventanaCondiciones.setVisible(true);
                this.setVisible(false);
            }
        }
    }
    public static void main(String[] args) {
        //Pantalla del main
        Bienvenida pantalla = new Bienvenida();
        pantalla.setLayout(null);
        pantalla.setBounds(0,0,350,450);
        pantalla.setResizable(false);
        pantalla.setLocationRelativeTo(null);
        pantalla.setVisible(true);
    }
}
