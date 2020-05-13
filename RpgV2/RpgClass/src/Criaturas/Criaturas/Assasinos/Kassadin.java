package Criaturas.Criaturas.Assasinos;

import Criaturas.FabricaDeCriaturas.*;


public class Kassadin implements Criatura01 {
    int ataqueI;
    int defesaI;
    int energia = 100;
    String name = "Kassadin";
    String classe = " Assassino ";

    public void mostrarCriatura01(){
        System.out.println("Classe:" + this.classe + "Nome: " + this.name + " // " + " Ataque: " + this.ataqueI + " Defesa: " + this.defesaI + " Energia: " + this.energia);
    }
}