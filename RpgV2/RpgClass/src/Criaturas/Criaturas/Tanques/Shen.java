package Criaturas.Criaturas.Tanques;

import Criaturas.FabricaDeCriaturas.Criatura05;

public class Shen implements Criatura05 {
    int ataqueI;
    int defesaI;
    int energia = 100;
    String name = "Shen";
    String classe = " Tanque ";

    public void mostrarCriatura05(){
        System.out.println("Classe:" + this.classe + "Nome: " + this.name + " // " + " Ataque: " + this.ataqueI + " Defesa: " + this.defesaI + " Energia: " + this.energia);
    }
}
