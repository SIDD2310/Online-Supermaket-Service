import java.util.*;
public class Cereal
{
ArrayList<String> s1 = new ArrayList<>();
ArrayList<Float> i1 = new ArrayList<>();
public Cereal()
{
s1.add("Rice (1kg) ");
s1.add("Dal (1kg) ");
s1.add("Wheat (1kg) ");
s1.add("Cornflakes (1kg) ");
s1.add("Barley (1kg) ");
s1.add("Maize (1kg) ");
s1.add("Oats (1kg) ");
i1.add((float) 40.00);
i1.add((float) 70.00);
i1.add((float) 40.00);
i1.add((float) 120.00);
i1.add((float) 70.00);
i1.add((float) 50.00);
i1.add((float) 70.00);
}
public void display()
{
System.out.println("--------------------------------");


System.out.println(" Cereal Items ");
System.out.println("--------------------------------");
for(int i = 0 ; i < 7 ; i++)
{
System.out.println((i+1) + ". " + s1.get(i).replace("[","").replace("]","").replace(",","") +
" $" + i1.get(i).toString().replace("[","").replace("]","").replace(",",""));
}
}
}

import java.util.*;
public class Beverage
{
ArrayList<String> s1 = new ArrayList<>();
ArrayList<Float> i1 = new ArrayList<>();
public Beverage()
{
s1.add("Soft Drinks ");
s1.add("Soda ");
s1.add("Water ");
s1.add("Juice ");
s1.add("Coffee ");
s1.add("Coconut Water ");
s1.add("Energy Drink ");
s1.add("Iced Tea ");
s1.add("Smoothies ");


s1.add("Lassi ");
i1.add((float) 40.00);
i1.add((float) 20.00);
i1.add((float) 20.00);
i1.add((float) 35.00);
i1.add((float) 40.00);
i1.add((float) 40.00);
i1.add((float) 100.00);
i1.add((float) 50.00);
i1.add((float) 70.00);
i1.add((float) 30.00);
}
public void display()
{
System.out.println("---------------------------------");
System.out.println(" Beverage ");
System.out.println("---------------------------------");
for(int i = 0 ; i < 7 ; i++)
{
System.out.println((i+1) + ". " + s1.get(i).replace("[","").replace("]","").replace(",","") +
" Rs" + i1.get(i).toString().replace("[","").replace("]","").replace(",",""));
}
}
}

import java.util.*;
public class Meat
{


ArrayList<String> s1 = new ArrayList<>();
ArrayList<Float> i1 = new ArrayList<>();
public Meat()
{
s1.add("Chicken (1kg) ");
s1.add("Mutton (1kg) ");
s1.add("Squid (1kg) ");
s1.add("Beef (1kg) ");
s1.add("Turkey (1kg) ");
s1.add("Prawns (1kg) ");
s1.add("Fish (1kg) ");
i1.add((float) 200.00);
i1.add((float) 600.00);
i1.add((float) 300.00);
i1.add((float) 250.00);
i1.add((float) 500.00);
i1.add((float) 800.00);
i1.add((float) 300.00);
}
public void display()
{
System.out.println("--------------------------------");
System.out.println(" Meat Items ");
System.out.println("--------------------------------");
for(int i = 0 ; i < 7 ; i++)
{
System.out.println((i+1) + ". " + s1.get(i).replace("[","").replace("]","").replace(",","") +
" Rs" + i1.get(i).toString().replace("[","").replace("]","").replace(",",""));
}


}
}

import java.util.*;
public class Snacks
{
ArrayList<String> s1 = new ArrayList<>();
ArrayList<Float> i1 = new ArrayList<>();
public Snacks()
{
s1.add("Lays Chips/packet ");
s1.add("Kurkure/packet ");
s1.add("Biscuits/packet ");
s1.add("Wafers/packet ");
s1.add("Aloo Bhujiya ");
s1.add("Cheetos/packet ");
s1.add("Pringles/packet ");
s1.add("Dairy Milk/packet ");
s1.add("5 Star/packet ");
s1.add("Sour Punk/packet ");
i1.add((float) 20.00);
i1.add((float) 10.00);
i1.add((float) 20.00);
i1.add((float) 40.00);
i1.add((float) 50.00);
i1.add((float) 20.00);
i1.add((float) 100.00);
i1.add((float) 20.00);


i1.add((float) 10.00);
i1.add((float) 30.00);
}
public void display()
{
System.out.println("-------------------------------");
System.out.println(" Snacks ");
System.out.println("-------------------------------");
for(int i = 0 ; i < 7 ; i++)
{
System.out.println((i+1) + ". " + s1.get(i).replace("[","").replace("]","").replace(",","") +
" Rs" + i1.get(i).toString().replace("[","").replace("]","").replace(",",""));
}
}
}

