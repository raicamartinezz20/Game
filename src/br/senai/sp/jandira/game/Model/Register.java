package br.senai.sp.jandira.game.Model;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Register {

    int validaPrint = 0;

    /**
     * Instancia Scanner
     */
    Scanner teclado = new Scanner(System.in);

    /**
     * Instancia Player
     */
    Player player = new Player();

    /**
     * Instancia Enemy
     */
    Enemy enemy = new Enemy();

    /**
     *  Instancia Output
     */
    Output output = new Output();

    public void BothRegister() {
        validaPrint = 1;
        PlayerRegister();
        EnemyRegister();
        output.PrintPlayer(player);
        output.PrintEnemy(enemy);

    }

    public Player PlayerRegister() {

        /** Coleta dados do Player-1 */
        System.out.println("---------------- CADASTRO PLAYER ----------------");
        System.out.print("Seu nome: ");
        player.nome = teclado.next();
        System.out.println("Escolha seu skin (red - blue - pink) : ");
        player.skin = teclado.next();
        System.out.println("--------- PLAYER CADASTRADO COM SUCESSO ---------");

        if(validaPrint != 1) {
            /** Printa as Informações Cadastradas */
            output.PrintPlayer(player);
        }

        return player;

    }

    public Enemy EnemyRegister() {

        /** Coleta dados do Enemy-1 */
        System.out.println("---------------- CADASTRO ENEMY ----------------");
        System.out.print("Seu nome: ");
        enemy.nome = teclado.next();
        System.out.println("Escolha sua skin (red - blue - pink) : ");
        enemy.skin = teclado.next();
        System.out.println("--------- ENEMY CADASTRADO COM SUCESSO ---------");

        if (validaPrint != 1) {
            output.PrintEnemy(enemy);
        }

        return enemy;
    }

    public void Decision() {

        String decision;

        System.out.println("SEJA BEM VINDO !!!");
        System.out.println("Deseja Cadastrar [PLAYER - ENEMY - AMBOS]: ");
        decision = teclado.next();

        switch (decision.toLowerCase()) {

            case "player":
                PlayerRegister();
                break;

            case "enemy":
                EnemyRegister();
                break;

            case "ambos":
                BothRegister();
        }

        System.out.println("Deseja Retornar ao Cadastro [1- SIM  2- NÃO]: ");
        int continuar = teclado.nextInt();

        if(continuar==1){
            Decision();
        }

    }

}
