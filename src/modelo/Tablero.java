package modelo;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JPanel;
import vista.FormResultado;
import vista.FormTikTacToe;

public class Tablero extends JPanel {
    
    // Atributos del tablero
    private int anchoCI; // Ancho de cada cuadro interno.
    private int alturaCI; // Altura de cada cuadro interno.
    private int margen; // Margen entre los cuadros.
    private Color colorTablero; // Color del fondo del tablero.
    private Color colorCI; // Color de los cuadros internos.
    private TipoImagen jugadorActual; // Imagen actual del jugador (X o O).
    private TipoImagen turnoPartida; // Indica el turno actual en la partida.
    
    // Jugadores
    private Jugador jugador1; // Primer jugador.
    private Jugador jugador2; // Segundo jugador.
    
    // Lista de cuadros del tablero
    private ArrayList<Cuadro> cuadros; // Lista que contiene todos los cuadros del tablero.
    private Cuadro cuadroFrontal; // Cuadro especial que se dibuja encima del tablero.

    // Constructor que inicializa el tablero
    public Tablero() {
        init(); // Llama al método init para inicializar los atributos.
    }

    // Método que inicializa las variables del tablero
    private void init() {
        anchoCI = 80; // Ancho de los cuadros.
        alturaCI = 80; // Altura de los cuadros.
        colorCI = Color.BLUE; // Color de los cuadros internos.
        colorTablero = Color.RED; // Color del fondo del tablero.
        margen = 6; // Margen entre los cuadros.
        jugador1 = new Jugador(); // Inicializa al primer jugador.
        jugador2 = new Jugador(); // Inicializa al segundo jugador.
        cuadros = new ArrayList(); // Inicializa la lista de cuadros.
        jugadorActual = TipoImagen.EQUIS; // El jugador que comienza es el de las X.
        turnoPartida = TipoImagen.EQUIS; // El turno inicial es del jugador con X.
    }

    // Método que crea y configura el tablero
    public void crearTablero() {
        setLayout(null); // Desactiva el layout automático para poder posicionar elementos manualmente.
        setSize(anchoCI * 3 + margen * 4, alturaCI * 3 + margen * 4); // Establece el tamaño del tablero en función de los cuadros.
        setBackground(colorTablero); // Establece el color de fondo del tablero.
        cuadroFrontal = new Cuadro(this.getWidth(), this.getHeight(), Color.RED); // Crea el cuadro frontal encima del tablero.
        cuadroFrontal.setLocation(0, 0); // Posiciona el cuadro frontal.
        cuadroFrontal.setOpaque(false); // Hace que el cuadro frontal sea transparente.
        cuadroFrontal.setEnabled(false); // Desactiva la interactividad del cuadro frontal.
        add(cuadroFrontal); // Añade el cuadro frontal al tablero.
        crearCuadrosInternos(); // Llama al método que crea los cuadros internos.
    }

    // Método que crea los cuadros internos del tablero
    private void crearCuadrosInternos() {
        int x = margen; // Coordenada X inicial.
        int y = margen; // Coordenada Y inicial.
        
        // Doble bucle para crear una cuadrícula de 3x3 cuadros.
        for (int i = 0; i < 3; i++) {
            x = margen;
            for (int j = 0; j < 3; j++) {
                Cuadro cuadro = new Cuadro(anchoCI, alturaCI, colorCI); // Crea un nuevo cuadro.
                cuadro.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Cambia el cursor a una mano cuando se pasa sobre un cuadro.
                cuadro.setLocation(x, y); // Posiciona el cuadro en el tablero.
                cuadro.setI(i); // Establece la fila del cuadro.
                cuadro.setJ(j); // Establece la columna del cuadro.
                add(cuadro); // Añade el cuadro al tablero.
                cuadros.add(cuadro); // Añade el cuadro a la lista de cuadros.
                crearEventosCuadro(cuadro); // Crea los eventos de interacción del cuadro.
                x += (anchoCI + margen); // Actualiza la posición X.
            }
            y += (alturaCI + margen); // Actualiza la posición Y.
        }
    }