import java.util.*;
public class Dairy
{
ArrayList<String> s1 = new ArrayList<>();
ArrayList<Float> i1 = new ArrayList<>();
public Dairy()
{
s1.add("Cheese ");
s1.add("Milk ");
s1.add("Butter ");
s1.add("Ice cream ");


s1.add("Yogurt ");
s1.add("Whipped cream ");
s1.add("Sour cream ");
i1.add((float) 200.50);
i1.add((float) 80.25);
i1.add((float) 40.00);
i1.add((float) 50.00);
i1.add((float) 100.00);
i1.add((float) 60.00);
i1.add((float) 120.00);
}
public void display()
{
System.out.println("-------------------------------");
System.out.println(" Dairy Items ");
System.out.println("-------------------------------");
for(int i = 0 ; i < 7 ; i++)
{
System.out.println((i+1) + ". " + s1.get(i).replace("[","").replace("]","").replace(",","") +
" Rs" + i1.get(i).toString().replace("[","").replace("]","").replace(",",""));
}
}
}

import java.util.*;
public class Breads
{
ArrayList<String> s1 = new ArrayList<>();


ArrayList<Float> i1 = new ArrayList<>();
public Breads()
{
s1.add("White Bread ");
s1.add("Brown bread ");
s1.add("Pita ");
s1.add("Banana bread ");
s1.add("Toast ");
s1.add("Baguette ");
s1.add("Brioche ");
s1.add("Croissant ");
s1.add("Sour Dough ");
i1.add((float) 40.00);
i1.add((float) 40.00);
i1.add((float) 80.00);
i1.add((float) 120.00);
i1.add((float) 45.00);
i1.add((float) 80.00);
i1.add((float) 75.00);
i1.add((float) 45.00);
i1.add((float) 80.00);
}
public void display()
{
System.out.println("-------------------------------");
System.out.println(" Breads ");
System.out.println("-------------------------------");
for(int i = 0 ; i < 7 ; i++)
{

System.out.println((i+1) + ". " + s1.get(i).replace("[","").replace("]","").replace(",","") +
" Rs" + i1.get(i).toString().replace("[","").replace("]","").replace(",",""));
}
}
}

import java.util.*;
public class Card
{
ArrayList<String> card_no = new ArrayList<>();
ArrayList<Integer> pin = new ArrayList<>();
ArrayList<String> name = new ArrayList<>();
ArrayList<String> address = new ArrayList<>();
ArrayList<String> email = new ArrayList<>();
ArrayList<String> phone = new ArrayList<>();
int count = 0;
public void new_card(String card_no, int pin, String name, String address, String email, String
phone)
{
this.card_no.add(card_no);
this.pin.add(pin);
this.name.add(name);
this.address.add(address);
this.email.add(email);
this.phone.add(phone);
count++;
}
public void display()


{
System.out.println("-------------------");
System.out.println(" Saved cards ");
System.out.println("-------------------");
for(int i = 0 ; i < count ; i++)
{
System.out.println((i+1) + ".Card number: " + card_no.get(i) + "\n Name: " + name.get(i) +
"\n Email: " + email.get(i) + "\n Address: " + address.get(i) + "\n Phone number: " +
phone.get(i) + "\n Pin: **" + pin.get(i).toString().substring(2, 4));
}
}
}

import java.util.*;
public class Fruits
{
ArrayList<String> s1 = new ArrayList<>();
ArrayList<Float> i1 = new ArrayList<>();
public Fruits()
{
s1.add("Orange (1kg) ");
s1.add("Apple (1kg) ");
s1.add("Banana (1 dozen) ");
s1.add("Grapes (1kg) ");
s1.add("Pineapple (1kg) ");
s1.add("Kiwi (250g) ");
s1.add("Mango (1kg) ");
i1.add((float) 60.00);
i1.add((float) 150.00);


i1.add((float) 60.00);
i1.add((float) 200.00);
i1.add((float) 80.00);
i1.add((float) 500.00);
i1.add((float) 150.00);
}
public void display()
{
System.out.println("-------------------------------");
System.out.println(" Fruits ");
System.out.println("-------------------------------");
for(int i = 0 ; i < 7 ; i++)
{
System.out.println((i+1) + ". " + s1.get(i).replace("[","").replace("]","").replace(",","") +
" $" + i1.get(i).toString().replace("[","").replace("]","").replace(",",""));
}
}
}

