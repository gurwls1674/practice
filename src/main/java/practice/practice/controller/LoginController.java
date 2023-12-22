package practice.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import practice.practice.models.Member;
import practice.practice.models.Menu;
import practice.practice.repository.MemberRepository;
import practice.practice.repository.MenuRepository;
import practice.practice.services.LoginServiceImpl;
import practice.practice.services.interfaces.LoginService;

import java.util.List;

@Controller
@RequestMapping("/account")
public class LoginController {

    @Autowired
    private MenuRepository menuRepository;
    @Autowired
    private MemberRepository memberRepository;
    @Autowired
    private LoginServiceImpl loginServiceImpl;

    @GetMapping("/login")
    public String goMain (Model model){
        System.out.println("로그인 페이지 진입");
        model.addAttribute("member",new Member());
        return "login";
    }

    @PostMapping("/login")
    public String tryLogin (@ModelAttribute("member")Member member){
        System.out.println("로그인 시도");
        System.out.println(member.getUsername());
        System.out.println(member.getPassword());
        boolean loginChecking = loginServiceImpl.tryLogIn(member);
        if(loginChecking==true) return "redirect:/main";
        else return "redirect:/login";
    }


}
