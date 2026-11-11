package com.divyansh.SpringBootweb;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.net.http.HttpRequest;

@Controller
public class HomeController {

    @RequestMapping("/hello")
    public String home(){
        System.out.println("Home method called");
        return "index";
    }

//    @RequestMapping("/add")
//    public String add(HttpServletRequest req, HttpSession session){
//        int num1 = Integer.parseInt(req.getParameter("num1"));
//        int num2 = Integer.parseInt(req.getParameter("num2"));
//        int result = num1 + num2;
//        session.setAttribute("result", result);
//        return  "result.jsp";
//    }

    // Request Param and Model Object
    //@RequestMapping("/add")
//    public String add(@RequestParam("num1")  int num, int num2 , Model model){
//        int result = num + num2;
//        model.addAttribute("result", result);
//        return  "result";
//    }

    // Model and View
    @RequestMapping("/add")
    public ModelAndView add(@RequestParam("num1")  int num, int num2 , ModelAndView mv){
        int result = num + num2;
        mv.addObject("result", result);
        mv.setViewName("result");
        return mv;
    }

}
