import java.sql.*;

public class Principal {
    public static void main(String[] args) {
        final String usuario = "postgres";
        final String senha = "170302Boa$";
        final String url = "jdbc:postgresql://localhost:5432/postgres";
        final String instrucaoSelect = "SELECT * FROM \"Pessoas\"";



        Connection conexao = null;
        Statement sentenca = null;
        ResultSet resultSet = null;

        try{
            // Estabelecendo a conexão
            conexao = DriverManager.getConnection(url, usuario, senha);
            sentenca = conexao.createStatement();

            // Executando a instrução SQL
            resultSet = sentenca.executeQuery(instrucaoSelect);

            // Processando o resultado
            while(resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                System.out.println("Id: " + id + " Nome: " + name);
            }

            System.out.println("Conexão realizada com sucesso");

        } catch (SQLException e){
            System.out.println("Erro na conexão com o Banco de Dados");
            e.printStackTrace();
        } finally {
            try {
                if(resultSet != null) resultSet.close();
                if(sentenca != null) sentenca.close();
                if(conexao != null) conexao.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
