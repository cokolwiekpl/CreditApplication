package pl.kumor;

import pl.kumor.client.ConsoleReader;
import pl.kumor.core.CreditApplicationService;
import pl.kumor.core.model.Person;

public class Main {

    public static void main(String[] args) {
        CreditApplicationService service = new CreditApplicationService();
        Person person = new ConsoleReader().readInputParameters();

        String decision = service.getDecision(person);

        System.out.println(decision);
    }
}