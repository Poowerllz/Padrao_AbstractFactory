package Nucleo;

import Criaturas.FabricaDeClasse.FabricaAssasinos;
import Criaturas.FabricaDeClasse.FabricaLutadores;
import Criaturas.FabricaDeClasse.FabricaMagos;
import Criaturas.FabricaDeClasse.FabricaTanques;
import Criaturas.FabricaPrincipal.*;
import Criaturas.FabricaDeCriaturas.*;

public class MetodoTester {
    public static void main(String[] args) {
        FabricaPrincipal Assasino = new FabricaAssasinos();
        Criatura01 Kassadin = Assasino.mostrarCriatura01();
        Criatura02 Katarina = Assasino.mostrarCriatura02();
        Criatura03 Kayn = Assasino.mostrarCriatura03();
        Criatura04 KhaZix = Assasino.mostrarCriatura04();
        Criatura05 LeBlanc = Assasino.mostrarCriatura05();
        
        FabricaPrincipal Lutadores = new FabricaLutadores();
        Criatura01 Irelia = Lutadores.mostrarCriatura01();
        Criatura02 LeeSin = Lutadores.mostrarCriatura02();
        Criatura03 Renekton = Lutadores.mostrarCriatura03();
        Criatura04 Riven = Lutadores.mostrarCriatura04();
        Criatura05 Yasuo = Lutadores.mostrarCriatura05();

        FabricaPrincipal Magos = new FabricaMagos();
        Criatura01 Ahri = Magos.mostrarCriatura01();
        Criatura02 Azir = Magos.mostrarCriatura02();
        Criatura03 Malzahar = Magos.mostrarCriatura03();
        Criatura04 Swain = Magos.mostrarCriatura04();
        Criatura05 Xerath = Magos.mostrarCriatura05();

        FabricaPrincipal Tanques = new FabricaTanques();
        Criatura01 Amumu = Tanques.mostrarCriatura01();
        Criatura02 Chogath = Tanques.mostrarCriatura02();
        Criatura03 Darius = Tanques.mostrarCriatura03();
        Criatura04 Rammus = Tanques.mostrarCriatura04();
        Criatura05 Shen = Tanques.mostrarCriatura05();



        System.out.println(" ");

                    System.out.println(" ASSASINOS ");
        System.out.println("=========================");
        Kassadin.mostrarCriatura01();
        System.out.println("=========================");
        Katarina.mostrarCriatura02();
        System.out.println("=========================");
        Kayn.mostrarCriatura03();
        System.out.println("=========================");
        KhaZix.mostrarCriatura04();
        System.out.println("=========================");
        LeBlanc.mostrarCriatura05();
        System.out.println("=========================");
        
        System.out.println(" ");

        System.out.println(" LUTADORES ");
        System.out.println("=========================");
        Irelia.mostrarCriatura01();
        System.out.println("=========================");
        LeeSin.mostrarCriatura02();
        System.out.println("=========================");
        Renekton.mostrarCriatura03();
        System.out.println("=========================");
        Riven.mostrarCriatura04();
        System.out.println("=========================");
        Yasuo.mostrarCriatura05();
        System.out.println("=========================");

        System.out.println(" ");

        System.out.println(" Magos ");
        System.out.println("=========================");
        Ahri.mostrarCriatura01();
        System.out.println("=========================");
        Azir.mostrarCriatura02();
        System.out.println("=========================");
        Malzahar.mostrarCriatura03();
        System.out.println("=========================");
        Swain.mostrarCriatura04();
        System.out.println("=========================");
        Xerath.mostrarCriatura05();
        System.out.println("=========================");

        System.out.println(" ");

        System.out.println(" Tanques ");
        System.out.println("=========================");
        Amumu.mostrarCriatura01();
        System.out.println("=========================");
        Chogath.mostrarCriatura02();
        System.out.println("=========================");
        Darius.mostrarCriatura03();
        System.out.println("=========================");
        Rammus.mostrarCriatura04();
        System.out.println("=========================");
        Shen.mostrarCriatura05();
        System.out.println("=========================");

    }
}