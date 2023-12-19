//InfoMapper.java
package com.chennann.springbootmybatisdemo.mapper;

import com.chennann.springbootmybatisdemo.pojo.Info;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface InfoMapper {

    @Insert("insert into info(xh, kh, cj) values (#{xh}, #{kh}, #{cj})")
    void addInfo(String xh, String kh, int cj);

    @Delete("delete from info where id = #{id}")
    void deleteInfo(int id);

    @Update("update info set cj = #{cj} where id = #{id} and kh = #{kh}")
    void updateInfo(int id, String kh, int cj);

    List<Info> WhereAndIf(Info info);

    List<Info> ChooseWhenOtherwise(int state);

    void ForeachTest(List<Info> list);

    void SetTest(int state);
}
