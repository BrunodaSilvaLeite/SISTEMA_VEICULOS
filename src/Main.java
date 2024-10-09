public class Main {
    public static void main(String[] args) {
        try {
            // Testando a classe Automovel
            Automovel automovel = new Automovel("Fusca", 1980, "Azul", "Volkswagen", 150, 4,"ABS", true
            );
            System.out.println(automovel.toInsert());

            // Testando a classe Motocicleta
            Motocicleta motocicleta = new Motocicleta("CB500", 2022, "Honda", "Preta", 45000, 5000, 45);
            System.out.println(motocicleta.toInsert());

            // Testando a classe Bicicleta
            Bicicleta bicicleta = new Bicicleta("Mountain", 2021, "Caloi", "Verde", "Alumínio", 3, true
            );
            System.out.println(bicicleta.toInsert());

            // Testando a classe skate
            Skate skate = new Skate("Street", 2019, "Element", "Preto", "PU");
            System.out.println(skate.toInsert());

            // Testando a classe Caminhão
            Caminhao caminhao = new Caminhao("Scania", 2020, "Scania", "Branco", "Scania", 20000, 3, 15000
            );
            System.out.println(caminhao.toInsert());
        } catch (IllegalArgumentException e) {
            System.err.println("Erro ao criar objeto: " + e.getMessage());
        }
    }
}
