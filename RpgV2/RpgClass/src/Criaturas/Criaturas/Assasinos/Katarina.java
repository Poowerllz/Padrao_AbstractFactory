package Criaturas.Criaturas.Assasinos;

import Criaturas.FabricaDeCriaturas.*;

public class Katarina implements Criatura02 {
    int ataqueI;
    int defesaI;
    int energia = 100;
    String name = "Katarina";
    String classe = " Assassino ";

    public void mostrarCriatura02(){
        System.out.println("Classe:" + this.classe + "Nome: " + this.name + " // " + " Ataque: " + this.ataqueI + " Defesa: " + this.defesaI + " Energia: " + this.energia);
    }
}