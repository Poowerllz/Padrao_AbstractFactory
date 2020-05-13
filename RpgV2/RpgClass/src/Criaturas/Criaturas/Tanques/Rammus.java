package Criaturas.Criaturas.Tanques;

import Criaturas.FabricaDeCriaturas.Criatura04;

public class Rammus implements Criatura04 {
    int ataqueI;
    int defesaI;
    int energia = 100;
    String name = "Rammus";
    String classe = " Tanque ";

    public void mostrarCriatura04(){
        System.out.println("Classe:" + this.classe + "Nome: " + this.name + " // " + " Ataque: " + this.ataqueI + " Defesa: " + this.defesaI + " Energia: " + this.energia);
    }
}
