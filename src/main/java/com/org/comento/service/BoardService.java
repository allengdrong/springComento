package com.org.comento.service;

import com.org.comento.domain.BoardVO;

import java.util.List;

public interface BoardService {

    // 1. 게시판 리스트
    public List<BoardVO> list() throws Exception;

    // 2. 게시판 글보기
    public BoardVO view(Long no, int inc) throws Exception;

    // 3. 게시판 글쓰기
    public int write(BoardVO vo) throws Exception;

    // 4. 게시판 글수정
    public int update(BoardVO vo) throws Exception;

    // 5. 게시판 글삭제
    public int delete(BoardVO vo) throws Exception;

}

