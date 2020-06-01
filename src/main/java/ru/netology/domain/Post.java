package ru.netology.domain;

public class Post {
    private String dateTime;
    private String imageUrl;
    private String name;
    private String button;
    private CommentsInfo commentsInfo;
    private LikeAmount likeamount;
    private PostRetort postretort;
    private PostView postView;
    private String id;
    private String groupName;
    private int can_edit;
    private int can_delete;
    private int can_pin;
    private int from_id;
    private String geo;
    private String text;

    public int getCan_edit() {
        return can_edit;
    }

    public void setCan_edit(int can_edit) {
        this.can_edit = can_edit;
    }

    public int getCan_delete() {
        return can_delete;
    }

    public void setCan_delete(int can_delete) {
        this.can_delete = can_delete;
    }

    public int getCan_pin() {
        return can_pin;
    }

    public void setCan_pin(int can_pin) {
        this.can_pin = can_pin;
    }


    public int getFrom_id() {
        return from_id;
    }

    public void setFrom_id(int from_id) {
        this.from_id = from_id;
    }

    public String getGeo() {
        return geo;
    }

    public void setGeo(String geo) {
        this.geo = geo;
    }



    public String getText() {
        return text;
    }

    public void setTeXt(String test) {
        this.text = test;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getButton() {
        return button;
    }

    public void setButton(String button) {
        this.button = button;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public LikeAmount getLikeamount() {
        return likeamount;
    }

    public void setLikeamount(LikeAmount likeamount) {
        this.likeamount = likeamount;
    }

    public PostRetort getPostretort() {
        return postretort;
    }

    public void setPostretort(PostRetort postretort) {
        this.postretort = postretort;
    }

    public PostView getPostView() {
        return postView;
    }

    public void setPostView(PostView postView) {
        this.postView = postView;
    }

}
