package ru.netology.manager;

import ru.netology.domain.Post;
import ru.netology.domain.PostAdd;

public class PostManager {
    private Post[] posts;

    public String geteratePagePost() {
        Post[] posts = PostAdd.getPosts();
        return null;
    }

    public Post[] search(int ownerId, String domain, String query, int ownerOnly, int count,int offset) {
        return posts;
    }

    public void delete(int postId, int ownerId) {
    }
}

