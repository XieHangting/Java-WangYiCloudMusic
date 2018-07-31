package com.qingguatang.java5minute.course3.model;

public class SongInfo {
    //歌曲名称
    private String  name;
    //歌手名称
    private String singer;
    //专辑名称
    private String albumName;
    //评论数
    private int commentCount;
    //歌词
    private String lyrics;
    //专辑图片
    private String albumImg;

    public SongInfo(String name,String singer,String albumName,int commentCount,String lyrics,String albumImg){
        this.name=name;
        this.singer=singer;
        this.albumName=albumName;
        this.commentCount=commentCount;
        this.lyrics=lyrics;
        this.albumImg=albumImg;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getSinger() {
        return singer;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }

    public String getLyrics() {
        return lyrics;
    }

    public void setAlbumImg(String albumImg) {
        this.albumImg = albumImg;
    }

    public String getAlbumImg() {
        return albumImg;
    }
}
