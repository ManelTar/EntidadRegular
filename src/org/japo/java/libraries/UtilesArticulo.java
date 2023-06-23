/*
 * Copyright 2023 Manel Eduard Tarazona García - mantargar@gmail.com.
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

/**
 *
 * @author Manel Eduard Tarazona García - mantargar@gmail.com.
 */
public class UtilesArticulo {

    public static final String ER_COD = "((19|20)\\d{2}|2100)\\d{4}";
    public static final String ER_NOM = "[\\wáéíóúüÁÉÍÓÚÜñÑ -]{3,30}";
    public static final String ER_PRE = "(\\d.\\d\\d)|(10.0)|(\\d.\\d)";
    public static final String ER_FOR = "S|L|G";

    public static final boolean validarCodigo(int codigo) {
        boolean testOK;
        String codigoString = String.valueOf(codigo);
        testOK = UtilesValidacion.validar(codigoString, ER_COD);
        return testOK;
    }

    public static final boolean validarNombre(String nombre) {
        boolean testOK;
        testOK = UtilesValidacion.validar(nombre, ER_NOM);
        return testOK;

    }

    public static final boolean validarPrecio(double precio) {
        boolean testOK;
        String precioString = String.valueOf(precio);
        testOK = UtilesValidacion.validar(precioString, ER_PRE);
        return testOK;
    }

    public static final boolean validarFormato(char formato) {
        boolean testOK;
        String formatoString = String.valueOf(formato);
        testOK = UtilesValidacion.validar(formatoString, ER_FOR);
      
        return testOK;
    }

    public static final String elegirFormato(char formato) {
        String tipo;
        switch (formato) {
            case 'G':
                tipo = "Gel";
                break;
            case 'S':
                tipo = "Sólido";
                break;
            case 'L':
                tipo = "Líquido";
                break;
            default:
                throw new AssertionError();
        }
        return tipo;
    }
}