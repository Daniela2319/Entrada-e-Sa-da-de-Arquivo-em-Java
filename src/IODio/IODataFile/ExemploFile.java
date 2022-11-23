package IODio.IODataFile;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExemploFile {

    public static void main(String[] args) {

        File f = new File("Dica-para-ler-e-escrever-arquivo-java-IO.txt");
        System.out.println("Nome do arquivo: " + f.getName());
        System.out.println("Caminho: " + f.getPath());
        System.out.println("Caminho Absoluto: " + f.getAbsolutePath());
        System.out.println("Diretório pai: " + f.getParent());
        System.out.println(f.exists() ? " existe" : " não existe");
        System.out.println(f.canWrite() ? "pode ser gravado" : "não pode ser gravado");
        System.out.println(f.canRead() ? "pode se lido" : "não pode se lido");
        System.out.println(f.isDirectory() ? "é diretório" : "não é diretório");
        DateFormat df = new SimpleDateFormat("15/11/2022");
        Date data = new Date(f.lastModified());
        System.out.println("Ultima modificação do arquivo: " + df.format(data));
        System.out.println("Tamanho do arquivo: " + f.length() + " bytes.");
    }
}
