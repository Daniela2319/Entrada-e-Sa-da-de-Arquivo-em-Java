package IOCaracter;


import java.io.*;

/* Crie a classe Gato com atributos nome, idade e cor:
Instancie um objeto e serialize
Desserialize este objeto e mostre no console.

 */
public class ExemploIOObject {

    public static void serealização() throws IOException {
        Gato gato = new Gato("Simba",5,"preto");

        File f = new  File("gato");

        /*OutputStream os = new FileOutputStream(f.getName());
        ObjectOutputStream oos = new ObjectOutputStream(os);*/
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f.getName()));

        oos.writeObject(gato);

        PrintStream ps = new PrintStream(System.out);
        ps.printf("Arquivo \"%s\" criando com sucesso! Tamanho '%d' bytes.", f.getName(), f.length());

        oos.close();
        ps.close();




    }



    public static void desserialização( String arquivo){

    }

    public static void main(String[] args) throws IOException {
        serealização();
    }
}
