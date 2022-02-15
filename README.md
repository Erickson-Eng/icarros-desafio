# ICarros - Desafio para desenvolvedor backend

Projeto desenvolvido com Java 11 para as questões desafios que envolvem algoritmos propostos pela empresa [ICarros](https://www.icarros.com.br/principal/index.jsp) e foi realizado o consumo de um serviço com Spring boot no qual é disponibilizado endpoints para consultas.

*As informações adicionais sobre a questão 6 vão estar dentro do repositorio especificamente criado para tal.*
## Desafios

Todo o desenvolvimento das questões estão separados por uma estrutura de pacote, onde, a execução está na raiz do projeto na classe MAIN.

- [Questão 1 - Fizzing'n buzzing](https://github.com/Erickson-Eng/icarros-desafio/blob/main/src/main/java/com/icarros/questao1/FizzBuzz.java)
- [Questão 2 - Angry marvin birds](https://github.com/Erickson-Eng/icarros-desafio/blob/main/src/main/java/com/icarros/questao2/Marvin.java)
- [Questão 3 - Creepy hours](https://github.com/Erickson-Eng/icarros-desafio/blob/main/src/main/java/com/icarros/questao3/CreepyHour.java)
- [Questão 4 - We are the champions, my friend](https://github.com/Erickson-Eng/icarros-desafio/blob/main/src/main/java/com/icarros/questao4/WeAreTheChampions.java)
- [Questão 5 - Venting the cost](https://github.com/Erickson-Eng/icarros-desafio/blob/main/src/main/java/com/icarros/questao5/VentingTheCosts.sql)
- [Questão 6 - Consume WS-Rest](https://github.com/Erickson-Eng/icarros)

## Como usar o projeto

Para execução do projeto se faz necessario que você tenha as seguintes ferramentas instaladas:

Se você optar por utilizar o maven via linha de comando é necessario algumas configurações colocando o mesmo disponivel no path se você utilizar windows.

### Onde você pode está realizando download das dependências.
- [Maven](https://maven.apache.org/download.cgi) *Faça download dos arquivos binarios*
- [Java 11](https://openjdk.java.net/install/)

Como adicionar o maven no path variable [Guia](https://stackoverflow.com/questions/45119595/how-to-add-maven-to-the-path-variable).

Comando necessario para executar o arquivo via terminal:
```
mvn clean install -DskipTests
mvn exec:java -Dexec.mainClass=com.icarros.Main
```