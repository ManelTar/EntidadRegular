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
public final class UtilesConfig {
   public static final String ER_USER = "[1-9]\\d{7}[TRWAGMYFPDXBNJZSQVHLCKE]";
    // hh:mm:ss
    public static final String ER_PASS = "([01]\\d|2[0123]):([0-5]\\d):([0-5]\\d)";

    private UtilesConfig() {
    }
    
}
