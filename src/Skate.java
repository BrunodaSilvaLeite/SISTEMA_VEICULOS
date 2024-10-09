public class Skate extends VeiculoComum {
    private String tipoRodas;
    // Construtor Skate
    public Skate(String modelo, int anoFabricacao, String marca, String cor,
                 String tipoRodas) {
        super(modelo, anoFabricacao, marca, cor);
        setTipoRodas(tipoRodas);
    }
    // Get metodo TipoRodas
    public String getTipoRodas() {
        return tipoRodas;
    }

    // Setar e validar se o valor do TipoRodas é null
    public void setTipoRodas(String tipoRodas) {
        if (tipoRodas == null || tipoRodas.trim().isEmpty()) {
            throw new IllegalArgumentException("Tipo de rodas é obrigatório.");
        }
        this.tipoRodas = tipoRodas;
    }
    // Override do método getInsert
    @Override
    // Método para gerar o comando INSERT
    public String toInsert() {
        return String.format("INSERT INTO Skate (modelo, ano, marca, cor, tipoRodas) VALUES ('%s', %d, '%s', '%s', '%s');",
                getModelo(), getAnoFabricacao(), getMarca(), getCor(), tipoRodas);
    }
}
