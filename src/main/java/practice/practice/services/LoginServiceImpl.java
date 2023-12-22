package practice.practice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import practice.practice.models.Member;
import practice.practice.repository.MemberRepository;
import practice.practice.services.interfaces.LoginService;

import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    MemberRepository memberRepository;

    @Override
    public boolean tryLogIn(Member member) {
       List<Member> targetMember =  memberRepository.findByPasswordAndUsername(member.getPassword(),member.getUsername());
       if(targetMember.size()==1){
           System.out.print("로그인 성공 id : " + targetMember.get(0).getUsername() + "\r" + "pw : "+ targetMember.get(0).getPassword() );
           return true;
       }else{
           System.out.println("로그인 실패");
           return false;
       }
    }

    @Override
    public void matchingMemberData() {

    }

    @Override
    public void permissionLogin() {

    }

    @Override
    public void logingMemberData() {

    }
}
