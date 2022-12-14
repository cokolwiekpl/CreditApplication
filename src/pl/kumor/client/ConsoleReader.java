package pl.kumor.client;

import pl.kumor.core.model.*;

import java.util.Scanner;

public class ConsoleReader {

    public Person readInputParameters() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = in.next();

        System.out.println("Enter your last name");
        String lastName = in.next();

        System.out.println("Enter your mothers maiden name");
        String mothersMaidenName = in.next();

        System.out.println("What is your marital status? (SINGLE, MARRIED, DIVORCED, WIDOWED, SEPARATED)");
        MaritalStatus maritalStatus = MaritalStatus.valueOf(in.next());

        System.out.println("What is your education level? (NONE, PRIMARY, MIDDLE, SECONDARY, POST_SECONDARY, TERTIARY)");
        Education education = Education.valueOf(in.next());

        System.out.println("Enter your email address:");
        String email = in.next();

        System.out.println("Enter your phone number:");
        String phoneNumber = in.next();

        System.out.println("Enter total monthly income in PLN");
        double income = in.nextDouble();

        System.out.println("Enter number of family dependants (including applicant):");
        int numOfDependant = in.nextInt();

        PersonalData personalData = new PersonalData(name, lastName, mothersMaidenName, income, maritalStatus, education, numOfDependant);
        ContactData contactData = new ContactData(email, phoneNumber);

        return new Person(personalData, contactData);
    }
}
