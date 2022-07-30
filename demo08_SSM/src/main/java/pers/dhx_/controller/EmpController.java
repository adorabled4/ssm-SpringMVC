package pers.dhx_.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pers.dhx_.pojo.Emp;
import pers.dhx_.service.EmpService;
import pers.dhx_.service.impl.EmpServiceImpl;

import java.util.Collection;
import java.util.List;
/**
 * @author Dhx_
 * @className EmpController
 * @description TODO
 * @date 2022/7/29 18:47
 *  * 查询所有员工 --》 /employee   get
 *  * 跳转到添加页面 --》 /to/add   get
 *  * 新增员工  --》 /employee   post
 *  * 跳转到修改页面 --》 /employee/1   get
 *  * 修改员工信息 --》 /employee   put
 *  * 删除员工 --》 /employee/1   delete
 */
@Controller
public class EmpController {
    @Autowired
    private EmpService empService;
    @RequestMapping(value="/Emp" ,method = RequestMethod.GET)
    public String getAllEmp(Model model){
        List<Emp> list=empService.getAllEmp();
        model.addAttribute("empList",list); // 将信息在请求域中共享
        return "employee_list";
    }
    @RequestMapping(value="/Emp/page/{pageNum}" ,method = RequestMethod.GET)
    public String getAllEmpByPage(Model model,@PathVariable("pageNum") Integer pageNum){
        PageInfo<Emp> page= empService.getAllEmpByPage(pageNum);  // 根据页码获取页面
       model.addAttribute("page",page); // 将信息在请求域中共享
       return "employee_list";
    }
}



