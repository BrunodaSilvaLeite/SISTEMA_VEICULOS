public class VeiculoComum extends Veiculo {
    private String marca;

    // Construtor VeiculoComum
    public VeiculoComum(String modelo, int anoFabricacao, String marca, String cor) {
        super(modelo, anoFabricacao, cor);
        setModelo(modelo);
        setMarca(marca);
        setAnoFabricacao(anoFabricacao);
        setCor(cor);

    }
    // Get metodo Marca
    public String getMarca() {
        return marca;
    }
    // Setar e validar se o valor da marca é null
    public void setMarca(String marca) {
        if (marca == null || marca.trim().isEmpty()) {
            throw new IllegalArgumentException("Marca é obrigatória.");
        }
        this.marca = marca;
    }
    // Método para gerar o comando INSERT
    public String toInsert() {
        return String.format("INSERT INTO VeiculoComum (modelo, ano, marca, cor) VALUES ('%s', %d, '%s', '%s')",
                getModelo(), getAnoFabricacao(), marca, getCor());
    }
}
