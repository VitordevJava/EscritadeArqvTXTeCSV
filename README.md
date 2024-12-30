Projeto: Escrita e Leitura de Arquivos TXT e CSV

Este repositório contém um projeto Java que demonstra a leitura e escrita de arquivos nos formatos TXT e CSV, além de realizar manipulações básicas de dados. Ele é útil para quem deseja aprender ou aprimorar conhecimentos sobre manipulação de arquivos utilizando a linguagem Java.

Funcionalidades

Leitura de arquivos TXT com dados estruturados.

Escrita de dados em arquivos TXT e CSV.

Manipulação e armazenamento de informações utilizando listas e classes Java.

Tratamento de exceções durante operações de I/O (Entrada e Saída).

Organização dos dados lidos em objetos do tipo Pessoa.

Tecnologias Utilizadas

Java 8+ - Linguagem de programação principal.

Eclipse IDE - Ambiente de desenvolvimento utilizado no projeto.

Biblioteca Scanner - Para leitura de arquivos.

API FileInputStream e FileOutputStream - Para manipulação de arquivos.

Como Executar o Projeto

Clone o repositório:

git clone https://github.com/VitordevJava/EscritadeArqvTXTeCSV.git

Abra o projeto em uma IDE compatível (recomendado: Eclipse ou IntelliJ IDEA).

Compile o código-fonte.

Execute o programa principal localizado no arquivo LerArquiv.java.

Certifique-se de incluir o arquivo arquivo.txt no diretório especificado no código, ou altere o caminho conforme necessário.

Formato Esperado do Arquivo TXT/CSV

Exemplo de conteúdo esperado no arquivo arquivo.txt:

João;joao@email.com;25
Maria;maria@email.com;30
Pedro;pedro@email.com;22

Cada linha contém os dados de uma pessoa, separados por ponto e vírgula (;).

Exemplo de Saída no Console

Nome: João, Email: joao@email.com
Nome: Maria, Email: maria@email.com
Nome: Pedro, Email: pedro@email.com

Estrutura do Projeto

TxtExcelJSON/
├── src/
│   ├── LerArquiv.java
│   ├── Pessoa.java
├── arquivo.txt
├── README.md

LerArquiv.java - Código responsável por ler e processar os dados do arquivo.

Pessoa.java - Classe que representa o modelo de dados para armazenar as informações lidas.

arquivo.txt - Arquivo de exemplo contendo os dados utilizados para testes.

README.md - Documentação do projeto.

Licença

Este projeto é distribuído sob a licença MIT. Consulte o arquivo LICENSE para mais detalhes.

Autor

João Vitor Soares de Carvalho - GitHub | LinkedIn
