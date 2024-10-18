import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        int num  = 5;
        System.out.printf("num "+ num);
        System.out.println();
        double pi = 0.78;
        String greet = "Hello";
        System.out.println(pi + " pi");
        System.out.println(greet);
        // Press Shift+F10 or click the green arrow button in the gutter to run the code.

     // accessing car class from here and printing
//        Car carObj = new Car("Range Rover",2020);
//         this is toString() method so oveerride it
//        System.out.println(carObj + " -->  result ");
//        carObj.carDisplay();

//        SwitchClass switchobj = new SwitchClass();
//        switchobj.displaySwitch();

        //ArrayIteration
//        ArrayIteration itrObj = new ArrayIteration();
//        itrObj.arrayDisplay();

        //clone array
//        ArrayClone cloneObj = new ArrayClone();
//        cloneObj.arraycloneDisplay(new int[]{2,4,6});

        tryWithResource fileoper =  new tryWithResource();
        fileoper.writeText();

    }
}

class Car{
    //class
    String color; //instance variable
    int year;

    //object
    Car(String color, int year){
        this.color = color;
        this.year = year;
        System.out.println(this.color + "cons---------");
    }
    public void carDisplay(){

        System.out.println("color -- > "+ color + "year --  >"+ year);
    }
    // this is called when car object is printed
    @Override
    public String toString() {
        return color;
    }

}
class SwitchClass{

    public void displaySwitch(){
        int month = 2;
      String monthName = switch (month){
            case 1 -> "Jan";
            case 2 ->  "Feb";
            default -> "ha haa";
        };
        System.out.println(monthName);
    }
}
class ArrayIteration{
    Scanner s = new Scanner(System.in);
    int size = 3;
    public void arrayDisplay(){
        String arr[] = {"a","b","c"};
        for(int i=0;i<size;i++){
            System.out.println("enter array "+ i + "out of "+ (size-i));

            System.out.println(s.nextInt() + " arrayyy  " + i);
        }
        int i = 1;
        for (String each: arr) {
            System.out.println(each + i++);
//            System.out.println(each + Integer.parseInt(each));
        }
    }
}
class ArrayClone{
    public void arraycloneDisplay(int arr1[]){
        int cloneArr1[] = new int[arr1.length];
        cloneArr1 = arr1.clone();
        for (int n:cloneArr1) {
            System.out.println(n + " clonned array elements ");
        }

        int tryCopy[] = Arrays.copyOf(cloneArr1,cloneArr1.length);
        System.out.println(tryCopy[0] + " ");

    }

}


class tryWithResource{

    public void writeText(){

        String txt = "hi all";
        try(FileWriter objFile = new FileWriter("write.txt")){
            for (char ch: txt.toCharArray()) {
                System.out.println(ch);
                objFile.write(ch);
            }

        } catch (IOException e) {
            System.out.println("error " + e);

        }
    }

    public void fileRead(){
        try(FileInputStream FISobj = new FileInputStream("write.txt")){

        }catch(){

        }
    }
//
//
//
//    }


}




