package br.edu.insper.mvc.model;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class DAO {
	
	private Connection connection = null;
	
	public DAO() throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://localhost/taskmanager","root","m1l2c3m43974");
		
		
	}
	
public List<Tarefa> getLista() throws SQLException {
		
		List<Tarefa> pessoas = new ArrayList<Tarefa>();
		
		PreparedStatement stmt = connection.
				prepareStatement("SELECT * FROM taskDB");
		ResultSet rs = stmt.executeQuery();
		
		while(rs.next()){
			Tarefa pessoa = new Tarefa();
			pessoa.setId(rs.getInt("id"));
			pessoa.setTask(rs.getString("task"));
			pessoa.setData(rs.getString("data"));
			
			pessoas.add(pessoa);
		}
		rs.close();
		stmt.close();
		
		return pessoas;
	}
	
	public void adiciona(Tarefa pessoas) throws SQLException{
		String sql ="INSERT INTO taskDB"+"(task,data) values(?,?)";
		PreparedStatement stmt = connection.prepareStatement(sql);
		stmt.setString(1, pessoas.getTask());
		stmt.setString(2,pessoas.getData());
		stmt.execute();
		stmt.close();
	}
	
	public void modifica(Tarefa pessoas) throws SQLException{
		String sql = "UPDATE taskDB SET " + "task=? WHERE id=?";
		PreparedStatement stmt = connection.prepareStatement(sql);
		stmt.setString(1, pessoas.getTask());
		stmt.setLong(2, pessoas.getId());
		stmt.execute();
		stmt.close();
		
	}
	
	public void remove(Integer id) throws SQLException{
		PreparedStatement stmt = connection.prepareStatement("DELETE FROM TaskDB WHERE id=?");
		stmt.setLong(1, id);
		stmt.execute();
		stmt.close();
		
	}
	
	public void close() throws SQLException {
		connection.close();
	}
}