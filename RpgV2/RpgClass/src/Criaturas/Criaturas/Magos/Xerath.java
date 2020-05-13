package Criaturas.Criaturas.Magos;

import Criaturas.FabricaDeCriaturas.Criatura05;

public class Xerath implements Criatura05 {
    int ataqueI;
    int defesaI;
    int energia = 100;
    String name = "Xerath";
    String classe = " Mago ";

    public void mostrarCriatura05(){
        System.out.println("Classe:" + this.classe + "Nome: " + this.name + " // " + " Ataque: " + this.ataqueI + " Defesa: " + this.defesaI + " Energia: " + this.energia);
    }
}
