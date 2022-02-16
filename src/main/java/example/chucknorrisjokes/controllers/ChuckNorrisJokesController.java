package example.chucknorrisjokes.controllers;

import example.chucknorrisjokes.services.ChuckNorrisJokesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
@RequiredArgsConstructor
public class ChuckNorrisJokesController {

    private final ChuckNorrisJokesService chuckNorrisJokesService;

    @GetMapping
    public String getJoke(Model model){

        model.addAttribute("joke", chuckNorrisJokesService.getJoke());

        return "index";
    }
}
