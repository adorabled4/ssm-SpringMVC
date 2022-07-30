package pers.dhx_.config;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.filter.HiddenHttpMethodFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

/**
 * @author Dhx_
 * @className WebInit
 * @description TODO  代替 web.xml
 * @date 2022/7/29 9:37
 */
public class WebInit extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {  // 设置一个配置类 代替Spring的配置文件
        return new Class[]{SpringConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {//设置一个配置类 代替springmvc的配置文件
        return new Class[]{WebConfig.class};
    }

    @Override
    protected String[] getServletMappings() { // 设置springmvc的前端控制器 DispatcherServlet的 url-pattern
        return new String[]{"/"};
    }


    @Override  // 设置当前的过滤器
    protected Filter[] getServletFilters() {
        // 创建编码过滤器 CharacterEncodingFilter
        CharacterEncodingFilter characterEncodingFilter=new CharacterEncodingFilter();
        characterEncodingFilter.setEncoding("utf-8");
        characterEncodingFilter.setForceEncoding(true); //  设置响应的编码

        //创建处理请求方式的处理器
        HiddenHttpMethodFilter hiddenHttpMethodFilter=new HiddenHttpMethodFilter();
        return new Filter[]{characterEncodingFilter,hiddenHttpMethodFilter};
    }
}
