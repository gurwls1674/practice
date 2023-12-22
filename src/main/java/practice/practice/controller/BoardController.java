package practice.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import practice.practice.models.Board;
import practice.practice.repository.BoardRepository;

import java.util.List;

@Controller
@RequestMapping("/api")
public class BoardController {

    @Autowired
    private BoardRepository boardRepository;

    @GetMapping("/board")
    public String goMain (Model model){
        System.out.println("게시판 목록 조회");

        List<Board> menu = boardRepository.findAll();
        model.addAttribute("board",menu);

        return "boardList";

    }

}
