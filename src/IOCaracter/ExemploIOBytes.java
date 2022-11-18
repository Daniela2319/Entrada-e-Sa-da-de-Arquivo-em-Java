package IOCaracter;

import java.io.*;

public class ExemploIOBytes {

    public static void copiarArquivo() throws IOException {
        File f = new File("C:\\edu.java\\Java IO\\ExerciciosIO\\JavaIO\\recomendações-copy.txt");
        String nomeArquivo = f.getName();

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(f.getName()));

        String nomeArquivoCopy = nomeArquivo.substring(0, nomeArquivo.indexOf("-")).concat("-copy2.txt");
        File fCopy = new File(nomeArquivoCopy);

        //criar documento
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(nomeArquivoCopy));

        int line = 0;
        while ((line = bis.read()) != -1){
            bos.write((char) line);
            bos.flush();
        }

        bis.close();
        bos.close();

        //Imprimir frase
        PrintStream ps = new PrintStream(System.out);
        ps.printf("Arquivo %s copiado com sucesso e está no diretório %s com %d bytes.",
                fCopy.getName(), fCopy.getPath(), fCopy.length());

    }

    public static void main(String[] args) throws IOException {
        copiarArquivo();
    }
}
