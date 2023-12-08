package com.jdc.test.mapper;

import com.jdc.test.pojo.Employee;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface EmployeeMapper {

    @Insert("INSERT INTO Employee (name, photo_url) VALUES (#{name}, #{photoUrl})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insertEmployee(Employee employee);

    @Delete("DELETE FROM Employee WHERE id = #{id}")
    void deleteEmployeeById(Long id);

    @Update("UPDATE Employee SET name = #{name}, photo_url = #{photoUrl} WHERE id = #{id}")
    void updateEmployee(Employee employee);

    @Select("SELECT * FROM Employee WHERE id = #{id}")
    Employee selectEmployeeById(Long id);

    @Select("SELECT * FROM Employee")
    List<Employee> selectAllEmployees();

    // 根据名称模糊查询
    @Select("SELECT * FROM Employee WHERE name LIKE CONCAT('%', #{name}, '%')")
    List<Employee> selectEmployeesByName(String name);

    // 分页查询
    @Select("SELECT * FROM Employee LIMIT #{start}, #{pageSize}")
    List<Employee> selectEmployeesByPage(@Param("start") int start, @Param("pageSize") int pageSize);
}

