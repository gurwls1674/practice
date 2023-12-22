package practice.practice.services.interfaces;


import practice.practice.models.Member;

public interface SignUpService {

    public void registNewMember(Member member);
    public void modifyMember();
    public void retireMember();

}
