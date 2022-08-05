/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p3;

import java.io.Serializable;

/**
 *
 * @author Joe
 */
public class DominioGobierno implements Dominios{

    private String dominio;

    @Override
    public void establecerDominio() {
        dominio = "gob.ec";
    }

    @Override
    public String obtenerDominio() {
        return dominio;
    }
}
