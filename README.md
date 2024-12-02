# KirbyMania

Loja ficticia inspirada no universo do Kirby! Este repositório contém a aplicação da loja e a interface de administração para gerenciar produtos. Não possui sistema de autenticação.

A interface é construída utilizando **HTML, CSS e JavaScript**, com integração back-end usando **Thymeleaf** e **Spring Boot** para renderização dinâmica e gerenciamento de dados.

---

## 🚀 Funcionalidades

### Loja Online
- Exibição de produtos dinâmicos.
- Adicionar itens ao carrinho.
- Visualizar produtos por categoria.

### Administração
- Criar novos produtos com nome, preço e categoria.
- Listar todos os produtos cadastrados.
- Excluir produtos existentes.

---

## 🛠️ Tecnologias Utilizadas

- **Front-End**:
  - HTML5, CSS3 e JavaScript.
  - Thymeleaf para renderização dinâmica.

- **Back-End**:
  - Spring Boot.
  - JPA/Hibernate para gerenciamento do banco de dados.

- **Banco de Dados**:
  - Mysql.

---

##  Estrutura do Projeto

```plaintext
kirby-mania/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com.kirby.kirbymania/ # Back-End
│   │   │        ├── controller   # Endpoints
│   │   │        ├── model        # Classes entidades 
│   │   │        ├── repositories # Repositorios CRUD da aplicacao
│   │   │        └── util         # Util
│   │   │── resources/
│   │        ├── templates/     # Templates Thymeleaf
│   │        └── static/        # Arquivos CSS/JS/Imagens
│   └── test/                   # Testes do projeto
├── README.md                   # Documentação
├── pom.xml                     # Configuração do Maven
```

## Como Executar

### Pré-requisitos
- Java 21
- Maven 3.8+

### Configuração do Ambiente
1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/kirby-shop.git
   cd kirby-shop
   ````
2. Instale as dependências e execute (pela IDE ou por linha de comando):
```bash
mvn spring-boot:run
```
3. As configurações da aplicação (como conexão com banco de dados) estão disponíveis em:
```plaintext
/src/main/resources/application.properties
```

4. Acesse a aplicação em teste em: 
- http:localhost:8080


