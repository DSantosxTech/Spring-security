
# Spring Security Example

Este é um projeto de exemplo que demonstra a integração do Spring Security em uma aplicação Spring Boot. Ele inclui configurações básicas para autenticação OAuth2 e permissões de acesso.

## Pré-requisitos

Certifique-se de ter instalado em sua máquina:

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Maven](https://maven.apache.org/download.cgi)

## Como Executar

1. Clone o repositório:

    ```bash
    git clone https://github.com/seu-usuario/spring-security-example.git
    ```

2. Navegue até o diretório do projeto:

    ```bash
    cd spring-security-example
    ```

3. Execute a aplicação usando Maven:

    ```bash
    mvn spring-boot:run
    ```

4. Abra o navegador e acesse [http://localhost:8080](http://localhost:8080).

## Configurações

As principais configurações podem ser encontradas no arquivo `SecurityConfig.java`. Este arquivo contém a configuração de autorização, autenticação e logout.

## Rotas

- **/public**: Rota pública acessível a todos.
- **/private**: Rota privada que requer autenticação.

