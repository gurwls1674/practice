package practice.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import practice.practice.models.Auth_member;
import practice.practice.models.Member;

public interface Auth_memberRepogitory extends JpaRepository<Auth_member,String>  {
}
