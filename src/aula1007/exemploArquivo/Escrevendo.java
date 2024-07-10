package aula1007.exemploArquivo;
import java.io.*;
import java.nio.channels.ScatteringByteChannel;

public class Escrevendo {
    public static void main(String[] args) {

        File caminho = new File ("C:\\Users\\viniw/Documentos");
        if (caminho.exists())
            System.out.println("O caminho existe");
        else {
            System.out.println("O caminho não existe, tentando criar");
            caminho.mkdirs();
        }
        //testando escrever uma pessoa em um arquivo
        Pessoa p1 = new Pessoa();
        p1.setNome("Jonas");
        p1.setSobrenome("Silvs");
        File arquivo = new File(caminho,"dadosPessoa.db");
        try{
            ObjectOutputStream objEscrita =
                    new ObjectOutputStream(new FileOutputStream(arquivo.getAbsolutePath()));
            objEscrita.writeObject(p1);
            objEscrita.close();
        }
        catch (FileNotFoundException e){
            System.out.println("Erro ao ler arquivo");
        }
        catch (IOException e){
            System.out.println("Erro ao gravar as informações");
        }
    }
}