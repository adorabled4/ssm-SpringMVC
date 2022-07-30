package pers.dhx_.mapper;

import org.apache.ibatis.annotations.Mapper;
import pers.dhx_.pojo.Emp;

import java.util.List;

/**
 * @author Dhx_
 * @className EmpMapper
 * @description TODO
 * @date 2022/7/29 18:46
 */
//@Mapper添加了@Mapper注解之后这个接口在编译时会生成相应的实现类
// *
// * 需要注意的是：这个接口中不可以定义同名的方法，因为会生成相同的id
// * 也就是说这个接口是不支持重载的
public interface EmpMapper {
    /**
     * 查询所有员工的信息
     * @return
     */
    List<Emp> getAllEmp();
}
