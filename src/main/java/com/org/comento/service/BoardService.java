package com.org.comento.service;

import com.org.comento.domain.BoardVO;

import java.util.List;

public interface BoardService {

    // 1. 게시판 리스트
    public List<BoardVO> list() throws Exception;
}

