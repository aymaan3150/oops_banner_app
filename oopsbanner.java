public class oopsbanner {
    public static void main(String[] args) {
        // Step 1: Create a String array to store all banner lines
        String[] lines = new String[7];
        // Step 2: Populate each line using String.join()
        lines[0] = String.join("   ",
                " ***** "," ***** ","****** "," ***** ");

        lines[1] = String.join("   ",
                "*     *","*     *","*     *","*     *");

        lines[2] = String.join("   ",
                "*     *","*     *","*******","*      ");

        lines[3] = String.join("   ",
                "*     *","*     *","*      "," ***** ");

        lines[4] = String.join("   ",
                "*     *","*     *","*      ","      *");

        lines[5] = String.join("   ",
                "*     *","*     *","*      ","*     *");

        lines[6] = String.join("   ",
                " ***** "," ***** ","*     ","  *****");

        // Step 3: Use enhanced for-loop to print each line
        for (String line : lines) {
            System.out.println(line);
        }
    }
}