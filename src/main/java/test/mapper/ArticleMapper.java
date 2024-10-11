package test.mapper;

import test.util.DBUtil;
import test.vo.Article;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *  该类负责处理article表的相关操作
 */
public class ArticleMapper {
    public int insertArticle(Article article) {
        try (Connection connection = DBUtil.getConnection();){
            String sql = "INSERT INTO article(title,content) " +
                    "VALUES(?,?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, article.getTitle());
            ps.setString(2, article.getContent());
            return ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
    //根据给定的id删除article表中对应的记录
    public int deleteArticleById(int id) {
        try (Connection connection = DBUtil.getConnection();){
            String sql = "DELETE FROM article WHERE id = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1,id);
            return ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
    //根据给定id查询article表中对应记录，并以Article对象形式返回
    //如果根据该id查询不到记录，返回值为null
    public Article findById(int id) {
        try (Connection connection = DBUtil.getConnection();){
            String sql = "SELECT title,content " +
                    "FROM article " +
                    "WHERE id = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                String title = rs.getString("title");
                String content = rs.getString("content");
                Article article = new Article();
                article.setTitle(title);
                article.setContent(content);
                return article;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    //将article表中每条记录用一个Article表示并存入集合将集合返回
    public List<Article> findAll() {
        List<Article> articleList = new ArrayList<>();
        try (Connection connection = DBUtil.getConnection();){
            Statement statement = connection.createStatement();
            String sql = "SELECT title,content FROM article";
            ResultSet rs = statement.executeQuery(sql);
            while(rs.next()){
                String title = rs.getString("title");
                String content = rs.getString("content");
                Article article = new Article();
                article.setTitle(title);
                article.setContent(content);
                articleList.add(article);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return articleList;
    }
}


