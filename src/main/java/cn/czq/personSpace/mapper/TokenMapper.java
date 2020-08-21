package cn.czq.personSpace.mapper;

import cn.czq.personSpace.model.Token;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TokenMapper {
    void addToken(Token token);
    void updataToken(Token token);
    Token findByUserId(int userid);
}
