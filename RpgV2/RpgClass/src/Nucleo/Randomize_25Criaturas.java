package Nucleo;
import java.util.Random;

import Criaturas.FabricaDeClasse.FabricaAssasinos;
import Criaturas.FabricaDeClasse.FabricaLutadores;
import Criaturas.FabricaDeClasse.FabricaMagos;
import Criaturas.FabricaDeClasse.FabricaTanques;
import Criaturas.FabricaPrincipal.*;
import Criaturas.FabricaDeCriaturas.*;

public class Randomize_25Criaturas {
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
    
        // Variáveis de quantidade gerada //
        int qA = 0;
        int qL = 0;
        int qM = 0;
        int qT = 0;
        // Variáveis de quantidade gerada // 
        
        Random aleatorio = new Random();
        for(int a = 0; a <= 24; a++) {
            int b = aleatorio.nextInt(19);

        switch(b){
            case 0:
                Kassadin.mostrarCriatura01(); 
                qA = qA + 1;
            break;

            case 1:
                Katarina.mostrarCriatura02();
                qA = qA + 1;
            break;

            case 2:
                Kayn.mostrarCriatura03();
                qA = qA + 1;
            break;

            case 3:
                KhaZix.mostrarCriatura04();
                qA = qA + 1;
            break;

            case 4:
                LeBlanc.mostrarCriatura05();
                qA = qA + 1;
            break;

            case 5:
                Irelia.mostrarCriatura01();
                qL = qL + 1;
            break;

            case 6:
                LeeSin.mostrarCriatura02();
                qL = qL + 1;
            break;

            case 7:
                Renekton.mostrarCriatura03();
                qL = qL + 1;
            break;

            case 8:
                Riven.mostrarCriatura04();
                qL = qL + 1;
            break;
            
            case 9:
                Yasuo.mostrarCriatura05();
                qL = qL + 1;
            break;

            case 10:
                Ahri.mostrarCriatura01();
                qM = qM + 1;
            break;

            case 11:
                Azir.mostrarCriatura02();
                qM = qM + 1;
            break;

            case 12:
                Malzahar.mostrarCriatura03();
                qM = qM + 1;
            break;

            case 13:
                Swain.mostrarCriatura04();
                qM = qM + 1;
            break;

            case 14:
                Xerath.mostrarCriatura05();
                qM = qM + 1;
            break;

            case 15:
                Amumu.mostrarCriatura01();
                qT = qT + 1;
            break;

            case 16:
                Chogath.mostrarCriatura02();
                qT = qT + 1;
            break;

            case 17:
                Darius.mostrarCriatura03();
                qT = qT + 1;
            break;

            case 18:
                Rammus.mostrarCriatura04();
                qT = qT + 1;
            break;

            case 19:
                Shen.mostrarCriatura05();
                qT = qT + 1;
            break;
            
        }
      }
     int qAll = qA + qT + qM + qL;

     System.out.println("");
     System.out.println("Quantidade de monstros gerados: " + qAll);
     System.out.println("Assasinos: " + qA);
     System.out.println("Magos: " + qM);
     System.out.println("Tanques: " + qT);
     System.out.println("Lutadores: " + qL);

   }
}