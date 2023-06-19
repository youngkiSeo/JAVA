package com.example.board11_1.board;

import com.green.board11.board.model.BoardInsDto;
import com.green.board11.board.model.BoardSelDto;
import com.green.board11.board.model.BoardUpdDto;
import com.green.board11.board.model.BoardVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    int InsBoard(BoardInsDto dto);
    int UpdBoard(BoardUpdDto dto);
    List<BoardVo>SelBoard(BoardSelDto dto);
}
