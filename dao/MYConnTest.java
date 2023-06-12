package com.green.java.dao;

import com.green.java.dao.model.BoardDetailVo;
import com.green.java.dao.model.BoardEntity;
import com.green.java.dao.model.BoardSelDto;
import com.green.java.dao.model.BoardUpdDto;

import java.sql.Connection;
import java.sql.SQLException;

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

        BoardDao boardDao = new BoardDao();
        BoardSelDto dto = new BoardSelDto();
        dto.setIboard(1009);
        BoardDetailVo result = boardDao.selBoardDetail(dto);
        System.out.println(result);
    }
}
