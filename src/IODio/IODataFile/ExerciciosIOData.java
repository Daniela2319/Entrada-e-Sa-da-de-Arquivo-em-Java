package IODio.IODataFile;


import java.io.*;
import java.util.Scanner;

/* Crie um arquivo "peça-de-roupas.bin" e armazene:
1- nome do produto, tamanho (P,M,G,U), quantidade e preço.
2- leia este arquivo e imprima no console.
 */
public class ExerciciosIOData {
    public static void incluirProduto() throws IOException {

        File f = new File("C:\\edu.java\\Java IO\\peca-de-roupas.bin"); //utilizando para apontar arquivo ou diretório

        PrintStream ps = new PrintStream(System.out); // criando um fluxo de saída para o console
        ps.flush();

        /*OutputStream os = new FileOutputStream(f.getPath()); //criando um fluxo de armazenamento em um arquivo
        DataOutputStream dos = new DataOutputStream(os);*/ // iniciando um objeto DataOutputStream

        DataOutputStream dos = new DataOutputStream(new FileOutputStream(f.getPath())); //decorator

        Scanner scan = new Scanner(System.in); //abrindo teclado

        ps.print("Nome do produto: "); //Pedindo o nome do produto
        String nome = scan.next(); //armazenado o input na variável
        dos.writeUTF(nome); //escrevendo no documento

        ps.print("Quantidade: "); //Pedindo a quantidade do produto
        int quantidade = scan.nextInt(); // armazenado o input na variável
        dos.writeInt(quantidade); //escrevendo no documento

        ps.print("Tamanho da peças (P/M/G/U): "); //Pedindo o tamanho do produto
        char tamanho = (char) System.in.read(); // armazena o input na variável
        dos.writeChar(tamanho); // escrevendo no documento

        ps.print("Preço: "); //Pedindo o preço do produto
        double preco = scan.nextDouble(); // armazenado o input na variável
        dos.writeDouble(preco); // escrevendo no documento

        ps.printf("O arquivo %s foi criado com %d bytes no diretório '%s'.\n",
                f.getName(), f.length(), f.getAbsolutePath());

        lerProduto(f.getPath()); // Chama o método ler produto mostra o caminho onde esta o arquivo e vai ler

        //fechando os fluxos
        scan.close();
        dos.close();
        ps.close();


    }
    public static void lerProduto(String caminhoArquivo) throws IOException {
        //lê o produto
        File f = new File(caminhoArquivo);

        //abrir o arquivo
        /*InputStream is = new FileInputStream(f.getPath());
        DataInputStream dis = new DataInputStream(is);*/
        DataInputStream dis = new DataInputStream(new FileInputStream(f.getPath()));

        // chamando as variavel com os métodos
        String nome = dis.readUTF();
        char tamanho = dis.readChar();
        int quantidade = dis.readInt();
        double preco = dis.readDouble();

        System.out.printf("\nNome.......................: %s\n", nome);
        System.out.printf("Quantidade.......................: %s\n", quantidade);
        System.out.printf("Tamanho.......................: %s\n", tamanho);
        System.out.printf("Preço.......................: %s\n", preco);
        System.out.println("Total valor das peças: " + (quantidade * preco));

        dis.close();



    }

    public static void main(String[] args) throws IOException {
        incluirProduto();
    }

}
