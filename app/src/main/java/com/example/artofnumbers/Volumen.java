package com.example.artofnumbers;

/**
 * Created by Peto-1 on 2/19/2015.
 */
public class Volumen {

    public Double number;
    public String unidades;
    public String unidadesto;

    public Volumen(Double vienenumber, String vieneunidades, String vieneunidadesto) {

        Double number = vienenumber;
        String unidades = vieneunidades;
        String unidadesto = vieneunidadesto;

    }

    public Volumen(Double vienenumber, String vieneunidades) {

        Double number = vienenumber;
        String unidades = vieneunidades;

    }

    public  String calculaUnVolumen(Double valor, String units, String unitst) {

        number = valor;
        unidades = units;
        unidadesto = unitst;
        Double respuestan;
        String respuestastr;
        String errorto = "0.000";
        String errorunits = "0.0000";

        switch (unidades) {

            case "l":
            case "l(liter)":
                switch (unidadesto) {
                    case "l":
                    case "l(liter)":
                        respuestan = 1 * number;
                        break;
                    case "m3":
                    case "m3(cubic_meter)":
                              respuestan = 0.001 * number;
                        break;
                    case "gal":
                    case "gal(gallon)":
                        respuestan = 0.2641 * number;
                        break;
                    default:
                        respuestan = Double.parseDouble(errorto);

                }
                 break;
            default:
                respuestan = Double.parseDouble(errorunits);

        }

        respuestastr = String.valueOf(respuestan);
        return respuestastr;

    }

}