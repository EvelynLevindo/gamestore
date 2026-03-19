package com.evelynlevindo.gamestore.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {

    // Rotas de navegação do site
    @GetMapping("/") // GetMapping lê a barra de pesquisa após o url do domínio do site
    public String getIndex() {
        return "index";
    }
    @GetMapping("/home")
    public String getHome() {
        return "index";
    }
    @GetMapping("/game-add")
    public String getGameAdd() {
        return "/game/add";
    }
}
