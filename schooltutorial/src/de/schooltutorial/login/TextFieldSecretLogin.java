package de.schooltutorial.login;

import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Component;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.PopupView.Content;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window.Notification;

import de.schooltutorial.pages.ITabSheetMenu;

@SuppressWarnings("serial")
public class TextFieldSecretLogin extends VerticalLayout implements Content {

    private final TextField username;
    private final PasswordField password;
    
    public TextFieldSecretLogin(final ITabSheetMenu oTabSheet) {
        setSizeUndefined(); // let content 'push' size
        setSpacing(true);
        setMargin(true);

        // Username
        username = new TextField("Username");
        addComponent(username);

        // Password
        password = new PasswordField("Password");
        addComponent(password);

        // Login button
        Button loginButton = new Button("Login", new Button.ClickListener() {
            // inline click listener
            public void buttonClick(ClickEvent event) 
            {
//                getWindow().showNotification(
//                        "User: " + username.getValue() + " Password: "
//                                + password.getValue());
               if (username.getValue() .equals(password.getValue()))
               {
            	   oTabSheet.setLogin(true);
            	   getWindow().showNotification(
                           "Erfolgreich eingeloggt !", Notification.TYPE_HUMANIZED_MESSAGE );
               }
               else 
               {
            	   oTabSheet.setLogin(false);
            	   getWindow().showNotification(
                           "Login fehlgeschlagen !", Notification.TYPE_WARNING_MESSAGE);
               }
            }
        });
        addComponent(loginButton);
        setComponentAlignment(loginButton, Alignment.TOP_RIGHT);

    }

	@Override
	public String getMinimizedValueAsHTML() {
		return username.getValue().toString();
	}

	@Override
	public Component getPopupComponent() {
		return this;
	}
}