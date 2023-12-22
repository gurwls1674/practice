package practice.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import practice.practice.models.Member;
import practice.practice.services.SignUpServiceImpl;

@Controller
@RequestMapping("signUp")
public class SignUpController {

    @Autowired
    private SignUpServiceImpl signUpserviceImpl;
    
    @GetMapping("/checkOut")
    public String go_signUp(Model model){
        System.out.println("회원가입 페이지 진입");
        model.addAttribute("member",new Member());
        return "signUp";
    }


    @PostMapping("/registProc")
    public String registNewMember(@ModelAttribute("member") Member member){
        System.out.println("새 회원으로 가입");
        signUpserviceImpl.registNewMember(member);
        return "redirect:/account/login";
    }
}
