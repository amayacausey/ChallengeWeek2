import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Contact Tracing Program\n" +
                "Enter a newly infected person's information\n" +
                "What is the patients name?");
        //Create an array to store data
        ContactInformation Patient = new ContactInformation();
        Patient.setName(sc.nextLine());
        System.out.println("What is " + Patient.getName() + " phone number?");
        Patient.setPhoneNum(sc.nextLine());
        System.out.println("What is " + Patient.getName() + " email?");
        Patient.setEmail(sc.nextLine());
        System.out.println("What city does " + Patient.getName() + " live?");
        Patient.setCity(sc.nextLine());
        System.out.println("What state does " + Patient.getName() + " live?");
        Patient.setState(sc.nextLine());

        Symptoms condition = new Symptoms();

        System.out.println("Does " + Patient.getName() + " have a fever(y/n)?");
        String hasFever = sc.nextLine();
        if (hasFever.equalsIgnoreCase("y")) {
            System.out.println("How long has " + Patient.getName() + " had these symptoms for?");
            condition.setDurationFever(sc.nextLine());
            condition.setFever("Fever");
        }else {
            condition.setFever("NO Fever");
            condition.setDurationFever("N/A");
        }

        System.out.println("Does " + Patient.getName() + " have a cough(y/n)?");
        String hasCough = sc.nextLine();
        if (hasCough.equalsIgnoreCase("y")) {
            condition.setCough("Cough");
            System.out.println("How long has " + Patient.getName() + " had these symptoms for?");
            condition.setDurationCough(sc.nextLine());

        }else {
            condition.setCough("NO Cough");
            condition.setDurationCough("N/A");
        }

        System.out.println("Does " + Patient.getName() + " have symptoms for Shortness of Breath(y/n)?");
        String hasBreath = sc.nextLine();
        if (hasBreath.equalsIgnoreCase("y")) {
            condition.setBreathe("Shortness of Breath");
            System.out.println("How long has " + Patient.getName() + " had these symptoms for?");
            condition.setDurationBreathe(sc.nextLine());
        } else {
            condition.setBreathe("NO Shortness of Breath");
            condition.setDurationBreathe("N/A");
        }

        System.out.println("Does " + Patient.getName() + " have symptoms for Tiredness?");
        String hasTired = sc.nextLine();
        if (hasTired.equalsIgnoreCase("y")) {
            condition.setTired("Tiredness");
            System.out.println("How long has" + Patient.getName() + " had these symptoms for?");
            condition.setDurationTired(sc.nextLine());
        } else {
            condition.setTired("NO Tiredness");
            condition.setDurationTired("N/A");
        }

        System.out.println("Does " + Patient.getName() + " have symptoms for aches (y/n)?");
        String hasAches = sc.nextLine();
        if (hasAches.equalsIgnoreCase("y")) {
            condition.setAches("Aches");
            System.out.println("How long has " + Patient.getName() + " had these symptoms for?");
            condition.setDurationAches(sc.nextLine());
        } else {
            condition.setAches("NO Aches");
            condition.setDurationAches("N/A");
        }
        System.out.println("Does " + Patient.getName() + " have symptoms for Chills (y/n)?");
        String hasChills = sc.nextLine();
        if (hasChills.equalsIgnoreCase("y")) {
            condition.setChills("Chills");
            System.out.println("How long has " + Patient.getName() + " had these symptoms for?");
            condition.setDurationChills(sc.nextLine());
        }else {
            condition.setChills("NO Chills");
            condition.setDurationChills("N/A");
        }
        System.out.println("Does " + Patient.getName() + " have symptoms for Sore Throat(y/n)?");
        String hasThroat = sc.nextLine();
        if (hasThroat.equalsIgnoreCase("y")) {
            condition.setThroat("Sore Throat");
            System.out.println("How long has " + Patient.getName() + " had these symptoms for?");
            condition.setDurationThroat(sc.nextLine());
        }else {
            condition.setThroat("NO Sore Throat");
            condition.setDurationThroat("N/A");
        }
        System.out.println("Does " + Patient.getName() + " have a symptoms for Loss of Smell (y/n)?");
        String hasSmell = sc.nextLine();
        if (hasSmell.equalsIgnoreCase("y")) {
            condition.setSmell("Loss of Smell");
            System.out.println("How long has " + Patient.getName() + " had these symptoms for?");
            condition.setDurationSmell(sc.nextLine());
        }else {
            condition.setSmell("NO Loss of Smell");
            condition.setDurationSmell("N/A");
        }
        System.out.println("Does " + Patient.getName() + " have symptoms for Loss of Taste(y/n)?");
        String hasTaste = sc.nextLine();
        if (hasTaste.equalsIgnoreCase("y")) {
            condition.setTaste("Loss of Taste");
            System.out.println("How long has " + Patient.getName() + " had these symptoms for?");
            condition.setDurationTaste(sc.nextLine());
        }else {
            condition.setTaste("NO Taste");
            condition.setDurationTaste("N/A");
        }
        System.out.println("Does " + Patient.getName() + " have a symptoms for Headache(y/n)?");
        String hasHead = sc.nextLine();
        if (hasHead.equalsIgnoreCase("y")) {
            condition.setHeadache("Headache");
            System.out.println("How long has " + Patient.getName() + " had these symptoms for?");
            condition.setDurationHeadache(sc.nextLine());
        }else
        {
            condition.setHeadache("NO Headache");
            condition.setDurationHeadache("N/A");
        }
        System.out.println("Does " + Patient.getName() + " have a symptoms for Diarrhea(y/n)?");
        String hasDia = sc.nextLine();
        if (hasDia.equalsIgnoreCase("y")) {
            condition.setDiarrhea("Diarrhea");
            System.out.println("How long has " + Patient.getName() + " had these symptoms for?");
            condition.setDurationDiarrhea(sc.nextLine());
        }else
        {
            condition.setDiarrhea("NO Diarrhea");
            condition.setDurationDiarrhea("N/A");
        }
        System.out.println("Does " + Patient.getName() + " have a symptoms for Severe Vomiting(y/n)?");
        String hasVom = sc.nextLine();
        if (hasVom.equalsIgnoreCase("y")) {
            condition.setVomiting("Vomiting");
            System.out.println("How long has " + Patient.getName() + " had these symptoms for?");
            condition.setDurationVomiting(sc.nextLine());
        } else
        {
            condition.setVomiting("NO Vomiting");
            condition.setDurationVomiting("N/A");
        }
        System.out.println("Do you have any additional informational?If not put n/a.");
        condition.setExtra(sc.nextLine());

        Distancing Contact = new Distancing();
        System.out.println("Has " + Patient.getName() + " met or run into anyone (y/n)");
        String userDistance = sc.nextLine();

       ArrayList <Distancing> distancings = new ArrayList<>();
        String reTry = "";
        //while (!reTry.equals("n")) {

            if (userDistance.equalsIgnoreCase("y")) {
                System.out.println("What is his/her name?");
                Contact.setDistanceName(sc.nextLine());
                System.out.println("What is his/her phone number?");
                Contact.setDistanceNum(sc.nextLine());
                System.out.println("What is his/her email?");
                Contact.setDistanceEmail(sc.nextLine());
                distancings.add(Contact);
                System.out.println("Have you ran into anyone else (y/n)?");
                String checkDist = sc.nextLine();

            //System.out.println("Have you ran into anyone else (y/n)?");
           // reTry = sc.nextLine();

        if (checkDist.equalsIgnoreCase("y")) {
            Distancing anotherContact = new Distancing();
            System.out.println("What is his/her name?");
            anotherContact.setDistanceName(sc.nextLine());
            System.out.println("What is his/her phone number?");
            anotherContact.setDistanceNum(sc.nextLine());
            System.out.println("What is his/her email?");
            anotherContact.setDistanceEmail(sc.nextLine());
            System.out.println("Have you ran into anyone else (y/n)?");
            distancings.add(anotherContact);
        }}






        System.out.println("------------------------------");
        System.out.println(Patient.toString());
        System.out.println("------------------------------");
       // System.out.println(condition.toString());
        System.out.println("------------------------------");
        //System.out.print(Contact.toString());
        System.out.println("\n------------------------------");
       // System.out.print(Contact.toString2());
        for (Distancing distancing : distancings)
        {
            System.out.println(distancing.toString());
        }


    }}
