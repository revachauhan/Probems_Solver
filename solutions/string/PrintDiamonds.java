package fewmore.string;

public class PrintDiamonds {

    private PrintDiamonds() {

    }
    public static void main(String[] args) {
		printDiamonds(5);
	}

    public static void printDiamonds(int size) {
        // for odd size
        // we can do similar thing for even size.
        if (size % 2 != 0) {
            int spaceCount = size / 2;
            int starCount = 1;
            while (spaceCount >= 0) {
                for (int i = 0; i < spaceCount; i++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < starCount; j++) {
                    System.out.print("*");
                }
                starCount = starCount + 2;
                spaceCount--;
                System.out.println();
            }
            starCount = size - 2;
            spaceCount = 1;
            while (starCount > 0) {
                for (int i = 0; i < spaceCount; i++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < starCount; j++) {
                    System.out.print("*");
                }
                starCount = starCount - 2;
                spaceCount++;
                System.out.println();
            }
        }
    }
}