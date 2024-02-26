import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            int testCases = Integer.parseInt(input.nextLine());
            for(int testcase = 0; testcase < testCases; testcase++) {
                String[] in = input.nextLine().split(" ");

                double iterations = 0;
                try {
                    iterations = Double.parseDouble(in[1]);
                } catch (NumberFormatException e){
                    iterations = 0;
                }
                double width = 0;
                try {
                     width = Integer.parseInt(in[0]) / Math.pow(2, iterations);
                } catch (NumberFormatException eg){
                    width = 1;
                }
                double areaOne = (Math.sqrt(3.0))/4 * Math.pow(width, 2);






                int triangles =(int)(Math.pow(3.0, iterations));

                double area = areaOne * triangles;
                String fg = String.format("%.2f", area);

                if (Double.isInfinite(iterations) || Double.isNaN(iterations)){
                    fg = "0.00";

                }

                System.out.println(triangles + " " + fg);

            }
        }


        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
    }
}