package com.org.comento.controller;

import com.org.comento.service.BoardService;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardController {

    private final String MODULE = "board";

    @Autowired
    @Qualifier("bi")
    private BoardService service;

    // 1. 게시판 리스트
    @GetMapping("/list.do")
    public String list(Model model) throws Exception {

        model.addAttribute("list", service.list());

        return MODULE + "/list";
    }

}
