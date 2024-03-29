package com.blog.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import com.blog.vo.Post;
import org.springframework.jdbc.core.RowMapper;

public class PostMapper implements RowMapper<Post>{
    
    @Override
    public Post mapRow(ResultSet rs, int rowNum) throws SQLException{
        Post post = new Post();
        post.setId(rs.getLong("id"));
        post.setUser(rs.getString("user"));
        post.setTitle(rs.getString("title"));
        post.setContent(rs.getString("content"));
        post.setRegDate(rs.getDate("reg_date"));
        post.setUpdtDate(rs.getDate("updt_date"));

        return post;
    }
}
