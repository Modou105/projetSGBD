 package jsoupPacket;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.ListIterator;

import javax.lang.model.element.Element;
import javax.lang.model.util.Elements;
import javax.swing.text.Document;
import org.jsoup.*;
import org.jsoup.nodes.*;
import org.jsoup.select.*;

public class TestTelechargement {

	public static void main(String[] args)  throws IOException {
		Document doc;
	doc = (Document) Jsoup.connect("https://sante.sec.gouv.sn/Pr%C3%A9sentation/coronavirus-informations-officielles-et-cotidiennes-du-msas/").timeout(100000).get();
		Document pages;
		HashMap<String, String > Liens = new  HashMap<>();	
		ArrayList<String> content = new ArrayList<>();
		
		
		Elements el2 = (Elements) ((org.jsoup.nodes.Element) doc).select("p a");
		
		for (Element element : el2) {
			if (((org.jsoup.nodes.Element) element).text().contains("de Presse")) {
				content.add(((Node) element).attr("href").replace("covid 19" , "covid%2019"));
				
			}
		}
		ListIterator li = content.listIterator();
		while (li.hasNext())
			System.out.println(li.next());

	}

}
