package pers.dhx_.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import pers.dhx_.pojo.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author Dhx_
 * @className TestParamController
 * @description TODO
 * @date 2022/7/25 17:43
 */
@Controller
public class TestParamController{
    @RequestMapping("/param/servletAPI")
    public String getParmByServletAPI(HttpServletRequest request){
        HttpSession session= request.getSession();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username:"+username+",password:"+password);
        return "success";
    }

    @RequestMapping("/param")
    public String getParam(@CookieValue(value="JSESSIONID",required=false,defaultValue="......")
                                   String jsessionId ){
        System.out.println("jsessionId:"+jsessionId);
        return "success";
    }
    @RequestMapping
    public String getParamByPojo(User user){
        System.out.println(user);
        return "success";
    }
}
