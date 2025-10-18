package com.JDBCEx.First.Dao;

import com.JDBCEx.First.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class RepoImp implements Repo {
    @Autowired
    private DataSource dataSource;
    List<Employee>list1=new ArrayList<>();
    @Override
    public List<Employee>getAllEmployees() {
        try {
            Connection con = dataSource.getConnection();
            PreparedStatement pstmnt = con.prepareStatement("SELECT * FROM Employee");
            ResultSet rs = pstmnt.executeQuery();
            while(rs.next()) {
                Employee emp = new Employee();
                emp.setId(rs.getInt(1));
                emp.setName(rs.getString(2));
                emp.setCity(rs.getString(3));
                list1.add(emp);
            }

            return list1;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
