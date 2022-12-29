package korini;

public class Music {
   
   private String title;
   private String singer;
   private String genre;
   private String link;
   
   public Music() {}

   public Music(String title, String singer, String genre, String link) {
      super();
      this.title = title;
      this.singer = singer;
      this.genre = genre;
      this.link = link;
   }

   public String getTitle() {
      return title;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public String getSinger() {
      return singer;
   }

   public void setSinger(String singer) {
      this.singer = singer;
   }

   public String getGenre() {
      return genre;
   }

   public void setGenre(String genre) {
      this.genre = genre;
   }

   public String getLink() {
      return link;
   }

   public void setLink(String link) {
      this.link = link;
   }

   @Override
   public String toString() {
      return "제목: " + title + "\n가수: " + singer + "\n장르: " + genre + "\n링크: " + link + "\n---------";
   }

   

}