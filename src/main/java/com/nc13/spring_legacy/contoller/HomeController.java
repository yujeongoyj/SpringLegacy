package com.nc13.spring_legacy.contoller;


import com.nc13.spring_legacy.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private BoardService boardService;

    @Autowired
    public HomeController(BoardService boardService) {
        this.boardService = boardService;
    }

    @GetMapping("/")
    public String showHome(Model model) {
        model.addAttribute("list", boardService.selectAll());
        return "index";
    }

    @GetMapping("/board/showAll")
    public String showAll(Model model) {
        model.addAttribute("list", "showAll에 돠착");
        return "board/showAll";
    }
}
