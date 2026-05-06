package br.techgeo.Main;
import br.techgeo.forma.Cilindro;
import br.techgeo.forma.Circulo;
import br.techgeo.forma.Forma;
import br.techgeo.forma.Volume;
import br.techgeo.ponto.Ponto;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ArrayList<Forma> lista = new ArrayList<>();
        lista.add(new Cilindro(1, 2, new Ponto(3,4)));
        lista.add(new Cilindro(1, 2, new Ponto(3,4)));

        lista.add(new Circulo(1, new Ponto(8,4)));
        lista.add(new Circulo(2, new Ponto(6,3)));

        // impressão áreas
        for (Forma forma : lista){
            System.out.println(forma);
            System.out.println();
        }
        for (Forma forma : lista){
            System.out.println(forma.calcularArea());
        }


        //impressão do volume
        for (Forma forma: lista){
            if (forma instanceof Volume){
                System.out.println(((Volume) forma).calcularVolume());
            }
        }
    }
}
