package com.org.comento.controller;

import com.org.comento.domain.BoardVO;
import com.org.comento.service.BoardService;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
@Log4j
public class BoardController {

    private final String MODULE = "board";

    @Autowired
    @Qualifier("bsi")
    private BoardService service;

    // 1. 게시판 리스트 - 검색 / list.do - get
    @GetMapping("/list.do")
    public String list(Model model) throws Exception {
        log.info("list() ...... " );
        model.addAttribute("list", service.list());
        return MODULE + "/list";
    }

    // 2. 게시판 글보기 / view.do - get
    @GetMapping("/view.do")
    public String view(Model model, Long no, int inc) throws Exception {

        log.info("view().no : "+ no +" - 게시판 글보기 --------------");

        model.addAttribute("vo", service.view(no, inc));

        return MODULE + "/view";
    }

    // 3. 게시판 등록 폼 / write.do - get
    @GetMapping("/write.do")
    public String writeForm() {
        return MODULE + "/write";
    }

    // 3. 게시판 등록 처리 / write.do - post
    @PostMapping("/write.do")
    public String write(BoardVO vo) {
        return "redirect:list.do";
    }

    // 4. 게시판 글수정 폼 / update.do - get
    @GetMapping("/update.do")
    public String updateForm(Model model, Long no) {
        return MODULE + "/update";
    }

    // 4. 게시판 글수정 처리 / update.do - post
    @PostMapping("/update.do")
    public String update(BoardVO vo) {
        return "redirect:view.do?no=" + vo.getNo() +"&inc=0";
    }

    // 5. 게시판 글삭제 / delete.do - get
    @GetMapping("/delete.do")
    public String delete(BoardVO vo) {
        return "redirect:list.do";
    }

}
