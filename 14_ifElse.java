/*Scrivi un programma che calcoli la lunghezza di una stringa, sulla base di questa lunghezza 
stampi "Lunghezza maggiore di 10", "Lunghezza minore di 10" o "Lunghezza pari a 10".*/


public class myClass{
    public static void main(String[] args){
        
        String name = "Manuel";
        lengthCheck(name);
    }
    
    
    public static void lengthCheck(String a){
        
        int nLength = a.length();
        
        if (nLength < 10){
        System.out.print("Lunghezza minore di 10");
        }
        else if (nLength > 10) {
        System.out.print("Lunghezza maggiore di 10");
        } 
        else {
        System.out.print("Lunghezza pari a 10");
        }
    }
    
}