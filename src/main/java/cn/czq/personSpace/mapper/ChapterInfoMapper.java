package cn.czq.personSpace.mapper;

import cn.czq.personSpace.model.ChapterInfo;

import java.util.List;

public interface ChapterInfoMapper {
    List<ChapterInfo> getAll();
    List<ChapterInfo> getById(Long id);
    List<ChapterInfo> getByCourseId(Long courseId);
    List<ChapterInfo> getByCreatedAt(String date);

}
