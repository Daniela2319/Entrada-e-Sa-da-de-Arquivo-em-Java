package IOCaracter;

import java.io.*;

//Faça uma cópia do arquivo "recomendações.txt" e agora adicione 3 marcas de carros.
public class ExercicioIOCaracter3 {
    public static void copiarArquivo() throws IOException {
        File f = new File("C:\\edu.java\\Java IO\\ExerciciosIO\\JavaIO\\recomendações.txt"); // criando uma referência para o arquivo que séra copiado
        String nomeArquivo = f.getName(); // nome do arquivo original

        /*Reader r = new FileReader(nomeArquivo);
        BufferedReader br = new BufferedReader(r);*/
        BufferedReader br = new BufferedReader(new FileReader(nomeArquivo)); // abrindo arquivo
        String line = br.readLine(); // lendo as linhas do arquivo que será copiado

        //formatando o nome do arquivo de copia
        /* 1- pegar tirando a estensão.txt do nome do arquivo original
           2- acresentando -copy.txt do nome do arquivo que será armazenado a copia
         */
        String nomeArquivoCopy = nomeArquivo.substring(0, nomeArquivo.indexOf(".")).concat("-copy.txt");

        File fcopy = new File(nomeArquivoCopy); //criando uma referência para a copia arquivo

        BufferedWriter bw = new BufferedWriter(new FileWriter(fcopy.getName())); // criando o arquivo

        // faça a copia
        do {
            bw.write(line); // pegue a linha lida no arquivo original "recomendações.txt" e armazena
            bw.newLine();   //depois insira uma linha
            bw.flush();    //terminado o laço. descarrega as informações capturada do techado no arquivo
            line = br.readLine();//depois realizada a cópia da linha acima. foi preenchemos a linha

        }while (!(line == null)); //enquanto a linha for diferente de null, continue copiando.
        System.out.printf("Arquivo\"%s\" copiado com sucesso! Com tamanho '%d' bytes.\n", f.getName(), f.length());
        System.out.printf("Arquivo\"%s\" criado com sucesso! Com tamanho '%d' bytes ", fcopy.getName(),fcopy.length());

    }

    public static void adicionarInfoNoArquivo(){}

    public static void main(String[] args) throws IOException {
        copiarArquivo();
    }


}
