package cn.czq.personSpace.mapper;

import cn.czq.personSpace.model.CommentInfo;

import java.util.List;

public interface CommentInfoMapper {
    List<CommentInfo> getCommentByChapterId(Long chapterId);
    List<CommentInfo> getCommentByCommentId(Long id);
    List<CommentInfo> getCommentByPostUserId(Long postUserId);
    void deleteCommentByCommentId(Long chapterId);
    void updateCommentByChapterId(CommentInfo commentInfo);
    void insComment(CommentInfo commentInfo);
}
