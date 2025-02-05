import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {
    public static void main(String[] args) {

        final String usuario = "postgres";
        final String senha = "170302Boa$";
        final String url = "jdbc:postgresql://localhost:5432/postgres";
        final String instrucaoInsert = "INSERT INTO \"Pessoas\"(id, name) VALUES (?,?)";

        Connection conexao = null;
        PreparedStatement preparedStatement = null;

        try {
            // Estabelecendo conexao
            conexao = DriverManager.getConnection(url, usuario, senha);

            // executando a instrução SQL
            preparedStatement = conexao.prepareStatement(instrucaoInsert);
            preparedStatement.setInt(1, 7);
            preparedStatement.setString(2, "Eduardo");
            preparedStatement.executeUpdate();


            System.out.println("Inserção realizada com sucesso");
        } catch (SQLException e) {
            System.out.println("Erro na conexão com o Banco de Dados");
            e.printStackTrace();
        } finally {
            try {
                if (preparedStatement != null) preparedStatement.close();
                if (conexao != null) conexao.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
