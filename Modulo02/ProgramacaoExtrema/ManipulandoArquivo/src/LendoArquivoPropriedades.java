import java.io.FileInputStream;
import java.util.Properties;

public class LendoArquivoPropriedades{
    public static void main(String[] args) {
        Properties prop = new Properties();

        try{
            // Carregando o arquivo de propriedades
            prop.load(new FileInputStream("src\\minhaConfig.properties"));
            // Imprimindo as propriedades
            prop.list(System.out);
            System.out.println(prop.getProperty("FileName"));
            System.out.println(prop.getProperty("Author_Name"));
            System.out.println(prop.getProperty("Website"));
            System.out.println(prop.getProperty("Topic"));
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
