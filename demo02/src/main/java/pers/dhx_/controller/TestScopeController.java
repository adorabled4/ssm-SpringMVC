package pers.dhx_.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author Dhx_
 * @className TestScopeController
 * @description TODO
 * @date 2022/7/26 9:15
 */
@Controller
public class TestScopeController {
    @RequestMapping("/test/mav")
    public ModelAndView testMAV(){
        /**
         * ModelAndView包含 model 和view 的功能，
         * model:向请求域中共享数据
         * view：创建逻辑视图实现页面跳转
         */
        ModelAndView modelAndView=new ModelAndView();
        // 向请求域中共享数据
        modelAndView.addObject("testRequestScope","helloMAV");
        //设置逻辑视图
        modelAndView.setViewName("success");
        return modelAndView;
    }

    @RequestMapping("/test/model")
    public String testMAV(Model model){

        // 向请求域中共享数据
        model.addAttribute("testRequestScope","helloMAV");
        //返回逻辑视图
        return "success";
    }

    @RequestMapping("/test/modelMap")
    public String testModelMap(ModelMap modelMap){
        // 向请求域中共享数据
        modelMap.addAttribute("testRequestScope","helloMAV");
        //返回逻辑视图
        return "success";
    }
    @RequestMapping("/test/map")
    public String testMap(Map<String,Object> map){
        // 向请求域中共享数据
        map.put("testRequestScope","helloMAV");
        //返回逻辑视图
        return "success";
    }

    @RequestMapping("/test/application")
    public String testApplication(HttpSession session){
        ServletContext servletContext= session.getServletContext();
        servletContext.setAttribute("testApplication","hello Application");
        return "success";
    }
}
