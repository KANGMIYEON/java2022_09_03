package word;

import java.util.Objects;

/* 단어장 프로그램 작성
 * 1. 단어등록 (메서드)
 * 2. 단어검색
 * 3. 단어수정
 * 4. 단어출력
 * 5. 종료
 * */
public class Word implements Comparable<Word>{
	
	private String word;
	private String mean;
	
	public Word() {}
	public Word(String word, String mean) {
		this.word = word;
		this.mean = mean;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public String getMean() {
		return mean;
	}
	public void setMean(String mean) {
		this.mean = mean;
	}
	@Override
	public String toString() {
		return "Word [단어: " + word + ", 의미: " + mean + "]";
	}
	
	@Override
	public int compareTo(Word o) {
		return word.compareTo(word);
	}
	
//	@Override
//	public int hashCode() {
//		return Objects.hash(mean, word);
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj) // 주소까지 일치하면 true 반환
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Word other = (Word) obj;
//		return Objects.equals(mean, other.mean) && Objects.equals(word, other.word);
//	}
	
	
	
}
