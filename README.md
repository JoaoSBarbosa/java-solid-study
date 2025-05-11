
# 🛠️ Projeto de Gerenciamento de Produtos com SOLID e Clean Architecture

Este projeto é um exemplo prático de aplicação dos princípios **SOLID** em uma arquitetura limpa e modular, usando **Java** e **Spring Boot**. A estrutura do código separa responsabilidades de forma clara, facilitando a manutenção, testes e extensibilidade.

---

## 📦 Estrutura do Projeto

```

src/
├── controller/            # Camada de entrada (interface com o mundo externo)
│   └── ProductController.java
├── domain/               # Entidades de negócio
│   └── Product.java
├── dto/                  # Objetos de transferência de dados
│   └── ProductDTO.java
├── repository/           # Abstrações e implementações de persistência
│   ├── ProductRepository.java
│   └── ProductRepositoryImpl.java
├── service/              # Orquestração de casos de uso
│   └── ProductService.java
├── usecase/              # Casos de uso (lógica de negócio)
│   ├── CreateProductUseCase.java
│   ├── GetAllProductsUseCase.java
│   └── GetProductByIdUseCase.java
└── validator/            # Validações de negócio
└── ProductValidator.java

````

---

## 🧠 Princípios SOLID Aplicados

| Princípio | Aplicação |
|-----------|-----------|
| **SRP** (Single Responsibility Principle) | Cada classe tem uma única responsabilidade. |
| **OCP** (Open/Closed Principle)          | Os casos de uso podem ser estendidos com novos comportamentos. |
| **LSP** (Liskov Substitution Principle)  | Camadas dependem de abstrações, podendo ser substituídas. |
| **ISP** (Interface Segregation Principle)| Interfaces pequenas e específicas, como `ProductRepository`. |
| **DIP** (Dependency Inversion Principle) | Serviços e casos de uso dependem de interfaces, não de implementações. |

---

## 🚀 Funcionalidades

- ✅ Criar produto
- ✅ Listar todos os produtos
- ✅ Buscar produto por ID
- ✅ Validação de dados de entrada
- ✅ Persistência com repositório customizado

---

## 🧪 Exemplo de Uso da API

### Criar Produto

```http
POST /products
Content-Type: application/json

{
  "name": "Cadeira Gamer",
  "price": 1499.99,
  "stock": 10
}
````

### Listar Produtos

```http
GET /products
```

### Buscar Produto por ID

```http
GET /products/1
```

---

## 🌱 Git Flow

Este projeto utiliza o **Git Flow** como estratégia de ramificação, promovendo organização e controle durante o desenvolvimento.

### Fluxo básico:

* `main`: contém o código **pronto para produção**.
* `develop`: branch de **desenvolvimento ativo**. Todas as novas features e correções são integradas aqui.
* `feature/*`: usadas para desenvolver **novas funcionalidades**.
* `release/*`: preparação de versões, integrando melhorias e testes finais.
* `hotfix/*`: correções críticas diretamente em `main`, seguidas de merge em `develop`.

### Como usar:

```bash
# Criar nova feature
git checkout develop
git checkout -b feature/nome-da-feature

# Finalizar feature
git checkout develop
git merge feature/nome-da-feature
git branch -d feature/nome-da-feature
```

> Recomendado o uso da extensão [Git Flow](https://github.com/nvie/gitflow) ou ferramentas como SourceTree para facilitar esse fluxo.

---

## 📚 Tecnologias Usadas

* Java 17+
* Spring Boot
* Spring Data JPA
* RESTful API
* Maven/Gradle
* PostgreSQL (ou outro banco compatível com JPA)

---

## ✅ Requisitos para rodar

* Java 17+
* Maven ou Gradle
* PostgreSQL (ou ajustar a implementação do repositório)

---

## 🤝 Contribuições

Contribuições são bem-vindas! Crie uma branch `feature/alguma-coisa` e abra um pull request.

---

## 📄 Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

```

```
