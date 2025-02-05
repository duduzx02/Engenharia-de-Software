import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update{
    public static void main(String[] args) {

        final String usuario = "postgres";
        final String senha = "170302Boa$";
        final String url = "jdbc:postgresql://localhost:5432/postgres";
        final String instrucaoUpdate = "UPDATE \"Pessoas\" SET name = ? WHERE id = ?";

        Connection conexao = null;
        PreparedStatement preparedStatement = null;

        try {
            // Estabelecendo conexao
            conexao = DriverManager.getConnection(url, usuario, senha);

            // executando a instrução SQL
            preparedStatement = conexao.prepareStatement(instrucaoUpdate);
            preparedStatement.setString(1, "Augusto");
            preparedStatement.setInt(2, 7);
            preparedStatement.executeUpdate();


            System.out.println("Atualização realizada com sucesso");
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
