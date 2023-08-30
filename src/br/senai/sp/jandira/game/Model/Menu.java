package br.senai.sp.jandira.game.Model;

import java.util.Scanner;

public class Menu {
    public void Menu(){

        Scanner teclado = new Scanner(System.in);
        Register register = new Register();
        Battle battle = new Battle();

        boolean exit = false;

        while (!exit){
            System.out.println("--------------------------------");
            System.out.println("----------  BEM VINDO  ---------");
            System.out.println("Escolha uma das Opções: ");
            System.out.println("1 - REGISTER");
            System.out.println("2 - BATTLE");
            System.out.println("3 - EXIT");
            System.out.println("--------------------------------");
            System.out.println("--------------------------------");

            int userOption = teclado.nextInt();

            switch (userOption){

                case 1:
                    register.Decision();
                    break;

                case 2:
                    battle.ChoiceScenario();
                    battle.Battle(register.player, register.enemy);
                    System.out.println("Feature in Development");
                    break;

                case 3:
                    exit = true;
                    break;
            }
        }
    }

}