import java.util.*;
public class Grocery
{
ArrayList<String> item_name = new ArrayList<>();
ArrayList<Float> item_price = new ArrayList<>();
int count = 0;
float total;

public void add(float a, String str)


{
Meat m = new Meat();
Cereal c = new Cereal();
Dairy d = new Dairy();
Fruits f = new Fruits();
Snacks s = new Snacks();
Breads b = new Breads();
Beverage br = new Beverage();
if(str.equals("m"))
{
item_name.add(m.s1.get((int) (a-1)));
item_price.add(m.i1.get((int) (a-1)));
count++;
total += m.i1.get((int) (a-1));
}
if(str.equals("c"))
{
item_name.add(c.s1.get((int) (a-1)));
item_price.add(c.i1.get((int) (a-1)));
count++;
total += c.i1.get((int) (a-1));
}
if(str.equals("d"))
{
item_name.add(d.s1.get((int) (a-1)));
item_price.add(d.i1.get((int) (a-1)));
count++;
total += d.i1.get((int) (a-1));
}


if(str.equals("f"))
{
item_name.add(f.s1.get((int) (a-1)));
item_price.add(f.i1.get((int) (a-1)));
count++;
total += f.i1.get((int) (a-1));
}
if(str.equals("s"))
{
item_name.add(s.s1.get((int) (a-1)));
item_price.add(s.i1.get((int) (a-1)));
count++;
total += s.i1.get((int) (a-1));
}
if(str.equals("b"))
{
item_name.add(b.s1.get((int) (a-1)));
item_price.add(b.i1.get((int) (a-1)));
count++;
total += b.i1.get((int) (a-1));
}
if(str.equals("br"))
{
item_name.add(br.s1.get((int) (a-1)));
item_price.add(br.i1.get((int) (a-1)));
count++;
total += br.i1.get((int) (a-1));
}
}


public void delete(int a)
{
item_name.remove(a-1);
total -= item_price.get(a-1);
item_price.remove(a-1);
count--;
System.out.println("Item has been deleted!");
}
public void clear_basket()
{
item_name.clear();
item_price.clear();
count = 0;
total = 0;
}
public void display()
{
if(!item_name.isEmpty())
{
System.out.println("------------------------------");
System.out.println(" YOUR BASKET \n");
for (int i = 0; i < count; i++)
{
System.out.print((i+1) + ". " + item_name.get(i).replace("[","").replace("]","").replace(",",""));
System.out.println(" " +
item_price.get(i).toString().replace("[","").replace("]","").replace(",",""));
}
System.out.println("\nTotal items: " + count);


String s = String.valueOf(total).substring(0, 4);
System.out.println("Total cost: Rs" + s);
System.out.println("------------------------------\n\n");
}
if(item_name.isEmpty()) {
System.out.println("------------------------------");
System.out.println(" YOUR BASKET IS EMPTY! ");
System.out.println("------------------------------\n");
}
}
}

import java.util.*;
import javax.swing.*;
public class Main extends Grocery
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

Main g = new Main();
Card c1 = new Card();
boolean bc = true;

System.out.println("------------------------------------------------------------------------");
System.out.println(" Welcome to SK Supermaket Shopping! ");
System.out.println("------------------------------------------------------------------------\n\n");


