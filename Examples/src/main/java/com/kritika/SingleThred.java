package com.kritika;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class SingleThred {
    public static void main(String[] args) {
        SingleThred st = new SingleThred();
        st.printNumber();

        for (int j=1; j<=100; j++){
            System.out.print("j: "+ j + "\t");
        }
    }

    public void printNumber(){
        for(int i=1; i<=100; i++){
            System.out.print("i: "+ i + "\t");
        }
    }
}