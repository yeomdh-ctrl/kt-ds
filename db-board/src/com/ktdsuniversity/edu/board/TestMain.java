package com.ktdsuniversity.edu.board;

import java.util.List;

import com.ktdsuniversity.edu.board.dao.ReplyDao;
import com.ktdsuniversity.edu.board.db.helper.DataAccessHelper;
import com.ktdsuniversity.edu.board.service.BoardService;
import com.ktdsuniversity.edu.board.service.ReplyService;
import com.ktdsuniversity.edu.board.vo.BoardVO;
import com.ktdsuniversity.edu.board.vo.ReplyVO;

public class TestMain {

	public static void main(String[] args) {
		long now = System.currentTimeMillis();
		// 게시글 작성( DB 게시글 생성)
		BoardVO newArticle = new BoardVO();
		newArticle.setTitle("새로운 게시글 입니다.");
		newArticle.setContent("새로운 게시글의 내용입니다.");
		
		DataAccessHelper dah = new DataAccessHelper("localhost", 1521, "XE", "BOARD", "BOARD");
		BoardService boardService = new BoardService(dah);		
		boardService.createNewArticle2(newArticle);
//		System.out.println(insertCount + "개의 게시글이 생성되었습니다.");
		
		// 게시글 수정
		BoardVO modifyArticle = new BoardVO();
		modifyArticle.setId("BO-20260303-000009");
		modifyArticle.setTitle("제목이 수정되었습니다");
		modifyArticle.setContent("내용이 수정되었습니다.");
		
		boardService.modifyArticle(modifyArticle);
		
		// 게시글 삭제
		boardService.deleteArticle("BO-20260303-000010");
		
		// 게시글 조회(BO-20260303-000006)
		BoardVO article = boardService.readArticle("BO-20260303-000006");
		System.out.println(article);
		
		List<BoardVO> article2 = boardService.readAllArticle();
		System.out.println(article2);
		
		
		ReplyService replyService = new ReplyService(dah);
		
		// 댓글 등록
		ReplyVO newReply = new ReplyVO();
		newReply.setBoardId("BO-20260303-000062");
		newReply.setContent("댓글입니다.");
		replyService.createNewReply(newReply);
		// 대댓글 등록
		ReplyVO newRereply = new ReplyVO();
		newRereply.setBoardId("BO-20260303-000062");
		newRereply.setTopId("RP-20260304-000004");
		newRereply.setContent("대댓글입니다.");
		replyService.createNewReply(newRereply);
		
		ReplyVO modifyReply = new ReplyVO();
		modifyReply.setId("RP-20260304-000060");
		modifyReply.setContent("수정된 댓글입니다");
		replyService.modifyArticle(modifyReply);
		
		ReplyVO reply = replyService.readReply("RP-20260304-000058");
		System.out.println(reply);
		
		List<ReplyVO> reply2 = replyService.readAllReply("BO-20260303-000062");
		System.out.println(reply2);
		
		List<ReplyVO> reReplies = replyService.readAllReplyByReplyId("RP-20260304-000030");
		System.out.println(reReplies);	
		
		dah.close();
		long end = System.currentTimeMillis();
		System.out.println(end-now);
	}
}
