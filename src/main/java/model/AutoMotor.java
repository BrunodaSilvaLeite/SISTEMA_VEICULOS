package model;

import javax.persistence.Entity;

@Entity
public class AutoMotor extends Veiculo {
    private String montadora;
    private double kilometragem;

    // Construtor AutoMotor
    public AutoMotor(String modelo, int anoFabricacao, String montadora, String cor, double kilometragem) {

        super(modelo, anoFabricacao, cor);
        setAnoFabricacao(anoFabricacao);
        setModelo(modelo);
        setCor(cor);
        setMontadora(montadora);
        setKilometragem(kilometragem);
    }

    // Get metodo montadora
    public String getMontadora() {
        return montadora;
    }

    // Setar e validar se o valor de montadora é null
    public void setMontadora(String montadora) {
        if (montadora == null || montadora.trim().isEmpty()) {
            throw new IllegalArgumentException("Montadora é obrigatória.");
        }
        this.montadora = montadora;
    }

    // Get do metodo kilometragem
    public double getKilometragem() {
        return kilometragem;
    }
    // Setar e validar se o valor da kilometragem é null
    public void setKilometragem(double kilometragem) {
        if (kilometragem < 0) {
            throw new IllegalArgumentException("Kilometragem não pode ser negativa.");
        }
        this.kilometragem = kilometragem;
    }

    // Override do método getInsert
    @Override
    //insert no banco de dados
    public String getInsert() {

        return String.format(
                "INSERT INTO Automotor (modelo, anoFabricacao, montadora, cor, kilometragem) VALUES ('%s', %d, '%s', '%s', %.2f);",
                getModelo().replace("'", "''"),
                getAnoFabricacao(),
                getCor(),
                montadora,
                kilometragem
        );
    }
}