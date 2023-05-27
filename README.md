# Exemplos de Padrões de Projeto em Java Puro

Este repositório contém exemplos de implementações em Java puro dos padrões de projeto Strategy, Singleton e Facade. Os padrões de projeto são soluções comprovadas para problemas recorrentes no desenvolvimento de software, fornecendo abordagens flexíveis e escaláveis para a criação de código bem estruturado.

## Padrões de Projeto Incluídos

### 1. Strategy Pattern (Padrão Strategy)

O padrão de projeto Strategy é um padrão comportamental que permite definir uma família de algoritmos, encapsular cada um deles e torná-los intercambiáveis. Com o Strategy, é possível alterar o comportamento de uma classe em tempo de execução, sem modificar seu código.

O exemplo fornecido neste repositório demonstra como implementar o padrão de projeto Strategy em Java puro, mostrando uma situação em que diferentes estratégias de pagamento são utilizadas em um sistema de compras online.

### 2. Singleton Pattern (Padrão Singleton)

O padrão de projeto Singleton é um padrão de criação que garante a existência de apenas uma instância de uma classe em todo o sistema. Ele fornece um ponto de acesso global a essa instância, permitindo que outros objetos acessem seus métodos e propriedades de forma consistente.

No exemplo fornecido neste repositório, é mostrada uma implementação do padrão Singleton em Java puro para uma classe de configuração, garantindo que apenas uma instância dessa classe seja criada durante a execução do programa.

### 3. Facade Pattern (Padrão Facade)

O padrão de projeto Facade é um padrão estrutural que fornece uma interface simplificada para um conjunto complexo de classes ou subsistemas. Ele oculta a complexidade subjacente e fornece uma única interface unificada para simplificar a interação com o sistema.

O exemplo de implementação do padrão Facade fornecido neste repositório demonstra como criar uma fachada para um sistema de compartilhamento de arquivos, simplificando a interação com as diferentes classes e subsistemas envolvidos.

## Pré-requisitos

- Java JDK 8 ou superior

## Como executar os exemplos

1. Clone este repositório em sua máquina local:

```bash
git clone https://github.com/yuri-italo/lab-padroes-de-projeto-java.git
```

2. Navegue até o diretório do padrão de projeto desejado:

```bash
cd lab-padroes-de-projeto-java/nome-do-padrao-de-projeto
```

3. Compile os arquivos Java:

```bash
javac *.java
```

4. Execute o exemplo:

```bash
java Main
```

Certifique-se de substituir "nome-do-padrao-de-projeto" pelo nome do padrão de projeto que deseja executar.

## Contribuição

Contribuições para este repositório são bem-vindas! Se você deseja adicionar exemplos de outros padrões de projeto em Java puro, sinta-se à vontade para enviar uma solicitação de pull.

Antes de contribuir, verifique se seu código está em conformidade com as diretrizes de estilo e padrões de projeto existentes.
