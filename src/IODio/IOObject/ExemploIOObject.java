package IODio.IOObject;


import java.io.*;

/* Crie a classe Gato com atributos nome, idade e cor:
Instancie um objeto e serialize
Desserialize este objeto e mostre no console.

 */
public class ExemploIOObject {

    public static void serealização() throws IOException {

        //objeto que será serealizado
        Gato gato = new Gato("Simba",5,"preto");

        // representação do documento
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



    public static void desserialização( String arquivo) throws IOException, ClassNotFoundException {

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(arquivo));
        Gato objetoGato = (Gato) ois.readObject();

        System.out.printf("\nNome..................: %\n", objetoGato.getNome());
        System.out.printf("\nIdade..................: %\n", objetoGato.getIdade());
        System.out.printf("\nCor.....................: %\n", objetoGato.getCor());
        System.out.println(objetoGato);

        ois.close();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //serealização();
        desserialização("C:\\edu.java\\Java IO\\ExerciciosIO\\JavaIO\\gato");
    }
}
