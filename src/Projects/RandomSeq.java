package Projects;

class Baap {
    public int h = 4;

    public int getH() {
        System.out.println("Baap " + h);
        return h;
    }
}

public class RandomSeq extends Baap {
    public int h = 44;

    public int getH() {
        System.out.println("RandomSeq " + h);
        return h;
    }

    public static void main(String[] args) {
        Baap b = new RandomSeq();
        System.out.println(b.h + " " + b.getH());
        RandomSeq bb = (RandomSeq) b;
        System.out.println(bb.h + " " + bb.getH());


//        System.out.println("Traditional Switch Statement:");
//        final int integer = 3;
//        String numericString;
//        switch (integer) {
//            case 1:
//                numericString = "one";
//                break;
//            case 2:
//                numericString = "two";
//                break;
//            case 3:
//                numericString = "three";
//                break;
//            default:
//                numericString = "N/A";
//        }
//        System.out.println("\t" + integer + " ==> " + numericString);

    }

}
