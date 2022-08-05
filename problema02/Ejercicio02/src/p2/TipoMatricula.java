/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;

import java.util.ArrayList;
import p1.Matricula;
import p1.MatriculaCampamento;
import p1.MatriculaColegio;

/**
 *
 * @author reroes
 */
public class TipoMatricula {

    private double promedioMatriculas;
    private ArrayList<Matricula> matriculas;

    public void establecerMatriculas(ArrayList<Matricula> m) {
        matriculas = m;
    }

    public ArrayList<Matricula> obtenerMatriculas() {
        return matriculas;
    }

    public void establecerPromedioTarifas() {
        double suma = 0;
        for (int i = 0; i < obtenerMatriculas().size(); i++) {
            suma = suma + obtenerMatriculas().get(i).obtenerTarifa();
        }
        promedioMatriculas = suma / obtenerMatriculas().size();
    }

    public double obtenerPromedioTarifas() {
        return promedioMatriculas;
    }

    public String toString() {
        String reporte = String.format("");

        for (int i = 0; i < matriculas.size(); i++) {
            reporte = String.format("%s\n"
                    + "%s", reporte, matriculas.get(i).toString());
        }

        return reporte;
    }
}
