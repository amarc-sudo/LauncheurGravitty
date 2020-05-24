package panel;

import java.awt.BorderLayout;
import java.awt.LayoutManager;
import java.net.URL;

import javax.swing.JEditorPane;
import javax.swing.JPanel;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;

public class PageDowload extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5723815368467941689L;
	BorderLayout layout;
	
	
	public PageDowload() {
		
		super();
		final JEditorPane editeur;
	 
	    try {
	      editeur = new JEditorPane(new URL("http://www.google.fr"));
	      editeur.setEditable(false);
	      editeur.addHyperlinkListener(new HyperlinkListener() {
	        public void hyperlinkUpdate(HyperlinkEvent e) {
	          if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
	            URL url = e.getURL();
	            if (url == null)
	              return;
	            try {
	              editeur.setPage(e.getURL());
	            } catch (Exception ex) {
	              ex.printStackTrace();
	            }
	          }
	        }
	      });
	 
	      add(editeur);
	    } catch (Exception e1) {
	      e1.printStackTrace();
	    }
	  }
	}