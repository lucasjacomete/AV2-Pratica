package br.com.Pergunta1;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        String nomeUsuario, dataNascimento, senha;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira o nome do usuário:");
        nomeUsuario = entrada.nextLine();
        System.out.println("Insira sua data de nascimento:");
        dataNascimento = entrada.nextLine();
        System.out.println("Insira sua senha:");
        senha = entrada.nextLine();
    
        RedeSocial redeSocial = new RedeSocial(nomeUsuario, dataNascimento, senha);
    
        System.out.println("Digite o texto para primeira publicação:");
        String textoPublicacao = entrada.nextLine();
        System.out.println("Link da mídia:");
        String link = entrada.nextLine();
        Publicacao publicacao = new Publicacao(textoPublicacao, link);
    
        redeSocial.inserePublicacao(publicacao);
    
        int opcao = 0;
        do {
          System.out.println("Deseja inserir outra publicação? digite 1 para Sim e 2 para não: ");
          opcao = entrada.nextInt();
    
          switch (opcao) {
            case 1:
              entrada = new Scanner(System.in);
              System.out.println("Digite um texto para publicação:");
              textoPublicacao = entrada.nextLine();
              System.out.println("Link da mídia:");
              link = entrada.nextLine();
              publicacao = new Publicacao(textoPublicacao, link);
              redeSocial.inserePublicacao(publicacao);
              break;
            case 2:
              opcao = 2;
              break;
            default:
              opcao = 2;
              break;
          }
        } while (opcao != 2);
    
        redeSocial.imprimePublicacoes();
      }
    
    }