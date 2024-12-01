package model;
import javax.persistence.Entity;

@Entity
public class Caminhao extends AutoMotor {
    private int quantidadeEixos;
    private double pesoBruto;
    // Construtor Caminhão
    public Caminhao(String modelo, int anoFabricacao, String cor, String montadora, double kilometragem, int quantidadeEixos, double pesoBruto) {
        super(modelo, anoFabricacao, cor, montadora, kilometragem);
        setQuantidadeEixos(quantidadeEixos);
        setPesoBruto(pesoBruto);
    }
    // Get metodo QuantidadeEixos
    public int getQuantidadeEixos() {
        return quantidadeEixos;
    }

    // Setar e validar se o valor do QuantidadeEixos é null
    public void setQuantidadeEixos(int quantidadeEixos) {
        if (quantidadeEixos <= 0) {
            throw new IllegalArgumentException("Quantidade de eixos deve ser maior que zero.");
        }
        this.quantidadeEixos = quantidadeEixos;
    }
    // Get metodo PesoBruto
    public double getPesoBruto() {
        return pesoBruto;
    }

    // Setar e validar se o valor do PesoBruto é null
    public void setPesoBruto(double pesoBruto) {
        if (pesoBruto <= 0) {
            throw new IllegalArgumentException("Peso bruto deve ser maior que zero.");
        }
        this.pesoBruto = pesoBruto;
    }
    // Método para gerar o comando INSERT
    public String toInsert() {
        return String.format("INSERT INTO Caminhao (modelo, ano, cor, montadora, kilometragem, quantidadeEixos, pesoBruto) VALUES ('%s', %d, '%s', '%s', %.2f, %d, %.2f);",
                getModelo(), getAnoFabricacao(), getCor(), getMontadora(), getKilometragem(),
                quantidadeEixos, pesoBruto);
    }
}
