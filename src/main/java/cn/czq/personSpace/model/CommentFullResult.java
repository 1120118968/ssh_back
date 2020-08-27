package cn.czq.personSpace.model;

import java.io.Serializable;
import java.util.List;

public class CommentFullResult implements Serializable {
    private ChapterInfo chapterInfo;
    private List<CommentInfo> commentInfos;

    public ChapterInfo getChapterInfo() {
        return chapterInfo;
    }

    public List<CommentInfo> getCommentInfos() {
        return commentInfos;
    }

    public CommentFullResult(ChapterInfo chapterInfo, List<CommentInfo> commentInfos) {
        super();
        this.chapterInfo = chapterInfo;
        this.commentInfos = commentInfos;
    }

    @Override
    public String toString() {
        return "CommentFullResult{" +
                "chapterInfo=" + chapterInfo +
                ", commentInfos=" + commentInfos +
                '}';
    }
}
