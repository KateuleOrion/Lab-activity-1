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

            jerseyNumber--;

            boolean eligible = (age >= 18 && age <= 35 && weightInKg <= 90);
            if(eligible){
                System.out.println("The player is eligible");}
            else{
                System.out.println("The player is NOT eligible");
            }

            String category;
            if (age < 20)
                category = "Rising Star";
            else if (age < 30)
                category = "Prime Player";
            else
                category = "Veteran";
        String position;

            switch (jerseyNumber) {

                case 1:
                    position=  "Goalkeeper";
                    break;
                case 2,5 :
                    position= "Defender";
                    break;
                case 6,8:
                    position ="midfielder";
                    break;
                case 7,11:
                    position= "Winger";
                    break;
                case 9:
                    position= "Striker";
                    break;
                case 10:
                    position= "Playmaker";
                    break;
                default:
                   position= "Unknown";
            }

            /*switch (jerseyNumber) {

                case 1:
                    System.out.println("Player position: Goalkeeper");
                    break;
                case 2 :
                    System.out.println("Player position: Defender");

                case 5:
                    System.out.println("Player position: Defender");
                    break;
                case 6:
                    System.out.println("Player position: midfielder");

                case 8:
                    System.out.println("Player position: Midfielder");
                    break;
                case 7:
                    System.out.println("Player position: Winger");
                case 11:
                    System.out.println("Player position: Winger");
                    break;
                case 9:
                    System.out.println("Player position: Striker");
                    break;
                case 10:
                    System.out.println("Player position: Playmaker");
                    break;
                default:
                    System.out.println("Player position: Unknown");

            };*/

        
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

            String finalStatus = eligible ? "Play": "Rest";

            boolean isAttacker = (jerseyNumber >= 7 && jerseyNumber <= 11);

            System.out.println("--- PLAYER REPORT ---");
            System.out.println("Name: "+ name);
            System.out.println("Age " + age + "years");
            System.out.println("Height:" + heightInCent + "cm");
            System.out.println("Weight: " +weightInKg+ "Kg");
            System.out.println("Jersey Number: "+ jerseyNumber);
            System.out.println("Position: "+ position);
            System.out.println("Attacker jersey: " + (isAttacker ? "Yes": "No"));
            System.out.println("Eligibility: " + (eligible ? "Eligible" : "Not Eligible"));
            System.out.println("Lineup Decision: " + lineupDecision);
            System.out.println("Final status: " + finalStatus);

        }


}
