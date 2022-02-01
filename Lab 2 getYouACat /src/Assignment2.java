public class Assignment2 {
    public static void main(String[] args) throws Exception {
        //Arjun Patel
        //This program writes the lyrics to a cat song but instead of
        //just using print statements in main, it is split up into different
        //functions to make it efficient.
        Verse1();
        System.out.println();
        Verse2();
        System.out.println();
        Verse3();
        System.out.println();
        Verse4();
        System.out.println();
        Verse5();
        System.out.println();
        Verse6();
    }
    public static void PigOinkPlusRest() {
        System.out.println("Pig goes oink oink,");
        SheepBaaPlusTheRest();
    }
    public static void SheepBaaPlusTheRest() {
        System.out.println("Sheep goes baa, baa,");
        GooseHissPlusRest();
    }
    public static void GooseHissPlusRest() {
        System.out.println("Goose goes hissy, hissy,");
        DuckQuackPlusRest();
    }
    public static void DuckQuackPlusRest() {
        System.out.println("Duck goes quack, quack,");
        HenChimmyPlusRest();
    }
    public static void HenChimmyPlusRest() {
        System.out.println("Hen goes chimmy-chuck, chimmy-chuck,");
        CatFiddle();
    }
    public static void CatFiddle() {
        System.out.println("Cat goes fiddle-i-fee.");
    }

    public static void Verse1() {
        System.out.println("Bought me a cat and the cat pleased me,");
        System.out.println("I fed my cat under yonder tree.");
        CatFiddle();
    }
    public static void Verse2() {
        System.out.println("Bought me a hen and the hen pleased me,");
        System.out.println("I fed my hen under yonder tree.");
        HenChimmyPlusRest();   
    }
    public static void Verse3() {
        System.out.println("Bought me a duck and the duck pleased me,");
        System.out.println("I fed my duck under yonder tree.");
        DuckQuackPlusRest();    
    }
    public static void Verse4() {
        System.out.println("Bought me a goose and the goose pleased me,");
        System.out.println("I fed my goose under yonder tree.");
        GooseHissPlusRest();  
        }
    public static void Verse5() {
        System.out.println("Bought me a sheep and the sheep pleased me,");
        System.out.println("I fed my sheep under yonder tree.");
        SheepBaaPlusTheRest();
    }
    public static void Verse6() {
        System.out.println("Bought me a pig and the pig pleased me,");
        System.out.println("I fed my pig under yonder tree.");
        PigOinkPlusRest();
    }
}

    