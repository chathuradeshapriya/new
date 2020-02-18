public class Human2{

int age;
String color;
double height;
double weight;


public void insertValues(int ageofthehuman, String colorofhuman, double heightofthehuman){
	age = ageofthehuman;
	color =	colorofhuman;
	height = heightofthehuman;
}



public static void main(String[] args){

Human2 asiri = new Human2();
asiri.insertValues(25, "yellow",67);

asiri.displayInfo();

}

}