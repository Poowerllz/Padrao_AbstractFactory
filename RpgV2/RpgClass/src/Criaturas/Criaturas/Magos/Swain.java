package Criaturas.Criaturas.Magos;

import Criaturas.FabricaDeCriaturas.Criatura04;

public class Swain implements Criatura04 {
    int ataqueI;
    int defesaI;
    int energia = 100;
    String name = "Swain";
    String classe = " Mago ";

    public void mostrarCriatura04(){
        System.out.println("Classe:" + this.classe + "Nome: " + this.name + " // " + " Ataque: " + this.ataqueI + " Defesa: " + this.defesaI + " Energia: " + this.energia);
    }
}
