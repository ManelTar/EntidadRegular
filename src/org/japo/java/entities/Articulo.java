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
package org.japo.java.entities;

import java.util.Objects;
import org.japo.java.libraries.UtilesArticulo;

/**
 *
 * @author Manel Eduard Tarazona García - mantargar@gmail.com.
 */
public final class Articulo {

    private int codigo;
    private String nombre;
    private double precio;
    private char formato;

    public Articulo(int codigo, String nombre, double precio, char formato) throws Exception {
        if (!UtilesArticulo.validarCodigo(codigo)
                || !UtilesArticulo.validarNombre(nombre)
                || !UtilesArticulo.validarPrecio(precio)
                || !UtilesArticulo.validarFormato(formato)) {
            throw new Exception("Artículo incorrecto");
        }
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.formato = formato;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public char getFormato() {
        return formato;
    }

    public void setFormato(char formato) {
        this.formato = formato;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Articulo other = (Articulo) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (Double.doubleToLongBits(this.precio) != Double.doubleToLongBits(other.precio)) {
            return false;
        }
        if (this.formato != other.formato) {
            return false;
        }
        return Objects.equals(this.nombre, other.nombre);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.codigo;
        hash = 79 * hash + Objects.hashCode(this.nombre);
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.precio) ^ (Double.doubleToLongBits(this.precio) >>> 32));
        hash = 79 * hash + this.formato;
        return hash;
    }
    
    @Override
    public String toString() {
        return String.format("%d - %s - %.2f€ - %s",
                codigo, nombre, precio, UtilesArticulo.elegirFormato(formato));
    }    

}
