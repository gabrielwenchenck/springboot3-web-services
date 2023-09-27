# Spring Boot Web Services
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/gabrielwenchenck/springboot3-web-services/blob/main/LICENSE) 

# Sobre o projeto

Este projeto é um serviço de gerenciamento de e-commerce desenvolvido com Spring Boot. O objetivo deste projeto foi treinar minhas habilidades de deploy, SQL e JPA/Hibernate, bem como compreender as decisões de design para um banco de dados relacional, por isso, os dados já estão semeados e só há a possibilidade de cadastrar/excluir/editar usuários, sendo as outras entidades fixas.

# Documentação

[![Postman](https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white)](https://documenter.getpostman.com/view/21578696/2s9YJXakbB)


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
- Back end: Railway
- Banco de dados: Postgresql

# Como executar o projeto

## Back end
Pré-requisitos: Java 17

## Para executar o projeto:
```bash
# clonar repositório
git clone https://github.com/gabrielwenchenck/springboot3-web-services.git

# executar o projeto
./mvnw spring-boot:run
```
**Importante:** Antes de executar o projeto localmente, alterar o perfil de produção para testes:

No arquivo ```application.properties```, que fica localizado no diretório /src/main/resources, alterar de

```spring.profiles.active=prod``` para ```spring.profiles.active=test```

# Autor
Gabriel Inácio Wenchenck de Carvalho

