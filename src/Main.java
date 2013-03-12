public class Main {

    public static void main(String[] args) {
    int xCrd = Integer.parseInt(args[0]);
    int yCrd = Integer.parseInt(args[1]);
	ImageCreation IC = new ImageCreation();
    IC.Welcome();
    IC.CountArgs(args);
    if(args[2].equals("red")){
        IC.CreateRedImage(xCrd, yCrd, args[3]);
    } else if (args[2].equals("blue")){
        IC.CreateBlueImage(xCrd, yCrd, args[3]);
    } else if (args[2].equals("green")) {
        IC.CreateGreenImage(xCrd, yCrd, args[3]);
    } else {
        IC.Puts("Only red, green and blue are acceptable ");
        System.exit(1);
    }

    }
}