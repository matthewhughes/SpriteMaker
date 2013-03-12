public class Main {

    public static void main(String[] args) {
    int xCrd = Integer.parseInt(args[0]);
    int yCrd = Integer.parseInt(args[1]);
	ImageCreation IC = new ImageCreation();
    IC.Welcome();
    IC.CountArgs(args);
    IC.TestingArgs(args);
    IC.CreateRedImage(10, 10, "Hello");
    /*if(args[2] == "red"){
        IC.CreateRedImage(xCrd, yCrd, args[3]);
    } else if (args[2] == "blue"){
        IC.CreateBlueImage(xCrd, yCrd, args[3]);
    } else if (args[2] == "green") {
        IC.CreateGreenImage(xCrd, yCrd, args[3]);
    } else {
        IC.Puts("Only red, green and blue are acceptable ");
        System.exit(1);
    } */

    }
}
