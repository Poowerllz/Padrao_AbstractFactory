package Criaturas.Criaturas.Lutadores;

import Criaturas.FabricaDeCriaturas.Criatura05;

public class Yasuo implements Criatura05 {
    int ataqueI;
    int defesaI;
    int energia = 100;
    String name = "Yasuo";
    String classe = " Lutador ";

    public void mostrarCriatura05(){
        System.out.println("Classe:" + this.classe + "Nome: " + this.name + " // " + " Ataque: " + this.ataqueI + " Defesa: " + this.defesaI + " Energia: " + this.energia);
    }
}
