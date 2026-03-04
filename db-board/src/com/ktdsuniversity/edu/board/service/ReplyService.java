package com.ktdsuniversity.edu.board.service;

import java.util.List;

import com.ktdsuniversity.edu.board.dao.ReplyDao;
import com.ktdsuniversity.edu.board.db.helper.DataAccessHelper;
import com.ktdsuniversity.edu.board.vo.ReplyVO;

public class ReplyService {

	private DataAccessHelper dah;
	private ReplyDao replyDao;
	
	public ReplyService(DataAccessHelper dah) {
		this.dah = dah;
		this.replyDao = new ReplyDao(this.dah);
	}
	public List<ReplyVO> readAllReply(String replyId){
		List<ReplyVO> result = this.replyDao.readAllReply(replyId);
		return result;
	}
	// ReplyVO 댓글 조회(댓글 아이디)
	public ReplyVO readReply(String replyId) {
		ReplyVO result = this.replyDao.readReply(replyId);
		return result;
	}
	// List<ReplyVO> 대댓글 조회(댓글 아이디)
	// 댓글에 등록된 모든 대댓글 조회(대댓글 포함) - 계층 조회
	public List<ReplyVO> readAllReplyByReplyId(String replyId) {
		List<ReplyVO> result = this.replyDao.readAllReplyByReplyId(replyId);
		return result;
	}
	// void 댓글 등록(ReplyVO)
	public void createNewReply(ReplyVO newReply) {
		try {
			this.replyDao.createNewReply(newReply);
			this.dah.commit();
		}
		catch(RuntimeException re) {
			this.dah.rollback();
		}
	}
	// void 댓글 수정(ReplyVO)
	public void modifyArticle(ReplyVO modifyReply) {		
		try {
			this.replyDao.modifyArticle(modifyReply);
			this.dah.commit();
		}
		catch(RuntimeException re) {
			this.dah.rollback();
		}
	}
	// void 댓글 삭제(ReplyVO)
	public void deleteReply(String replyID) {
		try {
			this.replyDao.deleteReply(replyID);
			this.dah.commit();
		}
		catch(RuntimeException re) {
			this.dah.rollback();
		}
	}
}
