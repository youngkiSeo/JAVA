package com.example.board11_1.board;

import com.green.board11.board.model.BoardInsDto;
import com.green.board11.board.model.BoardSelDto;
import com.green.board11.board.model.BoardUpdDto;
import com.green.board11.board.model.BoardVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {
    public final BoardMapper mapper;

    @Autowired
    public BoardService(BoardMapper mapper) {
        this.mapper = mapper;
    }
    public int InsBoard(BoardInsDto dto){
        return mapper.InsBoard(dto);
    }
    public int UpdBoard(BoardUpdDto dto){
        return mapper.UpdBoard(dto);
    }

    public List<BoardVo> SelBoard (BoardSelDto dto){
        int startIdx = (dto.getPage()-1) * dto.getRow();
        dto.setStartIdx(startIdx);
        return mapper.SelBoard(dto);
    }


}
