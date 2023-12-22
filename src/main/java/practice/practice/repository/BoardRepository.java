package practice.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import practice.practice.models.Board;

public interface BoardRepository extends JpaRepository<Board,String> {
}
