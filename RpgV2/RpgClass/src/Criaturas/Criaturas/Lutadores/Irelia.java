package Criaturas.Criaturas.Lutadores;

import Criaturas.FabricaDeCriaturas.Criatura01;

public class Irelia implements Criatura01 {
    int ataqueI;
    int defesaI;
    int energia = 100;
    String name = "Irelia";
    String classe = " Lutador ";

    public void mostrarCriatura01(){
        System.out.println("Classe:" + this.classe + "Nome: " + this.name + " // " + " Ataque: " + this.ataqueI + " Defesa: " + this.defesaI + " Energia: " + this.energia);
    }
}
