import java.sql.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Inicio");
        Class.forName("com.mysql.cj.jdbc.Driver");
        try{
        Connection conexao = Manager.obterConexao();
        Statement declaracao = conexao.createStatement();
        
        String comando = "SELECT * FROM LIVROS";
        
        ResultSet rs = declaracao.executeQuery(comando);
        System.out.println("Lista obtida");
        while(rs.next() == true){
            int id = rs.getInt("ID");
            String titulo = rs.getString("TITULO");
            int lancamento = rs.getInt("LANÇAMENTO");
            int quantidade = rs.getInt("QUANTIDADE");
            System.out.println("ID: " + id + " TITULO: " + titulo + " LANCAMENTO: " + lancamento + " QUANTIDADE: " + quantidade);
        }
    } catch(SQLException e){
        System.out.println("Erro ao acessar o banco de dados.");
        e.printStackTrace();
    
    }
    }
}
