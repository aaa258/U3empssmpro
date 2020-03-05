package com.team.emp.controller;

import com.github.pagehelper.PageInfo;
import com.team.emp.entity.Dept;
import com.team.emp.entity.Emp;
import com.team.emp.service.DeptService;
import com.team.emp.service.EmpService;
import com.team.emp.util.PageCondition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class EmpController {
    @Autowired
    private EmpService empService;
    @Autowired
    private DeptService deptService;
    @RequestMapping(value = "/showempinfo")
    public String showempinfo(PageCondition pageCondition, Model model){
        PageInfo<Emp> pageInfo=empService.getAllEmpInfo(pageCondition);
        List<Dept> list=deptService.getDeptInfo();
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("deptList",list);
        model.addAttribute("pageCondition",pageCondition);
        return "showEmp";
    }
    @RequestMapping(value = "/addshowemp")
    public String addshowemp(Model model){
        List<Dept> list=deptService.getDeptInfo();
        model.addAttribute("deptList",list);
        return "addEmp";
    }
    @RequestMapping(value = "/addemp")
    public String addemp(Emp emp){
        int temp=empService.addEmpInfo(emp);
        if (temp>0){
            return "redirect:showempinfo";
        }else {
            return "error";
        }
    }
    @RequestMapping(value = "/updateshowemp")
    public String updateshowemp(Integer eid,Model model){
        Emp emp=empService.getOneEmp(eid);
        List<Dept> list=deptService.getDeptInfo();
        model.addAttribute("deptList",list);
        model.addAttribute("emp",emp);
        return "updateEmp";
    }
    @RequestMapping(value = "/updatemp")
    public String updatemp(Emp emp){
        int temp=empService.updatemp(emp);
        if (temp>0){
            return "redirect:showempinfo";
        }else {
            return "error";
        }
    }
    @RequestMapping(value = "/deletemp")
    public String deletemp(Integer eid){
        int temp=empService.deletemp(eid);
        if (temp>0){
            return "redirect:showempinfo";
        }else {
            return "error";
        }
    }
}
