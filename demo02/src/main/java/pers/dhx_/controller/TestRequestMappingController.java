package pers.dhx_.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Dhx_
 * @className TestRequestMappingController
 * @description TODO
 * @date 2022/7/25 13:56
 */
@Controller
@RequestMapping("/class")   // 请求映射的基本信息，方法上面试具体信息  /controller/index , 类似于父目录与子目录
public class TestRequestMappingController {
//    此时控制器方法所匹配的请求的路径/controller/index

    @RequestMapping("/testRest/{id}/{username}")
    public String test(@PathVariable("id") String id, @PathVariable("username")String username){
        String userId =id;
        String userName=username;
        System.out.println("id:"+id+",username:"+username);
        return "success";
    }
    @RequestMapping("/index")
    public String protal(){
        return "index";
    }
    @RequestMapping(value={"/hello","hello1"},
    method ={ RequestMethod.POST,RequestMethod.GET})   // 只匹配get方式的请求
    public String test(){
        return "success";
    }
}
