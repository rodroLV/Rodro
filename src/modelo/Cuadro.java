package modelo;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

// Clase Cuadro que extiende de JPanel para representar un cuadro en el tablero
public class Cuadro extends JPanel {
    // Atributos que definen las dimensiones, color y tipo de imagen del cuadro
    private int ancho;
    private int altura;
    private Color color;
    private TipoImagen tipoImagen;
    private boolean dibujado;  // Indica si el cuadro ha sido dibujado o no
    private int i;  // Coordenada i del cuadro en la matriz del tablero
    private int j;  // Coordenada j del cuadro en la matriz del tablero
    
    // Constructor que inicializa el ancho, altura y color del cuadro
    public Cuadro(int ancho, int altura, Color color) {
        this.ancho = ancho;
        this.altura = altura;
        this.color = color;
        dibujado = false;  // Inicialmente, el cuadro no está dibujado
        init();  // Llama al método init para configurar el cuadro
    }

    // Método init para establecer el tamaño y el color de fondo del cuadro
    private void init() {
        setSize(ancho, altura);  // Establece el tamaño del cuadro
        setBackground(color);  // Establece el color de fondo del cuadro
    }

    // Sobrescribe el método paintComponent para personalizar el dibujo del cuadro
    @Override
    protected void paintComponent(Graphics gg) {
        super.paintComponent(gg);  // Llama al método de la clase padre
        Graphics2D g = (Graphics2D) gg;  // Castea el objeto Graphics a Graphics2D
        
        ImageIcon imagen = new ImageIcon();  // Crea un nuevo objeto ImageIcon
        
        // Selecciona la imagen adecuada según el tipo de imagen del cuadro
        if (tipoImagen == TipoImagen.CIRCULO)
            imagen = new ImageIcon(getClass().getResource(Ruta.CIRCULO));
        else if (tipoImagen == TipoImagen.EQUIS)
            imagen = new ImageIcon(getClass().getResource(Ruta.EQUIS));
        else if (tipoImagen == TipoImagen.LINEA1)
            imagen = new ImageIcon(getClass().getResource(Ruta.LINEA1));
        else if (tipoImagen == TipoImagen.LINEA2)
            imagen = new ImageIcon(getClass().getResource(Ruta.LINEA2));
        else if (tipoImagen == TipoImagen.LINEA3)
            imagen = new ImageIcon(getClass().getResource(Ruta.LINEA3));
        else if (tipoImagen == TipoImagen.LINEA4)
            imagen = new ImageIcon(getClass().getResource(Ruta.LINEA4));
        else if (tipoImagen == TipoImagen.LINEA5)
            imagen = new ImageIcon(getClass().getResource(Ruta.LINEA5));
        else if (tipoImagen == TipoImagen.LINEA6)
            imagen = new ImageIcon(getClass().getResource(Ruta.LINEA6));
        else if (tipoImagen == TipoImagen.LINEA7)
            imagen = new ImageIcon(getClass().getResource(Ruta.LINEA7));
        else if (tipoImagen == TipoImagen.LINEA8)
            imagen = new ImageIcon(getClass().getResource(Ruta.LINEA8));
        
        // Dibuja la imagen seleccionada en el cuadro, ajustándola a su tamaño
        g.drawImage(imagen.getImage(), 0, 0, this.getWidth(), this.getHeight(), null);
    }

    // Métodos getter y setter para acceder y modificar las coordenadas del cuadro en la matriz
    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    // Métodos getter y setter para el estado de si el cuadro ha sido dibujado
    public boolean isDibujado() {
        return dibujado;
    }

    public void setDibujado(boolean dibujado) {
        this.dibujado = dibujado;
    }

    // Métodos getter y setter para las dimensiones del cuadro
    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    // Métodos getter y setter para el color del cuadro
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    // Métodos getter y setter para el tipo de imagen del cuadro
    public TipoImagen getTipoImagen() {
        return tipoImagen;
    }

    public void setTipoImagen(TipoImagen tipoImagen) {
        this.tipoImagen = tipoImagen;
    }
}
