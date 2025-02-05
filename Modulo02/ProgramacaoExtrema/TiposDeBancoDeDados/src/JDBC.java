import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC {
    public static void main(String[] args) {
        try(Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system",
                "admin")){
            if(connection != null){
                System.out.println("Conexão realizada com sucesso");
            } else {
                System.out.println("Falha na conexão");
            }
        } catch (SQLException e){
            System.err.format("SQL State %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
