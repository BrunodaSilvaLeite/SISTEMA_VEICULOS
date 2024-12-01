package dao;

import model.Veiculo;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class VeiculoDao {
    private EntityManager entityManager;

    public VeiculoDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public  void salvar(Veiculo veiculo) {
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();
            entityManager.persist(veiculo);
            transaction.commit();
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback(); // Reverte a transação em caso de erro
            }
            throw new RuntimeException("Error ao salvar o veículo" + e.getMessage(), e);
        }

    }
}
