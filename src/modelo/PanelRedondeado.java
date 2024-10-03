package modelo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JPanel;

// Clase PanelRedondeado que extiende de JPanel para crear un panel con bordes redondeados
public class PanelRedondeado extends JPanel {

    // Atributos para definir el ancho y la altura del arco de los bordes redondeados
    private double arcoAncho = 50;
    private double arcoAltura = 50;
    private Color colorBorde = new Color(165, 40, 174);  // Color del borde del panel

    // Sobrescribe el método paintComponent para personalizar el dibujo del panel
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);  // Llama al método de la clase padre para pintar el componente

        // Crea una copia del objeto Graphics como Graphics2D para usar más funcionalidades
        Graphics2D g2 = (Graphics2D) g.create();

        // Habilita el antialiasing para suavizar los bordes de los gráficos
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Crea un objeto RoundRectangle2D para dibujar un rectángulo con esquinas redondeadas
        RoundRectangle2D.Double formaRedondeada = new RoundRectangle2D.Double(
                0, 0, this.getWidth() - 1, this.getHeight() - 1, arcoAncho, arcoAltura
        );

        // Establece el color de fondo del panel y rellena la forma redondeada
        g2.setColor(this.getBackground());
        g2.fill(formaRedondeada);

        // Establece el color del borde y dibuja el contorno de la forma redondeada
        g2.setColor(colorBorde);
        g2.draw(formaRedondeada);

        // Libera los recursos del objeto Graphics2D
        g2.dispose();
    }
}
