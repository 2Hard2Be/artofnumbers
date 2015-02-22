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
            case "lt":
                switch (unidadesto) {
                    case "l":
                    case "l(liter)":
                    case "lt":
                        respuestan = 1 * number;
                        break;
                    case "m3":
                    case "m3(cubic_meter)":
                              respuestan = 0.001 * number;
                        break;
                    case "gal":
                    case "gal(US_gallon)":
                        respuestan = 0.2641 * number;
                        break;
                    case "cm3":
                    case "cm3(cubic_centimeter)":
                    case "ml":
                    case "ml(milliliter)":
                    case "cc":
                        respuestan = 1000 * number;
                        break;
                    case "hl(hectoliter)":
                    case "hl":
                        respuestan = 0.01 * number;
                        break;
                    case "barrel(US)":
                    case "barrel":
                        respuestan = 0.0083864 * number;
                        break;
                    case "ft3(cubic_foot)":
                    case "ft3":
                        respuestan =  0.0353147 * number;
                        break;
                    case "in3(cubic inch)":
                    case "in3":
                        respuestan =  61.023744 * number;
                        break;
                    case "microliter":
                    case "ul":
                        respuestan =  1000000 * number;
                        break;
                    case "oz(US_liquid_ounce)":
                    case "oz":
                        respuestan =  33.814022 * number;
                        break;

                    default:
                        respuestan = Double.parseDouble(errorto);

                }
                 break;

            case "m3":
            case "m3(cubic_meter)":
                switch (unidadesto) {
                    case "l":
                    case "l(liter)":
                    case "lt":
                        respuestan = 1000 * number;
                        break;
                    case "m3":
                    case "m3(cubic_meter)":
                        respuestan = 1 * number;
                        break;
                    case "gal":
                    case "gal(US_gallon)":
                        respuestan = 264.172052 * number;
                        break;
                    case "cm3":
                    case "cm3(cubic_centimeter)":
                    case "ml":
                    case "ml(milliliter)":
                    case "cc":
                        respuestan = 1000000 * number;
                        break;
                    case "hl(hectoliter)":
                    case "hl":
                        respuestan = 10 * number;
                        break;
                    case "barrel(US)":
                    case "barrel":
                        respuestan = 8.386414 * number;
                        break;
                    case "ft3(cubic_foot)":
                    case "ft3":
                        respuestan =  35.314666 * number;
                        break;
                    case "in3(cubic inch)":
                    case "in3":
                        respuestan =  61023.744095 * number;
                        break;
                    case "microliter":
                    case "ul":
                        respuestan =  1000000000  * number;
                        break;
                    case "oz(US_liquid_ounce)":
                    case "oz":
                        respuestan =  33814.022701 * number;
                        break;

                    default:
                        respuestan = Double.parseDouble(errorto);
                }
                break;

            case "gal":
            case "gal(US_gallon)":
                switch (unidadesto) {
                    case "l":
                    case "l(liter)":
                    case "lt":
                        respuestan = 3.785411 * number;
                        break;
                    case "m3":
                    case "m3(cubic_meter)":
                        respuestan =  0.003785 * number;
                        break;
                    case "gal":
                    case "gal(US_gallon)":
                        respuestan = 1 * number;
                        break;
                    case "cm3":
                    case "cm3(cubic_centimeter)":
                    case "ml":
                    case "ml(milliliter)":
                    case "cc":
                        respuestan = 3785.411784 * number;
                        break;
                    case "hl(hectoliter)":
                    case "hl":
                        respuestan =  0.037854 * number;
                        break;
                    case "barrel(US)":
                    case "barrel":
                        respuestan = 0.031746 * number;
                        break;
                    case "ft3(cubic_foot)":
                    case "ft3":
                        respuestan =   0.133680 * number;
                        break;
                    case "in3(cubic inch)":
                    case "in3":
                        respuestan =  231 * number;
                        break;
                    case "microliter":
                    case "ul":
                        respuestan =   3785411.784  * number;
                        break;
                    case "oz(US_liquid_ounce)":
                    case "oz":
                        respuestan =  128 * number;
                        break;
                    default:
                        respuestan = Double.parseDouble(errorto);
                }
                break;
            case "cm3":
            case "cm3(cubic_centimeter)":
            case "ml":
            case "ml(milliliter)":
            case "cc":
                switch (unidadesto) {
                    case "l":
                    case "l(liter)":
                    case "lt":
                        respuestan = 0.001 * number;
                        break;
                    case "m3":
                    case "m3(cubic_meter)":
                        respuestan =  0.000001 * number;
                        break;
                    case "gal":
                    case "gal(US_gallon)":
                        respuestan = 0.000264 * number;
                        break;
                    case "cm3":
                    case "cm3(cubic_centimeter)":
                    case "ml":
                    case "ml(milliliter)":
                    case "cc":
                        respuestan = 1 * number;
                        break;
                    case "hl(hectoliter)":
                    case "hl":
                        respuestan =  0.00001 * number;
                        break;
                    case "barrel(US)":
                    case "barrel":
                        respuestan = 0.000008386414 * number;
                        break;
                    case "ft3(cubic_foot)":
                    case "ft3":
                        respuestan =   0.000035 * number;
                        break;
                    case "in3(cubic inch)":
                    case "in3":
                        respuestan =   0.061023 * number;
                        break;
                    case "microliter":
                    case "ul":
                        respuestan =   1000  * number;
                        break;
                    case "oz(US_liquid_ounce)":
                    case "oz":
                        respuestan =  0.033814 * number;
                        break;
                    default:
                        respuestan = Double.parseDouble(errorto);
                }
                break;

            case "hl(hectoliter)":
            case "hl":
                switch (unidadesto) {
                    case "l":
                    case "l(liter)":
                    case "lt":
                        respuestan = 100 * number;
                        break;
                    case "m3":
                    case "m3(cubic_meter)":
                        respuestan =  0.1 * number;
                        break;
                    case "gal":
                    case "gal(US_gallon)":
                        respuestan = 26.417205 * number;
                        break;
                    case "cm3":
                    case "cm3(cubic_centimeter)":
                    case "ml":
                    case "ml(milliliter)":
                    case "cc":
                        respuestan = 100000 * number;
                        break;
                    case "hl(hectoliter)":
                    case "hl":
                        respuestan =  1 * number;
                        break;
                    case "barrel(US)":
                    case "barrel":
                        respuestan =  0.838641 * number;
                        break;
                    case "ft3(cubic_foot)":
                    case "ft3":
                        respuestan =   3.531466 * number;
                        break;
                    case "in3(cubic inch)":
                    case "in3":
                        respuestan =   6102.374409 * number;
                        break;
                    case "microliter":
                    case "ul":
                        respuestan =   100000000  * number;
                        break;
                    case "oz(US_liquid_ounce)":
                    case "oz":
                        respuestan =   3381.402270 * number;
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