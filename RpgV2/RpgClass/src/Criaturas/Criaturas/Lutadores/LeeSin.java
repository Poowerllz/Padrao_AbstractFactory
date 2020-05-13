package Criaturas.Criaturas.Lutadores;

import Criaturas.FabricaDeCriaturas.Criatura02;

public class LeeSin implements Criatura02 {
    int ataqueI;
    int defesaI;
    int energia = 100;
    String name = "Lee sin";
    String classe = " Lutador ";

    public void mostrarCriatura02(){
        System.out.println("Classe:" + this.classe + "Nome: " + this.name + " // " + " Ataque: " + this.ataqueI + " Defesa: " + this.defesaI + " Energia: " + this.energia);
    }
}
