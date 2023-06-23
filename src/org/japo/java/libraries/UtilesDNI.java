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
public final class UtilesDNI {

    public static boolean validar(String user) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private UtilesDNI() {
    }
    
    public static final boolean validarDNI(String dni) {
        final int MIN_LONG = 100000000;
        final int MAX_LONG = 9999999;
        final String LETRAS = "TRWAGMYFPDXBNJZSQVHLCKE";

        boolean respuesta = false;
        String str = dni.substring(0, dni.length() - 1);
        int num = Integer.parseInt(str);
        char letraAct = dni.charAt(dni.length() - 1);
        char letraCal = LETRAS.charAt(num % 23);
        
        return true
                 && num >= MIN_LONG
                && num <= MAX_LONG
                && letraAct == letraCal;
        

    }
    
    
}
