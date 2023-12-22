package practice.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import practice.practice.models.Member;
import practice.practice.models.Menu;
import practice.practice.repository.MenuRepository;

import java.util.List;

@Controller
public class UrlController {

    @Autowired
    private MenuRepository menuRepository;

    @GetMapping("/")
    public String goMain (Model model){
        System.out.println("메인 페이지 진입 확인");
        List<Menu> menu = menuRepository.findAll();
        model.addAttribute("menu",menu);
        return "mainHome";
    }

    @GetMapping("/main")
    public String goMain2 (Model model){
        System.out.println("메인 페이지 진입 확인");
        List<Menu> menu = menuRepository.findAll();
        model.addAttribute("menu",menu);
        return "mainHome";
    }

    @GetMapping("/mainTest")
    public String urlTest (){
        System.out.println("진입테스트");
        return "mainHome";
    }

    @GetMapping("/manage")
    public String managePage (){
        System.out.println("관리자 페이지 접속");
        System.out.println("123123");
        return "mainHome";
    }
}
