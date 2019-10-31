/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cantantes;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author hp
 */
public class ListaCantante {
   
     ArrayList<Cantante> cantantes;

    public ListaCantante() {
        cantantes = new <Cantante> ArrayList();
    }

    public void AgregarCantanteFamoso(Cantante Cantante) {
        cantantes.add(Cantante);
    }

    public void listarCantanteFamoso() {
        Cantante cantante;
        Iterator<Cantante> continuar = cantantes.iterator();
        while (continuar.hasNext()) {
            cantante = continuar.next();
            System.out.print("Cantante: " + cantante.getNombre());
            System.out.println("        Discos con mas ventas: " + cantante.getDiscoConMasVentas());
        }
    }
    
}
