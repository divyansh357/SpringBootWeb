package com.divyansh.SpringBootweb;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.net.http.HttpRequest;

@Controller
public class HomeController {

    @RequestMapping("/hello")
    public String home(){
        System.out.println("Home method called");
        return "index.jsp";
    }

//    @RequestMapping("/add")
//    public String add(HttpServletRequest req, HttpSession session){
//        int num1 = Integer.parseInt(req.getParameter("num1"));
//        int num2 = Integer.parseInt(req.getParameter("num2"));
//        int result = num1 + num2;
//        session.setAttribute("result", result);
//        return  "result.jsp";
//    }

    @RequestMapping("/add")
    public String add(@RequestParam("num1")  int num, int num2 , HttpSession session){
        int result = num + num2;
        session.setAttribute("result", result);
        return  "result.jsp";
    }
}
