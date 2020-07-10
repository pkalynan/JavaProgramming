/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final_project;
import static java.lang.System.in;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author pkaly
 */
public class Recipe {

    /**
     *
     * @param recipeName
     * @param listOfRecipes
     * @param RecipeIngredients
     * @param ListOfServings
     * @param Everything
     * @param totalRecipeCalories
     * @param Servings
     * @param Calories
     * @param IngredientObject
     * @param numberCups
     * @param rate
     * @param Cost
     * @param numberCaloriesPerCup
     * @param TotalCalories
     * @param Calorieslist
     */
    public static void addNewRecipe(String recipeName, ArrayList<String> listOfRecipes, ArrayList<String> RecipeIngredients, List<String> ListOfServings, ArrayList<String> Everything, double totalRecipeCalories, int Servings, int Calories, ArrayList<String> IngredientObject, float numberCups, double rate, double Cost, double numberCaloriesPerCup, double TotalCalories, double Calorieslist) {
        Scanner scnr = new Scanner(in);
            //loop ingredients until user enters yes or done to the question - Recipe(s) user can add more than one
            System.out.println("Please enter the Recipe");
            recipeName = scnr.nextLine(); // in case ingredient name is more than one word
            if (recipeName.matches(".*[a-zA-Z]+.*")){ //ingredients must be alpha
                listOfRecipes.add(recipeName); //adding ingredients that are entered by user
            } 
            else {
                System.out.println("not a valid string.");
            }
            
        Ingredient.addIngredient(recipeName, listOfRecipes, RecipeIngredients, Calories, IngredientObject, numberCups, rate, Cost, numberCaloriesPerCup, TotalCalories, Calorieslist, listOfRecipes);

        
       
        Scanner scnr2 = new Scanner(in);
        try { // catching any error messages if any inputs do not follow the rules
                System.out.println("Please enter the number of servings: ");
                Servings = scnr.nextInt();
                ListOfServings.add(Servings + " : " + recipeName); 
                if (Servings == (int) Servings) { // needed to make this a String to mix with Recipe Name which is a String
                    System.out.println("valid");
                } else {
                    System.out.println("Not an Integer");
                    return;
                }

            } catch (Exception exx1) {
                System.out.println(exx1.getMessage() + " not a valid answer.");
                return;
            }
        
                try { // catching any error messages if any inputs do not follow the rules
                System.out.println("Please enter the number of Calories of " + recipeName + " per serving");
                Calories = scnr.nextInt();
                if (Calories == (int) Calories) { // needed to make this a String to mix with Recipe Name which is a String
                    System.out.println("valid");
                } else {
                    System.out.println("Not an Integer");
                    return;
                }

            } catch (Exception exx1) {
                System.out.println(exx1.getMessage() + " not a valid answer.");
                return;
            }
            
            
            
            totalRecipeCalories =+ (Calories * Servings); // formula - multiply total calories with number of servings 
            
            rate = (double) 0.50; // Random number assigned to rate - does not necessarily mean anything, politically correct, or have research to back that up.
           
            
            Cost = rate * totalRecipeCalories; // cost is rate multiplied by total calories
            
            
            //arraylist as a string data type. For recipe details
            Everything.add("\nRecipe name: \n" + recipeName + "\nServing: \n" + Servings + "\nTotal Calories: \n" + totalRecipeCalories + "\nCost: \n" + "$"+Cost+"0");
    }
    
    /**
     *
     * @param listOfRecipes
     */
    public static void RunRecipe(ArrayList<String> listOfRecipes){
        addNewRecipe Recipe1 = new addNewRecipe();
        Recipe1.setRecipeName(listOfRecipes);
        Recipe1.printRecipe();
    }
    
    /**
     *
     */
    public static class addNewRecipe{ //Private static class is created to define the appropriate variables

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
        public List<String> ListOfServings;

        /**
         *
         */
        public double totalRecipeCalories;

        /**
         *
         */
        public ArrayList<String> listOfRecipes;

        /**
         *
         */
        public String unit;

        /**
         *
         */
        public int Servings;

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
        public int Calories;

        /**
         *
         */
        public ArrayList<String> IngredientObject;

        /**
         *
         */
        public double rate;

        /**
         *
         */
        public double Cost; 

        /**
         *
         */
        public double Calorieslist;
      
        /**
         *
         */
        public addNewRecipe() {
        }

        /**
         *
         * @param recipeName
         * @param listOfRecipes
         * @param recipeIngredients
         * @param ListOfServings
         * @param Everything
         * @param totalRecipeCalories
         * @param Servings
         * @param Calories
         * @param IngredientObject
         * @param numberCups
         * @param rate
         * @param Cost
         * @param numberCaloriesPerCup
         * @param TotalCalories
         * @param Calorieslist
         */
        public addNewRecipe(String recipeName, ArrayList<String> listOfRecipes, ArrayList<String> recipeIngredients, List<String> ListOfServings, ArrayList<String> Everything, double totalRecipeCalories, int Servings, int Calories, ArrayList<String> IngredientObject, float numberCups, double rate, double Cost, double numberCaloriesPerCup, double TotalCalories, double Calorieslist) {
            this.recipeName = recipeName;
            this.nameOfIngredient = nameOfIngredient;
            this.recipeIngredients = recipeIngredients;
            this.ListOfServings = ListOfServings;
            this.Servings = Servings;
            this.totalRecipeCalories = totalRecipeCalories;
            this.unit = unit;
            this.numberCups = numberCups;
            this.numberCaloriesPerCup = numberCaloriesPerCup;
            this.TotalCalories = TotalCalories;
            this.Calories = Calories;
            this.IngredientObject = IngredientObject;
            this.rate = rate;
            this.Cost = Cost; 
            this.Calorieslist = Calorieslist;

            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        /**
         *
         * @param listOfRecipes
         */
        public void setRecipeName(ArrayList<String> listOfRecipes) {
            this.listOfRecipes = listOfRecipes;
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
        /**
         *
         * @param recipeName
         */
        public void getRecipeName(String recipeName) {
            this.recipeName = recipeName;
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
        /**
         *
         * @param totalRecipeCalories
         */
        public void setTotalRecipeCalories(double totalRecipeCalories) {
            this.totalRecipeCalories = totalRecipeCalories;
        }
        
        /**
         *
         * @param totalRecipeCalories
         */
        public void gettotalrecipeCalories(double totalRecipeCalories) {
            this.totalRecipeCalories = totalRecipeCalories;
        }

        /**
         *
         * @param recipeIngredients
         */
        public void setRecipeIngredients(ArrayList<String> recipeIngredients) {
            this.recipeIngredients = recipeIngredients;
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
        /**
         *
         * @param recipeIngredients
         */
        public void getRecipeIngredients(ArrayList<String> recipeIngredients) {
            this.recipeIngredients = recipeIngredients;
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }        

        /**
         *
         * @param Servings
         */
        public void setServings(int Servings) {
            this.Servings = Servings;
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
        /**
         *
         * @param Servings
         */
        public void getServings(int Servings) {
            this.Servings = Servings;
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        /**
         *
         * @param numberCups
         */
        public void setNumberOfCups(float numberCups) {
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
         */
        public void printRecipe() {
            System.out.println("Recipe Name: " + listOfRecipes);
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
}
