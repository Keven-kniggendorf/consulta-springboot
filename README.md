# Meu Repositório de Estudos de Spring Boot

## 📖 Sobre o Projeto
Este repositório foi criado para documentar e organizar meus estudos em **Spring Boot**.  
A ideia é que ele sirva como guia de consulta rápida, contendo exemplos práticos que criei, projetos e anotações sobre os principais recursos do framework.

---

## ✨ Tópicos Abordados

### 01 - Introdução ao Spring Boot
- Configuração do ambiente de desenvolvimento.  
- Criação de projetos com o Spring Initializr.  
- Estrutura de um projeto e seus principais componentes.  
- Conceitos de Injeção de Dependências (`@Autowired`, `@Component`, etc.).  

### 02 - Desenvolvimento Web com Spring MVC
- Criação de controladores com `@RestController`.  
- Mapeamento de rotas HTTP (`@GetMapping`, `@PostMapping`, `@PutMapping`, `@DeleteMapping`).  
- Recebimento e manipulação de parâmetros (`@PathVariable`, `@RequestParam`, `@RequestBody`).  

### 03 - Persistência de Dados com Spring Data JPA
- Configuração de banco de dados (H2, PostgreSQL, MySQL).  
- Mapeamento de entidades com JPA (`@Entity`, `@Id`, relacionamentos).  
- Criação de repositórios com a interface `JpaRepository`.  
- Implementação de um CRUD completo (Create, Read, Update, Delete).  

### 04 - Validações e Tratamento de Exceções
- Uso da **Bean Validation** para validar dados de entrada (`@Valid`, `@NotNull`, `@Size`).  
- Criação de um **ControllerAdvice** para tratamento centralizado de exceções.  

---

## 🛠️ Tecnologias e Pré-requisitos
Para executar os projetos deste repositório, é necessário ter instalado:

- **Java Development Kit (JDK)**: versão 17 ou superior  
- **Maven**: gerenciamento de dependências e build  
- **IDE**: IntelliJ IDEA, Eclipse ou VS Code com extensões para Java/Spring  
- **Postman** ou **Insomnia**: para testar os endpoints da API  

---

## 🚀 Como Executar os Projetos

1. Clone o repositório:  
   ```bash
   git clone https://github.com/Keven-kniggendorf/curso-springboot.git
Navegue até a pasta do projeto que deseja executar

cd curso-springboot/nome-do-projeto


Use o Maven para compilar e iniciar a aplicação

mvn spring-boot:run


Após a inicialização, acesse no navegador ou ferramenta de teste

http://localhost:8080

## 🔮 Próximos Passos
Este repositório está em constante evolução.  
O próximo grande tópico a ser estudado e implementado será a **segurança de APIs** utilizando o **Spring Security**.  

### Objetivos da implementação:
- [ ] Autenticação e autorização de endpoints  
- [ ] Segurança baseada em tokens **JWT (JSON Web Token)**  
- [ ] Configuração de **CORS** para permitir acesso de diferentes origens  



