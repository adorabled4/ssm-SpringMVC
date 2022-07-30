package pers.dhx_.service;

import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import pers.dhx_.pojo.Emp;

import java.util.List;

/**
 * @author Dhx_
 * @className EmpService
 * @description TODO
 * @date 2022/7/29 19:19
 */
public interface EmpService {
     PageInfo<Emp> getAllEmpByPage(Integer pageNum);
     List<Emp> getAllEmp();
}
