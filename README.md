# Projeto de Automação de Testes - Cucumber

## Descrição

Este projeto foi desenvolvido com o objetivo de criar **cenários de teste automatizados** para o site [Sauce Demo](https://www.saucedemo.com), utilizando a ferramenta **Cucumber** 
em conjunto com o padrão de projeto **Page Factory**.

O foco do projeto é testar dois fluxos principais:
1. **Login**: A automação valida o processo de login utilizando diferentes combinações de usuário e senha.
2. **Compra de Produtos**: O sistema é testado ao realizar a compra de produtos, incluindo a seleção, adição ao carrinho e finalização da compra.


## Tecnologias Utilizadas

- **Cucumber**: Framework de BDD (Behavior-Driven Development) utilizado para descrever os testes em linguagem natural.
- **Page Factory**: Padrão de projeto para otimizar o design de testes, tornando os elementos da página reutilizáveis e aumentando a legibilidade do código.
- **Selenium WebDriver**: Biblioteca para interação com o navegador.
- **JUnit**: Framework para execução de testes em Java.
- **Maven**: Gerenciador de dependências e build.

## Funcionalidades

- **Cenário de Login**: 
  - Realiza o login com diferentes combinações de usuário e senha, validando o acesso correto ao sistema.
- **Cenário de Compra de Produtos**: 
  - Testa o processo de adicionar produtos ao carrinho e finalizar a compra, validando os detalhes da transação.

## Estrutura de Diretórios

