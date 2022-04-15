

import java.sql.*;

public class AllCount  {
       int coutTable;
        int coutWord=0;
    public  AllCount(){
        String str="SELECT\n" +
                "\tCOUNT(*) TABLES,\n" +
                "\ttable_schema\n" +
                "FROM\n" +
                "\tinformation_schema. TABLES\n" +
                "WHERE\n" +
                "\ttable_schema = 'lytdatabase'\n" +
                "GROUP BY\n" +
                "\ttable_schema;";
        ResultSet resultSet = new Dao().query(str);

       try{
           resultSet.next();
           System.out.println(resultSet.getString(1));
           coutTable=Integer.parseInt(resultSet.getString(1));

       }
       catch (Exception e){

       }

        try {
            Class.forName("com.mysql.jdbc.Driver");
            /*
            * 修改ip地址、数据库名、和数据库密码
            * */
            Connection connection= DriverManager.getConnection("jdbc:mysql://*ip地址（本地可直接忽略）/数据库名?characterEncoding=UTF-8","root","密码");
            Statement statement=connection.createStatement();
            for (int i = 0; i < coutTable; i++) {
                int j=i+1;
                String string="select * from 高频"+j;
                ResultSet rrr=statement.executeQuery(string);
                while (rrr.next()){
                    coutWord++;
                }
            }
            System.out.println("一共学习了"+coutWord+"个单词");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }


}
