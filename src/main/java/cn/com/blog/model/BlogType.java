package cn.com.blog.model;

/**
 * Created by fcs on 14-12-27.
 */
public class BlogType {
    private  int blogTypeId;
    private  String blogTypeName;
    private  String blogTag;

    public int getBlogTypeId() {
        return blogTypeId;
    }

    public void setBlogTypeId(int blogTypeId) {
        this.blogTypeId = blogTypeId;
    }

    public String getBlogTypeName() {
        return blogTypeName;
    }

    public void setBlogTypeName(String blogTypeName) {
        this.blogTypeName = blogTypeName;
    }

    public String getBlogTag() {
        return blogTag;
    }

    public void setBlogTag(String blogTag) {
        this.blogTag = blogTag;
    }
}
