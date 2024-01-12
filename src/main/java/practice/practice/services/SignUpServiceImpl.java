package practice.practice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import practice.practice.models.Auth_member;
import practice.practice.models.Member;
import practice.practice.repository.Auth_memberRepogitory;
import practice.practice.repository.MemberRepository;
import practice.practice.services.interfaces.SignUpService;

@Service
public class SignUpServiceImpl implements SignUpService {

    @Autowired
    private MemberRepository memberRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private Auth_memberRepogitory auth_memberRepogitory;

    @Override
    public void registNewMember(Member member){
        member.setPassword(passwordEncoder.encode(member.getPassword()));
        memberRepository.save(member);
        Auth_member auth_member = new Auth_member();
        auth_member.setMember(member);
        System.out.println("가입 시도 username : "+member.getUsername());
        auth_memberRepogitory.save(auth_member);
    };

    @Override
    public void modifyMember() {

    }

    @Override
    public void retireMember() {

    }





}
