package Criaturas.Criaturas.Tanques;

import Criaturas.FabricaDeCriaturas.Criatura02;

public class Chogath implements Criatura02{
    int ataqueI;
    int defesaI;
    int energia = 100;
    String name = "Cho Gath";
    String classe = " Tanque ";

    public void mostrarCriatura02(){
        System.out.println("Classe:" + this.classe + "Nome: " + this.name + " // " + " Ataque: " + this.ataqueI + " Defesa: " + this.defesaI + " Energia: " + this.energia);
    }
}
