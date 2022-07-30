package pers.dhx_.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Dhx_
 * @className MyController
 * @description TODO
 * @date 2022/7/24 10:04
 */
@Controller
public class MyController {
    @RequestMapping("/")
    private String protal(){
    // 将逻辑视图 返回
        return "index";
    }
    @RequestMapping("/hello")
    private String hello(){
        return "success";
    }
}
