package Program;

import java.util.List;
import java.util.Scanner;
public class View {


	    public int exibirMenu() {
	        System.out.println("1 - Adicionar Carro");
	        System.out.println("2 - Listar Carros");
	        System.out.println("3 - Buscar Carro por Modelo");
	        System.out.println("4 - Sair");
	        System.out.print("Escolha uma opção: ");
	        Scanner scanner = null;
			return scanner.nextInt();
	    }

	    public Carro obterDetalhesCarro() {
	        System.out.print("Digite o modelo do carro: ");
	        Scanner scanner = null;
			String modelo = scanner.next();
	        System.out.print("Digite a marca do carro: ");
	        String marca = scanner.next();
	        System.out.print("Digite o ano do carro: ");
	        int ano = scanner.nextInt();
	        return  Carro();
	    }

	    private Carro Carro() {
			// TODO Auto-generated method stub
			return null;
		}

		public void mostrarCarros(List<Carro> carros) {
	        if (carros.isEmpty()) {
	            System.out.println("Nenhum carro cadastrado.");
	        } else {
	            System.out.println("Lista de Carros:");
	            for (Carro carro : carros) {
	                System.out.println(carro);
	            }
	        }
	    }

	    public String obterModeloCarro() {
	        System.out.print("Digite o modelo do carro: ");
	        Scanner scanner = null;
			return scanner.next();
	    }

	    public void mostrarMensagem(String mensagem) {
	        System.out.println(mensagem);
	    }
	}

