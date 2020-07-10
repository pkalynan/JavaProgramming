/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final_project;

/**
 *
 * @author pkaly
 */
//imports
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
        
/**
 *
 * @author pkaly
 */
public class RecipeBox {

    /**
     * @param args the command line arguments
     */
    
        private static class RecipeBox_ {
            //Defining variabls and datatypes
    
            private String recipeName;
            private String ingredientName;
            private int TotalRecipeCalories;
            private String Ingredients;
            private int Servings;
            private int Calories; //From the recipe class - suggests that it is per serving and not total.
            private double totalRecipeCalories; //needs to be a double
            private float numberCups; //number of units - unit of measure has a wide variety of abbreviations and full length units
            private String unit;
            private double rate; //to calculate cost
            private int numberCaloriesPerCup; //calories per unit
            private double TotalCalories; //suggests total calories included the number of servings
            private double Calorieslist; // this can sum up all calories per recipe - this is within the Ingredient java class
            private double Cost; //cost multiplies totalRecipeCalories and rate
            
            

            //This is the format that the data types and variables that functions
            java.util.ArrayList<String> listOfRecipes = new java.util.ArrayList<>();
            java.util.ArrayList<String> RecipeIngredients = new java.util.ArrayList<>();
            java.util.List<String> ListOfServings = new java.util.ArrayList<>();
            java.util.ArrayList<String> Everything = new java.util.ArrayList<>();
            java.util.List<String> CaloriesPerServings = new java.util.ArrayList<>();
            java.util.ArrayList<String> IngredientObject = new java.util.ArrayList<>();

            

            private void getListOfRecipes(ArrayList<String> listOfRecipes) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                this.listOfRecipes = listOfRecipes;
                }

            private void setRecipeIngredients(ArrayList<String> RecipeIngredients) {
                this.RecipeIngredients = RecipeIngredients;
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }

            private void setlistOfRecipes(ArrayList<String> listOfRecipes) {
                this.listOfRecipes = listOfRecipes;
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }
            
            //This code takes Stepping Stone 5 codes and displays once accessed
            //It is also used to print all of the recipes in Stepping stone 5 and recently added ones as well
            private void printAllRecipeDetails() {
                System.out.println("Recipe names recently added: " + listOfRecipes);
                System.out.println("Details");
                RecipeBox.ListEverything(recipeName, listOfRecipes, RecipeIngredients, ListOfServings, Everything, totalRecipeCalories, Servings, Calories, IngredientObject, rate, rate, Cost, TotalCalories, TotalCalories, Calorieslist);

            }
            
            /**delete ingredients individually (this is not relational, so the other sections may still have what
            *
            * was deleted
            * According to index.
            * **/
            private void deleteIngredient() {
                Scanner scnr = new Scanner(System.in);
                        if (!IngredientObject.isEmpty()) {
                            int i = 0;    
                            int index;
                            
                                    
                            System.out.println("Would you like to remove an item?");
                            String SAnswer = scnr.nextLine().toLowerCase();
                            if (SAnswer.equals("yes")) {
                                System.out.println("Enter the index that needs to be removed: ");
                                index = scnr.nextInt();
                                IngredientObject.remove(index);
                                System.out.println("New list: " + IngredientObject);
                            }
                                else {
                                    return;
                                    
                                }
                        } 
            }
            
            //delete method to remove a recipe according to index
            private void deleteitem() {
                Scanner scnr = new Scanner(System.in);
                        if (!listOfRecipes.isEmpty()) {
                            int i = 0;    
                            int index;
                            
                                    
                            System.out.println("Would you like to remove an item?");
                            String SAnswer = scnr.nextLine().toLowerCase();
                            if (SAnswer.equals("yes")) {
                                System.out.println("Enter the index of the ingredient that needs to be removed: ");
                                index = scnr.nextInt();
                                listOfRecipes.remove(index);
                                System.out.println("New list: " + listOfRecipes);
                            }
                                else {
                                    return;
                                    
                                }
                        } 
            }
            
            //deletion method.
            // user can delete recipe details in arraylist according to index
            private void deleteWholeRecipeDetails() {
                Scanner scnr = new Scanner(System.in);
                        if (!Everything.isEmpty()) {
                            int i = 0;    
                            int index;
                            
                                    
                            System.out.println("Would you like to remove a recipe");
                            String SAnswer = scnr.nextLine().toLowerCase();
                            if (SAnswer.equals("yes")) {
                                System.out.println("Enter the index of the ingredient that needs to be removed: ");
                                index = scnr.nextInt();
                                Everything.remove(index);
                                System.out.println("New list: " + Everything);
                            }
                                else {
                                    return;
                                    
                                }
                        } 
            }
            
            //most private voids will be used in the menu
            // ingredientObject printout
            private void IngredientObject() {
                System.out.println("Ingredients");
                Ingredient.RunIngredient(RecipeIngredients); // adding an object from Ingredient java class
                RecipeBox.IngredientObject(IngredientObject); 
            }
            
            //servings print
            private void Servings() {
                System.out.println("Listing all Servings: ");
                RecipeBox.ListServings(ListOfServings);
                
            }
            
