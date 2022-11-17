# Entrada e Saída em Java IO

## Leitura e Escrita de Caracteres

Fornece entrada e saída do sistema por meio de fluxos de dados.

## Objetivos
Mostra neste código como se utiliza **Stream Caracteres, fluxos Predefinidos, java.io.File e I/O Caracteres**.

**_Stream Caracteres_**: A plataforma Java armazena caracteres segundo o padão UNICODE. O Unicode é codificação para caracteres textuais capaz
de representar caracteres de muitos idiomas diferentes de todo o mundo. Cada caractere é representado por um ponto de código Unicode (code points).
As classes mãe Reader e Writer (classes abstratas) representam um fluxo de caracteres. Como são classes abstratas, precisam das classes filhas
(classes concretas) para ler e gravar dados.

**_Fluxos Predefinidos_**: -> Entrada de dados através do teclado: `System.in/Scanner` -> Saída de dados através do console: `System.out/PrintWriter`.
Classe System (java.lang.Sytem) encapsula vários aspectos do ambiente de tempo de execução e tem três atributos **public**, **final** e **static** e associados aos 
arquivos padrão de um sistem operacional:

* **Sytem.in**: objeto InputStream para a entrada padrão (teclado)
* **Sytem.out**: objeto PrintStream para a saída padrão (console)
* **System.err**: objeto PrintStream para saída padrão de erros (console).

**_java.io.File_**: File é a classe responsável por representar arquivo diretórios do seu sistema de arquivos. Esta classe pode fornecer informações úteis assim
como criar um novo arquivo, tamanho do arquivo, caminho absoluto, espaço livre em disco ou, ainda, excluí-lo.

**_I/O Caracteres_**

* **BufferedReader**: Fluxo de caractere de entrada armazenado em buffer.
* **BufferedWriter**: Fluxo de caractere de saída armazenado em buffer.
* **FileReader**: Fluxo de entrada que lê de um arquivo.
* **FileWriter**: Fluxo de saída que grava em um arquivo.
* **InputStreamReader**: Fluxo de entrada que converte bytes em caracteres.
* **OutputStreamWriter**: Fluxo de saída que converte caracteres em bytes.
* **Reader**: Classe abstrata que descreve a entrada de caracteres em fluxo.






                         


