package modelo;
import java.awt.Graphics; // Importación para manejar gráficos básicos
import java.awt.Graphics2D; // Importación para gráficos más avanzados (2D)
import java.net.URL; // Importación para manejar URLs (en este caso, la ruta de la imagen)
import javax.swing.ImageIcon; // Importación para manejar íconos de imagen en Swing
import javax.swing.JLabel; // Importación de JLabel para mostrar texto o imágenes

/**
 * Clase Imagen que extiende JLabel. Permite mostrar una imagen cargada desde un archivo en una URL.
 * Sobrescribe el método paintComponent para dibujar la imagen en el JLabel.
 */
public class Imagen extends JLabel {
    private String ruta = ""; // Variable que almacena la ruta de la imagen a mostrar

    /**
     * Método sobrescrito paintComponent para dibujar la imagen en el JLabel.
     * @param gg Objeto Graphics que permite realizar operaciones de dibujo.
     */
    @Override
    protected void paintComponent(Graphics gg) {
        // Convierte el objeto Graphics a Graphics2D para obtener mejores capacidades de dibujo
        Graphics2D g = (Graphics2D) gg;
        
        // Obtiene la ruta absoluta de la imagen en el sistema de archivos
        URL rutaAbsoluta = getClass().getResource(ruta);
        
        // Si la ruta de la imagen no es nula, dibuja la imagen en el JLabel
        if (rutaAbsoluta != null) {
            // Crea un ImageIcon utilizando la ruta absoluta
            ImageIcon imagen = new ImageIcon(rutaAbsoluta);
            // Dibuja la imagen redimensionada al tamaño del JLabel
            g.drawImage(imagen.getImage(), 0, 0, this.getWidth(), this.getHeight(), null);
        }
        
        // Libera los recursos de Graphics2D al final del dibujo
        g.dispose();
    }

    /**
     * Obtiene la ruta actual de la imagen.
     * @return La ruta de la imagen.
     */
    public String getRuta() {
        return ruta;
    }

    /**
     * Establece una nueva ruta para la imagen.
     * @param ruta La nueva ruta de la imagen.
     */
    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
}