            //print of recipe details within another method labelled differently
            private void Everything(){
                RecipeBox.ListEverything(recipeName, listOfRecipes, RecipeIngredients, ListOfServings, Everything, totalRecipeCalories, Servings, Calories, IngredientObject, rate, rate, Cost, TotalCalories, TotalCalories, Calorieslist);
            }

           
            
            //This code takes Stepping Stone 5 codes and displays once accessed 
            //It is used to print all recently added recipe names in an arraylist
            private void printAllRecipeNames() {
                System.out.println("Recipes: ");
                //RecipeBox.listOfRecipes(listOfRecipes); - this is also functional but not used
                Recipe.RunRecipe(listOfRecipes); // using object from Recipe java class
            }

            //This code takes Stepping Stone 5 codes and displays once accessed 
            //It is used to add recipes to an arraylist
            //long list of variables, all are needed to function properly
            private void addNewRecipe() {
                Recipe.addNewRecipe(recipeName, listOfRecipes, RecipeIngredients, ListOfServings, Everything, totalRecipeCalories, Servings, Calories, IngredientObject, numberCups, rate, Cost, TotalCalories, TotalCalories, Calorieslist);
                
            }
                        

            //This code was needed to choose from the options from stepping stone 6
            //It was essential to let the user choose whether to add a recipe, print recipe details or print all recipe names
            private void menu () {
                //Adding a Recipe Box and defining variables with datatypes
                RecipeBox_ myRecipeBox = new RecipeBox_();
                Scanner menuScnr = new Scanner(System.in);
                int input;
                
               //looping with a do-while statement for the menu
                do {
                //menu selection list
                System.out.println("Menu\n" + "1. Add Recipe\n" + "2. Print All Recipe Details\n" + "3. Print All Recipe Names\n" +"4. Exit" + "\nPlease select a menu item:");
                input = menuScnr.nextInt(); 
                
                //Switch statement to convert the entered number from 1 to 3
                switch (input) {
                
                    case 1:
                        myRecipeBox.addNewRecipe(); //using recipebox to add a recipe
                        continue; //chose to continue and not break for a coninuous loop back to the menu options
                
                
                    case 2:
                        /**
                         * As mentioned before, Ingredients from recipes need to be deleted one-by-one
                         * this is not a relational application - that is why items/recipes need to be 
                         * deleted individually and separately. 
                         */
                        myRecipeBox.IngredientObject(); 
                        /** ingredients has its own section as it was difficult create 
                        * a for loop without cutting off the variable value in further
                        * codes and classes.
                        **/
                        myRecipeBox.deleteIngredient();
                        myRecipeBox.Servings(); // list of servings according to recipe name
                        myRecipeBox.printAllRecipeDetails(); //using recipebox to print all recipe details
                        //myRecipeBox.Everything(); // Including the additional inputs entered by user
                        myRecipeBox.deleteWholeRecipeDetails(); // option to delete
                        continue; //continuing back to the menu options
                
                
                    case 3:
                        myRecipeBox.printAllRecipeNames(); //using recipebox to print all recipe names
                        myRecipeBox.deleteitem(); //delete an item or many depending on recipe names available
                        continue; //reverting back to the menu options
                           
                        
                    case 4: // user can exit
                        System.exit(0);
                        
                    default: //any other input entered will cause a break in the loop
                        break;
                }} while (input == (int) input); //As long as the input is an integer the loop will be maintained

           

            }
        }
        
    /**
     *
     * @param args
     */
    public static void main(String[] args) { //main class to run the code
        // TODO code application logic here
        
        RecipeBox_ myRecipeBox = new RecipeBox_(); //defining the recipebox
            myRecipeBox.menu(); //accessing the menu options
            /** All the methods, classes including the Ingredient java class, will be within "an object array list"
             * as this new RecipeBox_ entails all classes and elements.
             * Also, as the menu options also involves many of the classes in the package
             * */
            

        
            
        }
       /**information entered in the Ingredient java class can be printed in the ingredients section of the menu
         * with the recipe name, unit, and amount per entry by user
     * @param IngredientObject
         **/
       public static void IngredientObject(ArrayList<String> IngredientObject) {
            System.out.println(IngredientObject);
        }
       
        

        //Listing all recipes entered

    /**
     *
     * @param listOfRecipes
     */
        public static void listOfRecipes(ArrayList<String> listOfRecipes){
            System.out.println(listOfRecipes.toString());
        
                   
                        }
        
        //printing out each recipe's serving(s)

    /**
     *
     * @param ListOfServings
     */
        public static void ListServings(List<String> ListOfServings) {
            System.out.println(ListOfServings);
        }
        
        //Format in arraylist as string - for printing all recipe details

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
                
        public static void ListEverything(String recipeName, ArrayList<String> listOfRecipes, ArrayList<String> RecipeIngredients, List<String> ListOfServings, ArrayList<String> Everything, double totalRecipeCalories, int Servings, int Calories, ArrayList<String> IngredientObject, double numberCups, double rate, double Cost, double numberCaloriesPerCup, double TotalCalories, double Calorieslist) {
            System.out.println(Everything);
        }
    
}