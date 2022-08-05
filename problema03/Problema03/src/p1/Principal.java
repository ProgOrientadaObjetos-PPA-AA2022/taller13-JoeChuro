/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import java.util.ArrayList;
import p2.Estudiante;
import p3.Correo;
import p3.DominioGmail;
import p3.DominioGobierno;
import p3.DominioOutlook;
import p3.DominioUTPL;
import p3.DominioYahoo;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        /*
        El mini-sistema debe permitir que se genere
        diversos correos para un estudiante.
        Para Gmail
        Para Outlook
        Para Yahoo
        Para utpl.edu.ec
        Para gobiernoec.gob
        
         */

         Estudiante e = new Estudiante();
        e.establecerNombres("René Elizalde");
        e.establecerUserName("rrelizalde");
        ArrayList<Correo> lista = new ArrayList<>();

        Correo c = new Correo();
        c.establecerUserName(e.obtenerUserName());
        DominioGmail dg = new DominioGmail();
        dg.establecerDominio();
        c.establecerDominio(dg);
        c.establecerCorreo();

        Correo c2 = new Correo();
        c2.establecerUserName(e.obtenerUserName());
        DominioUTPL ut = new DominioUTPL();
        ut.establecerDominio();
        c2.establecerDominio(ut);
        c2.establecerCorreo();

        Correo c3 = new Correo();
        c3.establecerUserName(e.obtenerUserName());
        DominioGobierno dg2 = new DominioGobierno();
        dg2.establecerDominio();
        c3.establecerDominio(dg2);
        c3.establecerCorreo();

        Correo c4 = new Correo();
        c4.establecerUserName(e.obtenerUserName());
        DominioOutlook dO = new DominioOutlook();
        dO.establecerDominio();
        c4.establecerDominio(dO);
        c4.establecerCorreo();

        Correo c5 = new Correo();
        c5.establecerUserName(e.obtenerUserName());
        DominioYahoo dy = new DominioYahoo();
        dy.establecerDominio();
        c5.establecerDominio(dy);
        c5.establecerCorreo();

        lista.add(c);
        lista.add(c2);
        lista.add(c3);
        lista.add(c4);
        lista.add(c5);
        e.establecerCorreos(lista);

        System.out.println(e); 

    }

}
