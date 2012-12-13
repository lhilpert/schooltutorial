package de.schooltutorial.pages;

import com.vaadin.ui.Alignment;
import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.PopupView;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
public class PopupViewImpressum extends HorizontalLayout {

	public PopupViewImpressum() {

    	// this is a HorizontalLayout
    	

        // Create the content for the popup
        Label content = new Label(
                "Angaben gem�� � 5 TMG </br>" +
                " MAX Muster </br> ADRESSE " +
                "</br>85354 " +
                "</br>Freising " +
                "</br>Kontakt " +
                "</br>Telefon:"+
                "</br>Verantwortlich f�r den Inhalt nach � 55 Abs. 2 RStV: </br>" +
                "MAX Muster"+
                "<p><strong>Haftung f�r Inhalte</strong></p><p>Die Inhalte unserer Seiten wurden mit gr��ter Sorgfalt erstellt." +
                " F�r die Richtigkeit, Vollst�ndigkeit und Aktualit�t der Inhalte k�nnen wir jedoch keine Gew�hr �bernehmen. " +
                "Als Diensteanbieter sind wir gem�� � 7 Abs.1 TMG f�r eigene Inhalte auf diesen Seiten nach den allgemeinen Gesetzen verantwortlich. " +
                "Nach �� 8 bis 10 TMG sind wir als Diensteanbieter jedoch nicht verpflichtet, �bermittelte oder gespeicherte fremde Informationen zu " +
                "�berwachen oder nach Umst�nden zu forschen, die auf eine rechtswidrige T�tigkeit hinweisen. Verpflichtungen zur Entfernung oder Sperrung der" +
                " Nutzung von Informationen nach den allgemeinen Gesetzen bleiben hiervon unber�hrt. " +
                "Eine diesbez�gliche Haftung ist jedoch erst ab dem Zeitpunkt der Kenntnis einer konkreten Rechtsverletzung m�glich. " +
                "Bei Bekanntwerden von entsprechenden Rechtsverletzungen werden wir diese Inhalte umgehend entfernen.</p>" +
                "<p><strong>Haftung f�r Links</strong></p><p>Unser Angebot enth�lt Links zu externen Webseiten Dritter, auf deren" +
                " Inhalte wir keinen Einfluss haben. Deshalb k�nnen wir f�r diese fremden Inhalte auch keine Gew�hr �bernehmen. F�r die Inhalte" +
                " der verlinkten Seiten ist stets der jeweilige Anbieter oder Betreiber der Seiten verantwortlich. Die verlinkten Seiten wurden zum Zeitpunkt der Verlinkung" +
                " auf m�gliche Rechtsverst��e �berpr�ft. Rechtswidrige Inhalte waren zum Zeitpunkt der Verlinkung nicht erkennbar. Eine permanente" +
                " inhaltliche Kontrolle der verlinkten Seiten ist jedoch ohne konkrete Anhaltspunkte....." +
                "<p><i>Quellverweis: <a href=\"http://www.e-recht24.de/artikel/datenschutz/6590-facebook-like-button-datenschutz-disclaimer.html\" target=\"_blank\">Facebook Disclaimer</a>, <a href=\"http://www.google.com/intl/de/analytics/privacyoverview.html\" target=\"_blank\">Datenschutzerkl�rung f�r Google Analytics</a>, <a href=\"http://www.e-recht24.de/artikel/datenschutz/6635-datenschutz-rechtliche-risiken-bei-der-nutzung-von-google-analytics-und-googleadsense.html \" target=\"_blank\">Google Adsense Haftungsausschluss</a>, <a href=\"http://www.google.com/intl/de/+/policy/+1button.html\" target=\"_blank\">Google +1 Bedingungen</a>, <a href=\"http://twitter.com/privacy\" target=\"_blank\">Twitter Bedingungen</a></i></p>"                
                , Label.CONTENT_XHTML);
               

 

        // The PopupView popup will be as large as needed by the content
        content.setWidth("400px");

        // Construct the PopupView with simple HTML text representing the
        // minimized view
        PopupView popup = new PopupView("Impressum", content);
        addComponent(popup);
        setComponentAlignment(popup, Alignment.MIDDLE_RIGHT);

        // ------
        // Dynamic content for the minimized view
        // ------

        // In this sample we update the minimized view value with the content of
        // the TextField inside the popup.
//        popup = new PopupView(new PopupTextField());
//        popup.setDescription("Click to edit");
//        popup.setHideOnMouseOut(false);
//        addComponent(popup);
//        setComponentAlignment(popup, Alignment.BOTTOM_RIGHT);
    }

	// Create a dynamically updating content for the popup
	public class PopupTextField implements PopupView.Content {

		private TextField tf = new TextField("Edit me");
		private VerticalLayout root = new VerticalLayout();

		public PopupTextField() {
			root.setSizeUndefined();
			root.setSpacing(true);
			root.setMargin(true);
			root.addComponent(new Label(
					"The changes made to any components inside the popup are reflected automatically when "
							+ "the popup is closed, but you might want to provide explicit action buttons for the user, like \"Save\" or \"Close\"."));

			root.addComponent(tf);
			tf.setValue("Initial dynamic content");
			tf.setWidth("300px");
		}

		public String getMinimizedValueAsHTML() {
			return tf.getValue().toString();
		}

		public Component getPopupComponent() {
			return root;
		}
	};
}