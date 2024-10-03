package modelo;

public class Jugador {
    // Atributos de la clase Jugador
    private String nombre; // Nombre del jugador.
    private TipoImagen tipoImagen; // Tipo de imagen asignada al jugador (e.g., X o O).
    private int tablero[][]; // Matriz que representa el tablero del jugador.

    // Constructor por defecto que inicializa el tablero y lo limpia.
    public Jugador(){
        tablero = new int[3][3]; // Inicializa la matriz del tablero con un tamaño de 3x3.
        limpiar(); // Llama al método limpiar para inicializar el tablero en blanco.
    }

    // Constructor que recibe el tipo de imagen y inicializa el tablero.
    public Jugador(TipoImagen tipoImagen){
        this.tipoImagen = tipoImagen; // Asigna el tipo de imagen.
        tablero = new int[3][3]; // Inicializa la matriz del tablero.
        limpiar(); // Llama al método limpiar para inicializar el tablero en blanco.
    }

    // Constructor que recibe el nombre y el tipo de imagen, y luego inicializa el tablero.
    public Jugador(String nombre, TipoImagen tipoImagen){
        this.nombre = nombre; // Asigna el nombre del jugador.
        this.tipoImagen = tipoImagen; // Asigna el tipo de imagen.
        tablero = new int[3][3]; // Inicializa la matriz del tablero.
        limpiar(); // Llama al método limpiar para inicializar el tablero en blanco.
    }

    // Método que limpia el tablero, llenando la matriz con ceros.
    public void limpiar(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = 0; // Establece cada casilla del tablero en 0 (vacío).
            }
        }
    }

    // Método que verifica si hay un tres en raya y retorna el tipo de línea ganadora o empate.
    public TipoImagen tresEnRaya(Jugador jugadorRival){
        // Verifica las posibles líneas ganadoras (horizontales, verticales y diagonales).
        if(tablero[0][0]==1 && tablero[0][1]==1 && tablero[0][2]==1) return TipoImagen.LINEA1; // Línea 1 horizontal.
        if(tablero[1][0]==1 && tablero[1][1]==1 && tablero[1][2]==1) return TipoImagen.LINEA2; // Línea 2 horizontal.
        if(tablero[2][0]==1 && tablero[2][1]==1 && tablero[2][2]==1) return TipoImagen.LINEA3; // Línea 3 horizontal.
        if(tablero[0][0]==1 && tablero[1][0]==1 && tablero[2][0]==1) return TipoImagen.LINEA4; // Línea 1 vertical.
        if(tablero[0][1]==1 && tablero[1][1]==1 && tablero[2][1]==1) return TipoImagen.LINEA5; // Línea 2 vertical.
        if(tablero[0][2]==1 && tablero[1][2]==1 && tablero[2][2]==1) return TipoImagen.LINEA6; // Línea 3 vertical.
        if(tablero[2][0]==1 && tablero[1][1]==1 && tablero[0][2]==1) return TipoImagen.LINEA7; // Línea diagonal inversa.
        if(tablero[0][0]==1 && tablero[1][1]==1 && tablero[2][2]==1) return TipoImagen.LINEA8; // Línea diagonal principal.

        // Verifica si el tablero está lleno (empate).
        int contador = 0; // Contador para el número total de casillas ocupadas.
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(tablero[i][j] == 1) contador++; // Incrementa el contador si el jugador ocupa la casilla.
                if(jugadorRival.getTablero()[i][j] == 1) contador++; // Incrementa el contador si el rival ocupa la casilla.
            }
        }

        if(contador == 9) return TipoImagen.EMPATE; // Si todas las casillas están ocupadas, hay empate.

        return null; // Si no hay ganador ni empate, retorna null.
    }

    // Métodos getters y setters para los atributos.
    public int[][] getTablero() {
        return tablero; // Retorna el tablero del jugador.
    }

    public void setTablero(int[][] tablero) {
        this.tablero = tablero; // Asigna un nuevo tablero al jugador.
    }

    public String getNombre() {
        return nombre; // Retorna el nombre del jugador.
    }

    public void setNombre(String nombre) {
        this.nombre = nombre; // Asigna un nuevo nombre al jugador.
    }

    public TipoImagen getTipoImagen() {
        return tipoImagen; // Retorna el tipo de imagen del jugador.
    }

    public void setTipoImagen(TipoImagen tipoImagen) {
        this.tipoImagen = tipoImagen; // Asigna un nuevo tipo de imagen al jugador.
    }
}
