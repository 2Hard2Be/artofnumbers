package com.example.artofnumbers;

/**
 * Created by Peto-1 on 3/4/2015.
 */
public class Longitud {

    public Double number;
    public String unidades;
    public String unidadesto;

    public Longitud (Double vienenumber, String vieneunidades, String vieneunidadesto) {

        Double number = vienenumber;
        String unidades = vieneunidades;
        String unidadesto = vieneunidadesto;

    }

    public Longitud(Double vienenumber, String vieneunidades) {

        Double number = vienenumber;
        String unidades = vieneunidades;

    }

    public  String calculaUnaLongitud(Double valor, String units, String unitst) {

        number = valor;
        unidades = units;
        unidadesto = unitst;
        Double respuestan;
        String respuestastr;
        String errorto = "0.000";
        String errorunits = "0.0000";

        switch (unidades) {

            case  "cm(centimeter)":
            case "cm":

                switch (unidadesto) {
                    case "cm(centimeter)":
                    case "cm":

                        respuestan = 1 * number;
                        break;

                    case "ft(feet)":
                    case "ft":
                        respuestan =  0.032808 * number;
                        break;


                    case "in(inch)":
                    case "in":
                        respuestan =  0.393700 * number;
                        break;

                    case "km(kilometer)":
                    case "km":

                        respuestan = 0.00001 * number;
                        break;
                    case "m(meter)":
                    case "m":
                        respuestan = 0.01 * number;
                        break;
                    case "mi(mile)":
                    case "mi":

                        respuestan =   0.0000062 * number;
                        break;

                    case "mm(millimeter)":
                    case "mm":

                        respuestan =   10 * number;
                        break;

                    case "yd(yard)":
                    case "yd":

                        respuestan =   0.010936 * number;
                        break;

                    default:
                        respuestan = Double.parseDouble(errorto);

                }
                break;

            case  "ft(feet":
            case "ft":

                switch (unidadesto) {
                    case "cm(centimeter)":
                    case "cm":

                        respuestan = 30.48 * number;
                        break;

                    case "ft(feet)":
                    case "ft":
                        respuestan =  1 * number;
                        break;


                    case "in(inch)":
                    case "in":
                        respuestan =  12 * number;
                        break;

                    case "km(kilometer)":
                    case "km":

                        respuestan = 0.0003048 * number;
                        break;
                    case "m(meter)":
                    case "m":
                        respuestan = 0.3048 * number;
                        break;
                    case "mi(mile)":
                    case "mi":

                        respuestan =   0.000189393 * number;
                        break;

                    case "mm(millimeter)":
                    case "mm":

                        respuestan =   304.8 * number;
                        break;

                    case "yd(yard)":
                    case "yd":

                        respuestan =   0.333333 * number;
                        break;

                    default:
                        respuestan = Double.parseDouble(errorto);

                }
                break;

            case "in(inch)":
            case "in":

                switch (unidadesto) {
                    case "cm(centimeter)":
                    case "cm":

                        respuestan = 2.54 * number;
                        break;

                    case "ft(feet)":
                    case "ft":
                        respuestan =   0.083333333 * number;
                        break;


                    case "in(inch)":
                    case "in":
                        respuestan =  1 * number;
                        break;

                    case "km(kilometer)":
                    case "km":

                        respuestan =  0.0000254 * number;
                        break;
                    case "m(meter)":
                    case "m":
                        respuestan = 0.0254 * number;
                        break;
                    case "mi(mile)":
                    case "mi":

                        respuestan =    0.000015782 * number;
                        break;

                    case "mm(millimeter)":
                    case "mm":

                        respuestan =   25.4 * number;
                        break;

                    case "yd(yard)":
                    case "yd":

                        respuestan =    0.027777777 * number;
                        break;

                    default:
                        respuestan = Double.parseDouble(errorto);

                }
                break;

            case "km(kilometer)":
            case "km":

                switch (unidadesto) {
                    case "cm(centimeter)":
                    case "cm":

                        respuestan = 100000 * number;
                        break;

                    case "ft(feet)":
                    case "ft":
                        respuestan =   3280.839895  * number;
                        break;


                    case "in(inch)":
                    case "in":
                        respuestan =  39370.07874 * number;
                        break;

                    case "km(kilometer)":
                    case "km":

                        respuestan =  1 * number;
                        break;
                    case "m(meter)":
                    case "m":
                        respuestan = 1000 * number;
                        break;
                    case "mi(mile)":
                    case "mi":

                        respuestan =     0.621371192 * number;
                        break;

                    case "mm(millimeter)":
                    case "mm":

                        respuestan =   1000000 * number;
                        break;

                    case "yd(yard)":
                    case "yd":

                        respuestan = 1093.6132983 * number;
                        break;

                    default:
                        respuestan = Double.parseDouble(errorto);

                }
                break;

            case "m(meter)":
            case "m":

                switch (unidadesto) {
                    case "cm(centimeter)":
                    case "cm":

                        respuestan = 100 * number;
                        break;

                    case "ft(feet)":
                    case "ft":
                        respuestan =   3.280839895  * number;
                        break;


                    case "in(inch)":
                    case "in":
                        respuestan =   39.37007874 * number;
                        break;

                    case "km(kilometer)":
                    case "km":

                        respuestan =  0.001 * number;
                        break;
                    case "m(meter)":
                    case "m":
                        respuestan = 1 * number;
                        break;
                    case "mi(mile)":
                    case "mi":

                        respuestan = 0.000621371 * number;
                        break;

                    case "mm(millimeter)":
                    case "mm":

                        respuestan =   1000 * number;
                        break;

                    case "yd(yard)":
                    case "yd":

                        respuestan = 1.093613298 * number;
                        break;

                    default:
                        respuestan = Double.parseDouble(errorto);

                }
                break;
//Aqui voy
            case "kg(kilogram)":
            case "kg":
                switch (unidadesto) {
                    case "g(gram)":
                    case "gm":
                    case "g":
                        respuestan = 1000 * number;
                        break;

                    case "kg(kilogram)":
                    case "kg":
                        respuestan =  1 * number;
                        break;
                    case "lb(pound)":
                    case "lb":
                    case "lbs":
                        respuestan = 2.204622 * number;
                        break;
                    case "ton(metric_ton)":
                    case "ton":

                        respuestan = 0.001 * number;
                        break;
                    case "mg(milligram)":
                    case "mg":
                        respuestan = 1000000 * number;
                        break;
                    case "ounce":

                        respuestan =  35.273961 * number;
                        break;

                    default:
                        respuestan = Double.parseDouble(errorto);

                }
                break;

            case "lb(pound)":
            case "lb":
            case "lbs":
                switch (unidadesto) {
                    case "g(gram)":
                    case "gm":
                    case "g":
                        respuestan = 453.59237 * number;
                        break;

                    case "kg(kilogram)":
                    case "kg":
                        respuestan =  0.453592 * number;
                        break;
                    case "lb(pound)":
                    case "lb":
                    case "lbs":
                        respuestan = 1 * number;
                        break;
                    case "ton(metric_ton)":
                    case "ton":

                        respuestan =  0.000453 * number;
                        break;
                    case "mg(milligram)":
                    case "mg":
                        respuestan = 453592.37 * number;
                        break;
                    case "ounce":

                        respuestan =  16 * number;
                        break;

                    default:
                        respuestan = Double.parseDouble(errorto);

                }
                break;

            case "ton(metric_ton)":
            case "ton":
                switch (unidadesto) {
                    case "g(gram)":
                    case "gm":
                    case "g":
                        respuestan = 1000000 * number;
                        break;

                    case "kg(kilogram)":
                    case "kg":
                        respuestan =  1000 * number;
                        break;
                    case "lb(pound)":
                    case "lb":
                    case "lbs":
                        respuestan = 2204.622621 * number;
                        break;
                    case "ton(metric_ton)":
                    case "ton":

                        respuestan =  1 * number;
                        break;
                    case "mg(milligram)":
                    case "mg":
                        respuestan = 1000000000 * number;
                        break;
                    case "ounce":

                        respuestan =  35273.961 * number;
                        break;

                    default:
                        respuestan = Double.parseDouble(errorto);

                }
                break;

            case "mg(milligram)":
            case "mg":
                switch (unidadesto) {
                    case "g(gram)":
                    case "gm":
                    case "g":
                        respuestan = 0.001 * number;
                        break;

                    case "kg(kilogram)":
                    case "kg":
                        respuestan =   0.000001 * number;
                        break;
                    case "lb(pound)":
                    case "lb":
                    case "lbs":
                        respuestan = 0.000002204 * number;
                        break;
                    case "ton(metric_ton)":
                    case "ton":

                        respuestan =  1.0e-9 * number;
                        break;
                    case "mg(milligram)":
                    case "mg":
                        respuestan = 1 * number;
                        break;
                    case "ounce":

                        respuestan =  0.000035274 * number;
                        break;

                    default:
                        respuestan = Double.parseDouble(errorto);

                }
                break;

            case "ounce":

                switch (unidadesto) {
                    case "g(gram)":
                    case "gm":
                    case "g":
                        respuestan =  28.349523 * number;
                        break;

                    case "kg(kilogram)":
                    case "kg":
                        respuestan =    0.028349 * number;
                        break;
                    case "lb(pound)":
                    case "lb":
                    case "lbs":
                        respuestan = 0.0625 * number;
                        break;
                    case "ton(metric_ton)":
                    case "ton":

                        respuestan =  0.000028 * number;
                        break;
                    case "mg(milligram)":
                    case "mg":
                        respuestan = 28349.523125 * number;
                        break;
                    case "ounce":

                        respuestan =  1 * number;
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