    // Método que añade eventos a los cuadros del tablero
    public void crearEventosCuadro(Cuadro cuadro) {
        MouseListener evento = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {
                if (cuadro.isDibujado()) return; // Si el cuadro ya está dibujado, no hace nada.
                
                TipoImagen tipoImagenResultado = null; // Variable para almacenar el resultado del turno.
                if (jugadorActual == TipoImagen.EQUIS) {
                    cuadro.setTipoImagen(TipoImagen.EQUIS); // Establece la imagen del cuadro a X.
                    jugador1.getTablero()[cuadro.getI()][cuadro.getJ()] = 1; // Marca la casilla en el tablero del jugador 1.
                    tipoImagenResultado = jugador1.tresEnRaya(jugador2); // Verifica si hay tres en raya.
                    resultado(tipoImagenResultado, TipoImagen.EQUIS); // Llama al método que maneja el resultado.
                    jugadorActual = TipoImagen.CIRCULO; // Cambia el turno al jugador de O.
                    cambiarEstilos(TipoImagen.CIRCULO); // Cambia los estilos de los jugadores.
                } else if (jugadorActual == TipoImagen.CIRCULO) {
                    cuadro.setTipoImagen(TipoImagen.CIRCULO); // Establece la imagen del cuadro a O.
                    jugador2.getTablero()[cuadro.getI()][cuadro.getJ()] = 1; // Marca la casilla en el tablero del jugador 2.
                    tipoImagenResultado = jugador2.tresEnRaya(jugador1); // Verifica si hay tres en raya.
                    resultado(tipoImagenResultado, TipoImagen.CIRCULO); // Llama al método que maneja el resultado.
                    jugadorActual = TipoImagen.EQUIS; // Cambia el turno al jugador de X.
                    cambiarEstilos(TipoImagen.EQUIS); // Cambia los estilos de los jugadores.
                }
                
                cuadro.setDibujado(true); // Marca el cuadro como dibujado.
                repaint(); // Redibuja el tablero.
            }

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {}

            @Override
            public void mouseExited(MouseEvent e) {}
        };
        cuadro.addMouseListener(evento); // Añade el evento de ratón al cuadro.
    }

    // Método que cambia los estilos de los jugadores en el tablero
    public void cambiarEstilos(TipoImagen jugadorAct) {
        if (jugadorAct == TipoImagen.CIRCULO) {
            FormTikTacToe.imgJugadorEquis.setRuta(Ruta.JUGADORAUXILLAR); // Cambia la imagen del jugador X a una auxiliar.
            FormTikTacToe.imgJugadorEquis.repaint(); // Redibuja la imagen del jugador X.
            FormTikTacToe.nombreJugadorEquis.setForeground(new Color(240, 240, 240, 100)); // Cambia el color del nombre del jugador X.
            
            FormTikTacToe.imgJugadorCirculo.setRuta(Ruta.JUGADORCIRCULO); // Cambia la imagen del jugador O.
            FormTikTacToe.imgJugadorCirculo.repaint(); // Redibuja la imagen del jugador O.
            FormTikTacToe.nombreJugadorCirculo.setForeground(new Color(255, 200, 255)); // Cambia el color del nombre del jugador O.
        } else if (jugadorAct == TipoImagen.EQUIS) {
            FormTikTacToe.imgJugadorCirculo.setRuta(Ruta.JUGADORAUXILLAR); // Cambia la imagen del jugador O a una auxiliar.
            FormTikTacToe.imgJugadorCirculo.repaint(); // Redibuja la imagen del jugador O.
            FormTikTacToe.nombreJugadorCirculo.setForeground(new Color(240, 240, 240, 100)); // Cambia el color del nombre del jugador O.
            
            FormTikTacToe.imgJugadorEquis.setRuta(Ruta.JUGADOREQUIS); // Cambia la imagen del jugador X.
            FormTikTacToe.imgJugadorEquis.repaint(); // Redibuja la imagen del jugador X.
            FormTikTacToe.nombreJugadorEquis.setForeground(new Color(180, 232, 255)); // Cambia el color del nombre del jugador X.
        }
    }

    // Método que maneja el resultado de la partida
    public void resultado(TipoImagen tipoImagenResultado, TipoImagen jugadorGanador) {
        if (tipoImagenResultado == TipoImagen.EMPATE) { // Si hay empate
            Tablero tablero = this; // Referencia al tablero actual.
            Timer timer = new Timer(); // Crea un temporizador para mostrar el resultado.
            TimerTask tarea = new TimerTask() {
                @Override
                public void run() {
                    FormResultado formResultado = new FormResultado(TipoImagen.EMPATE, tablero); // Crea el formulario de resultado.
                    formResultado.setVisible(true); // Muestra el formulario de empate.
                }
            };
            timer.schedule(tarea, 800); // Programa la tarea con un retraso de 800 ms.
        } else if (tipoImagenResultado != null) { // Si hay un ganador
            Ruta.cambiarRutas(jugadorGanador); // Cambia las rutas de los recursos según el ganador.
            cuadroFrontal.setTipoImagen(tipoImagenResultado); // Establece la línea ganadora en el cuadro frontal.
            desactivarCuadros(true); // Desactiva los cuadros para que no se puedan seguir jugando.
            
            Tablero tablero = this; // Referencia al tablero actual.
            Timer timer = new Timer(); // Crea un temporizador para mostrar el resultado.
            TimerTask tarea = new TimerTask() {
                @Override
                public void run() {
                    FormResultado formResultado = new FormResultado(jugadorGanador, tablero); // Crea el formulario de resultado.
                    formResultado.setVisible(true); // Muestra el formulario con el ganador.
                }
            };
            timer.schedule(tarea, 800); // Programa la tarea con un retraso de 800 ms.
        }
    }

    // Método que reinicia el tablero para una nueva partida
    public void reiniciarTablero(TipoImagen ganador) {
        desactivarCuadros(false); // Reactiva todos los cuadros para la nueva partida.
        borrarImagenes(); // Limpia las imágenes de los cuadros.
        cuadroFrontal.setTipoImagen(null); // Limpia la imagen del cuadro frontal.
        if (ganador == TipoImagen.EQUIS) {
            int puntajeNuevo = Integer.parseInt(FormTikTacToe.puntajeEquis.getText()) + 1; // Aumenta el puntaje del jugador X.
            FormTikTacToe.puntajeEquis.setText(String.valueOf(puntajeNuevo)); // Actualiza el puntaje en la interfaz.
        } else if (ganador == TipoImagen.CIRCULO) {
            int puntajeNuevo = Integer.parseInt(FormTikTacToe.puntajeCirculo.getText()) + 1; // Aumenta el puntaje del jugador O.
            FormTikTacToe.puntajeCirculo.setText(String.valueOf(puntajeNuevo)); // Actualiza el puntaje en la interfaz.
        }
        
        if (turnoPartida == TipoImagen.EQUIS) { // Cambia el turno para la nueva partida.
            jugadorActual = TipoImagen.CIRCULO;
            turnoPartida = TipoImagen.CIRCULO;
        } else if (turnoPartida == TipoImagen.CIRCULO) {
            jugadorActual = TipoImagen.EQUIS;
            turnoPartida = TipoImagen.EQUIS;
        }
        cambiarEstilos(jugadorActual); // Cambia los estilos para el jugador que comienza.
        jugador1.limpiar(); // Limpia el tablero del jugador 1.
        jugador2.limpiar(); // Limpia el tablero del jugador 2.
        repaint(); // Redibuja el tablero.
    }

    // Método que activa o desactiva los cuadros
    public void desactivarCuadros(boolean valor) {
        for (Cuadro cuadro : cuadros) {
            cuadro.setDibujado(valor); // Establece el valor de dibujado para todos los cuadros.
        }
    }

    // Método que borra las imágenes de los cuadros
    public void borrarImagenes() {
        for (Cuadro cuadro : cuadros) {
            cuadro.setTipoImagen(null); // Limpia la imagen de cada cuadro.
        }
    }

    // Getters y setters de los atributos del tablero
    public TipoImagen getJugadorActual() {
        return jugadorActual;
    }

    public void setJugadorActual(TipoImagen jugadorActual) {
        this.jugadorActual = jugadorActual;
    }

    public ArrayList<Cuadro> getCuadros() {
        return cuadros;
    }

    public void setCuadros(ArrayList<Cuadro> cuadros) {
        this.cuadros = cuadros;
    }

    public int getAnchoCI() {
        return anchoCI;
    }

    public void setAnchoCI(int anchoCI) {
        this.anchoCI = anchoCI;
    }

    public int getAlturaCI() {
        return alturaCI;
    }

    public void setAlturaCI(int alturaCI) {
        this.alturaCI = alturaCI;
    }

    public int getMargen() {
        return margen;
    }

    public void setMargen(int margen) {
        this.margen = margen;
    }

    public Color getColorTablero() {
        return colorTablero;
    }

    public void setColorTablero(Color colorTablero) {
        this.colorTablero = colorTablero;
    }

    public Color getColorCI() {
        return colorCI;
    }

    public void setColorCI(Color colorCI) {
        this.colorCI = colorCI;
    }

    public Jugador getJugador1() {
        return jugador1;
    }

    public void setJugador1(Jugador jugador1) {
        this.jugador1 = jugador1;
    }

    public Jugador getJugador2() {
        return jugador2;
    }

    public void setJugador2(Jugador jugador2) {
        this.jugador2 = jugador2;
    }
}
