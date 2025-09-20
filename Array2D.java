public class Array2D {


    public static void main(String[] args) {
        String[][] groceries = {
                {"orange", "Apple", "banana"},
                {"Meat", "chicken", "Fish"},
                {"onion", "Carrot", "Potato"}
        };
        System.out.println("2D array of grocories :");

        for (String[] grocery : groceries) {
            for (String food : grocery) {
                System.out.print(food + " ");
            }
            System.out.println();

        }

        int [][] numbers = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("2D array of numbers :");
        for(int[] number : numbers){
            for(int num : number){
                System.out.print(num +" ");
            }
            System.out.println();
        }

        char [] [] telPhone = {
                {'1' , '2' , '3'},
                {'4' , '5',  '6'},
                {'7' , '8' , '9'},
                {'*',  '0',  '#'}
        };
        System.out.println("Array of char (Telphone):");
        for(char[] number : telPhone){
            for(char num : number){
                System.out.print(num +" ");
            }
            System.out.println();
        }
    }
}