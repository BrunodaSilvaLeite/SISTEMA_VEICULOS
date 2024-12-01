# SISTEMA_VEICULOS

## 🚀 Começando

Este sistema processa dados de veículos de vários tipos, permitindo o armazenamento e gerenciamento de informações sobre automóveis, motocicletas, caminhões, bicicletas e skates. O sistema utiliza JPA (Java Persistence API) para interação com o banco de dados MySQL e Maven para gerenciamento de dependências.

### Estrutura do Sistema:

- **Automóveis**: Além dos atributos comuns (modelo, ano de fabricação, montadora, cor e kilometragem), os automóveis domésticos possuem atributos como a quantidade máxima de passageiros, tipo de freio e presença de airbag.
- **Motocicletas**: Atributos específicos como cilindrada e torque.
- **Caminhões**: Inclui quantidade de eixos e peso bruto.
- **Bicicletas**: Modelo, marca, cor, material, quantidade de marchas e presença de amortecedor.
- **Skates**: Modelo, marca, cor e tipo das rodas.

Todos os atributos são encapsulados e validados conforme necessário. Cada classe tem um construtor e um método que gera o comando `INSERT` para inserir dados em um banco de dados relacional.

### 📋 Pré-requisitos

- **Java**: Para desenvolvimento da aplicação.
- **IntelliJ IDEA**: IDE para desenvolvimento Java.
- **MySQL**: Banco de dados relacional para armazenamento dos dados.
- **Maven**: Para gerenciamento de dependências.

### 🔧 Instalação

1. Clone este repositório:

   ```bash
   git clone https://github.com/BrunodaSilvaLeite/SISTEMA_VEICULOS.git
Acesse o diretório do projeto:

bash
Copiar código
cd SISTEMA_VEICULOS
Configure o banco de dados MySQL:

Crie um banco de dados no MySQL com o nome sistema_veiculos.
Configure a conexão do JPA com o banco de dados no arquivo persistence.xml.
Compile o projeto com o Maven:

bash
Copiar código
mvn clean install
Execute o projeto na sua IDE (IntelliJ IDEA).

📌 Banco de Dados Relacional
O banco de dados é criado com base nas classes do sistema, onde cada classe representa uma tabela e os atributos representam as colunas da tabela.

Tabelas Criadas:
Automóvel
Motocicleta
Caminhão
Bicicleta
Skate
Cada classe possui um método que gera o comando INSERT para popular o banco de dados.

🛠️ Ferramentas e Tecnologias Utilizadas
JPA (Java Persistence API): Para persistência dos dados no banco de dados MySQL.
MySQL: Banco de dados relacional utilizado para armazenar os dados dos veículos.
Maven: Gerenciamento de dependências.
javax.persistence: Para a configuração do JPA.


📝 Como Testar
Crie objetos de veículos (Automóveis, Motocicletas, Caminhões, Bicicletas, Skates).
Chame o método salvar() para inserir os dados no banco de dados.
Verifique se as tabelas foram criadas no banco de dados.
Confira o console para ver as mensagens de sucesso ou erro

📸 Imagens
![image](https://github.com/user-attachments/assets/5d0778d8-d03b-4481-a725-0db24b3ce4bf)
![image](https://github.com/user-attachments/assets/b87bbb19-d369-4bc8-aba3-39ffdee14d26)
![image](https://github.com/user-attachments/assets/c512ac3d-44fb-430b-b74f-b1b962730d91)
![image](https://github.com/user-attachments/assets/a7c2822c-1110-472c-a0dd-95ae7ec1d7d5)
![image](https://github.com/user-attachments/assets/8acc9983-cc5f-480d-adb8-8bb1c233d754)
![image](https://github.com/user-attachments/assets/4413dd10-f47c-4c5c-9982-53a867a23daf)
![image](https://github.com/user-attachments/assets/1ba696aa-4633-472a-9d4d-5ffe7c42a620)
![image](https://github.com/user-attachments/assets/1d9fecdb-c426-4b53-b284-f7252a00fc9e)
![image](https://github.com/user-attachments/assets/95767b4e-e8cb-4bf9-b21a-96b3f654bd71)


✒️ Autores
Bruno - Atividade individual - Lista de Exercícios AC2 - HERANÇA 3/4

