package com.org.comento.dao;

import com.org.comento.domain.BoardVO;

import java.util.List;

public interface BoardDAO {

    // 1. 리스트
    public List<BoardVO> list() throws Exception;

}
