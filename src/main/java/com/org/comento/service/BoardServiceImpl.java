package com.org.comento.service;

import com.org.comento.dao.BoardDAO;
import com.org.comento.domain.BoardVO;
import lombok.Setter;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Qualifier("bi")
public class BoardServiceImpl implements BoardService{

    @Setter
    private BoardDAO dao;

    @Override
    public List<BoardVO> list() throws Exception {
        return dao.list();
    }

}
