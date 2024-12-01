package Main;

import dao.VeiculoDao;
import model.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("veiculosPU");
        EntityManager entityManager = emf.createEntityManager();

        VeiculoDao veiculoDao = new VeiculoDao(entityManager);

        // Criando o objeto Automóvel (exemplo de carro de passeio)
        Automovel automovel = new Automovel(
                "Fusca",             // Modelo do veículo
                1975,                // Ano de fabricação
                "Azul",              // Cor do veículo
                "Volkswagen",        // Fabricante (montadora)
                120000,              // Quilometragem
                5,                   // Máximo de passageiros
                "ABS",               // Tipo de freio
                true                 // Possui airbag
        );

        // Criando o objeto Caminhão (exemplo de veículo pesado)
        Caminhao caminhao = new Caminhao(
                "MAN TGX",            // Modelo do caminhão
                2019,                 // Ano de fabricação
                "Laranja",            // Cor do caminhão
                "MAN",                // Fabricante (montadora)
                450000,               // Quilometragem
                2,                    // Máximo de passageiros
                4                     // Quantidade de eixos
        );

        // Criando o objeto Motocicleta (exemplo de moto)
        Motocicleta motocicleta = new Motocicleta(
                "CG 160 Titan",       // Modelo da motocicleta
                2022,                 // Ano de fabricação
                "Preto",              // Cor da motocicleta
                "Honda",              // Fabricante (montadora)
                1000,                 // Quilometragem
                162,                  // Cilindrada
                14                    // Torque em Nm
        );

        // Salvando os veículos no banco de dados
        veiculoDao.salvar(automovel);
        veiculoDao.salvar(caminhao);
        veiculoDao.salvar(motocicleta);
        System.out.println("Veículos motorizados salvos com sucesso!");

        // Criando o objeto Bicicleta (exemplo de veículo não motorizado)
        Bicicleta bicicleta = new Bicicleta(
                "Caloi Elite Carbon", // Modelo da bicicleta
                2021,                 // Ano de fabricação
                "Caloi",              // Fabricante
                "Vermelho",           // Cor da bicicleta
                "Qualquer",            // Material do quadro
                1,                    // Capacidade máxima de passageiros
                true   // Tipo de freio
        );

        // Criando o objeto Skate (exemplo de veículo recreativo)
        Skate skate = new Skate(
                "Tony Hawk Pro",      // Modelo do skate
                2023,                 // Ano de fabricação
                "Element",            // Fabricante
                "Preto",              // Cor do skate
                "Fibra de Vidro"      // Material da prancha
        );

        // Salvando os veículos não motorizados no banco de dados
        veiculoDao.salvar(bicicleta);
        veiculoDao.salvar(skate);
        System.out.println("Veículos não motorizados salvos com sucesso!");

    }
}
