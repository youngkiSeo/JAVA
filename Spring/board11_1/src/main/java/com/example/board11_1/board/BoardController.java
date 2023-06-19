package com.example.board11_1.board;

import com.green.board11.board.model.BoardInsDto;
import com.green.board11.board.model.BoardSelDto;
import com.green.board11.board.model.BoardUpdDto;
import com.green.board11.board.model.BoardVo;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/board")
public class BoardController {
    private final BoardService service;

    @Autowired
    public BoardController(BoardService service) {
        this.service = service;
    }

    @PostMapping
    @Operation(summary = "글 작성")
    public int PostBoard(@RequestParam String title,
                         @RequestParam String ctnt,
                         @RequestParam int iuser
                         ){
        BoardInsDto dto = new BoardInsDto();
        dto.setTitle(title);
        dto.setCtnt(ctnt);
        dto.setIuser(iuser);
        return service.InsBoard(dto);
    }
    @PutMapping
    @Operation(summary = "글 수정")
    public int PutBoard(@RequestParam int iboard,
                        @RequestParam String title,
                        @RequestParam String ctnt,
                        @RequestParam int iuser){
        BoardUpdDto dto = new BoardUpdDto();
        dto.setIboard(iboard);
        dto.setTitle(title);
        dto.setCtnt(ctnt);
        dto.setIuser(iuser);
        return service.UpdBoard(dto);
    }

    @GetMapping
    @Operation(summary = "글 보기")
    public List<BoardVo> GetBoard(@RequestParam(defaultValue = "1") int page,
                                  @RequestParam(defaultValue = "30") int row,
                                  Model model){
        BoardSelDto dto = new BoardSelDto();
        dto.setPage(page);
        dto.setRow(row);
        model.addAllAttributes("boardList",service.SelBoard(dto));
    }
}
