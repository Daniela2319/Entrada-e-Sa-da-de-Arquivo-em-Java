package IOCaracter.model;


import java.io.*;

public class ExemploIOObjtctExpection {

    public static void serealizarObjeto(){
        File f = new File("gato"); //representação do documento

        //objeto que será serealizado
        GatoComentado gatoComentado = new GatoComentado("Preto",9, "preta");

        ObjectOutputStream oos = null; //inicializando o ObjetctOutputStream

        try { //tente
            OutputStream os = new FileOutputStream(f.getAbsolutePath()); //criar arquivo
            oos = new ObjectOutputStream(os); // iniciar o fluxo da serealização
            oos.writeObject(gatoComentado); //método que escreve no objeto

        } catch (FileNotFoundException e) { // captura exigida pelo FileOutuputStream
            // Caso apresente um expception FileNotFoundException, imprima a frase abaixo no console
            System.out.printf("Arquivo %s não encontrado! Verifique o diretório %s", f.getName(), f.length());

        } catch (IOException e){ //captura exigida pelo método writeObject(object);
            //caso apresente uma exception IOException, imprimir a frase abaixo no console:
            System.out.printf("Não foi possível criar o arquivo \"%s\".", f.getName());
            e.printStackTrace();
        } finally { // esse bloco sempre será executando, independente se teve excption ou não.
            try { //tente
                oos.close(); // fechar o arquivo

            } catch (IOException e) { // captura exigida pelo método close()
                System.out.printf("Erro ao fechar o arquivo \"%s\".", f.getName());
            }

        }


    }




}
