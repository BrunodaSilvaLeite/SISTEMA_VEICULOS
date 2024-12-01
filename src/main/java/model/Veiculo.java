package model;
import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Veiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String modelo;
    private int anoFabricacao;
    private String cor;
    // Construtor Veiculo
    public Veiculo(String modelo, int anoFabricacao, String cor) {
        setModelo(modelo); // Usa o parâmetro corretamente
        setAnoFabricacao(anoFabricacao); // Usa o parâmetro corretamente
        setCor(cor); // Usa o parâmetro corretamente
    }

    // Get do metodo modelo
    public String getModelo() {
        return modelo;
    }

    // Setar e validar se o valor de modelo é null
    public void setModelo(String modelo) {
        if (modelo == null || modelo.trim().isEmpty()) {
            throw new IllegalArgumentException("Modelo não pode estar vazio.");
        }
        this.modelo = modelo;
    }

    // Get ano de fabricação
    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    // Setar e validar se o valor de ano é null
    public void setAnoFabricacao(int anoFabricacao) {
        if (anoFabricacao < 0 ) {
            throw new IllegalArgumentException("Ano de fabricação não pode estar vazio.");
        }
        this.anoFabricacao = anoFabricacao;
    }
    // Get cor
    public String getCor() {
        return cor;
    }
    // Setar e validar se o valor da cor é null
    public void setCor(String cor) {
        if (cor == null || cor.trim().isEmpty()) {
            throw new IllegalArgumentException("Cor é obrigatória.");
        }
        this.cor = cor;
    }
    // Método para gerar o comando INSERT

    public String getInsert() {

        return String.format(
                "INSERT INTO Veiculo (modelo, anoFabricacao) VALUES ('%s', '%s');",
                modelo,
                anoFabricacao,
                cor
        );
    }
}