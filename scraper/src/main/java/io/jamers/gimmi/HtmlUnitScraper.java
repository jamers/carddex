package io.jamers.gimmi;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

import java.io.IOException;
import java.net.URLEncoder;

import static io.jamers.gimmi.CardMarketClient.URL;

/**
 * References
 * https://www.scrapingbee.com/blog/introduction-to-web-scraping-with-java/
 */
public class HtmlUnitScraper {
    public static void main(String[] args) {
        try {
            WebClient client = new WebClient();
            client.getOptions().setCssEnabled(false);
            client.getOptions().setJavaScriptEnabled(false);

//            String searchUrl = "https://newyork.craigslist.org/search/moa?query=" + URLEncoder.encode(searchQuery, "UTF-8");
            HtmlPage page = client.getPage(URL);
            System.out.println();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
