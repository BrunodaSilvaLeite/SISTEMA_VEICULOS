public class Automovel extends AutoMotor {
    private int maxPassageiros;
    private String tipoFreio;
    private boolean airbag;

    //Construtor Automovel
    public Automovel(String modelo, int anoFabricacao, String cor, String montadora, double kilometragem, int maxPassageiros, String tipoFreio, boolean airbag) {
        super(modelo, anoFabricacao, cor, montadora, montadora, kilometragem);
        setMaxPassageiros(maxPassageiros);
        setTipoFreio(tipoFreio);
        this.airbag = airbag;
    }

    //get max passageiros
    public int getMaxPassageiros() {
        return maxPassageiros;
    }
    // Setar e validar se o valor de setMaxPassageiros é null
    public void setMaxPassageiros(int maxPassageiros) {
        if (maxPassageiros <= 0) {
            throw new IllegalArgumentException("Quantidade máxima de passageiros deve ser maior que zero.");
        }
        this.maxPassageiros = maxPassageiros;
    }

    //get max getTipoFreio
    public String getTipoFreio() {
        return tipoFreio;
    }
    // Setar e validar se o valor de setTipoFreio é null
    public void setTipoFreio(String tipoFreio) {
        if (tipoFreio == null || tipoFreio.trim().isEmpty()) {
            throw new IllegalArgumentException("Tipo de freio é obrigatório.");
        }
        this.tipoFreio = tipoFreio;
    }
    //get hasAirbag
    public boolean hasAirbag() {
        return airbag;
    }
    //set hasAirbag
    public void setAirbag(boolean airbag) {
        this.airbag = airbag;
    }

    public String toInsert() {
        return String.format("INSERT INTO Automovel (modelo, ano, cor, montadora, kilometragem, maxPassageiros, tipoFreio, airbag) VALUES ('%s', %d, '%s', '%s', %.2f, %d, '%s', %b);",
                getModelo(), getAnoFabricacao(), getCor(), getMontadora(), getKilometragem(),
                maxPassageiros, tipoFreio, airbag);
    }
}
