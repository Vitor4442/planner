# Planner - API para Planejamento de Viagens

> Uma API RESTful desenvolvida em Spring Boot para facilitar o planejamento colaborativo de viagens. Permite criar viagens, registrar links úteis, adicionar atividades, convidar participantes e gerenciar todo o ciclo da viagem de forma simples e organizada.

![Spring Boot](https://img.shields.io/badge/Spring_Boot-4.0.1-6DB33F.svg?style=for-the-badge&logo=spring-boot)
![Java](https://img.shields.io/badge/Java-25-ED8B00.svg?style=for-the-badge&logo=openjdk)
![H2 Database](https://img.shields.io/badge/H2_Database-Embedded-blue.svg?style=for-the-badge&logo=h2)
![Status](https://img.shields.io/badge/status-EM%20DESENVOLVIMENTO-yellow.svg)

## 🚀 Funcionalidades Principais

- Criar viagem com destino, datas e proprietário
- Atualizar detalhes da viagem
- Confirmar a viagem (torna-la definitiva)
- Registrar links úteis relacionados à viagem
- Adicionar atividades
- Convidar participantes
- Confirmar presença como participante
- Recuperar todos os detalhes da viagem 

## 🛠️ Tecnologias Utilizadas

- **Java 25** (LTS)
- **Spring Boot 4.0.1**
- **Spring Data JPA (Hibernate)**
- **H2 Database** (banco em memória para desenvolvimento e testes)
- **Flyway** (migrações de banco de dados)
- **Spring Validation**
- **Lombok**
- **Maven**

## 📦 Pré-requisitos

- Java 25 ou superior
- Maven 3.8+
- Git

> Não é necessário instalar nenhum banco de dados externo, pois o projeto utiliza o H2 em modo embedded.

## ⚙️ Configuração e Execução

1. Clone o repositório
```bash
git clone https://github.com/SEU_USUARIO/PlanTrip.git
cd PlanTrip

./mvnw spring-boot:run
