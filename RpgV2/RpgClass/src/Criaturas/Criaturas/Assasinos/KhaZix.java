package Criaturas.Criaturas.Assasinos;

import Criaturas.FabricaDeCriaturas.*;

public class KhaZix implements Criatura04 {
    int ataqueI;
    int defesaI;
    int energia = 100;
    String name = "Kha Zix";
    String classe = " Assassino ";

    public void mostrarCriatura04(){
        System.out.println("Classe:" + this.classe + "Nome: " + this.name + " // " + " Ataque: " + this.ataqueI + " Defesa: " + this.defesaI + " Energia: " + this.energia);
    }
}