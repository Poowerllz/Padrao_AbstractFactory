package Criaturas.Criaturas.Assasinos;

import Criaturas.FabricaDeCriaturas.Criatura05;

public class LeBlanc implements Criatura05 {
    int ataqueI;
    int defesaI;
    int energia = 100;
    String name = "LeBlanc";
    String classe = " Assassino ";

    public void mostrarCriatura05(){
        System.out.println("Classe:" + this.classe + "Nome: " + this.name + " // " + " Ataque: " + this.ataqueI + " Defesa: " + this.defesaI + " Energia: " + this.energia);
    }
}