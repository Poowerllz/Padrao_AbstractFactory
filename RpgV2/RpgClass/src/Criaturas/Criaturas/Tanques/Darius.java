package Criaturas.Criaturas.Tanques;

import Criaturas.FabricaDeCriaturas.Criatura03;

public class Darius implements Criatura03 {
    int ataqueI;
    int defesaI;
    int energia = 100;
    String name = "Darius";
    String classe = " Tanque ";

    public void mostrarCriatura03(){
        System.out.println("Classe:" + this.classe + "Nome: " + this.name + " // " + " Ataque: " + this.ataqueI + " Defesa: " + this.defesaI + " Energia: " + this.energia);
    }
}
