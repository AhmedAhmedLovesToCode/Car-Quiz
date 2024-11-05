import java.io.*;
import java.util.*;

public class Main 
{
    public static void main(String[] args) 
    {
        try 
        {
            int points = 0;
            Scanner scan1 = new Scanner(System.in);
            System.out.println("Welcome to the Cars quiz, where we test your knowledge of the best Disney movie in existence CARS!");
            System.out.println("Which one of these three cars would you like to get quizzed on?");
            System.out.println("1: Lightning McQueen");
            System.out.println("2: Sally");
            System.out.println("3: Tow Mater");
            int choice = scan1.nextInt();
            File f = new File("info.txt");
            Scanner scan2 = new Scanner(f);
            

                
            String line = scan2.nextLine();
            String[] infoArray = line.split(",");
            String model = infoArray[0];
            String color = infoArray[1];
            String topSpeed = infoArray[2];
            
            String line2 = scan2.nextLine();
            String[] infoArray2 = line2.split(",");
            String model2 = infoArray2[0];
            String color2 = infoArray2[1];
            String topSpeed2 = infoArray2[2];
            
            String line3 = scan2.nextLine();
            String[] infoArray3 = line3.split(",");
            String model3 = infoArray3[0];
            String color3 = infoArray3[1];
            String topSpeed3 = infoArray3[2];
            
            Car1 McQueen = new Car1("McQueen", model, color, Integer.parseInt(topSpeed));
            Car2 Sally = new Car2("Sally", model, color, Integer.parseInt(topSpeed));
            Car3 TowMater = new Car3("Tow Mater", model, color, Integer.parseInt(topSpeed));
            switch (choice)
            {
                case 1:
                System.out.println("Can you tell me the model in which Lightning McQueen was based off of, make sure the first letter of the word is captialzied.");
                scan1.nextLine();
                String lm1 = scan1.nextLine();
                if (lm1.equals(model))
                {
                    System.out.println("That is correct.");
                    System.out.println("\n");
                    points ++;
                }
                else 
                {
                    System.out.println("That's not quite it, try again");
                    System.out.println("\n");
                }

                System.out.println("What was Lightning McQueen's color, make sure the first letter of the word is captialzied.");
                String lm2 = scan1.nextLine();
                if (lm2.equals(color))
                {
                    System.out.println("You are on a role today!");
                    System.out.println("\n");
                    points++;
                }
                else 
                {
                    System.out.println("No, not exactly.");
                    System.out.println("\n");
                }

                System.out.println("Can you recall Lightning McQueen's top speed.");
                String lm3 = scan1.nextLine();
                if (lm3.equals(topSpeed))
                {
                    System.out.println("CORRECT");
                    System.out.println("\n");
                    points++;
                } 
                else 
                {
                    System.out.println("Not quite");
                    System.out.println("\n");
                }
                
                if (points == 3)
                {
                    System.out.println(McQueen);
                    System.out.println("\n");
                }
                else
                {
                    System.out.println("I think you should watch the movie again");
                    System.out.println("\n");
                }
                
                
                
                case 2:
                System.out.println("Can you tell me the model in which Sally was based off of, make sure the first letter of the word is captialzied.");
                scan1.nextLine();
                String lm4 = scan1.nextLine();
                if (lm4.equals(model2))
                {
                    System.out.println("That is correct.");
                    System.out.println("\n");
                    points ++;
                }
                else 
                {
                    System.out.println("That's not quite it, try again");
                    System.out.println("\n");
                }

                System.out.println("What was Sally's color, make sure the first letter of the word is captialzied.");
                String lm5 = scan1.nextLine();
                if (lm5.equals(color2))
                {
                    System.out.println("You are on a role today!");
                    System.out.println("\n");
                    points ++;
                }
                else 
                {
                    System.out.println("No, not exactly.");
                    System.out.println("\n");
                }

                System.out.println("Can you recall Sally's top speed.");
                String lm6 = scan1.nextLine();
                if (lm6.equals(topSpeed2))
                {
                    System.out.println("3 FOR 3");
                    System.out.println("\n");
                    points ++;
                } 
                else 
                {
                    System.out.println("Not quite");
                    System.out.println("\n");
                }
                
                if (points == 3)
                {
                    System.out.println(Sally);
                    System.out.println("\n");
                }
                else
                {
                    System.out.println("Please consider binge watching the movie");
                    System.out.println("\n");
                }
                
                
                
                
                
                case 3:
                System.out.println("Can you tell me the model in which Tow Mater was based off of, make sure the first letter of the word is captialzied.");
                scan1.nextLine();
                String lm7 = scan1.nextLine();
                if (lm7.equals(model3))
                {
                    System.out.println("\n");
                    System.out.println("That is correct.");
                    
                }
                else 
                {
                    System.out.println("That's not quite it, try again");
                }

                System.out.println("What was Tow Mater's color, make sure the first letter of the word is captialzied.");
                String lm8 = scan1.nextLine();
                if (lm8.equals(color3))
                {
                    System.out.println("You are on a role today!");
                    System.out.println("\n");
                }
                else 
                {
                    System.out.println("No, not exactly.");
                    System.out.println("\n");
                }

                System.out.println("Can you recall Tow Mater's top speed.");
                String lm9 = scan1.nextLine();
                if (lm9.equals(topSpeed3))
                {
                    System.out.println("3 FOR 3");
                    System.out.println("\n");        
                }

                else 
                {
                    System.out.println("Not necessarily");
                    System.out.println("\n");
                }
                
                
                if (points == 3)
                {
                    System.out.println(TowMater);
                    System.out.println("\n");
                }
                else
                {
                    System.out.println("For the love of everything, watch the movie right now");
                    System.out.println("\n");
                }

            }
            

                
        }

        catch (FileNotFoundException ex) 
        {
            System.out.println("File cannot not be found");
        }
        catch(ArrayIndexOutOfBoundsException ec)
        {
            System.out.println("It is out of bounds");
        }
        
        
    }
}
