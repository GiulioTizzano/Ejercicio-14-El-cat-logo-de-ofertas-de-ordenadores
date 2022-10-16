package aplicacion;

import dominio.*;


public class Main {
    public static void main(String[] args) {
       OfertaOrdenador O1 = new OfertaOrdenador(500, 50, M1);
       ModeloOrdenador M1 = new ModeloOrdenador(12345, 16, 1000, Asus, Intel);

        System.out.print(O1);
        System.out.print(M1);

    }    
}
