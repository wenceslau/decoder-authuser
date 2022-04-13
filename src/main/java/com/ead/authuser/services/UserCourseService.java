package com.ead.authuser.services;

import com.ead.authuser.models.UserCourseModel;
import com.ead.authuser.models.UserModel;
import com.fasterxml.jackson.databind.deser.std.UUIDDeserializer;

import java.util.UUID;

public interface UserCourseService {

    boolean existsByUserAndCourseId(UserModel userModel, UUID courseId);

    UserCourseModel save(UserCourseModel userCourseModel);

    boolean existsByCourseId(UUID courseId);

    void deleteUserCourseByCourse(UUID courseId);
}
