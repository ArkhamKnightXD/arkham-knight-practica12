package arkham.knight.practica12.spring;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

//En mainview es recomendable siempre trabajar la pagina de inicio
@Route
public class MainView extends VerticalLayout {

    public MainView(@Autowired MessageBean bean) {


        Button button = new Button("Click me",
                e -> Notification.show(bean.getMessage()));
        add(button);


    }

}
