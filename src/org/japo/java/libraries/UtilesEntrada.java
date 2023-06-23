/* 
 * Copyright Copyright 2022 Manel Eduard Tarazona García - mantargar@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.libraries;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Manel Eduard Tarazona García - mantargar@gmail.com.
 */
public final class UtilesEntrada {

    private UtilesEntrada() {
    }

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");
// ENTRADAS LEER

    public static final int leerEntero(String msg, String msg_err) {
        boolean introOK = false;
        int num = 0;
        do {

            try {

                System.out.print(msg);
                num = SCN.nextInt();
                introOK = true;
            } catch (Exception e) {
                System.out.println(msg_err);
            } finally {
                SCN.nextLine();
            }
        } while (!introOK);

        return num;
    }

    public static final char leerCaracter(String msg) {
        boolean introOK = false;
        char car = 0;

        do {
            try {
                System.out.print(msg);
                car = SCN.nextLine().charAt(0);
                introOK = true;
            } catch (Exception e) {
                System.out.println("ERROR de ENTRADA");
            }
        } while (!introOK);

        return car;
    }

    public static final String leerCadena(String msg) {
        System.out.print(msg);
        return SCN.nextLine();
    }

    public static final double leerDouble(String msg) {
        double deci = 0;
        boolean introOK = false;

        do {
            try {
                System.out.print(msg);
                deci = SCN.nextDouble();
                introOK = true;
            } catch (Exception e) {
                System.out.println("ERROR de ENTRADA");
            }
        } while (!introOK);

        return deci;
    }

    public static final boolean leerBoolean(String msg) {
        boolean boo = true;
        boolean introOK = false;

        do {
            try {
                System.out.print(msg);
                boo = SCN.nextBoolean();
                introOK = true;
            } catch (Exception e) {
                System.out.println("ERROR de ENTRADA");
            }
        } while (!introOK);

        return boo;
    }

    // ENTRADAS CON RANGOS DE DATOS
    public static final int leerEnteroRango(String msg, String msg_err, int min, int max) {
        final int MAX_RANGO = max;
        final int MIN_RANGO = min;
        boolean rangoOK = false;
        int num = 0;

        do {

            num = leerEntero(msg, msg_err);
            //rangoOK= num > max || num < min;
            if (num > MAX_RANGO || num < MIN_RANGO) {
                System.out.println("Número fuera de rango");
                System.out.println("---");
            } else {
                rangoOK = true;
            }

        } while (!rangoOK);

        return num;
    }

    public static final char leerCaracterRango(String msg, int min, int max) {
        final int MAX_RANGO = max;
        final int MIN_RANGO = min;
        boolean rangoOK = false;
        char car = 0;

        do {
            car = leerCaracter(msg);
            if (car > MAX_RANGO || car < MIN_RANGO) {
                System.out.println("Caracter fuera de rango");
                System.out.println("---");
            } else {
                rangoOK = true;
            }

        } while (!rangoOK);
        // 65 90 las mayus
        return car;
    }

    public static final double leerDoubleRango(String msg, int min, int max) {
        double deci = 0;
        final int MAX_RANGO = max;
        final int MIN_RANGO = min;
        boolean rangoOK = false;

        do {

            deci = leerDouble(msg);

            if (deci > MAX_RANGO || deci < MIN_RANGO) {

                System.out.println("Número fuera de rango");
                System.out.println("---");

            } else {
                rangoOK = true;
            }

        } while (!rangoOK);

        return deci;
    }

}
