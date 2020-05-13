package Criaturas.Criaturas.Lutadores;

import Criaturas.FabricaDeCriaturas.Criatura04;

public class Riven implements Criatura04 {
    int ataqueI;
    int defesaI;
    int energia = 100;
    String name = "Riven";
    String classe = " Lutador ";

    public void mostrarCriatura04(){
        System.out.println("Classe:" + this.classe + "Nome: " + this.name + " // " + " Ataque: " + this.ataqueI + " Defesa: " + this.defesaI + " Energia: " + this.energia);
    }
}
