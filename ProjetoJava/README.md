# Projeto de Gestão de Funcionários em Java

Este é um projeto simples em Java que gerencia funcionários de uma indústria, aplicando conceitos de:
- Herança (com as classes `Pessoa` e `Funcionario`)
- Manipulação de coleções (`List` e `Map`)
- Formatação de datas e valores monetários
- Operações básicas com `BigDecimal`

---

##  Funcionalidades Implementadas

1. **Inserção dos funcionários** na ordem especificada.  
2. **Remoção do funcionário "João"** da lista.  
3. **Impressão de todos os funcionários** com as informações:
   - Data de nascimento no formato `dd/MM/yyyy`
   - Salário formatado em `R$ X.XXX,XX` 
4. **Atualização do salário** com aumento de **10%**.  
5. **Agrupamento dos funcionários por função** em um `Map<String, List<Funcionario>>`.  
6. **Impressão dos funcionários agrupados por função.**  
7. **Listagem de aniversariantes** nos meses **Outubro (10)** e **Dezembro (12)**.  
8. **Exibição do funcionário com a maior idade**, mostrando nome e idade.  
9. **Ordenação alfabética** da lista de funcionários.  
10. **Cálculo do total dos salários** de todos os funcionários.  
11. **Cálculo de quantos salários mínimos** cada funcionário ganha (considerando **R$ 1212,00**).  

---

##  Pré-requisitos

Certifique-se de ter as seguintes ferramentas instaladas:
- **JDK 17** ou superior ([Download e Instalação](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html))
- **Maven** (Opcional, caso queira gerenciar dependências)
- **VSCode** com as extensões:
  - **Extension Pack for Java** (para suporte completo ao Java no VSCode)
  - **Debugger for Java** (para facilitar o teste e depuração)

---

##  Como Executar o Projeto

### 1. Clonar o Repositório
Abra o terminal e execute:
```bash
git clone https://github.com/seu-usuario/nome-do-repositorio.git
cd nome-do-repositorio
```
### 2. Abrir o Projeto no VSCode
No terminal, dentro da página do projeto, abra o VSCode com:
```
code.

```
### 3. Compilar e Executar
No VSCode:
** Abra a pasta src e navegue até principal/Principal.java
** Clique em Run no topo do arquivo ou use o atalho ` Ctrl + F5 `.


## Algumas dificuldades encontradas no desafio

Durante o desenvolvimento do projeto foi utilizar algumas bibliotecas e estudar como elas funcionavam como:
- O ` BigDecimal `, pois a forma de formatação é um pouco confusa.
- Revisei alguns conceitos de POO como Herança e Poliformismo especialmente como acessar e sobrescrever métodos de uma classe pai(superclasse).
- Também tive um pouco de dificuldade no uso de ` Map<String> `, precisar entender como armazenar os dados em um mapa, tive que rever os conceitos de manipular e iterar coleções em Java.






