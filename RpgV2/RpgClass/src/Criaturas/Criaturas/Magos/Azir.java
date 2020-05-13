package Criaturas.Criaturas.Magos;

import Criaturas.FabricaDeCriaturas.Criatura02;

public class Azir implements Criatura02 {
    int ataqueI;
    int defesaI;
    int energia = 100;
    String name = "Azir";
    String classe = " Mago ";

    public void mostrarCriatura02(){
        System.out.println("Classe:" + this.classe + "Nome: " + this.name + " // " + " Ataque: " + this.ataqueI + " Defesa: " + this.defesaI + " Energia: " + this.energia);
    }
}
