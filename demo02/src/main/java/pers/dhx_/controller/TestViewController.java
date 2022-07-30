package pers.dhx_.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Dhx_
 * @className TestViewController
 * @description TODO
 * @date 2022/7/26 11:51
 */
@Controller
public class TestViewController {
    @RequestMapping("/test/view/thymeleaf")
    public String testThymeleaf(){
        return "success";
    }
}
