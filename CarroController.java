package Program;

import java.util.ArrayList;
import java.util.List;

public class CarroController {

    private static List<Carro> carros;
    private static Carro carroView;

    public CarroController() {
        this.carros = new ArrayList<>();
        CarroController.carroView = new Carro();
    }

    public static void iniciar() {
        boolean sair = false;

        while (!sair) {
            int opcao = carroView.exibirMenu();

            switch (opcao) {
                case 1:
                    adicionarCarro();
                    break;
                case 2:
                    listarCarros();
                    break;
                case 3:
                    buscarCarroPorModelo();
                    break;
                case 4:
                    sair = true;
                    break;
                default:
                    carroView.mostrarMensagem("Opção inválida!");
                    break;
            }
        }
    }

    private static void adicionarCarro() {
        Carro novoCarro = carroView.obterDetalhesCarro();
        carros.add(novoCarro);
        carroView.mostrarMensagem("Carro adicionado com sucesso!");
    }

    private static void listarCarros() {
        carroView.mostrarCarros(carros);
    }

    private static void buscarCarroPorModelo() {
        String modelo = carroView.obterModeloCarro();
        List<Carro> carrosEncontrados = new ArrayList<>();

        for (Carro carro : carros) {
            if (carro.getModelo().equalsIgnoreCase(modelo)) {
                carrosEncontrados.add(carro);
            }
        }

        carroView.mostrarCarros(carrosEncontrados);
    }
}
