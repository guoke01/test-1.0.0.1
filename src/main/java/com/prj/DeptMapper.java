package com.prj;

import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DeptMapper {
    @Select("select * from dept")
    List<Dept> findDept();

    @Insert(" insert into dept values (#{id},#{name},#{manager})")
    int insertDept(Dept dept);

    @Select("select * from dept where id = #{id}")
    Dept findDeptById(String id);

    @Update("update dept set name = #{name}, manager = #{manager} where id = #{id}")
    int updateDept(Dept dept);

    @Delete("delete from dept where id = #{id}")
    int delDept(String id);
}