do {

System.out.println("_____________________________________");
System.out.println(" This is the Main Menu ");
System.out.println("_____________________________________");
System.out.println("1.Add item to basket");
System.out.println("2.Delete item from basket");
System.out.println("3.View basket");
System.out.println("4.View your cart and proceed to payment");
System.out.println("5.Exit");
System.out.println("Enter which one you'd like to proceed to");
int a = sc.nextInt();

if(a == 1) //to add to basket opens here
{
do {
System.out.println("1.Meats");
System.out.println("2.Cereal");
System.out.println("3.Dairy");
System.out.println("4.Fruits");
System.out.println("5.Snacks");
System.out.println("6.Breads");
System.out.println("7.Beverage");
System.out.println("8.Go back to main menu\n");
System.out.println("Choose your section: ");

int b = sc.nextInt();

if (b == 1) // meats open here


{
Meat meats = new Meat();
do {
meats.display();

System.out.println("11. Go back to sections menu\n");
System.out.println("Choose item which you want to add: ");

int c = sc.nextInt();
if (c == 1) {
g.add(1, "m");
}
if (c == 2) {
g.add(2, "m");
}
if (c == 3) {
g.add(3, "m");
}
if (c == 4) {
g.add(4, "m");
}
if (c == 5) {
g.add(5, "m");
}
if (c == 6) {
g.add(6, "m");
}
if (c == 7) {
g.add(7, "m");


}
if(c == 11){
bc = false;
}
}while (bc);
bc = true;
} //meats close here

if (b == 2) //cereals open here
{
Cereal cereals = new Cereal();
do {
cereals.display();
System.out.println("11. Go back to sections menu\n");
System.out.println("Choose item which you want to add: ");

int l = sc.nextInt();
if (l == 1) {
g.add(1, "c");
}
if (l == 2) {
g.add(2, "c");
}
if (l == 3) {
g.add(3, "c");
}
if (l == 4) {
g.add(4, "c");


}
if (l == 5) {
g.add(5, "c");
}
if(l == 6){
g.add(6, "c");
}
if(l == 7) {
g.add(7, "c");
}
if(l == 11){
bc = false;
}
}while (bc);
bc = true;
} //cereals closes here

if (b == 3)//dairy starts here
{
Dairy dairy = new Dairy();
do {
dairy.display();
System.out.println("11. Go back to sections menu\n");
System.out.println("Choose item which you want to add: ");

int c = sc.nextInt();
if (c == 1) {
g.add(1, "d");


}
if (c == 2) {
g.add(2, "d");
}
if (c == 3) {
g.add(3, "d");
}
if (c == 4) {
g.add(4, "d");
}
if (c == 5) {
g.add(5, "d");
}
if (c == 6) {
g.add(6, "d");
}
if (c == 7) {
g.add(7, "d");
}
if(c == 11){
bc = false;
}
}while (bc);
bc = true;
}//diary closes here

if (b == 4)//fruits starts here
{
Fruits fruits = new Fruits();


do {
fruits.display();
System.out.println("11. Go back to sections menu\n");
System.out.println("Choose item which you want to add: ");
int c = sc.nextInt();
if (c == 1) {
g.add(1, "f");
}
if (c == 2) {
g.add(2, "f");
}
if (c == 3) {
g.add(3, "f");
}
if (c == 4) {
g.add(4, "f");
}
if (c == 5) {
g.add(5, "f");
}
if(c == 6){
g.add(6, "f");
}
if (c == 7) {
g.add(7, "f");//supposed to be f noee
}
if(c == 11){
bc = false;
}


}while (bc);
bc = true;
}//fruits closes here

if (b == 5)//snacks open here
{
Snacks snack = new Snacks();
do {
snack.display();
System.out.println("11. Go back to sections menu\n");
System.out.println("Choose item which you want to add: ");

int c = sc.nextInt();
if (c == 1) {
g.add(1, "s");
}
if (c == 2) {
g.add(2, "s");
}
if (c == 3) {
g.add(3, "s");
}
if (c == 4) {
g.add(4, "s");
}
if (c == 5) {
g.add(5, "s");
}
if(c == 6){


g.add(6, "s");
}
if (c == 7) {
g.add(7, "s");
}

if (c == 8) {
g.add(8, "s");
}

if (c == 9) {
g.add(9, "s");
}

if (c == 10) {
g.add(10, "s");
}

if(c == 11){
bc = false;
}
}while (bc);
bc = true;
}//snacks closes here

if(b == 6)//breads starts here
{
Breads breads = new Breads();
do {


breads.display();
System.out.println("11. Go back to sections menu\n");
System.out.println("Choose item which you want to add: ");

int c = sc.nextInt();
if (c == 1) {
g.add(1, "b");
}

if (c == 2) {
g.add(2, "b");
}

if (c == 3) {
g.add(3, "b");
}

if (c == 4) {
g.add(4, "b");
}

if (c == 5) {
g.add(5, "b");
}

if (c == 6) {
g.add(6, "b");
}


if (c == 7) {
g.add(7, "b");
}

if (c == 8) {
g.add(8, "b");
}

if (c == 9) {
g.add(9, "b");
}

if(c == 11){
bc = false;
}
}while (bc);
bc = true;
}//breads closes here

if(b == 7)//beverages starts here
{
Beverage bvg= new Beverage();
do {
bvg.display();
System.out.println("11. Go back to sections menu\n");
System.out.println("Choose item which you want to add: ");

int c = sc.nextInt();


if (c == 1) {
g.add(1, "br");
}

if (c == 2) {
g.add(2, "br");
}

if (c == 3) {
g.add(3, "br");
}

if (c == 4) {
g.add(4, "br");
}

if (c == 5) {
g.add(5, "br");
}

if (c == 6) {
g.add(6, "br");
}

if (c == 7) {
g.add(7, "br");
}

if (c == 8) {


g.add(8, "br");
}

if (c == 9) {
g.add(9, "br");
}

if (c == 10) {
g.add(9, "br");
}

if(c == 11){
bc = false;
}
}while (bc);
bc = true;
}

if(b == 8)
{
bc = false;
}
}while(bc);
bc = true;
}

if(a == 2)
{
g.display();


if(!g.item_name.isEmpty())
{
System.out.println("Choose item which you want to delete: ");
int d = sc.nextInt();
g.delete(d);
g.display();
if(!g.item_name.isEmpty())
{
do {
System.out.println("Do you want to delete another item(Y/N): ");
String str = sc.next();
if (str.equalsIgnoreCase("y"))
{
System.out.println("Choose item which you want to delete: ");
int e = sc.nextInt();
g.delete(e);
g.display();
}
else {
bc = false;
}
}
while (bc);
bc = true;
}
}
}

if(a == 3){


g.display();
}

if(a == 4){
g.display();
if(!g.item_name.isEmpty()) {
do {
System.out.println("1.Credit card/ Debit card");
System.out.println("2.Cash on delivery\n");
System.out.println("Choose payment method: ");
int f = sc.nextInt();
if (f == 1) {
System.out.println("1.New Credit card/ Debit card");
System.out.println("2.Use existing Credit card/ Debit card");
int j = sc.nextInt();
if (j == 1) {
System.out.println("Enter your name: ");
sc.nextLine();
String name = sc.nextLine();
System.out.println("Enter your email: ");
String email = sc.nextLine();
System.out.println("Enter your address: ");
String address = sc.nextLine();
System.out.println("Enter your phone number: ");
String phone = sc.nextLine();
System.out.println("Enter card number: ");
String card_no = sc.nextLine();
System.out.println("Enter pin: ");
int pin = sc.nextInt();


System.out.println("Do you want to save your card details(Y/N): ");
String s = sc.next();
if (s.equalsIgnoreCase("y")) {
c1.new_card(card_no, pin, name, address, email, phone);
System.out.println("Your card has been saved");
System.out.println("\nPayment successful!! \nYou will receive your order
within a week :)\n");
} else {
System.out.println("Payment successful!! \nYou will receive your order within
a week :)\n");
}
bc = false;
g.clear_basket();
g.display();
}
if (j == 2) {
if (c1.card_no.isEmpty()) {
System.out.println("You have no saved cards!!\n");
bc = true;
} else {
c1.display();
System.out.println("Select the card which you want to use: ");
int h = sc.nextInt();
System.out.println("Payment successful!! \nYou will receive your order within
a week :)\n");
g.clear_basket();
g.display();
bc = false;
}
}


}
if (f == 2) {
System.out.println("Enter your name: ");
sc.nextLine();
String name = sc.nextLine();
System.out.println("Enter your email: ");
String email = sc.nextLine();
System.out.println("Enter your address: ");
String address = sc.nextLine();
System.out.println("Enter your phone number: ");
String phone = sc.nextLine();
System.out.println("\nYour order has been placed!! \nYou will receive your order
within a week :)");
System.out.println("\nPlease pay total amount $" + g.total + " on receiving the
delivery\n");
g.clear_basket();
g.display();
bc = false;
}
}
while(bc);
bc = true;
}
}

if(a == 5)
{
bc = false;
}

Page 39

}while(bc);
}
}
