package Criaturas.Criaturas.Magos;

import Criaturas.FabricaDeCriaturas.Criatura03;

public class Malzahar implements Criatura03 {
    int ataqueI;
    int defesaI;
    int energia = 100;
    String name = "Malzahar";
    String classe = " Mago ";

    public void mostrarCriatura03(){
        System.out.println("Classe:" + this.classe + "Nome: " + this.name + " // " + " Ataque: " + this.ataqueI + " Defesa: " + this.defesaI + " Energia: " + this.energia);
    }
}
