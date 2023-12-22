package practice.practice.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import practice.practice.models.Menu;

public interface MenuRepository extends JpaRepository<Menu,Long> {

}
