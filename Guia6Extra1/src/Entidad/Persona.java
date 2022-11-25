/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author ezepl
 */
public class Persona {

    public Persona(String nombre, int Documento, int nacimiento) {
        this.nombre = nombre;
        this.Documento = Documento;
        this.nacimiento = nacimiento;
    }
    public String nombre;
    public int Documento;
    public int nacimiento;
}
