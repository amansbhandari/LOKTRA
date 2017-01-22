package UnitTests;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

import Client.ClientRequests;
import WebCrawler.QueryParams;
import WebCrawler.WebCrawlerServices;

public class TestWebCrawlerServices 
{
	
	@Test
	public void TestnumberOfResults() throws IOException
	{
		QueryParams params = new QueryParams("toothbrush");
		assertEquals(ClientRequests.findResults(params),1500);
	}
	
	@Test
	public void TestnumberOfResultsPageWise() throws IOException
	{
		QueryParams params = new QueryParams("toothbrush",3);
		assertEquals(ClientRequests.findResults(params),39);
	}
}
