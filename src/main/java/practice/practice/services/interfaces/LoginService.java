package practice.practice.services.interfaces;

import org.springframework.stereotype.Service;
import practice.practice.models.Member;

@Service
public interface LoginService {

    //로그인 시도
    public boolean tryLogIn(Member member);

    //아이디,비밀번호 비교
    public void matchingMemberData();

    //로그인 승인
    public void permissionLogin();

    //로그인 기록 저장
    public void logingMemberData();
}
