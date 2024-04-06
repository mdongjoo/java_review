package final1;

public class Post { //게시물 클래스 
//  Post 클래스
//  - 모든 필드는 private으로 설정한다
//  id: 게시물의 고유 식별자 (정수)
//  title: 게시물의 제목 (문자열)
//  content: 게시물의 내용 (문자열)
	//필드 
	private int id;  //게시물의 고유 식별자 
	private String title; //게시물의 제목
	private String content; //게시물의 내용
	
	//생성자 
	public Post(int id, String title, String content) {
		super();
		this.id = 0; //id는 0으로 초기화 
		this.title = title;
		this.content = content;
	}
	//getter setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
}
