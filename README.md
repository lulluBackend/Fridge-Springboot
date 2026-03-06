# Fridge API

API REST desenvolvida em Java utilizando Spring Boot para gerenciar
alimentos armazenados em uma geladeira.

O projeto foi criado com o objetivo de praticar conceitos de
desenvolvimento backend, arquitetura em camadas e integração com banco
de dados relacional.

------------------------------------------------------------------------

## Tecnologias Utilizadas

-   Java
-   Spring Boot
-   Spring Web
-   Spring Data JPA
-   Hibernate
-   MySQL
-   Maven

------------------------------------------------------------------------

## Arquitetura do Projeto

O projeto segue uma arquitetura em camadas comum em aplicações Spring
Boot:

Controller → Service → Repository → Database

**Controller** Responsável por expor os endpoints da API.

**Service** Contém a lógica de negócio da aplicação.

**Repository** Responsável pela comunicação com o banco de dados
utilizando Spring Data JPA.

**Model (Entity)** Representa as tabelas do banco de dados.

------------------------------------------------------------------------

## Funcionalidades

A API permite:

-   Listar alimentos cadastrados
-   Adicionar novos alimentos
-   Remover alimentos pelo ID

------------------------------------------------------------------------

## Endpoints

### Listar alimentos

GET /food

Resposta:

\[ { "id": 1, "name": "Milk", "quantity": 2, "expirationDate":
"2026-03-10" }\]

------------------------------------------------------------------------

### Adicionar alimento

POST /food

Body JSON:

{ "name": "Cheese", "quantity": 1, "expirationDate": "2026-03-20" }

------------------------------------------------------------------------

### Remover alimento

DELETE /food/{id}

Exemplo:

DELETE /food/1

------------------------------------------------------------------------

## Configuração do Banco de Dados

O projeto utiliza MySQL.

As configurações estão em:

src/main/resources/application.properties

Exemplo:

spring.datasource.url=jdbc:mysql://localhost:3306/fridge_db
spring.datasource.username=root spring.datasource.password=1234

Também é possível utilizar variáveis de ambiente:

DB_URL DB_USER DB_PASSWORD

------------------------------------------------------------------------

## Como Rodar o Projeto

1.  Clonar o repositório

git clone `<repo-url>`{=html}

2.  Entrar na pasta do projeto

cd fridge-api

3.  Rodar o projeto

./mvnw spring-boot:run

ou executar a classe:

FridgeApplication

A aplicação iniciará em:

http://localhost:8080

------------------------------------------------------------------------

## Objetivo do Projeto

Este projeto foi desenvolvido como parte do processo de aprendizado em
desenvolvimento backend com Java e Spring Boot, focando em:

-   criação de APIs REST
-   integração com banco de dados
-   uso de JPA/Hibernate
-   organização de projeto em camadas

------------------------------------------------------------------------
