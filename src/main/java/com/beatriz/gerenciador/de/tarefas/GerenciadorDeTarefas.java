package com.beatriz.gerenciador.de.tarefas;

import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorDeTarefas {

    public static void main(String[] args) {
        int opcao = 999;
        ArrayList<String> lista = new ArrayList<>();

        while (opcao != 0) {
            Scanner scanner = new Scanner(System.in);
            lista.forEach((tarefa) -> {
                System.out.println(lista.indexOf(tarefa) + 1 + " " + tarefa);
            });
            System.out.println("");
            System.out.println("Escolha uma opcao:");
            System.out.println("0- sair ; 1- cadastrar ; 2- excluir");
            System.out.print("opcao ");
            try {
                opcao = scanner.nextInt();
            } catch (Exception e) {
                opcao = 999;
                System.out.println("Entrada nao permitida");
            }
            scanner = new Scanner(System.in);

            switch (opcao) {
                case 0 ->
                    System.out.println("Escolheu sair");
                case 1 -> {
                    System.out.print("Digite a tarefa: ");
                    String tarefa = scanner.nextLine();
                    lista.add(tarefa);
                }
                case 2 -> {
                    if (lista.isEmpty()) {
                        System.out.println("\nA lista esta vazia!");
                    } else {
                        System.out.print("Digite o numero da tarefa: ");
                        try {
                            int remover = scanner.nextInt() - 1;
                            if (remover < 0 || remover >= lista.size()) {
                                System.out.println("Tarefa nao existente");
                            } else {
                                lista.remove(remover);
                            }
                        } catch (Exception e) {
                            System.out.println("Entrada nao permitida");
                        }
                    }
                }
                default ->
                    System.out.println("opcao nao encontrada");
            }
        }
    }
}
