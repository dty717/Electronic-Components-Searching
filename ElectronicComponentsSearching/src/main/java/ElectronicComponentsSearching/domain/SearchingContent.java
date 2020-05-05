package ElectronicComponentsSearching.domain;



import java.io.Serializable;

public class SearchingContent implements Serializable{
    
    private String keyword;
	private String content;
	private String imgsrc;

	public SearchingContent(String keyword,String content,String imgsrc){
		this.keyword=keyword;
		this.content=content;
		this.imgsrc=imgsrc;
	}

	public SearchingContent(){
	    
	}
	
	public String getKeyword(){
		return keyword;
	}
	public void setKeyword(String keyword){
		this.keyword=keyword;
	}

	public String getContent(){
		return content;
	}
	public void setContent(String content){
		this.content=content;
	}

	public String getImgsrc(){
		return imgsrc;
	}
	public void setImgsrc(String imgsrc){
		this.imgsrc=imgsrc;
	}

}
