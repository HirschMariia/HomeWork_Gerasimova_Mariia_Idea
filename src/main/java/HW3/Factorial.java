package HW3;


    public class Factorial {
        public static void main(String[] args) {
            HW3.Factorial f = new HW3.Factorial();

            System.out.println(f.factorialFor(5));

            System.out.println(f.factorialWhile(6));

            System.out.println(f.factorialDoWhile(7));
        }

        public int factorialFor(int number) {
            if (number <= 0) {
                return 0;
            }

            int result = 1;
            for (int i = 1; i <= number; i++) {
                result *= i;
            }

            return result;
        }

        public int factorialWhile(int number) {
            if (number <= 0) {
                return 0;
            }

            int result = 1;
            int i = 1;
            while(i <= number) {
                result *= i;
                i++;
            }

            return result;
        }

        public int factorialDoWhile(int number) {
            if (number <= 0) {
                return 0;
            }

            int result = 1;
            int i = 1;

            do {
                result *= i;
                i++;
            } while(i <= number);

            return result;
        }
    }
