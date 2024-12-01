package model;

import javax.persistence.Entity;

@Entity
public class Bicicleta extends VeiculoComum {
    private String material;
    private int quantidadeMarchas;
    private boolean amortecedor;
    // Construtor Bicicleta
    public Bicicleta(String modelo, int anoFabricacao, String marca, String cor,
                     String material, int quantidadeMarchas, boolean amortecedor) {
        super(modelo, anoFabricacao, marca, cor);
        setMaterial(material);
        setQuantidadeMarchas(quantidadeMarchas);
        setAmortecedor(amortecedor);
    }

    // Get do metodo meterial
    public String getMaterial() {
        return material;
    }
    // Setar e validar se o valor do Material é null
    public void setMaterial(String material) {
        if (material == null || material.trim().isEmpty()) {
            throw new IllegalArgumentException("Material é obrigatório.");
        }
        this.material = material;
    }
    // Get do metodo QuantidadeMarchas
    public int getQuantidadeMarchas() {
        return quantidadeMarchas;
    }
    // Setar e validar se o valor da quantidadeMarchas é null
    public void setQuantidadeMarchas(int quantidadeMarchas) {
        if (quantidadeMarchas <= 0) {
            throw new IllegalArgumentException("Quantidade de marchas deve ser maior que zero.");
        }
        this.quantidadeMarchas = quantidadeMarchas;
    }
    // Get do metodo Amortecedor
    public boolean isAmortecedor() {
        return amortecedor;
    }
    // Setar o metodo Amortecedor
    public void setAmortecedor(boolean amortecedor) {
        this.amortecedor = amortecedor;
    }
    // Override do método getInsert
    @Override
    // Método para gerar o comando INSERT
    public String toInsert() {
        return String.format("INSERT INTO Bicicleta (modelo, ano, marca, cor, material, quantidadeMarchas, amortecedor) VALUES ('%s', %d, '%s', '%s', '%s', %d, %b);",
                getModelo(), getAnoFabricacao(), getMarca(), getCor(),
                material, quantidadeMarchas, amortecedor);
    }
}
