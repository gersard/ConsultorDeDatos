package com.example.gerardo.apidatos.core;

/**
 * Created by Gerardo on 24/09/2016.
 */
public class GlobalFunctions {


    //VALIDADOR DE RUT CHILENO
    public static boolean validarRut(String rut) {
        boolean validacion = false;
        try {
            rut =  rut.toUpperCase();
            rut = rut.replace(".", "");
            rut = rut.replace("-", "");
            int rutAux = Integer.parseInt(rut.substring(0, rut.length() - 1));

            char dv = rut.charAt(rut.length() - 1);

            int m = 0, s = 1;
            for (; rutAux != 0; rutAux /= 10) {
                s = (s + rutAux % 10 * (9 - m++ % 6)) % 11;
            }
            if (dv == (char) (s != 0 ? s + 47 : 75)) {
                validacion = true;
            }

        } catch (java.lang.NumberFormatException e) {
        } catch (Exception e) {
        }
        return validacion;
    }
    public static String formatRut(String rut){
        if (!rut.contains("-")){
            rut = rut.substring(0, 8) + "-" + rut.substring(8, rut.length());
            return rut;
        }
        return rut;
    }

}
