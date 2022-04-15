import java.sql.*;

public class Dao {
    ResultSet set=null;
    Connection connection=null;
    Statement statement=null;
    public ResultSet query(String sql){

        try {
            Class.forName("com.mysql.jdbc.Driver");
            /*
             这里需要修改！！数据库名、ip地址和密码


            * */
             connection= DriverManager.getConnection("jdbc:mysql://ip地址（本地可以忽略）/数据库名?characterEncoding=UTF-8","root","密码");
             statement=connection.createStatement();
             set=statement.executeQuery(sql);



        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return  set;
    }
    public void close(){
        try {
            statement.close();
            connection.close();

        }
        catch (Exception e){

        }
    }
}
