package practice.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import practice.practice.models.Member;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member,String> {
    List<Member> findByPasswordAndUsername(String password,String username);
}
