package com.training.streams;

public class News {
	int newsId; String postedByUser; String commentByUser; String comment;

	/**
	 * @return the newsId
	 */
	public int getNewsId() {
		return newsId;
	}

	/**
	 * @param newsId the newsId to set
	 */
	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}

	/**
	 * @return the postedByUser
	 */
	public String getPostedByUser() {
		return postedByUser;
	}

	/**
	 * @param postedByUser the postedByUser to set
	 */
	public void setPostedByUser(String postedByUser) {
		this.postedByUser = postedByUser;
	}

	/**
	 * @return the commentByUser
	 */
	public String getCommentByUser() {
		return commentByUser;
	}

	/**
	 * @param commentByUser the commentByUser to set
	 */
	public void setCommentByUser(String commentByUser) {
		this.commentByUser = commentByUser;
	}

	/**
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * @param comment the comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

	/**
	 * @param newsId
	 * @param postedByUser
	 * @param commentByUser
	 * @param comment
	 */
	public News(int newsId, String postedByUser, String commentByUser, String comment) {
		super();
		this.newsId = newsId;
		this.postedByUser = postedByUser;
		this.commentByUser = commentByUser;
		this.comment = comment;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comment == null) ? 0 : comment.hashCode());
		result = prime * result + ((commentByUser == null) ? 0 : commentByUser.hashCode());
		result = prime * result + newsId;
		result = prime * result + ((postedByUser == null) ? 0 : postedByUser.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		News other = (News) obj;
		if (comment == null) {
			if (other.comment != null)
				return false;
		} else if (!comment.equals(other.comment))
			return false;
		if (commentByUser == null) {
			if (other.commentByUser != null)
				return false;
		} else if (!commentByUser.equals(other.commentByUser))
			return false;
		if (newsId != other.newsId)
			return false;
		if (postedByUser == null) {
			if (other.postedByUser != null)
				return false;
		} else if (!postedByUser.equals(other.postedByUser))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "News [newsId=" + newsId + ", postedByUser=" + postedByUser + ", commentByUser=" + commentByUser
				+ ", comment=" + comment + "]";
	} 
	
}
