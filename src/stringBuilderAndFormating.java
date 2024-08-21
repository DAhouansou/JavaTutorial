public class stringBuilderAndFormating {

    public static void main (String[] args) {

        String info = "";

        info += "My name is Bob";
        info += "";
        info += "I am a builder";

        StringBuilder sb = new StringBuilder();

        sb.append("My name is Bob")
        .append(" ")
        .append("I am a toilet");

        System.out.println(sb.toString());


        /////Formatting///////////////////////////////////////

        System.out.println("Here is text \t that was a new tab, \nthat was a new line");


        System.out.printf("Total quantity is %12d; total cost is %d.", 24, 54);
        System.out.printf("\nTotal value %s: %12.2f ", "of the digit is", 4.54);
    }
}
