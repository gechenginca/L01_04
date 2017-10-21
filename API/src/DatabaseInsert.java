package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseInsert {
  /**
   * Insert a new student into the STUDENTS table.
   * @param utorId The utorId of a student.
   * @param name The name of a student.
   * @param connection
   * @return An integer > 0 to verify a student was added.
   * @throws DatabaseInsertException
   */
  protected static  int insertStudent(int utorId, String name, Connection connection) throws DatabaseInsertException {
    String sql = "INSERT INTO STUDENTS(ID, NAME) VALUES(?,?)";
    try {
      PreparedStatement preparedStatement = connection.prepareStatement(sql, 
                                              Statement.RETURN_GENERATED_KEYS);
      preparedStatement.setInt(1,utorId);
      preparedStatement.setString(2, name);
      int id = preparedStatement.executeUpdate();
      if (id > 0) {
        ResultSet uniqueKey = preparedStatement.getGeneratedKeys();
        if (uniqueKey.next()) {
          return uniqueKey.getInt(1);
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    throw new DatabaseInsertException();
  }

  /**
   * Insert a professor into the PROFESSORS table.
   * @param utorId The utorID of a professor.
   * @param name The name of a professor.
   * @param connection
   * @return An integer > 0 to represent a successful new row.
   * @throws DatabaseInsertException
   */
  protected static int insertProfessor(int utorId, String name, Connection connection) throws DatabaseInsertException{
    String sql = "INSERT INTO PROFESSORS(ID, NAME) VALUES(?,?)";
    try {
      PreparedStatement preparedStatement = connection.prepareStatement(sql, 
                                              Statement.RETURN_GENERATED_KEYS);
      preparedStatement.setInt(1,utorId);
      preparedStatement.setString(2, name);
      int id = preparedStatement.executeUpdate();
      if (id > 0) {
        ResultSet uniqueKey = preparedStatement.getGeneratedKeys();
        if (uniqueKey.next()) {
          return uniqueKey.getInt(1);
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    throw new DatabaseInsertException();
  }
  
  
}
