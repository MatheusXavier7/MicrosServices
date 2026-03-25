# 🚀 Microsservices

## 📌 Sobre o projeto

Este projeto foi desenvolvido com o objetivo de **entender na prática o funcionamento de uma arquitetura baseada em microsserviços**.

A aplicação simula um fluxo simples de pedidos, onde os dados são enviados para uma fila e processados de forma assíncrona, permitindo observar conceitos fundamentais como desacoplamento, comunicação entre serviços e mensageria.

---

## 🧠 Conceitos explorados

- Arquitetura de microsserviços  
- Comunicação assíncrona  
- Mensageria com RabbitMQ  
- Serialização de objetos (JSON)  
- Integração entre serviços independentes  
- Separação de responsabilidades  

---

## ⚙️ Tecnologias utilizadas

- Java  
- Spring Boot  
- Spring AMQP  
- RabbitMQ  
- MySQL  

---

## 🔄 Funcionamento

O fluxo da aplicação funciona da seguinte forma:

1. Um pedido é criado via API (`/pedido`)  
2. O serviço de pedidos envia a mensagem para uma fila no RabbitMQ  
3. O microsserviço de processamento consome essa mensagem  
4. O pedido é processado de forma assíncrona  

> 💡 Isso permite que os serviços funcionem de forma independente e escalável.

---

## 🏗️ Estrutura do projeto

- **microsservices** → Serviço responsável por criar pedidos  
- **processamento** → Serviço responsável por consumir e processar pedidos  
