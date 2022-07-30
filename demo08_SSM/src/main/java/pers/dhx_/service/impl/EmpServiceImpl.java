package pers.dhx_.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pers.dhx_.mapper.EmpMapper;
import pers.dhx_.pojo.Emp;
import pers.dhx_.service.EmpService;

import java.util.List;

/**
 * @author Dhx_
 * @className EmpServiceImpl
 * @description TODO
 * @date 2022/7/29 19:19
 */
@Service
@Transactional  // 执行出错后可以回滚
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper empMapper;

    public PageInfo<Emp> getAllEmpByPage(Integer pageNum) {
        PageHelper.startPage(pageNum, 4);  // 开启分页功能
        List<Emp> list = empMapper.getAllEmp();  // 查询所有员工信息
        PageInfo<Emp> page = new PageInfo<>(list, 5);  // 导航分页 ，下面显示几个页码
        return page;
    }
    @Override
    public List<Emp> getAllEmp() {
        return empMapper.getAllEmp();
    }
}
