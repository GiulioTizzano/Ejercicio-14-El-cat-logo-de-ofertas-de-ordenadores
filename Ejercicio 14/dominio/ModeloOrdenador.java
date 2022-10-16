package dominio;

public class ModeloOrdenador {

    int identificadorDeModelo; // variable predeterminada de la tarea.
    int memoriaRam; // variable predeterminada de la tarea.
    int discoDuro;
    String marca; // variable predeterminada de la tarea.
    String modeloProcesador;

    public ModeloOrdenador(int identificadorDeModelo, int memoriaRam, int discoDuro, String marca, String modeloProcesador) {
        this.identificadorDeModelo = identificadorDeModelo;
        this.memoriaRam = memoriaRam;
        this.discoDuro = discoDuro;
        this.marca = marca;
        this.modeloProcesador = modeloProcesador;

    }

    public int IdentificadorModelo() {
        return identificadorDeModelo;
    }

    public int setIdentificadorModelo(int identificadorDeModelo) {
        this.identificadorDeModelo = identificadorDeModelo;
        return identificadorDeModelo;
    }

    public int getMemoriaRam() {
        return memoriaRam;

    }
    
    public int setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
        return memoriaRam;
    }

    public int getDiscoDuro() {
        return discoDuro;

    }
    
    public int setDiscoDuro(int discoDuro) {
        this.discoDuro = discoDuro;
        return discoDuro;
    }

    public String getMarca() {
        return marca;
    }

    public String setmarca(String marca) {

        this.marca = marca;
        return marca;
    }

    public String getModeloProcesador() {
        return modeloProcesador;

    }

    public String setModeloProcesador(String modeloProcesador) {
        this.modeloProcesador = modeloProcesador;
        return modeloProcesador;

    }

    public String toString() {

        return "El ordenador es un " + marca + "con un discoduro de" + discoDuro + " GB " + " una RAM de " + memoriaRam + 
        " procesador " + modeloProcesador + " con un identificador unico " + identificadorDeModelo;
    }



    
}