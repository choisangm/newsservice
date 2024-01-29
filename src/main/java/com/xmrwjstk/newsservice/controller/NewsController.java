package com.xmrwjstk.newsservice.controller;

import com.xmrwjstk.newsservice.dto.CategoryDTO;
import com.xmrwjstk.newsservice.service.NewsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class NewsController {

    private final NewsService newsService;

    @GetMapping("/")
    public String newsMain(Model model){
        model.addAttribute("nick_name","에스비에스");
        return "/index";
    }

    @GetMapping("/category")
    public String getCategories(Model model){
        List<CategoryDTO> categories = newsService.findAllCategories();
        model.addAttribute("categories",categories);
        return "/category";
    }
}
