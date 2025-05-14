//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       /* //Question B
        MyPair<String,Integer> myPair= new MyPair<>("Anders",13);
        //Question C
        MyPair<String,Double> myPair2=new MyPair<>("Phoenix",39.7);
        /*Question D no You cant not assign to eachother because both of them were treated equally in java
        and two of them are seperate individuals
         */
        //Question E
        MyPair<String,Integer>[] grades= new MyPair[5];
        grades[0]= new MyPair<>("Name",10);
        grades[1]= new MyPair<>("Name2",1000);
        grades[2]= new MyPair<>("Name3",12020);
        for(MyPair<String,Integer>x : grades){
            System.out.println(x);
        }
        //it was only Null;
        MyPair<Integer,Integer> myPair= new MyPair<>(120,190);
        MyPair<MyPair<Integer,Integer>,String>appointment= new MyPair<>(myPair,"Name2");
        System.out.println(appointment.swap());
        System.out.println("IM NOT NICE");
}}