/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final_project;

import static java.lang.System.in;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author pkaly
 */
public class Ingredient {
    
    /**
     *
     * @param recipeName
     * @param listOfRecipes
     * @param recipeIngredients
     * @param Calories
     * @param IngredientObject
     * @param numberCups
     * @param rate
     * @param Cost
     * @param numberCaloriesPerCup
     * @param TotalCalories
     * @param Calorieslist
     * @param Caloriess
     */
    public static void addIngredient(String recipeName, ArrayList<String> listOfRecipes, ArrayList<String> recipeIngredients, int Calories, ArrayList<String> IngredientObject, float numberCups, double rate, double Cost, double numberCaloriesPerCup, double TotalCalories, double Calorieslist, ArrayList<String> Caloriess) {
        String nameOfIngredient;
        String unit;
        String Answer = "";
        Scanner scnr = new Scanner(in);
            Scanner scnr2 = new Scanner(in); // another scanner was added again because when the ingredients were added
            /** with the previous scanner, it would add extra character such as a space, which will not align
             * Looping ingredients until the user is done, user will be prompted -
             * included based on examples from starter code
            */ 
            
            
            do {
            System.out.println("Please enter the ingredient for "+ recipeName + ": "); //based on starter code
            nameOfIngredient = scnr2.nextLine();
                recipeIngredients.add(recipeName + " : " + nameOfIngredient);
            System.out.println("Choose unit of measure");
                unit = scnr.next().toLowerCase();
                //.add(unit); // in case units need to be collected
            System.out.println("Amount?");
                numberCups = scnr.nextFloat(); // making the data type into string so it will be more organized - to identify the recipe name that correstponds to the items    
                //numberCupslist.add(numberCups); //option of listing all consecutive input of numberCups (not used in final, but tested for rough draft
            System.out.println("Calories per unit: ");
                numberCaloriesPerCup = scnr.nextDouble(); // calories are in integers
                System.out.println("Did you list all of the ingredients?"); // this is an opportunity for the user to list more ingredients, numberCups, unit of measure
                Answer = scnr.next().toLowerCase();;
                TotalCalories =+ numberCaloriesPerCup * numberCups; // multiplying calories per unit by the number of unit(s)
                Calorieslist += TotalCalories; // adding all the calories of each ingredient
                IngredientObject.add(numberCups + " " + unit + " of " + nameOfIngredient + " from " + recipeName + " will have " + TotalCalories + " calories."); // for IngredientObject method in an array list as a string data type
                
                System.out.println("Automatic Calories Calculation: " + Calorieslist);
        } while (!Answer.matches("yes|done") && (numberCaloriesPerCup == (double) numberCaloriesPerCup) | (numberCaloriesPerCup == (int) numberCaloriesPerCup) && (nameOfIngredient.matches(".*[a-zA-Z]+.*")) && (numberCups == (float) numberCups) | (numberCups == (int) numberCups) && (unit.matches("cups|cup|teaspoon|teaspoon|tsp|tablespoon|tablespooms|tbsp|tsps|tbsps|ouce|ouces|oz|ozs|pounds|pound|lb|lbs|ml|liter|ls|l|k|kg|g|gs|ks|kgs")));
        System.out.println("");

    }
    
    /**
     *
     * @param recipeIngredients
     */
    public static void RunIngredient(ArrayList<String> recipeIngredients){
        addIngredient Ingredient1 = new addIngredient();
        Ingredient1.setNameOfIngredients(recipeIngredients);
        Ingredient1.printIngredients();
    }
    
    /**
     *
     */
    public static class addIngredient { //Private static class is created to define the appropriate variables

        /**
         *
         */

        public String recipeName;

        /**
         *
         */
        public String nameOfIngredient;

        /**
         *
         */
        public ArrayList<String> recipeIngredients;

        /**
         *
         */
        public String unit;

        /**
         *
         */
        public float numberCups;

        /**
         *
         */
        public double numberCaloriesPerCup;

        /**
         *
         */
        public double TotalCalories;

        /**
         *
         */
        public double Calorieslist;

        /**
         *
         */
        public addIngredient() {
        }

        /**
         *
         * @param recipeName
         * @param nameOfIngredient
         * @param recipeIngredients
         * @param unit
         * @param numberCups
         * @param numberCaloriesPerCup
         * @param TotalCalories
         * @param Calorieslist
         */
        public addIngredient(String recipeName, String nameOfIngredient, ArrayList<String> recipeIngredients, String unit, float numberCups, double numberCaloriesPerCup, double TotalCalories, double Calorieslist) {
            this.recipeName = recipeName;
            this.nameOfIngredient = nameOfIngredient;
            this.recipeIngredients = recipeIngredients;
            this.unit = unit;
            this.Calorieslist = Calorieslist;
            this.numberCups = numberCups;
            this.numberCaloriesPerCup = numberCaloriesPerCup;
            this.TotalCalories = TotalCalories;
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        /**
         *
         * @param recipeName
         */
        public void setRecipeName(String recipeName) {
            this.recipeName = recipeName;
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
        /**
         *
         * @param recipeIngredients
         */
        public void setNameOfIngredients (ArrayList<String> recipeIngredients) {
            this.recipeIngredients = recipeIngredients;
        }

        /**
         *
         * @param ingredientName
         */
        public void setNameOfIngredient(String ingredientName) {
            this.nameOfIngredient = nameOfIngredient;
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
        /**
         *
         * @param ingredientName
         */
        public void getNameOfIngredient(String ingredientName) {
            this.nameOfIngredient = nameOfIngredient;
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }        
        
        /**
         *
         * @param unit
         */
        public void setunit(String unit) {
            this.unit = unit;
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        /**
         *
         * @param numberCups
         */
        public void setNumberCups(float numberCups) {
            this.numberCups = numberCups;
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
        /**
         *
         * @param numberCups
         */
        public void getNumberCups(float numberCups) {
            this.numberCups = numberCups;
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
        /**
         *
         * @param TotalCalories
         */
        public void setTotalCalories(double TotalCalories) {
            this.TotalCalories = TotalCalories;
        }
        
        /**
         *
         * @param TotalCalories
         */
        public void getTotalCalories(double TotalCalories) {
            this.TotalCalories = TotalCalories;
        }
        
        /**
         *
         */
        public void printIngredients(){
            System.out.println("\nRecipe Ingredients: \n" + recipeIngredients);
        }
    }
}
