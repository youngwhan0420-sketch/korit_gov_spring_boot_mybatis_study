package com_korit.mybatis_study.controller;

import com_korit.mybatis_study.dto.AddBoardReqDto;
import com_korit.mybatis_study.dto.EditBoardReqDto;
import com_korit.mybatis_study.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/board")
public class BoardController {

    @Autowired
    private BoardService boardService;

    @PostMapping("/add")
    public ResponseEntity<?> addBoard(@RequestBody AddBoardReqDto addBoardReqDto) {
        return ResponseEntity.ok(boardService.addBoard(addBoardReqDto));

    }
    // 전체 조회하기
    @GetMapping("/all")
    public ResponseEntity<?> getBoardList() {
        return ResponseEntity.ok(boardService.getBoardList());
    }
    // 단건 조회하기
    @GetMapping("/{boardId}")
    public ResponseEntity<?> getBoardByBoardId(@PathVariable Integer boardId) {
        return ResponseEntity.ok(boardService.getBoardByBoardId(boardId));

    }
    @PostMapping("/update")
    public ResponseEntity<?> editBoard(@RequestBody EditBoardReqDto editBoardReqDto) {
        return ResponseEntity.ok(boardService.editBoard(editBoardReqDto));
    }
    //삭제
    @PostMapping("/remove")
    public ResponseEntity<?> removeBoard(@RequestParam Integer boardId) {
        return ResponseEntity.ok(boardService.removeBoard(boardId));
    }
}
