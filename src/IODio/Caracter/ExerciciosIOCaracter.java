package IODio.Caracter;

import java.io.*;

public class ExerciciosIOCaracter {

    //Abra o teclado para escrever 3 filmes que você recomendaria e exiba esses filmes no console.
    public static void abrirTecladoExibirConsole() throws IOException{
        System.out.println("Digite 3 sugestões de filmes: ");

        //abrindo teclado
        /*InputStream is = System.in;
        Reader irs = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(irs);*/

        System.out.println("Recomende 3 filmes: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        do { // faça:
            bw.write(line); // pegue a linha lida através do teclado e armazene em um buffer
            bw.newLine(); // depois insira uma linha
            line = br.readLine(); // depois de realizado a cópia da linha a cima. preenchemos a linha.
        }while (!(line.isEmpty()));// quando a linha estiver vazio, pare.
        bw.flush();

        br.close();// fechamos o fluxo de entrada
        bw.close(); // fechamos o fluxo de saída
    }

    public static void main(String[] args) throws IOException {
        abrirTecladoExibirConsole();
    }
}
