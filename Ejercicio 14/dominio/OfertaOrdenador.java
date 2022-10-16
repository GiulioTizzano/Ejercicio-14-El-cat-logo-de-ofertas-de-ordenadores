package dominio;

public class OfertaOrdenador {

    int precioInicial; // variable predetermindada de la tarea.
    int descuento; // variable predeterminada de la tarea.
    private oferta tieneOrdenadorOfertado;
    int descuentoInt; 
    int precioFinal;
    
    public OfertaOrdenador(int precioInicial, int descuento, oferta tieneOrdenadorOfertado) {
        this.tieneOrdenadorOfertado = tieneOrdenadorOfertado;
        this.precioInicial = precioInicial;
        this.descuento = descuento;
        this.descuentoInt = (precioInicial * descuento) / 100;
        this.precioFinal = precioInicial - descuentoInt;
    
    }

    public int getInitialPrice() {
        return precioInicial;

    }

    public int setInitialPrice(int precioInicial) {

        return precioInicial;

    }

    public int getDiscount() {
        return descuento;
    }

    public int setDescuento(int descuento) {
        this.descuento = descuento;
        return descuento;

    }
    
    public int calcularPrecioFinal(int precioFinal) {
        return precioFinal;

    }

    public String toString() {

        return "El precio inicial es " + precioInicial + " con un descuento de " + descuento + " euros " + "con un precio neto de " +
        precioFinal + " euros ";
    }


}


