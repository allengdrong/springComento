package com.org.comento.service;

import com.org.comento.dao.BoardDAO;
import com.org.comento.domain.BoardVO;
import lombok.Setter;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
@Qualifier("bsi")
public class BoardServiceImpl implements BoardService {

    @Inject
    private BoardDAO dao;

    @Override
    public List<BoardVO> list() throws Exception {
        return dao.list();
    }

    @Override
    public BoardVO view(Long no, int inc) throws Exception {
        if(inc == 1)
            dao.increase(no);
        return dao.view(no);
    }

    @Override
    public int write(BoardVO vo) throws Exception {
        return dao.write(vo);
    }

    @Override
    public int update(BoardVO vo) throws Exception {
        return dao.update(vo);
    }

    @Override
    public int delete(BoardVO vo) throws Exception {
        return dao.delete(vo);
    }

}