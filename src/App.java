import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class App extends JFrame{//CREAR EXTENDS PARA TRABAJAR CON SUBCLASES

    int WIDTH = 800;    int HEIGHT = 1000;//SIZE VENTANA
    int Desplazamiento = 35;//CENTRAR AREA DE JUEGO
    BufferedImage bi = new BufferedImage(this.WIDTH,this.HEIGHT,BufferedImage.TYPE_4BYTE_ABGR);//IMAGEN ESTANDAR
    Graphics gbi = bi.getGraphics();//GENERAR IMAGEN

    //PINTA EL FONDO 
    public void pintarFondo(Graphics g){
        g.setColor(Color.RED);
        g.fillRect(10, 10, this.WIDTH, this.HEIGHT);
        //g.drawImage(bi,10,10, this.WIDTH,this.HEIGHT,this);//LA IMAGEN COMPLETA ES GRAFICADA
    }

    public void paint(Graphics g){//BUCLE
        System.out.println("Test");
        this.pintarFondo(gbi);//PINTA EL FONDO ^
        g.drawImage(bi,10,10, this.WIDTH,this.HEIGHT,this);//LA IMAGEN COMPLETA ES GRAFICADA
    }

    public App(){
        this.setSize(this.WIDTH,this.HEIGHT);//VENTANA SIZE
        this.setVisible(true);//VENTANA
        this.setTitle("TIC TOC");//NOMBRE VENTANA
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    };//CONSTRUCTOR
    public static void main(String[] args) throws Exception {
        System.out.println("HOLA, COMENZANDO");
        App Juego = new App();//INICIO
    }
}
