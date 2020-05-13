package Criaturas.Criaturas.Tanques;

import Criaturas.FabricaDeCriaturas.Criatura01;

public class Amumu implements Criatura01 {
    int ataqueI;
    int defesaI;
    int energia = 100;
    String name = "Amumu";
    String classe = " Tanque ";

    public void mostrarCriatura01(){
        System.out.println("Classe:" + this.classe + "Nome: " + this.name + " // " + " Ataque: " + this.ataqueI + " Defesa: " + this.defesaI + " Energia: " + this.energia);
    }
}
