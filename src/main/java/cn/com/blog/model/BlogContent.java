package cn.com.blog.model;

import java.util.List;

/**
 * Created by fcs on 14-12-27.
 */
public class BlogContent {
    private int blogid;                       //序号
    private List<BlogType> blogTypeList;      //博客类型。
    private String author;                    //作者
    private String blogTitle;                   //博客名称
    private String blogContent;                 //博客内容
    private String blogIntro;                   //简介

    public int getBlogid() {
        return blogid;
    }

    public void setBlogid(int blogid) {
        this.blogid = blogid;
    }

    public List<BlogType> getBlogTypeList() {
        return blogTypeList;
    }

    public void setBlogTypeList(List<BlogType> blogTypeList) {
        this.blogTypeList = blogTypeList;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBlogTitle() {
        return blogTitle;
    }

    public void setBlogTitle(String blogTitle) {
        this.blogTitle = blogTitle;
    }

    public String getBlogContent() {
        return blogContent;
    }

    public void setBlogContent(String blogContent) {
        this.blogContent = blogContent;
    }

    public String getBlogIntro() {
        return blogIntro;
    }

    public void setBlogIntro(String blogIntro) {
        this.blogIntro = blogIntro;
    }
}
