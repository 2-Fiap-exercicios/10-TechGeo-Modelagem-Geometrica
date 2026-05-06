package br.techgeo.Main;
import br.techgeo.cilindro.Cilindro;
import br.techgeo.circulo.Circulo;
import br.techgeo.ponto.Ponto;

public class Main {

    public static void main(String[] args) {

        Ponto ponto;

        // Cilindro
        ponto= new Ponto(2, -3);
        Cilindro cilindro = new Cilindro(8, 2, ponto);

        System.out.println("Área= " + cilindro.calcularArea() + "\n" +"Volume= "+ cilindro.calcularVolume());

        // Circulo
        ponto= new Ponto(-4, 7);
        Circulo circulo = new Circulo(10, ponto);
        System.out.println("Área= "+circulo.calcularArea());



    }
}
