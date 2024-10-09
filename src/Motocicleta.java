public class Motocicleta extends AutoMotor {
    private int cilindradas;
    private double torque;
    // Construtor Motocicleta
    public Motocicleta(String modelo, int anoFabricacao, String montadora, String cor, double kilometragem,
         int cilindradas, double torque) {
        super(modelo, anoFabricacao, montadora, cor, montadora, kilometragem);
        setCilindradas(cilindradas);
        setTorque(torque);
    }
    // Get metodo getCilindradas
    public int getCilindradas() {
        return cilindradas;
    }
    // Setar e validar se o valor de Cilindradas é null
    public void setCilindradas(int cilindradas) {
        if(cilindradas <= 0) {
            throw new IllegalArgumentException("Cilindradas devem ser positivas.");
        }
        this.cilindradas = cilindradas;
    }
    // Get metodo getTorque
    public double getTorque() {
        return torque;
    }
    // Setar e validar se o valor do torque é null
    public void setTorque(double torque) {
        if(torque < 0) {
            throw new IllegalArgumentException("Torque não pode ser negativo.");
        }
        this.torque = torque;
    }

    //insert no banco de dados
    public String toInsert() {
        return String.format(
                "INSERT INTO Motocicleta (modelo, anoFabricacao, montadora, cor, kilometragem, cilindrada, torque) VALUES ('%s', %d, '%s', '%s','%s','%s' %.2f);",
                getModelo(),
                getAnoFabricacao(),
                getMontadora(),
                getCor(),
                getKilometragem(),
                cilindradas,
                torque
        );
    }
}
