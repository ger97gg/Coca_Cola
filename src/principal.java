import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Locale;

public class principal extends JFrame implements ActionListener, ItemListener {

    private JMenuBar menu;
    private JMenu opcion, fondo, calcular, acerca;
    private JMenuItem rojo, negro, morado, nuevo, salir, vacaciones, creador;
    private JLabel e1, e2, e3, e4, e5,  e6, e7, e8, e9, e10;
    private JTextField text1, text2, text3;
    private JTextArea area1;
    private JScrollPane scrol1;
    private JComboBox combo1, combo2;
    String nomAdmi = "";
    Bienvenida nombreBvd;

    public principal(){
        //pantalla
        setLayout(null);
        setBounds(0,0,640,535);
        getContentPane().setBackground(new Color(255,0,0));
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //icono
        setTitle("Pantalla Principal");
        ImageIcon imagen = new ImageIcon("C:\\Users\\German Gamarra\\OneDrive\\Escritorio\\Curso EOI\\Coca_Cola\\src\\images\\icon.png");
        setIconImage(imagen.getImage());

        //recuperar nombre
        nombreBvd = new Bienvenida();
        nombreBvd.setVisible(false);
        nomAdmi = nombreBvd.nombreDef;

        //Menu
        menu = new JMenuBar();
        menu.setBackground(new Color(255,0,0));
        setJMenuBar(menu);
        opcion = new JMenu("Opciones");
        opcion.setForeground(Color.WHITE);
        menu.add(opcion);
        fondo = new JMenu("Color de fondo");
        opcion.add(fondo);
        rojo = new JMenuItem("Rojo");
        fondo.add(rojo);
        rojo.addActionListener(this);
        negro = new JMenuItem("Negro");
        fondo.add(negro);
        negro.addActionListener(this);
        morado = new JMenuItem("Morado");
        fondo.add(morado);
        morado.addActionListener(this);

        nuevo = new JMenuItem("Nuevo");
        opcion.add(nuevo);
        nuevo.addActionListener(this);
        salir = new JMenuItem("Salir");
        opcion.add(salir);
        salir.addActionListener(this);

        calcular = new JMenu("Calcular");
        calcular.setForeground(Color.WHITE);
        menu.add(calcular);
        vacaciones = new JMenuItem("Vacaciones");
        calcular.add(vacaciones);
        vacaciones.addActionListener(this);


        acerca = new JMenu("Acerca de");
        acerca.setForeground(Color.WHITE);
        menu.add(acerca);
        creador = new JMenuItem("Del creador");
        acerca.add(creador);
        creador.addActionListener(this);

        //labels
        ImageIcon imagen2 = new ImageIcon("C:\\Users\\German Gamarra\\OneDrive\\Escritorio\\Curso EOI\\Coca_Cola\\src\\images\\historia1.png");
        e1 = new JLabel(imagen2);
        e1.setBounds(20,20,300,150);
        add(e1);

        e2 = new JLabel("Bienvenido" + " " +   nomAdmi);
        e2.setBounds(330, 70, 250,50);
        e2.setForeground(Color.WHITE);
        e2.setFont(new Font("Arial", 1, 25));
        add(e2);

        e3 = new JLabel("Datos del trabajador para el cálculo de vacaciones");
        e3.setBounds(20, 180, 600,50);
        e3.setForeground(Color.WHITE);
        e3.setFont(new Font("Arial", 1, 23));
        add(e3);

        //Nombre Completo
        e4 = new JLabel("Nombre Completo: ");
        e4.setBounds(20, 240, 120,30);
        e4.setForeground(Color.WHITE);
        e4.setFont(new Font("Arial", 1, 12));
        add(e4);
        text1 = new JTextField();
        text1.setBounds(20,270,150,20);
        text1.setFont(new Font("Arial", 1, 12));
        //text1.setBackground(Color.lightGray);
        add(text1);

        //Apellido Paterno
        e5 = new JLabel("Apellido Paterno: ");
        e5.setBounds(20, 290, 120,30);
        e5.setForeground(Color.WHITE);
        e5.setFont(new Font("Arial", 1, 12));
        add(e5);
        text2 = new JTextField();
        text2.setBounds(20,320,150,20);
        text2.setFont(new Font("Arial", 1, 12));
        //text2.setBackground(Color.lightGray);
        add(text2);

        //Apellido Materno
        e6 = new JLabel("Apellido Materno: ");
        e6.setBounds(20, 340, 120,30);
        e6.setForeground(Color.WHITE);
        e6.setFont(new Font("Arial", 1, 12));
        add(e6);
        text3 = new JTextField();
        text3.setBounds(20,370,150,20);
        text3.setFont(new Font("Arial", 1, 12));
        //text3.setBackground(Color.lightGray);
        add(text3);

        //Depertamento
        e7 = new JLabel("Selecciona el Departamento: ");
        e7.setBounds(250, 240, 180,30);
        e7.setForeground(Color.WHITE);
        e7.setFont(new Font("Arial", 1, 12));
        add(e7);
        combo1 = new JComboBox<>();
        combo1.setBounds(250, 270, 200,20);
        //combo1.setBackground(Color.lightGray);
        add(combo1);
        combo1.addItem("");
        combo1.addItem("Atención al Cliente");
        combo1.addItem("Departamento de Logística");
        combo1.addItem("Departamento de Gerencia");


        //Antiguedad
        e8 = new JLabel("Selecciona la Antigüedad: ");
        e8.setBounds(250, 290, 180,30);
        e8.setForeground(Color.WHITE);
        e8.setFont(new Font("Arial", 1, 12));
        add(e8);
        combo2 = new JComboBox<>();
        combo2.setBounds(250, 320, 200,20);
        //combo2.setBackground(Color.lightGray);
        add(combo2);
        combo2.addItem("");
        combo2.addItem("1 año de servicio");
        combo2.addItem("2 a 6 Anos de servicio");
        combo2.addItem("7 Anos o más de servicio");

        //calculo
        e9 = new JLabel("Resultado del Cálculo: ");
        e9.setBounds(250, 340, 180,30);
        e9.setForeground(Color.WHITE);
        e9.setFont(new Font("Arial", 1, 12));
        add(e9);
        area1 = new JTextArea();
        scrol1 = new JScrollPane(area1);
        area1.setEditable(false);
        scrol1.setBounds(250,370,300,50);
        area1.setFont(new Font("Arial", 1, 10));
        //area1.setBackground(Color.lightGray);
        add(scrol1);


        //Copyright
        e10 = new JLabel("© 2017 The Coca-Cola Company");
        e10.setBounds(220,430,200,30);
        e10.setFont(new Font("Arial",1,12));
        e10.setForeground(new Color(255,255,255));
        add(e10);

        setVisible(true);
    }

