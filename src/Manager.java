import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Manager {
    
    public static Connection obterConexao() throws Exception{
        Connection conexao = null;
        try{
             Class.forName("com.mysql.cj.jdbc.Driver");
             conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/BIBLIOTEA", "root", "123456");
             System.out.println("Conexão obtida com sucesso.");
            
            }catch(SQLException e){
            e.printStackTrace();
            System.out.println("Não foi possível acessar o Banco de Dados.");
        }
            return conexao;
        }
        

    }
