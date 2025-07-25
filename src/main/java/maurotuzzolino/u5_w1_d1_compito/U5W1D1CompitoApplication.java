package maurotuzzolino.u5_w1_d1_compito;

import maurotuzzolino.u5_w1_d1_compito.entities.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class U5W1D1CompitoApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(U5W1D1CompitoApplication.class, args);

        Menu menu = context.getBean(Menu.class);
        menu.stampaMenu();
    }

}
