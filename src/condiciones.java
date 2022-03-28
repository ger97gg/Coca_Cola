import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class condiciones extends JFrame implements ActionListener, ChangeListener {

    private JLabel etiqueta1, etiqueta2;
    private JButton boton1, boton2;
    private JCheckBox check1;
    private JTextArea area1;
    private JScrollPane scrol1;
    String nombre ="";


    public condiciones() {
        //pantalla principal
        setLayout(null);
        setBounds(0,0,600,360);
        setBackground(new Color(224,224,244));
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //tit-pantalla
        setTitle("Licencia de uso");
        ImageIcon imagen = new ImageIcon("C:\\Users\\German Gamarra\\OneDrive\\Escritorio\\Curso EOI\\Coca_Cola\\src\\images\\icon.png");
        setIconImage(imagen.getImage());

        //Label del título
        etiqueta1 = new JLabel("TÉRMINOS Y CONDICIONES");
        etiqueta1.setBounds(200,10,200,30);
        etiqueta1.setFont(new Font("Arial",1,12));
        etiqueta1.setForeground(Color.black);
        add(etiqueta1);

        //Texto Área
        area1 = new JTextArea();//el area


        area1.setText( "    TÉRMINOS Y CONDICIONES"+ "\n\n" +
                "    A.PROHIBIDA SU VENTA O DISTRIBUCIÓN SIN AUTORIZACIÓN DE ESTE PROYECTO.\n" +
                "    B.PROHIBIDA LA ALTERACIÓN DEL CÓDIGO FUENTE.\n" +
                "    C.NO ME HAGO RESPONSABLE DEL MAL USO DE ESTE SOFTWARE.\n\n" +
                "   texto texto texto texto texto texto texto texto texto texto texto texto texto texto texto,\n" +
                "   texto texto texto texto texto texto texto texto texto texto texto texto texto texto texto,\n" +
                "   texto texto texto texto texto texto texto texto texto texto texto texto texto texto texto,\n" +
                "   texto texto texto texto texto texto texto texto texto texto texto texto texto texto texto,\n" +
                "   texto texto texto texto texto texto texto texto texto texto texto texto texto texto texto,\n" +
                "   texto texto texto texto texto texto texto texto texto texto texto texto texto texto texto,\n" +
                "   texto texto texto texto texto texto texto texto texto texto texto texto texto texto texto,\n" +
                "   texto texto texto texto texto texto texto texto texto texto texto texto texto texto texto,\n" +
                "   texto texto texto texto texto texto texto texto texto texto texto texto texto texto texto,\n" +
                "   texto texto texto texto texto texto texto texto texto texto texto texto texto texto texto,\n" +
                "   texto texto texto texto texto texto texto texto texto texto texto texto texto texto texto,\n" +
                "   texto texto texto texto texto texto texto texto texto texto texto texto texto texto texto,\n" +
                "   texto texto texto texto texto texto texto texto texto texto texto texto texto texto texto,\n\n" +

                "          PARA MAYOR INFORMACIÓN SOBRE OTROS PROYECTOS.\n" +
                "          german199752@gmail.com.\n");

        area1.setFont(new Font("ArialBlack",1,12));
        area1.setForeground(new Color(0,0,0));
        scrol1 = new JScrollPane(area1);//introducimos el área en el scroll pane
        scrol1.setBounds(20,60,540,150);//set del cuadro
        add(scrol1);//lo añadimos en el scroll
        area1.setEditable(false);//no pueden editar el texto


        //Recuperar Proyecto
        Bienvenida texto = new Bienvenida();
        nombre = texto.nombreDef;

        //checkbox
        check1 = new JCheckBox(" Yo " + nombre+ " Acepto");
        check1.setBounds(20,230,150,30);
        check1.setFont(new Font("Helvetic",1,13));
        check1.addChangeListener(this);
        add(check1);

        //botones
        boton1 = new JButton("Continuar");
        boton1.setBounds(20,270,100,30);
        boton1.setFont(new Font("Helvetic",1,13));
        add(boton1);
        boton1.addActionListener(this);
        boton1.setEnabled(false);

        boton2 = new JButton("No Acepto");
        boton2.setBounds(130,270,100,30);
        boton2.setFont(new Font("Helvetic",1,13));
        add(boton2);
        boton2.addActionListener(this);

        //label 2
        ImageIcon imagen2 = new ImageIcon("C:\\Users\\German Gamarra\\OneDrive\\Escritorio\\Curso EOI\\Coca_Cola\\src\\images\\coca-cola.png");
        etiqueta2 = new JLabel(imagen2);
        etiqueta2.setBounds(250,190,350,150);
        add(etiqueta2);

        setVisible(true);
    }

    public void stateChanged (ChangeEvent e) {
        if (check1.isSelected()){
            boton1.setEnabled(true);
            boton2.setEnabled(false);
        }else{
            boton1.setEnabled(false);
            boton2.setEnabled(true);
        }
    }

    public void actionPerformed (ActionEvent e) {
        if (e.getSource() == boton1){
            this.setVisible(false);
            principal principal = new principal();
            principal.setLayout(null);
            principal.setBounds(0,0,640,535);
            principal.getContentPane().setBackground(new Color(255,0,0));
            principal.setResizable(false);
            principal.setLocationRelativeTo(null);
            principal.setDefaultCloseOperation(EXIT_ON_CLOSE);
            principal.setVisible(true);

        }if (e.getSource() == boton2){
            Bienvenida atras = new Bienvenida();
            atras.setLayout(null);
            atras.setBounds(0,0,350,450);
            atras.getContentPane().setBackground(new Color(255,0,0));
            atras.setResizable(false);
            atras.setLocationRelativeTo(null);
            atras.setDefaultCloseOperation(EXIT_ON_CLOSE);
            atras.setVisible(true);
            this.setVisible(false);
        }
    }

    public static void main(String[] args) {
        new condiciones();
    }

}
