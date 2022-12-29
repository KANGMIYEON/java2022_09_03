package korini;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MusicManager {
   private ArrayList<Music> list = new ArrayList<>();
   private ArrayList<Music> kpop = new ArrayList<>();
   private ArrayList<Music> pop = new ArrayList<>();
   private ArrayList<Music> ballad = new ArrayList<>();
   private ArrayList<Music> hiphop = new ArrayList<>();
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
// 0 메인스크린 메서드
   public void printMenu() {
	 
	  System.out.println("---------------------");
	  System.out.println("Korini Music Playlist");
	  System.out.println("1. 음악 등록");
	  System.out.println("2. 음악 검색");
	  System.out.println("3. AI 추천 음악");
	  System.out.println("4. 음악 정보 수정");
	  System.out.println("5. 음악 삭제");
	  System.out.println("6. 종료");
	  System.out.println("---------------------");
	  
   }
   
// 1 음악추가 메서드_debugged. 테스트 완료
   public void addMusic() throws IOException {
      System.out.println(">>노래 추가");
      System.out.println("노래 제목을 입력해주세요");
      String title = br.readLine();
      System.out.println("가수를 입력해주세요");
      String singer = br.readLine();
      System.out.println("장르를 입력해주세요 (K-POP/POP/Ballad/Hip-Hop)");
      String tmp = br.readLine();
      String genre = null;
      if(!tmp.equals("K-POP") && !tmp.equals("POP") && !tmp.equals("Ballad") && !tmp.equals("Hip-Hop")) {
         System.out.println("네가지 장르 중 하나를 입력해주세요.");
      }else {
         genre = tmp;
      };
      System.out.println("링크를 입력해주세요");
      String link = br.readLine();
      Music mc = new Music(title, singer, genre, link);
      if(genre.equals("K-POP")) {
          kpop.add(mc);
       }else if(genre.equals("POP")) {
          pop.add(mc);
       }else if(genre.equals("Ballad")) {
          ballad.add(mc);
       }else if(genre.equals("Hip-Hop")) {
          hiphop.add(mc);
       }
      list.add(mc);
      System.out.println("음악추가가 완료되었습니다.");
   }
   
 // 2 음악 검색
   public void searchMusic() throws NumberFormatException, IOException {
      System.out.println(">>>음악 검색>>>");
      System.out.println("1. 장르로 검색");
      System.out.println("2. 가수로 검색");
      System.out.println("3. 제목으로 검색");
      System.out.println(">>>선택: ");
      String me= br.readLine();
      int cnt=0;
      
      switch(me) {
      case "1": 
         cnt=0;
         System.out.println(">>장르 검색");
         System.out.println("장르를 입력해주세요");
          String genre=br.readLine();
          for(int i=0;i<list.size();i++) {
             if(list.get(i).getGenre().equals(genre)) {
                System.out.println(list.get(i));
             }else {
                cnt++;
                if(cnt==list.size()) {
                System.out.println("해당 장르가 없습니다.");
            }
                }
             }break;
      case "2": 
         cnt=0;
         System.out.println(">>가수 검색");
         System.out.println("가수를 입력해주세요");
          String singer=br.readLine();
          for(int i=0;i<list.size();i++) {
             if(list.get(i).getSinger().equals(singer)) {
                System.out.println(list.get(i));
             }else {
                cnt++;
                if(cnt==list.size()) {
                System.out.println("해당 가수가 없습니다.");
                }
            }                      
         }break;
      case "3": 
         cnt=0;
         System.out.println(">>노래 검색");
         System.out.println("노래 제목을 입력해주세요");
         String title=br.readLine();
         for(int i=0;i<list.size();i++) {
            if(list.get(i).getTitle().equals(title)) {
               System.out.println(list.get(i));
            }else {
               cnt++;
               if(cnt==list.size()) {
               System.out.println("해당 노래가 없습니다.");
               }
            }
         }break;
      default: System.out.println("1~3 중 번호를 입력해주세요.");
      }
      
   }
   
// 3 킬러기믹
   public void killer() throws NumberFormatException, IOException {
      
      System.out.println("추천받으실 장르를 선택해주세요");
      System.out.println("1. K-POP");
      System.out.println("2. POP");
      System.out.println("3. Ballad");
      System.out.println("4. Hip-Hop");
      String menu =  br.readLine();
      
      switch (menu) {
      case "1":
         kpop();
         break;
      case "2":
         pop();
         break;
      case "3":
         ballad();
         break;
      case "4":
         hiphop();
         break;
      default:
         System.out.println("1~4 중 번호를 입력해주세요."); break;
      }
   }

   public void kpop() {
      int i = (int) (Math.random() * kpop.size()) + 0;
      System.out.println(kpop.get(i));
   }

   public void pop() {
      int i = (int) (Math.random() * pop.size()) + 0;
      System.out.println(pop.get(i));
   }

   public void ballad() {
      int i = (int) (Math.random() * ballad.size()) + 0;
      System.out.println(ballad.get(i));
   }

   public void hiphop() {
      int i = (int) (Math.random() * hiphop.size()) + 0;
      System.out.println(hiphop.get(i));
   }
   
// 4 음악 수정    
   public void fixMusic() throws IOException {
	      
      System.out.println("1. 노래 수정");
      System.out.println("2. 가수명 수정");
      System.out.println("3. 장르 수정");
      System.out.println("4. 링크 수정");
      
      String fix = br.readLine();
      
      switch (fix) {
      case "1":
         System.out.println("수정을 원하는 노래 제목을 입력해주세요 >>");
         String title = br.readLine();
         int cnt = 0;
         for (Music tmp : list) {
            if(tmp.getTitle().equals(title)) {
               System.out.println("제목을 새로 입력해주세요 >>");
               String newTitle = br.readLine();
               tmp.setTitle(newTitle);
               System.out.println("제목 수정이 완료 되었습니다.");
            }else {
            	cnt++;
            	if(cnt == list.size()) {
            		System.out.println("검색하신 제목 없습니다.");
            	}
            }
         }
         break;
      case "2":
         System.out.println("가수명 변경을 원하는 곡을 입력해주세요 >>");
         String song = br.readLine();
         int cnt1 = 0;
         for(Music tmp :list) {
            if(tmp.getTitle().equals(song)) {
               System.out.println("가수명을 새로 입력해주세요 >>");
               String newSinger = br.readLine();
               tmp.setSinger(newSinger);
               System.out.println("가수명 수정이 완료 되었습니다.");
               break;
            }else {
            	cnt1++;
            	if(cnt1 == list.size()) {
            		System.out.println("검색하신 가수가 없습니다.");
            	}
            }
         }
         break;
      case "3":
         System.out.println("장르 수정을 원하는 가수를 입력해주세요 >>");
         String singer1 = br.readLine();
         for(Music tmp : list) {
            if(tmp.getSinger().equals(singer1)) {
               System.out.println("수정할 장르를 입력해주세요 >>");
               String genre = br.readLine();
               tmp.setGenre(genre);
               System.out.println("장르 수정이 완료 되었습니다.");
               break;
            }
         }
         break;
      case "4":
         System.out.println("링크 수정을 원하는 곡 입력해주세요 >>");
         String singer2 = br.readLine();
         for(Music tmp : list) {
            if(tmp.getTitle().equals(singer2)) {
               System.out.println("수정할 링크를 입력해주세요 >>");
               String link = br.readLine();
               tmp.setLink(link);
               System.out.println("링크 수정이 완료 되었습니다.");
               break;
            }
         }
         break;
      default: 
         System.out.println("1~4 중 선택해주세요.");
      }
   }
   
// 5 음악 삭제
   public void delete() throws IOException {
	   System.out.println("삭제를 원하시는 곡을 입력하세요");
	   String song = br.readLine();
	   boolean flag = false;
	   int cnt = 0;
	   for(int i=0; i<list.size(); i++) {
		   if(list.get(i).getTitle().equals(song)) {
			   list.remove(i);
			   flag = true;
			   for(int j=0; j<kpop.size(); j++) {
				   if(kpop.get(j).getTitle().equals(song)) {
					   kpop.remove(j);
					   flag = true;
				   }
			   }
			   for(int k=0; k<ballad.size(); k++) {
				   if(ballad.get(k).getTitle().equals(song)) {
					   ballad.remove(k);
					   flag = true;
				   }
			   }
			   for(int l=0; l<hiphop.size(); l++) {
				   if(hiphop.get(l).getTitle().equals(song)) {
					   hiphop.remove(l);
					   flag = true;
				   }
			   }
			   for(int m=0; m<pop.size(); m++) {
				   if(pop.get(m).getTitle().equals(song)) {
					   pop.remove(m);
					   flag = true;
				   }
			   }
		   }else {
			   cnt++;
			   if(cnt == list.size()) {
				   System.out.println("일치하는 곡이 없습니다.");
				   flag = false;
				   break;
			   }
		   }
	   }
	   if(flag) {
		   System.out.println("삭제가 완료되었습니다.");		   
	   }
   }
  
   
   
   
// 7 음악 일괄 추가
   
   public void addWholeMusic() {
	   Music flex = new Music("flex (Prod. By 기리보이), 키드밀리(Kid Milli)", "기리보이, 스윙스(Swings), NO:EL", "힙합",
			   "https://www.youtube.com/watch?v=rsvJOrI2GfE");
	   Music goodday = new Music("Good Day (Feat. 팔로알토) (Prod. 코드 쿤스트)", "pH-1, 키드밀리(Kid Milli), 루피(Loopy)", "힙합",
			   "https://www.youtube.com/watch?v=HhWAQDZX-Vg");
	   Music gara = new Music("가라사대", "비와이(BewhY)", "힙합", "https://www.youtube.com/watch?v=ckZor7HRU1E");
	   Music saep = new Music("새삥 (Prod. ZICO) (Feat. 호미들)", "지코(ZICO)", "힙합",
			   "https://www.youtube.com/watch?v=BRSARx8wEVk");
	   Music ferris = new Music("회전목마 (Feat. Zion.T, 원슈타인) (Prod. Slom)", "sokodomo", "힙합",
			   "https://www.youtube.com/watch?v=tnAxZipkuWw");
	   Music mybag = new Music("MY BAG", "(여자)아이들", "힙합", "https://www.youtube.com/watch?v=CK422h0brGE");
	   Music counting = new Music("Counting Stars (Feat. Beenzino)", "BE'O(비오)", "힙합",
			   "https://www.youtube.com/watch?v=mLCsbacHxA8");
	   Music meteor = new Music("METEOR", "창모(CHANGMO)", "힙합", "https://www.youtube.com/watch?v=lOrU0MH0bMk");
	   Music any = new Music("아무노래", "지코(ZICO)", "힙합", "https://www.youtube.com/watch?v=UuV2BmJ1p_I");
	   Music freak = new Music("괴짜(Freak)", "지코(ZICO)", "힙합", "https://www.youtube.com/watch?v=JEXsNICXdrc");
	   list.add(flex); hiphop.add(flex);
	   list.add(goodday); hiphop.add(goodday);
	   list.add(gara); hiphop.add(gara);
	   list.add(saep); hiphop.add(saep);
	   list.add(ferris); hiphop.add(ferris);
	   list.add(mybag); hiphop.add(mybag);
	   list.add(counting); hiphop.add(counting);
	   list.add(meteor); hiphop.add(meteor);
	   list.add(any); hiphop.add(any);
	   list.add(freak); hiphop.add(freak);
	   
	   Music delete = new Music("삭제", "이승기", "발라드", "https://www.youtube.com/watch?v=rVi--B0JU1o");
	   Music seeingStar = new Music("별 보러 가자", "적재", "발라드", "https://www.youtube.com/watch?v=Mz031oU0Xfw");
	   Music yeosu = new Music("여수 밤바다", "버스커 버스커", "발라드", "https://www.youtube.com/watch?v=4NCnhPZB9us");
	   Music pocha = new Music("포장마차", "황인욱", "발라드", "https://www.youtube.com/watch?v=g6uvXiLNrxM");
	   Music sigh = new Music("한숨", "이하이", "발라드", "https://www.youtube.com/watch?v=5iSlfF8TQ9k");
	   Music hello = new Music("Hello", "허각", "발라드", "https://www.youtube.com/watch?v=4oQ2-b89a0w");
	   Music stalker = new Music("스토커", "10cm", "발라드", "https://www.youtube.com/watch?v=Laf1o9NEjcI");
	   Music pillow = new Music("같은 베개", "테이", "발라드", "https://www.youtube.com/watch?v=RF_PZ2pf2Fs");
	   Music gashi = new Music("가시", "버즈", "발라드", "https://www.youtube.com/watch?v=jednbOpzFP4");
	   Music itsLove = new Music("사랑인걸", "모세", "발라드", "https://www.youtube.com/watch?v=Jh1WMqs7k70");
	   list.add(delete); ballad.add(delete);
	   list.add(seeingStar); ballad.add(seeingStar);
	   list.add(yeosu); ballad.add(yeosu);
	   list.add(pocha); ballad.add(pocha);
	   list.add(sigh); ballad.add(sigh);
	   list.add(hello); ballad.add(hello);
	   list.add(stalker); ballad.add(stalker);
	   list.add(pillow); ballad.add(pillow);
	   list.add(gashi); ballad.add(gashi);
	   list.add(itsLove); ballad.add(itsLove);
	   
	   Music after = new Music("After LIKE", "IVE (아이브)", "K-POP", "https://www.youtube.com/watch?v=F0B7HDiY-10");
	   Music attention = new Music("Attention", "NewJeans (뉴진스)", "K-POP", "https://www.youtube.com/watch?v=js1CtxSY38I");
	   Music forever = new Music("FOREVER 1", "소녀시대 (GIRLS' GENERATION)", "K-POP",
			   "https://www.youtube.com/watch?v=Qpf26PtBXgo");
	   Music sneakers = new Music("SNEAKERS", "ITZY (있지)", "K-POP", "https://www.youtube.com/watch?v=Hbb5GPxXF1w");
	   Music fearless = new Music("FEARLESS", "LE SSERAFIM (르세라핌)", "K-POP", "https://www.youtube.com/watch?v=4vbDFu0PUew");
	   Music dynamite = new Music("Dynamite", "방탄소년단 (BTS)", "K-POP", "https://www.youtube.com/watch?v=gdZLi9oWNZg");
	   Music nextlevel = new Music("Next Level", "aespa (에스파)", "K-POP", "https://www.youtube.com/watch?v=4TWR90KJl84");
	   Music weekend = new Music("Weekend", "태연", "K-POP", "https://www.youtube.com/watch?v=RmuL-BPFi2Q");
	   Music ilu = new Music("I LOVE U", "WINNER", "K-POP", "https://www.youtube.com/watch?v=waMAVn2hHBM");
	   Music lovesick = new Music("Lovesick Girls", "BLACKPINK (블랙핑크)", "K-POP",
			   "https://www.youtube.com/watch?v=dyRsYk0LyA8");
	   list.add(after); kpop.add(after);
	   list.add(attention); kpop.add(attention);
	   list.add(forever); kpop.add(forever);
	   list.add(sneakers); kpop.add(sneakers);
	   list.add(fearless); kpop.add(fearless);
	   list.add(dynamite); kpop.add(dynamite);
	   list.add(nextlevel); kpop.add(nextlevel);
	   list.add(weekend); kpop.add(weekend);
	   list.add(ilu); kpop.add(ilu);
	   list.add(lovesick); kpop.add(lovesick);
	   
	   Music shape = new Music("Shape of You", "Ed Sheeran", "POP", "https://youtu.be/JGwWNGJdvx8");
	   Music around = new Music("Around the World", "Buddy Greco", "POP", "https://youtu.be/ZtUoOw_RhS0");
	   Music likeyou = new Music("I Really Like You", "Carly Rae Jepsen", "POP", "https://youtu.be/qV5lzRHrGeg");
	   Music heather = new Music("Heather", "Conan Gray", "POP", "https://youtu.be/GPUg7n8-M6o");
	   Music theman = new Music("The Man Comes Around", "Johnny Cash", "POP", "https://youtu.be/k9IfHDi-2EA");
	   Music gloria = new Music("Gloria", "Laura Branigan", "POP", "https://youtu.be/nNEb2k_EmMg");
	   Music sunday = new Music("Sunday Morning", "Maroon5", "POP", "https://youtu.be/2cEgApe0mVw");
	   Music spades = new Music("Ace of Spades", "Motorhead", "POP", "https://youtu.be/3mbvWn1EY6g");
	   Music delilah = new Music("Hey There Delilah", "Plain White T's", "POP", "https://youtu.be/h_m-BjrxmgI");
	   Music beyond = new Music("Beyond the Sea", "Robbie Williams", "POP", "https://youtu.be/FzKpTdQeQ34");
	   list.add(shape); pop.add(shape);
	   list.add(around); pop.add(around);
	   list.add(likeyou); pop.add(likeyou);
	   list.add(heather); pop.add(heather);
	   list.add(theman); pop.add(theman);
	   list.add(gloria); pop.add(gloria);
	   list.add(sunday); pop.add(sunday);
	   list.add(spades); pop.add(spades);
	   list.add(delilah); pop.add(delilah);
	   list.add(beyond); pop.add(beyond);
	   
   }
   
}