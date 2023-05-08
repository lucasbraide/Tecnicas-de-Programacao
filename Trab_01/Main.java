package Trab_01;
import java.io.*;
import java.util.*;

class Main{

    // Recebe como parametro um scanner e um hash de destino - a função vai ler todos os dados do arquivo
    // e adicionará no Hash - dessa forma o HashMap já faz a filtragem de CPFs duplicados automaticamente.
    public static void Entry_To_Hash(Scanner leitura, HashMap<String,String> dados){
        while(leitura.hasNextLine()){
            String line = leitura.nextLine();
            String line_array[] = line.split(";"); // Split nos dados com o separador - indice 0 será o CPF - 1 será o nome
            dados.put(line_array[0], line_array[1]);
        }
    }
    public static void main(String [] args) throws IOException{
        //Caminho dos arquivos de entrada
        File entrada_1 = new File("C:\\Users\\lucas\\Desktop\\UFC\\Disciplinas\\Técnicas de Programação\\Tecnicas-de-Programacao\\Trab_01\\entrada_1.txt");
        File entrada_2 = new File ("C:\\Users\\lucas\\Desktop\\UFC\\Disciplinas\\Técnicas de Programação\\Tecnicas-de-Programacao\\Trab_01\\entrada_2.txt");

        Scanner scan_leitura_1 = new Scanner(entrada_1);
        Scanner scan_leitura_2 = new Scanner(entrada_2);

        // Cria o hash para os dados de saída
        HashMap<String, String> dados_hash = new HashMap<String, String>();
        
        Entry_To_Hash(scan_leitura_1, dados_hash);
        Entry_To_Hash(scan_leitura_2, dados_hash);

        //Fecha os scanners de leitura
        scan_leitura_1.close();
        scan_leitura_2.close();

        // Realiza o Merge no arquivo de saida - printa os dados do HashMap para o arquivo 'saida.txt'
        FileWriter writer = new FileWriter("C:\\Users\\lucas\\Desktop\\UFC\\Disciplinas\\Técnicas de Programação\\Tecnicas-de-Programacao\\Trab_01\\saida.txt"); //Writer com o caminho do arquivo de saída
        for (Map.Entry<String, String> set : dados_hash.entrySet()) {
            String line = set.getKey() + ";" + set.getValue() + "\n"; //Pega a chave e valor do HashMap e formata a string de escrita na saida
            writer.write(line);
    }
    writer.close(); // Fecha o writer
}
}