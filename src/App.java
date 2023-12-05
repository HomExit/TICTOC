import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;

public class App extends{//CREAR EXTENDS PARA TRABAJAR CON SUBCLASES
    //VENTANA
    Dimension SZSC = Toolkit.getDefaultToolkit().getScreenSize();

    int WIDTH = SZSC.width;    int HEIGHT = SZSC.height;//SIZE VENTANA
    int Desplazamiento = 35;//CENTRAR AREA DE JUEGO
    int ColumnasG = 4;  int FilasG = 4;
    /*
    BufferedImage bi = new BufferedImage(this.WIDTH,this.HEIGHT,BufferedImage.TYPE_4BYTE_ABGR);//IMAGEN ESTANDAR
    Graphics gbi = bi.getGraphics();//GENERAR IMAGEN

    //PINTA EL FONDO 
    public void pintarFondo(Graphics g){
        g.setColor(Color.RED);
        g.fillRect(10, 10, this.WIDTH, this.HEIGHT);
        //g.drawImage(bi,10,10, this.WIDTH,this.HEIGHT,this);//LA IMAGEN COMPLETA ES GRAFICADA
    }

    public void paint(Graphics g){
        this.pintarFondo(gbi);//PINTA EL FONDO ^
        g.drawImage(bi,10,10, this.WIDTH,this.HEIGHT,this);//LA IMAGEN COMPLETA ES GRAFICADA
    }*/

    public App(){
        //this.setSize(SZSC.width,SZSC.height);//VENTANA SIZE
        /*
        //this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        this.setTitle("TIC TOC");//NOMBRE VENTANA
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/

        for(int i = 0;i<ColumnasG;i++){
            for(int i2 = 0;i2<FilasG;i2++){
                JButton Boton = new JButton();
                Boton.setBounds(((this.WIDTH/3)*(i-1)),((this.HEIGHT/3)*(i2-1)),(this.WIDTH/3),(this.HEIGHT/3));
                JF.add(Boton);
            }
        }

        JF.setVisible(true);//VENTANA
    };//CONSTRUCTOR
    public static void main(String[] args) throws Exception {
        System.out.println("HOLA, COMENZANDO");
        App Juego = new App();//INICIO
    }
}