package Criaturas.Criaturas.Magos;

import Criaturas.FabricaDeCriaturas.Criatura01;

public class Ahri implements Criatura01 {
    int ataqueI;
    int defesaI;
    int energia = 100;
    String name = "Ahri";
    String classe = " Mago ";

    public void mostrarCriatura01(){
        System.out.println("Classe:" + this.classe + "Nome: " + this.name + " // " + " Ataque: " + this.ataqueI + " Defesa: " + this.defesaI + " Energia: " + this.energia);
    }
}

