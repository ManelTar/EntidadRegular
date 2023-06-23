/*
 * Copyright 2023 Manel Eduard Tarazona García - mantargar@gmail.com.
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

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Manel Eduard Tarazona García - mantargar@gmail.com.
 */
public final class UtilesValidacion {

    private UtilesValidacion() {
    }

    public static final boolean validar(String dato, String er) {
       boolean testOK = false;

        try {
            // expresion regular complilada
            Pattern patron = Pattern.compile(er);

//            detector de expresion regular
            Matcher detector = patron.matcher(dato);

//            Resolucion semaforo
            testOK = detector.matches();
        } catch (Exception e) {
            System.out.println("Error; " + e.getMessage());
        }

        return testOK;
    }

}
