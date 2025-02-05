import java.sql.*;

public class Delete {
    public static void main(String[] args) {
        final String usuario = "postgres";
        final String senha = "170302Boa$";
        final String url = "jdbc:postgresql://localhost:5432/postgres";
        final String instrucaoDelete = "DELETE FROM \"Pessoas\" WHERE id = ?";


        Connection conexao = null;
        PreparedStatement preparedStatement = null;

        try {
            // Estabelecendo a conexão
            conexao = DriverManager.getConnection(url, usuario, senha);

            // Executando a instrução SQL
            preparedStatement = conexao.prepareStatement(instrucaoDelete);
            preparedStatement.setInt(1, 7);
            preparedStatement.executeUpdate();


            System.out.println("Exclusão realizada com sucesso");

        } catch (SQLException e){
            System.out.println("Erro na conexão com o Banco de Dados");
            e.printStackTrace();
        } finally {
            try {
                if(preparedStatement != null) preparedStatement.close();
                if(conexao != null) conexao.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }
}
