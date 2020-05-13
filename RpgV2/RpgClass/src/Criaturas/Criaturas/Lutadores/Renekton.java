package Criaturas.Criaturas.Lutadores;

import Criaturas.FabricaDeCriaturas.Criatura03;

public class Renekton implements Criatura03 {
    int ataqueI;
    int defesaI;
    int energia = 100;
    String name = "Renekton";
    String classe = " Lutador ";

    public void mostrarCriatura03(){
        System.out.println("Classe:" + this.classe + "Nome: " + this.name + " // " + " Ataque: " + this.ataqueI + " Defesa: " + this.defesaI + " Energia: " + this.energia);
    }

}
