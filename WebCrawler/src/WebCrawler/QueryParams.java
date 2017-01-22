package WebCrawler;

/*
 * Will consist of all the params which can be added in URL
 * the params which are present in the instance will only be included in URL
 * others will get excluded.
 */

public class QueryParams 
{
	public QueryParams(String key) 
	{
		this.key = key;
		this.page = null;
	}
	
	public QueryParams(String key, int page) 
	{
		super();
		this.key = key;
		this.page = page;
	}
	
	private String key;
	private Integer page;
	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}
}
