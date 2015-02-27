package com.example.artofnumbers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Peto-1 on 2/18/2015.
 */
public class convertidor {

    public String cifra;
    public String unidad;
    public String unidadto;
    public String respuestastring;

    public convertidor(String vienecifra, String vieneunidad) {

        String cifra = vienecifra;
        String unidad = vieneunidad;

    }

    public convertidor(String vienecifra, String vieneunidad, String vieneunidadto) {

        String cifra = vienecifra;
        String unidad = vieneunidad;
        String unidadto = vieneunidadto;


    }
//Por el momento solo volumen, agregar switchboard para elegir unidades u
// y detro un if en cada entrada del switch para descartar unidades desconocidas en el else interno
// para elegir entre unidades y dimensiones

    public String convierte(String c, String u, String uto) {

        cifra = c;
        unidad = u;
        unidadto = uto;


        Double numero = Double.valueOf(cifra);

        switch (unidad) {

            case "l":
            case "l(liter)":
            case "lt":
            case "m3":
            case "m3(cubic_meter)":
            case "gal":
            case "gal(US_gallon)":
            case "cm3":
            case "cm3(cubic_centimeter)":
            case "ml":
            case "ml(milliliter)":
            case "cc":
            case "hl(hectoliter)":
            case "hl":
            case "barrel(US)":
            case "barrel":
            case "ft3(cubic_foot)":
            case "ft3":
            case "in3(cubic inch)":
            case "in3":
            case "microliter":
            case "ul":
            case "oz(US_liquid_ounce)":
            case "oz":

//                HashSet contine los parametros para evaluar las unidades to
                  final Set<String> values = new HashSet<String>(Arrays.asList("l","l(liter)","lt","m3","m3(cubic_meter)",
                          "gal","gal(US_gallon)","cm3","cm3(cubic_centimeter)","ml","ml(milliliter)","cc","hl(hectoliter)",
                          "hl","barrel(US)","barrel","ft3(cubic_foot)","ft3","in3(cubicinch)","in3","microliter","ul",
                          "oz(US_liquid_ounce)","oz"));

                if (values.contains(unidadto)) {

                    Volumen volumetrickey = new Volumen(numero, unidad, unidadto);
                    respuestastring = volumetrickey.calculaUnVolumen(numero, unidad, unidadto);

                } else {
                    respuestastring = "Unknown units to convert";
                }
                break;

            default:

                respuestastring =  "Unknown units";
        }

//Evaluar si conviene mejor colocar aqui las respuestas del string como y no en main para que tenga
//        versatilidad en el texto resultado
        return respuestastring;

    }

}
