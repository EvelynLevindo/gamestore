package com.evelynlevindo.gamestore.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import com.evelynlevindo.gamestore.Model.Game;
import com.evelynlevindo.gamestore.Repository.GameRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class GameController {
    
    // Conversar com o CRUD
    @Autowired
    GameRepository gameRepository;

    @GetMapping("/game-list")
    public ModelAndView gameList() {
        ModelAndView mv = new ModelAndView("/games/list");
        mv.addObject("Games", gameRepository.findAll());
        return mv;
    }

    @PostMapping("game-add")
    public ModelAndView createGame(Game game) {
        ModelAndView mv = new ModelAndView("/games/add");
        gameRepository.save(game);
        mv.setViewName("redirect:/game-list");
        
        return mv;
    }
}
