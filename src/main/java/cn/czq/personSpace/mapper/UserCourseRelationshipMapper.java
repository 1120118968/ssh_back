package cn.czq.personSpace.mapper;

import cn.czq.personSpace.model.UserCourseRelationship;


public interface UserCourseRelationshipMapper {
    UserCourseRelationship getByCourseIdAndUserId(Long courseId, Long userId);
    UserCourseRelationship getByUserId(Long userId);

}
