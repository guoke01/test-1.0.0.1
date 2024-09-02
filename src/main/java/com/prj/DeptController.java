package com.prj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    DeptMapper deptMapper;
    @GetMapping("/findDept")
    public List<Dept> findDept(){

        return deptMapper.findDept();
    }

    @GetMapping("/findDeptById")
    public Dept findDeptById(String id){

        return deptMapper.findDeptById(id);
    }

    @PostMapping("/insertDept")
    public int insertDept(@RequestBody Dept dept){

        return deptMapper.insertDept(dept);
    }

    @PutMapping("/dept")
    public Dept updateDept(@RequestBody Dept dept){

        deptMapper.updateDept(dept);
        return this.findDeptById(dept.getId());
    }

    @DeleteMapping("/dept")
    public int delDept(String id){
        return deptMapper.delDept(id);
    }
}
