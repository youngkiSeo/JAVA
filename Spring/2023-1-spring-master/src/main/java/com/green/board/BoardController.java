package com.green.board;

import org.springframework.beans.factory.annotation.Autowired;
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
    public int boardPost(@RequestBody BoardEntity entity) {
        System.out.println(entity);
        return service.insBoard(entity);
    }

    @GetMapping
    public List<BoardEntity> boardGetAll() {
        return service.selBoardAll();
    }

    @GetMapping("/{iboard}")
    public BoardEntity boardGetById(@PathVariable int iboard) {
        BoardEntity entity = new BoardEntity();
        entity.setIboard(iboard);
        return service.selBoardById(entity);
    }

    @PutMapping
    public int boardPut(@RequestBody BoardEntity entity) {
        System.out.println(entity);
        return service.updBoard(entity);
    }

    @DeleteMapping("/{iboard}")
    public int boardDelete(@PathVariable int iboard) {
        BoardEntity entity = new BoardEntity();
        entity.setIboard(iboard);
        System.out.println(entity);
        return service.delBoard(entity);
    }
}
