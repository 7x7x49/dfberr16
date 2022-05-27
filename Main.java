package com.company;
import java.util.Scanner;

@FunctionalInterface
interface Convert<T, N>{
    N convert(T t);    }

class Structure1{
    int a, b, c;
    public Structure1(int a, int b, int c){          //инициализация переменных
        this.a = a;
        this.b = b;
        this.c = c;                       }
                }

class Structure2{
    int a, b, c;
    public Structure2( int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;                        }

   public int Zero(){
        if(b==0){ return 0; }                         //если b=0, то всё выражение равно нулю

        else{ return (int) Math.pow(b, c) * a; }      //возведение b в степень c и умножение на а
                    }
                }

public class Main{
    public static void main(String[] args) {
        System.out.println("Enter 3 variables using Enter:\n" +
                "a, b, c");
        Scanner in = new Scanner(System.in);
        Structure1 un = new Structure1(in.nextInt(), in.nextInt(), in.nextInt());
        Convert<Structure1, Structure2> con = x -> new Structure2(x.a, x.b, x.c);
        Structure2 deux = con.convert(un);
        System.out.println(deux.a + " * " + deux.b + " ^ " + deux.c + " = " + deux.Zero());
                                           }
                 }
