package pers.dhx_.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import pers.dhx_.service.HelloService;

/**
 * @author Dhx_
 * @className ListenerTest
 * @description TODO
 * @date 2022/7/29 18:04
 */
@Controller
public class ListenerTest {

    @Autowired
    private HelloService helloService;
}
