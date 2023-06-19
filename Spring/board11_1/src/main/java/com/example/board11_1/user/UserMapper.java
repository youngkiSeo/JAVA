package com.example.board11_1.user;

import com.green.board11.user.model.*;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int CmtIns(UserInsDto dto);
    UserLoginVo selUserById(UserLoginDto dto);
    int UpdUserPw(UserPatchPwDto dto);
    int UpUserPic(UserPatchPicDto dto);
}
