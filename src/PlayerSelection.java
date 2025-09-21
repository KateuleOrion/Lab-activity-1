import java.util.Scanner;
public class PlayerSelection {

        public static void main(String[] args){
            Scanner input = new Scanner(System.in);

            String name;
            int age;
            double height;
            double weight;
            int jerseyNumber;

            System.out.println("Enter the player name: ");
            name = input.nextLine();

            System.out.println("Enter the player's age: ");
            age = input.nextInt();

            System.out.println("Enter the player's height in meters: ");
            height = input.nextDouble();

            System.out.println("Enter the player's weight in pounds: ");
            weight = input.nextDouble();

            System.out.println("Enter the player's jersey number:");
            jerseyNumber = input.nextInt();

            input.close();

            final double POUND = 0.45359237;
            final int METER = 100;

            double weightInKg = (int) (weight * POUND);

            double heightInCent = (int) height * METER;

            age++;

            // simulated penalty
            jerseyNumber--;

            System.out.println("The player's new age is: " + age + " and their jersey number is now: " + jerseyNumber);

            //Task 4//

            boolean eligible = (age >= 18 && age <= 35 && weightInKg <= 90);
            if(eligible){
                System.out.println("The player is eligible");}
            else{
                System.out.println("The player is NOT eligible");
            }

            boolean hasProblems =(age < 18 || weightInKg >= 90);
            if (hasProblems){
                System.out.println("Player has a problem: either he is too young or overweight!!");}


            boolean isEligible = (!(age >= 18 && age <= 35 && weightInKg <= 90));
            if (isEligible){
                System.out.println("Eligible");}
            else{
                System.out.println("NOT ELIGIBLE");}



            String category;
            if (age < 20)
                category = "Rising Star";
            else if (age < 30)
                category = "Prime Player";
            else
                category = "Veteran";

            String position = switch (jerseyNumber) {
                case 1 -> ("Goalkeeper");
                case 2, 5 -> ("Defender");
                case 6, 8 -> ("Midfielder");
                case 7, 11 -> ("Winger");
                case 9 -> ("Striker");
                case 10 -> ("Playmaker");
                default -> ("not known");
            };

            String lineupDecision;
            if (category.equals("Prime Player")) {
                if (weightInKg < 80) {
                    lineupDecision = "Starting lineup";
                } else {
                    lineupDecision = "Benched";
                }
            } else {
                lineupDecision = "Benched";
            }

            String finalStatus = isEligible ? "Play":"Rest";

            boolean isAttacker = (jerseyNumber >= 7 && jerseyNumber <= 11);


            System.out.println("--- PLAYER REPORT ---");
            System.out.println("Name: "+ name);
            System.out.println("Age " + age + "years");
            System.out.println("Height:" + heightInCent + "cm");
            System.out.println("Weight: " +weightInKg+ "Kg");
            System.out.println("Jersey Number: "+ jerseyNumber);
            System.out.println("Position: "+ position);
            System.out.println("Attacker jersey: " + (isAttacker ? "Yes" : "No"));
            System.out.println("Eligibility: " + (isEligible ? "Eligible" : "Not Eligible"));
            System.out.println("Lineup Decision: " + lineupDecision);
            System.out.println("Final status: " + finalStatus);

        }


}
