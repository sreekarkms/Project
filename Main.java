import java.util.*;
public class Main{
    static void check(char op,int[][] boxes,int pos,int x1){
        char op1=op;
        switch(op1){
            case 'l':
                l(boxes,pos);
                break;
            case 'r':
                r(boxes,pos);
                break;
            case 'f':
                f(boxes,pos,x1);
                break;
            /*case b:
                b(boxes,pos);*/
        }
    }
    static void display(int[][] boxes){
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(boxes[i][j]);
            }
            System.out.println();
        }
    }
    static void f(int[][] boxes,int pos,int x1){
        Scanner sc=new Scanner(System.in);
        int ele=pos;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.println("1.--------"+i+"--"+j+"x1"+x1);
                if(boxes[i][j]==pos){
                    System.out.println("2.--------"+i+"--"+j+"x1"+x1);
                    if(i>=0&&j>=0){
                        System.out.println("3.--------"+i+"--"+j+"x1"+x1);
                        if(x1%2==1||x1==1){
                            System.out.println("4");
                            if(boxes[i-1][j]==0){
                                System.out.println("5");
                                boxes[i-1][j]=pos;
                                boxes[i][j]=0;
                                break;
                            }
                            if(boxes[i-1][j]!=0){
                                System.out.println("6");
                                boxes[i-1][j]=pos;
                                boxes[i][j]=0;
                                break;
                            }
                            else{
                            System.out.println("Out of the board");
                            break;
                            }
                        }
                        else{
                            if(i>=0&&j>=0){
                                System.out.println("4.");
                                if(i<=4&&j<=4){
                                    if(i+1<5){
                                        //System.out.println("#####");
                                        if(boxes[i+1][j]==0){
                                            boxes[i+1][j]=pos;
                                            boxes[i][j]=0;
                                            break;
                                        }
                                        if(boxes[i+1][j]!=0){
                                            //System.out.println("$$$$$$$$$");
                                            boxes[i+1][j]=pos;
                                            boxes[i][j]=0;
                                            break;
                                        }
                                    }
                                    else{
                                        //System.out.println("!!!!!!!!!!!!!");
                                        System.out.println("Out of the board");
                                        break;    
                                    }
                                }
                                else{
                                    //System.out.println("~~~~~~~~~~");
                                    System.out.println("Out of the board");
                                    break;
                                }
                            }
                            break;
                            
                            }
                          //  break;
                        }
                        break;
                    }
                    //break;
                }
                //break;
            }
        System.out.println("-------------------------------------------------");
        display(boxes);
    }
    //------------------------------------------------------------------------------------------
    static void r(int[][] boxes,int pos){
        Scanner sc=new Scanner(System.in);
        int ele=pos;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(boxes[i][j]==pos){
                    if(i>=0&&j>=0){
                        System.out.println("--------"+i+"--"+j);
                        if(boxes[i][j+1]==0){
                            boxes[i][j+1]=pos;
                            boxes[i][j]=0;
                            break;
                        }
                        else if(boxes[i][j+1]!=0){
                        
                            boxes[i][j+1]=pos;
                            boxes[i][j]=0;
                            break;
                        }
                        
                    }
                    else{
                        System.out.println("Out of the board");
                        break;
                    }
                }
            }
        }
        System.out.println("-------------------------------------------------");
        display(boxes);
    }
    static void l(int[][] boxes,int pos){
        Scanner sc=new Scanner(System.in);
        int ele=pos;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(boxes[i][j]==pos){
                    if(i>0&&j>0){
                        System.out.println("--------"+i+"--"+j);
                        if(boxes[i][j-1]==0){
                            boxes[i][j-1]=pos;
                            boxes[i][j]=0;
                        }
                        if(boxes[i][j-1]!=0){
                        
                            boxes[i][j-1]=pos;
                            boxes[i][j]=0;
                        }
                        
                    }
                    else{
                        System.out.println("Out of the board");
                        break;
                    }
                }
            }
        }
        System.out.println("-------------------------------------------------");
        display(boxes);
    }
    
    static void level1(int[][] boxes){
        Scanner sc=new Scanner(System.in);
        System.out.println("WELCOME");
        System.out.println("You are playing LEVEL-1");
        System.out.println("L R F B can be used");
        //char op=sc.next().charAt(0);
        int count1=0,count2=0,count3=0,count4=0,count5=0;
        //System.out.println("Enter the pawn position and operation:");
        for(int i=0;i<1000;i++){
            System.out.println("Enter the A PLayer move");
            int pos=sc.nextInt();
            int x1=1;
            char op=sc.next().charAt(0);
            check(op,boxes,pos,x1);
            System.out.println("----------------------");
            //l(boxes,pos);
            //char operation=sc.next().charAt(0);    
            System.out.println("Enter Player-B move");
            int pos1=sc.nextInt();
            x1=x1+1;
            char op1=sc.next().charAt(0);
            check(op1,boxes,pos1,x1);
            
        }
        
        
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int boxes[][]=new int[5][5];
        System.out.println("PLAYER-A");
        System.out.println("Enter the places of pawns to be stored in order(in numerics)");
        for(int i=0;i<5;i++){
            boxes[4][i]=sc.nextInt();
        }
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(boxes[i][j]);
            }
            System.out.println();
        }
        //PLAYER-B input
        System.out.println("PLAYER-B");
        System.out.println("Enter the places of pawns to be stored in order(in numerics)");
        for(int i=0;i<5;i++){
            boxes[0][i]=sc.nextInt();
        }
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(boxes[i][j]);
            }
            System.out.println();
        }
        //Problem solving
        System.out.println("Choose the LEVEL you want to play:");
        System.out.println("1. LEVEL-1");
        System.out.println("2. LEVEL-2");
        System.out.println("3. LEVEL-3");
        System.out.println("Enter Your choice by numericals(1, 2, 3)");
        //int input=sc.nextInt();
        //level1(boxes);
        int level=sc.nextInt();
        switch(level){
            case 1:
                level1(boxes);
                break;
           /* case 2:
                level2(boxes);
                break;
            case 3:
                level3(boxes);
                break;
             */   
        }
    }
}