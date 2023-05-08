package view;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import Controller.Musica;
import Controller.Player;

public class Main {

	public static void main(String[] args) {
		    	
		        List<Musica> lista = new LinkedList<>();
		        Player player = new Player ();
		        Scanner sc = new Scanner(System.in);

		        while (true) {
		           

		            int opcao = Integer.parseInt(JOptionPane.showInputDialog("1- Adicionar Música \n 2- Remover Música \n 3- Executar Playlist \n 4- Sair"));

		            switch (opcao) {
		                case 1:
		                    
		                    String nome = JOptionPane.showInputDialog("Digite o nome da música:"); 
		                    String nomeArtista =JOptionPane.showInputDialog("Digite o nome do artista:");
		                    int duracao = Integer.parseInt(JOptionPane.showInputDialog("Digite a duração da música (em segundos):"));
		                    

		                    String novaMusica = nome + ";" + nomeArtista + ";" + duracao;
		                    player.adicionaMusica(lista, novaMusica);
		                    break;
		                case 2:
		                	int posicao =Integer.parseInt(JOptionPane.showInputDialog("Digite a posição da música a ser removida: (posicão começa em 0)"));
		                    player.removeMusica(lista, posicao);
		                    break;
		                case 3:
		                    player.executaPlaylist(lista);
		                    break;
		                case 4:
		                	System.out.println("Playlist finalizada!");
		                    sc.close();
		                    System.exit(0);
		                default:
		                    System.out.println("Opção inválida");
		                    break;
		            }
		        }
		}
		
}
