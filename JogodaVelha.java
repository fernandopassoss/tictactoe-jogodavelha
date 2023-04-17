/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.jogodavelha;

/**
 *
 * @author luisf
 */
import java.util.Scanner;
import java.util.InputMismatchException;

public class JogodaVelha {

 
public static void main(String[] args) {
    
   
    /*Como não são muitas variáveis e não podemos utilizar vetor, optaremos por criar 
    uma variável para cada posição do tabuleiro*/
    int coluna=0, linha=0;
    char linha1coluna1 = ' ', linha1coluna2 = ' ', linha1coluna3 = ' ';
    char linha2coluna1 = ' ', linha2coluna2 = ' ', linha2coluna3 = ' ';
    char linha3coluna1 = ' ', linha3coluna2 = ' ', linha3coluna3 = ' ';

    Scanner ler = new Scanner(System.in);
        
    System.out.println("Sejam bem vindos ao jogo da velha via JAVA,  "
            + "observem com a atenção o tabuleiro."
            + "Ele contem linhas e colunas enumeradas para que possam interagir\n");
    System.out.println("Tabuleiro:\n1  |  |  \n"
            + "___|__|___\n"
            + "2  |  |  \n"
            + "___|__|___\n"
            + "3  |  |  \n"
            + "   |  |  \n"
            + " 1  2  3");
    System.out.println("Fiquem atentos e boa sorte :)\nObs: JOGADOR 1 = X, JOGADOR 2 = O\n");
    
        
    do{
        
        if(linha1coluna1!=' ' 
            && linha1coluna2!=' ' 
                && linha1coluna3!=' ' 
                    && linha2coluna1!=' ' 
                        && linha2coluna2!=' ' 
                            && linha2coluna3!=' ' 
                                && linha3coluna1!=' ' 
                                    && linha3coluna2!=' ' 
                                        && linha3coluna3!=' '){
                System.out.println("Deu velha, nenhum vencedor :(");
                break;
        }
        

        do{
            
   
              
            
            try{
                System.out.println("Jogador 1, informe a coluna");
            while(! ler.hasNextInt()){
                ler.nextLine();
                System.out.println("Entrada invalida, tente novamente");
              }
            
            coluna = ler.nextInt();
              
            System.out.println("Agora digite a linha");             
            while(! ler.hasNextInt()){
                System.out.println("Entrada invalida, tente novamente");
                ler.nextLine();
              }
            
            linha = ler.nextInt();  
              
            }catch(InputMismatchException erro){
               System.out.println("Valor invalido, erro "+ erro);
               continue;
            }
            
            
            
        if(coluna==1){
            if(linha == 1 && linha1coluna1 == ' ' ){
                linha1coluna1 = 'x';
                break;
                    }else if(linha == 2 && linha2coluna1 == ' ' ){
                       linha2coluna1 = 'x';
                       break;
                          }else if(linha == 3 && linha3coluna1 == ' '){
                                linha3coluna1 = 'x';
                                break;
                           }               
        }
        if(coluna==2){
            if(linha == 1 && linha1coluna2 == ' '){
                linha1coluna2 = 'x';
                break;
                    }else if(linha == 2 && linha2coluna2 == ' '){
                        linha2coluna2 = 'x';
                        break;
                            }else if(linha == 3 && linha3coluna2 == ' '){
                                linha3coluna2 = 'x';
                                break;
                           }
        }
        if(coluna==3){
            if(linha == 1 && linha1coluna3 == ' '){
                linha1coluna3 = 'x';
                break;
                    }else if(linha == 2 && linha2coluna3 == ' '){
                        linha2coluna3 = 'x';
                        break;
                            }else if(linha == 3 && linha3coluna3 == ' '){
                                linha3coluna3 = 'x';
                                break;
                            }
        }
        
        if((coluna!=1 && coluna!=2 && coluna!=3)||(linha!=1 && linha!=2 && linha!=3)){
            System.out.println("Digite exclusivamente numeros entre 1 e 3");
        }   
        
        
        }while(true);
        
        if(linha1coluna1!=' ' 
            && linha1coluna2!=' ' 
                && linha1coluna3!=' ' 
                    && linha2coluna1!=' ' 
                        && linha2coluna2!=' ' 
                            && linha2coluna3!=' ' 
                                && linha3coluna1!=' ' 
                                    && linha3coluna2!=' ' 
                                        && linha3coluna3!=' '){
                System.out.println("Deu velha, nenhum vencedor :(");
                break;
        }
        
        System.out.println("Tabuleiro:\n1 "
                + linha1coluna1 +" | "
                + linha1coluna2 +" | "
                + linha1coluna3 +
                " \n ___|___|___\n2 "
                + linha2coluna1 +" | "
                + linha2coluna2 +" | "
                + linha2coluna3 +
                " \n ___|___|___\n3 "
                + linha3coluna1 +" | "
                + linha3coluna2 +" | "
                + linha3coluna3 +
                " \n    |   |   \n   1  2  3");
        
        if((linha1coluna1=='x' && linha2coluna2=='x' && linha3coluna3=='x')||
                (linha1coluna3=='x' && linha2coluna2=='x' && linha3coluna1=='x')||
                    (linha1coluna1=='x' && linha2coluna1=='x' && linha3coluna1=='x')||
                        (linha1coluna2=='x' && linha2coluna2=='x' && linha3coluna2=='x')||
                            (linha1coluna3=='x' && linha2coluna3=='x' && linha3coluna3=='x')||
                                (linha1coluna1=='x' && linha1coluna2=='x' && linha1coluna3=='x')||
                                    (linha2coluna1=='x' && linha2coluna2=='x' && linha2coluna3=='x')||
                                            (linha3coluna1=='x' && linha3coluna2=='x' && linha3coluna3=='x')){
            
                                                System.out.println("Parabens player 1, voce ganhou");
                                                break;
        }


        do{
            

            
            try{
                System.out.println("Jogador 2, informe a coluna");
            while(! ler.hasNextInt()){
                System.out.println("Entrada invalida, tente novamente");
                ler.nextLine();
                
            }
            coluna = ler.nextInt();
              
                System.out.println("Agora digite a linha");
              
            while(! ler.hasNextInt()){
                System.out.println("Entrada invalida, tente novamente");
                ler.nextLine();
              }
            linha = ler.nextInt();  
              
            }catch(InputMismatchException erro){
                System.out.println("Valor invalido, erro "+ erro);
                continue;
            }

            if(coluna==1){
                if(linha == 1 && linha1coluna1 == ' ' ){
                    linha1coluna1 = 'o';
                    break;
                        }else if(linha == 2 && linha2coluna1 == ' ' ){
                            linha2coluna1 = 'o';
                            break;
                                }else if(linha == 3 && linha3coluna1 == ' '){
                                    linha3coluna1 = 'o';
                                    break;
                                   }
            }               
                               
            if(coluna==2){
                if(linha == 1 && linha1coluna2 == ' '){
                    linha1coluna2 = 'o';
                    break;
                        }else if(linha == 2 && linha2coluna2 == ' '){
                            linha2coluna2 = 'o';
                            break;
                                }else if(linha == 3 && linha3coluna2 == ' '){
                                    linha3coluna2 = 'o';
                                    break;
                               }
            }
            if(coluna==3){
                if(linha == 1 && linha1coluna3 == ' '){
                    linha1coluna3 = 'o';
                    break;
                        }else if(linha == 2 && linha2coluna3 == ' '){
                            linha2coluna3 = 'o';
                            break;
                                }else if(linha == 3 && linha3coluna3 == ' '){
                                    linha3coluna3 = 'o';
                                    break;
                                }
            }
            
        if((coluna!=1 && coluna!=2 && coluna!=3)||(linha!=1 && linha!=2 && linha!=3)){
            System.out.println("Digite exclusivamente numeros entre 1 e 3");
        }           

        }while(true);

        
        System.out.println("Tabuleiro:\n1 "
                + linha1coluna1 +" | "
                + linha1coluna2 +" | "
                + linha1coluna3 +
                " \n ___|___|___\n2 "
                + linha2coluna1 +" | "
                + linha2coluna2 +" | "
                + linha2coluna3 +
                " \n ___|___|___\n3 "
                + linha3coluna1 +" | "
                + linha3coluna2 +" | "
                + linha3coluna3 +
                " \n    |   |   \n   1  2  3");
        
        if((linha1coluna1=='o' && linha2coluna2=='o' && linha3coluna3=='o')||
                (linha1coluna3=='o' && linha2coluna2=='o' && linha3coluna1=='o')||
                    (linha1coluna1=='o' && linha2coluna1=='o' && linha3coluna1=='o')||
                           (linha1coluna2=='o' && linha2coluna2=='o' && linha3coluna2=='o')||
                                (linha1coluna3=='o' && linha2coluna3=='o' && linha3coluna3=='o')||
                                    (linha1coluna1=='o' && linha1coluna2=='o' && linha1coluna3=='o')||
                                           (linha2coluna1=='o' && linha2coluna2=='o' && linha2coluna3=='o')||
                                                (linha3coluna1=='o' && linha3coluna2=='o' && linha3coluna3=='o')){
                                                
                                                    System.out.println("Parabens player 2, voce ganhou");
                                                    break;
        }
        


    }while(true);
    
    }
}
