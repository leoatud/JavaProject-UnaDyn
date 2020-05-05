/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mybatis.pojo;

import java.util.List;

/**
 *
 * @author cliu
 */
public class Blog {

   public static int uid = 1;

   private Integer id;
   private String title;
   private int author_id;
   private String state;
   private Boolean featured;
   private String style;

   public Blog(String title, int author_id, String state, Boolean featured, String style) {
      this.id = uid;
      this.title = title;
      this.author_id = author_id;
      this.state = state;
      this.featured = featured;
      this.style = style;
   }

   public Blog() {
   }

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public String getTitle() {
      return title;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public int getAuthor_id() {
      return author_id;
   }

   public void setAuthor_id(int author_id) {
      this.author_id = author_id;
   }

   public String getState() {
      return state;
   }

   public void setState(String state) {
      this.state = state;
   }

   public Boolean getFeatured() {
      return featured;
   }

   public void setFeatured(Boolean featured) {
      this.featured = featured;
   }

   public String getStyle() {
      return style;
   }

   public void setStyle(String style) {
      this.style = style;
   }

   @Override
   public String toString() {
      return "Blog{" + "id=" + id + ", title=" + title + ", author_id=" + author_id + ", state=" + state + ", featured=" + featured + ", style=" + style + '}';
   }

}
