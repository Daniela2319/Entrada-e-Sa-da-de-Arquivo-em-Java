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


 # Leitura e Escrita de Bytes
## File Input/Output

Fornece entrada e saída do sistem no meio de fluxos de dados.

## Objetivos

Mostra no código como se utiliza **_Byte Stream, Hierarquia I/O Byte e Leitura e Escrita de Bytes._**

**Byte Stream**: Os programas usam fluxos de bytes para realizar a entrada e a saída de bytes de 8 bits.
Usando este stream, você pode ler e armazenar máscaras, vídeos, áudios, imagens, objetos compilados etc.
Todas as classes de fluxo de bytes descendem de InputStream e OutputStream.

**I/O Bytes** Classe de fluxo de bytes
* **_PrintSteam_**: Fluxo de saída que contém _print() e println()_;
* **_InputStream_**: Classe abstrata que descreve a entrada em fluxo;
* **_OutputStream_**: Classe abrtrata que descreve a saída em fluxo;
* **_FileInputStream_**: Fluxo de entrada que lê de um arquivo;
* **_BufferedInputStream_**: Fluxo de entrada armazenado em buffer;
* **_BufferedOutputStream_**: Fluxo de saída armazenado em buffer;
* **_DataInputStream_**: Fluxo de entrada que contém métodos para a leitura dos tipos dados padrão Java;
* **_DataOuputStream_**: Fluxo de saída que contém método para a gravação dos tipos dados padrão em Java;
* **_ObjetInputStream_**: Fluxo de entrada para objetos;
* **_ObjetOutputStream_**: Fluxo de saída para objtetos.


## I/O de Data

Para ler e gravar valores binários de tipos primitivos Java (int, double, sort por exemplo),
usaremos DataInputStream e DataOutputStream.

DataInputStream e DataOutputStream são frequentemente usados juntos.


## Object I/O

### Classes ObjectOutputStream

Um **_ObjectOutputStream_** grava tipos de dados primitivos e gráficos de objetos Java em um OutputStream.
Os objetos podem ser lidos (reconstituídos) usando um ObjectInputStream. O armazenamento persistente de objetos pode ser
realizado usando um arquivo para o fluxo. Se o fluxo for um fluxo de soquete de rede, os objetos podem ser reconstituídos em outro host
ou em outro processo.


Mais informações no link [oracle](docs.oracle.com/javase/7/docs/api/java/io/ObjectOutputStream.html).

## Serealização

A serialização resume-se em salvar, gravar, capturar o estado de um objeto.

A interface ObjectOutput estende-se da interface DataOutput, o que significa que um
ObjectOutputStream herda todos os comportamentos de escrever tipos primitivos e Strings como
um DataOutputStream.

O método **_writeObject(Object)_**: grava um objeto no armazenamento ou fluxo subjacente.
Este método lança IOException se ocorrer um erro de I/O.

## Desserialização

O processo de reconstrução de um objeto a partir de uma entrada é chamada de desserialização.

A interface ObjectInput estende-se da interface DataInput, o que significa que um ObjectInputStream também tem
comportamentos de leitura de tipos primitivos e Strings como um DataInputStream.

O método **_readObject()_** lê e retorna um objeto. Lança ClassNotFoundException se a classe
do objeto serializado não puder ser encontrada e IOException se ocorrer um erro de I/O.



Estudos realizado Daniela Velter.👩‍🚀

Instrutor Camila Cavalcante da DIO.






                         


