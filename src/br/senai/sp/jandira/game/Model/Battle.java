package br.senai.sp.jandira.game.Model;

import java.util.Scanner;

public class Battle {

    /** Declarar Variaveis */
    String scenarioBattle;

    /** Instancia Scanner */
    Scanner teclado = new Scanner(System.in);

    /** Instancia Scenario */
    Scenario scenario = new Scenario();

    public void Battle(Player player, Enemy enemy){

        while (true){

        int lifePlayer = player.getLife();
        int lifeEnemy = enemy.getLife();

        if (lifeEnemy == 0){
            System.out.println("O Player" + player.nome + " é o Vencedor !!!");
            break;
        } else if (lifePlayer == 0){
            System.out.println("O Enemy " + enemy.nome + "é o Vencedor !!!");
            break;
        }


        System.out.println("------------ BATTLE --------------");
        System.out.println(" Ataque Player [ C ] " + player.nome + " life: " + lifePlayer);
        System.out.println(" Ataque Enemy [ X ] " + enemy.nome + " life: " + lifeEnemy );
        System.out.println("----------------------------------");

        String attack = teclado.next();

        if (attack.equalsIgnoreCase("C")) {

            System.out.println("--------------------------");
            System.out.println("-     PLAYER ATACOU      -");
            System.out.println("--------------------------");

            int danoPlayer = (int) (Math.random() * 20) + 1;
            int defesaEnemy = (int) (Math.random() * 20) + 1;

            int danoReal = danoPlayer - defesaEnemy;

            if (danoReal < 0){
                danoReal = 0;
            }

            enemy.subTrairVida(danoPlayer);

            System.out.println("---------------------------------");
            System.out.println(" O Ataque foi de: " + danoPlayer);
            System.out.println("---------------------------------");
            System.out.println(" A Defesa foi de: " + defesaEnemy);



        } else if (attack.equalsIgnoreCase("X")) {

            System.out.println("-------------------------------");
            System.out.println("-          ENEMY ATACOU       -");
            System.out.println("-------------------------------");

            int danoEnemy = (int) (Math.random() * 20) + 1;
            int defesaEnemy = (int) (Math.random() * 20) + 1;

            int danoReal = danoEnemy - defesaEnemy;

            if (danoReal < 0){
                danoReal = 0;
            }
            player.subTrairVida(danoEnemy);

            System.out.println("---------------------------------");
            System.out.println(" O Ataque foi de: " + danoEnemy);
            System.out.println("---------------------------------");


        } else {
            System.out.println("TECLA INVALIDA!!!!");
        }
        }


    }


    public void ChoiceScenario (){
        System.out.println("--------------------------------------------------------------");
        System.out.println("Escolha um cenario:   [1- Torre Eiffel  2- Arabia 3-Turquia]: ");
        System.out.println("[1- Torre Eiffel  2- Arabia 3-Turquia - Default: Senai Jandira]");
        System.out.println("--------------------------------------------------------------");

        int choiceScenario = teclado.nextInt();

        scenarioBattle = scenario.Scenario(choiceScenario);

        System.out.println(scenarioBattle);

    }

}





