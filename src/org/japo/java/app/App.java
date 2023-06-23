/*
 * Copyright 2022 Manel Eduard Tarazona García - mantargar@gmail.com.
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
package org.japo.java.app;

import org.japo.java.entities.Articulo;

/**
 *
 * @author Manel Eduard Tarazona García - mantargar@gmail.com.
 */
public final class App {

    public static void launchApp() throws Exception {
        try {
            System.out.println("Artículo válido:");
            System.out.println("================");
            Articulo articulo1 = new Articulo(20230013, "Gel de Ducha Dermo", 2.35, 'G');
            System.out.println(articulo1.toString());
            System.out.println("---");
            Articulo articulo2 = null;
            try {
                articulo2 = new Articulo(20229999, "Articulo con nombre demasiado largo para ser válido", 12.00, 'X');
            } catch (Exception e) {
                System.out.println("Artículo no válido:");
                System.out.println("===================");
                System.out.println("ERROR: " + e.getMessage());
                System.out.println();
            }
            if (articulo2 != null) {
                System.out.println("Artículo no válido:");
                System.out.println("-------------------");
                System.out.println(articulo2.toString());
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
