package ru.netology.domain;

public class PostView {
    public class CommentsInfo {
        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public boolean isCanPost() {
            return canPost;
        }

        public void setCanPost(boolean canPost) {
            this.canPost = canPost;
        }

        private int count;
        private boolean canPost;
    }
}