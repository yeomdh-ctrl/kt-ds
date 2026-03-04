package com.ktdsuniversity.edu.board.dao;

import java.util.ArrayList;
import java.util.List;

import com.ktdsuniversity.edu.board.dao.query.ReplyQuery;
import com.ktdsuniversity.edu.board.db.helper.DataAccessHelper;
import com.ktdsuniversity.edu.board.db.helper.SQLType;
import com.ktdsuniversity.edu.board.vo.ReplyVO;

public class ReplyDao {
	private DataAccessHelper dah;

	public ReplyDao(DataAccessHelper dah) {
		this.dah = dah;
	}

	// List<ReplyVO> 댓글 목록 조회(게시글 아이디)
	// 게시글에 등록된 모든 댓글 조회(대댓글 포함) - 계층 조회
	public List<ReplyVO> readAllReply(String replyId) {
		this.dah.preparedStatement(ReplyQuery.makeSelectOneQuery(), (pstmt) -> {
			pstmt.setString(1, replyId);
		});
		List<ReplyVO> result = new ArrayList<>();
		this.dah.executeQuery(SQLType.SELECT, rs -> {
			ReplyVO eachReply = new ReplyVO();
			eachReply.setId(rs.getString("ID"));
			eachReply.setBoardId(rs.getString("BOARD_ID"));
			eachReply.setTopId(rs.getString("TOP_ID"));
			eachReply.setContent(rs.getString("CONTENT"));
			eachReply.setWriteDate(rs.getString("WRITE_DATE"));
			result.add(eachReply);
		});
		return result;
	}

	// ReplyVO 댓글 조회(댓글 아이디)
	public ReplyVO readReply(String replyId) {
		ReplyVO result = new ReplyVO();
		this.dah.preparedStatement(ReplyQuery.makeSelectOneQuery(), (pstmt) -> {
			pstmt.setString(1, replyId);
		});
		this.dah.executeQuery(SQLType.SELECT, rs -> {
			result.setId(rs.getString("ID"));
			result.setBoardId(rs.getString("BOARD_ID"));
			result.setTopId(rs.getString("TOP_ID"));
			result.setContent(rs.getString("CONTENT"));
			result.setWriteDate(rs.getString("WRITE_DATE"));
		});

		return result;
	}

	// List<ReplyVO> 대댓글 조회(댓글 아이디)
	// 댓글에 등록된 모든 대댓글 조회(대댓글 포함) - 계층 조회
	public List<ReplyVO> readAllReplyByReplyId(String replyId) {
		this.dah.preparedStatement(ReplyQuery.makeSelectAllQueryByReply(), (pstmt) -> {
			pstmt.setString(1, replyId);
		});
		List<ReplyVO> result = new ArrayList<>();
		this.dah.executeQuery(SQLType.SELECT, rs -> {
			ReplyVO eachReply = new ReplyVO();
			eachReply.setId(rs.getString("ID"));
			eachReply.setBoardId(rs.getString("BOARD_ID"));
			eachReply.setTopId(rs.getString("TOP_ID"));
			eachReply.setContent(rs.getString("CONTENT"));
			eachReply.setWriteDate(rs.getString("WRITE_DATE"));

			result.add(eachReply);
		});

		return result;
	}

	// void 댓글 등록(ReplyVO)
	public void createNewReply(ReplyVO newReply) {
		this.dah.preparedStatement(ReplyQuery.makeInsertQuery(), (pstmt) -> {
			pstmt.setString(1, newReply.getBoardId());
			pstmt.setString(2, newReply.getTopId());
			pstmt.setString(3, newReply.getContent());
		});
		this.dah.executeQuery(SQLType.INSERT, null);

	}

	// void 댓글 수정(ReplyVO)
	public void modifyArticle(ReplyVO modifyReply) {
		this.dah.preparedStatement(ReplyQuery.makeUpdateQuery(), (pstmt) -> {
			pstmt.setString(1, modifyReply.getContent());
			pstmt.setString(2, modifyReply.getId());
		});
		this.dah.executeQuery(SQLType.UPDATE, null);

	}

	// void 댓글 삭제(ReplyVO)
	public void deleteReply(String replyID) {
		this.dah.preparedStatement(ReplyQuery.makeDeleteQuery(), (pstmt) -> {
			pstmt.setString(1, replyID);
		});
		this.dah.executeQuery(SQLType.DELETE, null);

	}
}
