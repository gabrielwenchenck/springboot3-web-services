# Spring Boot Web Services

# Sobre o projeto

Este projeto é um sistema de gerenciamento de e-commerce desenvolvido com Spring Boot. O sistema é projetado para gerenciar produtos, categorias, itens de pedido, pedidos, usuários e pagamentos.


## Modelo de domínio
![image](https://github.com/gabrielwenchenck/springboot3-web-services/assets/104534121/d3807073-4e77-4c8f-a9fd-5b81c0840624)

### Product
- Representa os produtos disponíveis para venda no e-commerce. Cada produto tem atributos como nome, descrição, preço e quantidade em estoque.

### Category
- Representa as diferentes categorias nas quais os produtos podem ser classificados.

### OrderItem
- Representa um item individual em um pedido. Cada OrderItem está associado a um Product e a um Order.

### Order
- Representa um pedido feito por um usuário. Cada pedido pode ter vários itens (OrderItem) e está associado a um User e a um Payment.

### User
- Representa os usuários do sistema. Cada usuário pode fazer vários pedidos.

### Payment
- Representa o pagamento de um pedido. Cada pagamento está associado a um Order e tem um status que pode ser uma das várias opções representadas por uma enumeração.

# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- JPA / Hibernate
- Maven

## Implantação em produção
- Back end: Heroku
- Banco de dados: Postgresql

# Como executar o projeto

## Back end
Pré-requisitos: Java 17

```bash
# clonar repositório
git clone https://github.com/gabrielwenchenck/springboot3-web-services.git

# executar o projeto
./mvnw spring-boot:run
```


# Autor
Gabriel Inácio Wenchenck de Carvalho

