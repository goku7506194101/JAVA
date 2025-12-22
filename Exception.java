public class Exception {
    public static void main(String[] args) {
        try {
            //read numbers from CLI
            int a  = Integer.parseInt(args[0]);
            int b  = Integer.parseInt(args[1]);

            //Division
            int result = a / b;
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Division by Zero is not allowed.");
        }
        catch (NumberFormatException e) {
            System.out.println("Error: Please provide valid integers.");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Please provide two numbers as command line arguments.");
        }
        finally {
            System.out.println("Execution completed.");
        }
    }
}
