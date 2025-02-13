import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

public class EscrevendoArquivo {
    public static void main(String[] args) throws IOException {
        InputStream istream;
        int c;
        final int EOF = -1;
        istream = System.in;
        FileWriter outFile = new FileWriter("Data.txt");
        BufferedWriter bWriter = new BufferedWriter(outFile);

        System.out.println("Como escrever caracteres no arquivo - pressione Ctrl + Z para concluir! ");
        while((c = istream.read()) != EOF){
            bWriter.write(c);
        }
        bWriter.close();
    }
}
