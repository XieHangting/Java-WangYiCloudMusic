package com.qingguatang.java5minute.course4.model;

import java.util.Date;

public class Comment {
    //评论人头像
    private String icon;
    //评论人昵称
    private String nickName;
    //评论内容
    private String content;
    //评论时间
    private Date commentTime;
    //点赞数
    private int likeNum;


    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getIcon() {
        return icon;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }

    public Date getCommentTime() {
        return commentTime;
    }

    public void setLikeNum(int likeNum) {
        this.likeNum = likeNum;
    }

    public int getLikeNum() {
        return likeNum;
    }
}
