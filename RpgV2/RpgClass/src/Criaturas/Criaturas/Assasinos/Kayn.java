package Criaturas.Criaturas.Assasinos;

import Criaturas.FabricaDeCriaturas.*;

public class Kayn implements Criatura03 {
    int ataqueI;
    int defesaI;
    int energia = 100;
    String name = "Kayn";
    String classe = " Assassino ";

    public void mostrarCriatura03(){
        System.out.println("Classe:" + this.classe + "Nome: " + this.name + " // " + " Ataque: " + this.ataqueI + " Defesa: " + this.defesaI + " Energia: " + this.energia);
    }
}