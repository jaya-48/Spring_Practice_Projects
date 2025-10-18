package com.example.SpringDataJPA1.Repository;

import com.example.SpringDataJPA1.Entity.Student;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends CrudRepository<Student,Integer> {
    public List<Student> findByMarksGreaterThanAndCourse(int marks,String course);
    public List<Student> findByMarksBetween(int start,int end);
    public List<Student> findByCourse(String Course);
    @Query("From Student")
    public List<Student> searchAllStudents();
    @Transactional
    @Modifying
    @Query(value = "INSERT INTO student(id,name,email,course,marks)VALUES(:id,:name,:email,:course,:marks)",nativeQuery = true)
    public int insertStudent(int id,String name,String email,String course,int marks);
    @Transactional
    @Modifying
    @Query(value="UPDATE Student SET course=:course WHERE id=:id")
    public int updateStudent(int id,String course);
    @Transactional
    @Modifying
    @Query(value="DELETE FROM Student WHERE id=:id")
    public int deleteStudent(int id);

}
