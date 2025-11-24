package com_korit.mybatis_study.mapper;

import com_korit.mybatis_study.entity.Board;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface BoardMapper { //1. 인터페이스는 안에 구현해놔야할 메소드를 넣어놔야한다.

    Optional<Board> findBoardByTitle(String title); // 2. 얘는 mappers안에 파일로 구현한다. 둘이 연결해줘야 하는데 namespace에 경로를 잡아줘야 한다.
    int addBoard(Board board);
    List<Board> getBoardList();
    Optional<Board> findBoardByBoardId(Integer boardId);
    int editBoard(Board board);
    int removeBoard(Integer boardId);


}
