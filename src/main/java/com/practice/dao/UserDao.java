package com.practice.dao;

import com.practice.bean.*;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 数据库的增删查改等操作在这里执行
 * MyBatis MapperScan 会扫描到这里，完成sql语句与相关操作语句的映射
 * Created by ygh on 2016/1/26.
 */
@Repository
public interface UserDao {
    //登录
    @Select("select * from userinfo where userid=#{userid} and password=#{password} limit 1")
    Userbean getLogin(@Param("userid") String userid, @Param("password") String password);

    //注册
    @Insert("insert into userinfo (userid, password,username,sex,xueyuan,zhuanye,type) values(#{userid}, #{password},#{username},#{sex},#{xueyuan},#{zhuanye},#{type})")
    int resign(@Param("userid") String userid, @Param("password") String password, @Param("username") String username, @Param("sex") String sex, @Param("xueyuan") String xueyuan, @Param("zhuanye") String zhuanye, @Param("type") String type);

    @Insert("insert into schoolpicture (userid,imgpath,imgdesc,imgtime) values(#{userid}, #{imgpath},#{imgdesc},#{imgtime})")
    int setIMG(@Param("userid") String userid, @Param("imgpath") String imgpath, @Param("imgdesc") String imgdesc, @Param("imgtime") String imgtime);

    @Select("select * from schoolpicture ")
    List<PictureBean> getimg();

    @Select("select * from schoolmsg")
    List<SchoolBean> getSchool();

    @Select("select * from schoolnews")
    List<SchoolNewsBean> getNews();

    @Select("select * from schoolnotice")
    List<SchoolNoticesBean> getNotices();

    @Select("select * from storemsg")
    List<StoreBean> getStore();

    @Select("select * from playground")
    List<PlaygroundBean> getPlayground();


    /**
     * 头像操作
     * @param userid
     * @param headimg
     * @return
     */
    @Update("update userinfo set headimg=#{headimg} where userid=#{userid}")
    int setHeadimg(@Param("userid") String userid, @Param("headimg") String headimg);

    @Select("select headimg from userinfo where userid=#{userid} limit 1")
    String getHeadimg(@Param("userid") String userid);


}
