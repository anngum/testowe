// klasa musi nazywać się tak samo, jak plik
//import java.util.*;  //wszystkie z util
import java.util.ArrayList;
import java.util.HashSet;

public class Kolekcje {

public static void main(String[] args) {
	String[] imiona = new String[]{"Ala", "Ola","Asia","Basia", "Asia","Ola",
	"Ela","Ela","Ewa","Ala"};
	
	for(String i : imiona){
		System.out.println(i);   
    }
	// utworzenie kolekcji, ktora jest listą:
	ArrayList<String> lista = new ArrayList<>(); 
	
	//ArrayList<Integer> lista - lista liczb całkowitych
	for(String i : imiona){
		lista.add(i);   
    }
	System.out.println(lista);
	
	//utworzenie kolekcji, ktora jest zbiorem
	HashSet<String> zbior = new HashSet<>();
	for(String i : imiona){
		zbior.add(i);   
    }
	System.out.println(zbior);
	
	for(String i : zbior){
		lista.add(i);   
    }
	System.out.println(lista);
}
