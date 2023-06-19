package com.green.java.dao;

import com.green.java.dao.model.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class MYConnTest {
    public static void main(String[] args) {
        BoardEntity entity = new BoardEntity();
//        entity.setCtnt("내용수정3");
//        entity.setTitle("제목수정3");
//        entity.setIuser(1);
//        entity.setIboard(1009);
        BoardDao dao = new BoardDao();
        //dao.insBoard(entity);
        BoardUpdDto upddto = new BoardUpdDto();
        upddto.setCtnt("ctnt");
        upddto.setIboard(1009);
        upddto.setTitle("title");
        upddto.setIuser(1);
        //dao.updBoard(upddto);


//        BoardSelDto dto = new BoardSelDto();
//        dto.setIboard(1009);
//        BoardDetailVo result = boardDao.selBoardDetail(dto);
//        System.out.println(result);


        int page =2;
        int row = 30;
        int startIdx = (page - 1 ) * row;
        BoardDao boardDao = new BoardDao();
        BoardSelDto selDto = new BoardSelDto();
        selDto.setPage(2);
        selDto.setRow(30);
        selDto.setStartIdx(startIdx);
        List<BoardVo> list =  boardDao.selBoard(selDto);
        for (BoardVo vo: list) {
            System.out.println(vo);
        }
        //System.out.println(list.toString());


    }
}
