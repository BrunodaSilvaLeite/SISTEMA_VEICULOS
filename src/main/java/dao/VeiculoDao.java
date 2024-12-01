package dao;

import model.Veiculo;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

// Classe responsável por realizar operações de banco de dados relacionadas à entidade Veiculo
public class VeiculoDao {

    // Gerenciador de entidades que será usado para interagir com o banco de dados
    private EntityManager entityManager;

    // Construtor que recebe o EntityManager como dependência
    // Isso facilita a injeção de dependências e torna o código mais testável
    public VeiculoDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    // Método para salvar um objeto do tipo Veiculo no banco de dados
    public void salvar(Veiculo veiculo) {
        // Obtém a transação associada ao EntityManager
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            // Inicia a transação
            transaction.begin();

            // Persiste o objeto veiculo no banco de dados
            // Isso faz com que o Hibernate/ORM insira o registro na tabela correspondente
            entityManager.persist(veiculo);

            // Confirma (commita) a transação para salvar as alterações no banco
            transaction.commit();
        } catch (Exception e) {
            // Em caso de erro, verifica se a transação ainda está ativa
            if (transaction.isActive()) {
                // Reverte a transação para evitar dados inconsistentes no banco
                transaction.rollback();
            }
            // Lança uma exceção personalizada com a mensagem de erro
            // Inclui a causa original para facilitar o rastreamento
            throw new RuntimeException("Erro ao salvar o veículo: " + e.getMessage(), e);
        }
    }
}

