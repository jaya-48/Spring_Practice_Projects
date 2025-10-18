package com.JDBCEx.First.Dao;

import com.JDBCEx.First.model.Employee2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
@Repository
public class Company {
    @Autowired
    private DataSource dataSource;
    List<Employee2> employee2s=new ArrayList<>();
    public List<Employee2> getAllBossEmployee(){
        try{
            Connection con = dataSource.getConnection();
            PreparedStatement pstmnt = con.prepareStatement("select * from Employee2");
            ResultSet rs = pstmnt.executeQuery();
            while(rs.next()){
                Employee2 emp2=new Employee2();
                emp2.setId(rs.getInt(1));
                emp2.setName(rs.getString(2));
                emp2.setCity(rs.getString(3));
                //.setId(rs.getInt(1));
                emp2.setRole(rs.getString(4));
                if(emp2.getRole().equals("BOSS")){
                    employee2s.add(emp2);
                }

                //return employee2s;

            }
            return employee2s;

        } catch (Exception e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
        }
        return null;
    }

}
