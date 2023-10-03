public class Person {
    public String name;
    public int age;
    public boolean sex;
    //True - male
    //False - female


    public String getName(){
        String prefix = sex ? "Mr" : "Mrs";
        return prefix + ". " + name;
//        if (sex){
//            return "Mr. " + name;
//        } else {
//            return "Mrs. " + name;
//
//        }

    }
}
