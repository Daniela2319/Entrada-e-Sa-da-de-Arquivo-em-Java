package IOCaracter;

import java.io.*;
import java.util.Scanner;

public class ExerciciosIOCaracter2 {
    // Abra o teclado para escrever 3 livros que você recomendaria e armazene em "recomendações.txt".
    public static void lerTecladoEscreverDocumento() throws IOException {

        PrintWriter pw = new PrintWriter(System.out);
        pw.println("Digite 3 recomendações de livros: ");
        pw.flush(); //descarregar o contéudo do método write no console

        Scanner scan = new Scanner(System.in); // abertura do teclado
        String line = scan.nextLine();// captura da linha do teclado

        //cria o documento
        File f = new File("recomendações.txt"); // classe utilizada para especificar  arquivo

        BufferedWriter bw = new BufferedWriter(new FileWriter(f.getName())); // padão decorator

        // escreve dentro no documento
        do { //faça:
            bw.write(line); // escreva na buffer interno a linha capturada pelo scanner
            bw.newLine(); // pule para proxima linha no buffer
            bw.flush(); // terminado o laço, descarrega as informações capturada pelo teclado no arquivo
            line= scan.nextLine(); // pegue a proxima linha do teclado
        }while (!(line.equalsIgnoreCase("fim")));
        // Repita as operações do laço do-while. Quando digitar a palavra 'fim', pare.
        pw.printf("Arquivo \"%s\" foi criado com sucesso!",f.getName());
        //Utiliza o método printf da classe PrintWrite para formatar a mensagem que será exibida

        //fechando os fluxos
        pw.close(); // fechamento do fluxo de saida para o console
        scan.close(); // fechamento do fluxo entrada através do teclado
        bw.close(); // fechamento do fluxo saida para escrita no documento



    }

    public static void main(String[] args) throws IOException {
        lerTecladoEscreverDocumento();
    }
}
