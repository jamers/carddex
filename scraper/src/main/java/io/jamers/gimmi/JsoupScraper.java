package io.jamers.gimmi;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

import static io.jamers.gimmi.CardMarketClient.URL;

/**
 * References
 * https://www.zenrows.com/blog/web-scraping-java#can-you-web-scrape-in-java
 */
public class JsoupScraper {

    public static void main(String[] args) {
        Document doc;

        try {
            // fetching the target website
            doc = Jsoup.connect(URL)
                    .userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) " +
                            "AppleWebKit/537.36 (KHTML, like Gecko) " +
                            "Chrome/124.0.0.0 " +
                            "Safari/537.36")
                    .header("Accept-Language", "*")
                    .get();
            // 403 boom
            System.out.println();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}