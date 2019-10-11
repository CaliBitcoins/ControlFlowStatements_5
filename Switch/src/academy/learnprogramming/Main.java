package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    int value = 1;
	    if(value ==1) {
            System.out.println("Value was 1");
        } else if(value == 2) {
	        System.out.println("Value was 2");
        } else {
            System.out.println("Was not 1 or 2");
        }


	    // SWITCH STATEMENT FORMAT

	    // switch(switchValue) {
            // case testSwitchValue0:
                // do.something();
                // break;
            // case testSwitchValue1:
                // do.something();
                // break;
            // default:
                // do.this(if not caught);

        int switchValue = 2;

	    switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        // CODING CHALLENGE

        char switchChar = 'T';
	    switch(switchChar) {
            case 'A':
                System.out.println("Found 'A' ");
                break;
            case 'B':
                System.out.println("Found 'B' ");
                break;
            case 'C':
                System.out.println("Found 'C' ");
                break;
            case 'D':
                System.out.println("Found 'D' ");
                break;
            case 'E':
                System.out.println("Found 'E' ");
                break;
            default:
                System.out.println("Not found");
                break;
        }

    }
}