    public void itemStateChanged (ItemEvent e){

    }

    public void actionPerformed (ActionEvent e){
        if (e.getSource() == rojo){
            getContentPane().setBackground(Color.RED);
        }if (e.getSource() == negro){
            getContentPane().setBackground(Color.black);
        }if (e.getSource() == morado){
            getContentPane().setBackground(new Color(87,35,100));
        }if (e.getSource() == nuevo){
            text1.setText("");
            text2.setText("");
            text3.setText("");
            area1.setText("");
            combo1.setSelectedIndex(0);
            combo2.setSelectedIndex(0);
        }if(e.getSource() == vacaciones){
            String NC = text1.getText().toUpperCase(Locale.ROOT);
            String AP = text2.getText().toUpperCase(Locale.ROOT);
            String AM = text3.getText().toUpperCase(Locale.ROOT);
            String Dep = combo1.getSelectedItem().toString();
            String Anos = combo2.getSelectedItem().toString();

            if (NC.equals("") || AP.equals("") || AM.equals("") || Dep.equals("") || Anos.equals("")){
                JOptionPane.showMessageDialog(null,"¡Debes rellenar todos los campos!");
            }else {
                if (Dep.equals("Atención al Cliente")){

                    if (Anos.equals("1 año de servicio")){
                        area1.setText(" Al empleado " + NC + " " + AP + " " + AM +"\n" +
                                " que  trabaja en el sector de Atención al Cliente\n" +
                                " y que tiene una antigüedad de un 1 año\n" +
                                " le corresponden 6 días de vacaciones.\n");

                    }if (Anos.equals("2 a 6 Anos de servicio")){
                        area1.setText(" Al empleado " + NC + " " + AP + " " + AM +"\n" +
                                " que  trabaja en el sector de Atención al Cliente\n" +
                                " y que tiene una antigüedad de entre 2 y 6 Anos\n" +
                                " le corresponden 14 días de vacaciones.\n");
                    }if (Anos.equals("7 Anos o más de servicio")){
                        area1.setText(" Al empleado " + NC + " " + AP + " " + AM +"\n" +
                                " que  trabaja en el sector de Atención al Cliente\n" +
                                " y que tiene una antigüedad de 7 Anos o más\n" +
                                " le corresponden 20 días de vacaciones.\n");
                    }

                }if (Dep.equals("Departamento de Logística")){

                    if (Anos.equals("1 año de servicio")){
                        area1.setText(" Al empleado " + NC + " " + AP + " " + AM +"\n" +
                                " que  trabaja en el Departamento de Logística\n" +
                                " y que tiene una antigüedad de un 1 año\n" +
                                " le corresponden 7 días de vacaciones.\n");
                    }if (Anos.equals("2 a 6 Anos de servicio")){
                        area1.setText(" Al empleado " + NC + " " + AP + " " + AM +"\n" +
                                " que  trabaja en el Departamento de Logística\n" +
                                " y que tiene una antigüedad de entre 2 y 6 Anos\n" +
                                " le corresponden 15 días de vacaciones.\n");
                    }if (Anos.equals("7 Anos o más de servicio")){
                        area1.setText(" Al empleado " + NC + " " + AP + " " + AM +"\n" +
                                " que  trabaja en el Departamento de Logística\n" +
                                " y que tiene una antigüedad de 7 Anos o más\n" +
                                " le corresponden 22 días de vacaciones.\n");
                    }

                }if (Dep.equals("Departamento de Gerencia")){

                    if (Anos.equals("1 año de servicio")){
                        area1.setText(" Al empleado " + NC + " " + AP + " " + AM +"\n" +
                                " que  trabaja en el Departamento de Gerencia\n" +
                                " y que tiene una antigüedad de un 1 año\n" +
                                " le corresponden 10 días de vacaciones.\n");
                    }if (Anos.equals("2 a 6 Anos de servicio")){
                        area1.setText(" Al empleado " + NC + " " + AP + " " + AM +"\n" +
                                " que  trabaja en el Departamento de Gerencia\n" +
                                " y que tiene una antigüedad de entre 2 y 6 Anos\n" +
                                " le corresponden 20 días de vacaciones.\n");
                    }if (Anos.equals("7 Anos o más de servicio")){
                        area1.setText(" Al empleado " + NC + " " + AP + " " + AM +"\n" +
                                " que  trabaja en el Departamento de Gerencia\n" +
                                " y que tiene una antigüedad de 7 Anos o más\n" +
                                " le corresponden 30 días de vacaciones.\n");
                    }

                }
            }

        }if (e.getSource() == creador){
            JOptionPane.showMessageDialog(null,"Desarrollado por: Germán Gamarra como proyecto final del curso Java " +
                    "para principiantes 2022\n" + "german199752@gmail.com");
        }if (e.getSource()== salir){
            this.setVisible(false);
            Bienvenida inicio = new Bienvenida();
            inicio.setLayout(null);
            inicio.setBounds(0,0,350,450);
            inicio.setResizable(false);
            inicio.setLocationRelativeTo(null);
            inicio.setDefaultCloseOperation(EXIT_ON_CLOSE);
            inicio.getContentPane().setBackground(new Color(255,0,0));
            inicio.setVisible(true);
        }
    }

    public static void main(String[] args) {
        new principal();
    }
}
