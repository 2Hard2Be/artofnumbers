package com.example.artofnumbers;

/**
 * Created by Peto-1 on 2/18/2015.
 */
public class convertidor {

    public String cifra;
    public String unidad;
    public String unidadto;

public convertidor (String vienecifra, String vieneunidad) {

    String cifra = vienecifra;
    String unidad = vieneunidad;

}

public convertidor (String vienecifra, String vieneunidad, String vieneunidadto)  {

     String cifra = vienecifra;
     String unidad = vieneunidad;
     String unidadto = vieneunidadto;


}
//solo probando el metodo convierte, el 500 de abajo solo es prueba

    public String convierte (String c, String u, String uto ){

      cifra = c;
      unidad = u;
      unidadto = uto;

       Float numero = Float.valueOf(c);


       Float respuestafloat = numero + 500;

        String respuestastring = Float.toString(respuestafloat);

return respuestastring;

    }

}